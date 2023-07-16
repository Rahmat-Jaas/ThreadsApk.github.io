package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C03370Ia;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class InputDex implements Closeable {
    public static final byte STATE_RAW = 0;
    public static final byte STATE_USED = 2;
    public static final byte STATE_ZIPPED = 1;
    public static final String XZS_ASSET_SUFFIX = ".xzs.tmp~";
    public final DexManifest.Dex dex;
    public InputStream mContents;
    public byte mState;
    public int sizeHint;

    private void synthesizeDexJarFile(OutputStream outputStream) {
        InputStream inputStream;
        CheckedInputStream checkedInputStream;
        InputStream inputStream2 = this.mContents;
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        try {
            ZipEntry zipEntry = new ZipEntry("classes.dex");
            if (inputStream2 instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream2;
                FileChannel channel = fileInputStream.getChannel();
                if (channel.position() == 0) {
                    InputStream fileInputStream2 = new FileInputStream(fileInputStream.getFD());
                    try {
                        checkedInputStream = fileInputStream2;
                        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        checkedInputStream = fileInputStream2;
                        try {
                            CheckedInputStream checkedInputStream2 = new CheckedInputStream(bufferedInputStream, new CRC32());
                            checkedInputStream = checkedInputStream2;
                            zipEntry.setSize(checkedInputStream2.skip(Long.MAX_VALUE));
                            zipEntry.setCrc(checkedInputStream2.getChecksum().getValue());
                            zipEntry.setMethod(0);
                            Mlog.safeFmt("computed zip data for %s from file size:%s crc:%s", this, Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCrc()));
                            checkedInputStream = checkedInputStream2;
                            Fs.safeClose((Closeable) checkedInputStream2);
                            channel.position(0);
                        } catch (Throwable th) {
                            th = th;
                            inputStream = bufferedInputStream;
                            Fs.safeClose((Closeable) inputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = checkedInputStream;
                    }
                }
            }
            zipOutputStream.putNextEntry(zipEntry);
            C03370Ia.A01(inputStream2, zipOutputStream, Integer.MAX_VALUE);
            zipOutputStream.finish();
            zipOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void close() {
        Fs.safeClose((Closeable) this.mContents);
    }

    public void extract(File file) {
        InputStream inputStream;
        byte b = this.mState;
        this.mState = 2;
        if (b == 0 || b == 1) {
            String name = file.getName();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (name.endsWith(".dex.jar")) {
                    if (b == 1) {
                        Mlog.safeFmt("copying existing zip file %s", this);
                        inputStream = this.mContents;
                    } else {
                        Mlog.safeFmt("synthesizing new zip file %s", this);
                        synthesizeDexJarFile(fileOutputStream);
                        fileOutputStream.close();
                        return;
                    }
                } else if (name.endsWith(DexManifest.DEX_EXT)) {
                    Mlog.safeFmt("writing raw dex file %s", this);
                    this.mState = b;
                    inputStream = getDexContents();
                } else {
                    throw new RuntimeException(AnonymousClass00U.A0L("don't know how to make this kind of file: ", name));
                }
                C03370Ia.A01(inputStream, fileOutputStream, Integer.MAX_VALUE);
                fileOutputStream.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            throw new RuntimeException("InputDex already used");
        }
        throw th;
    }

    public InputStream getDexContents() {
        ZipEntry nextEntry;
        int i;
        byte b = this.mState;
        this.mState = 2;
        if (b == 1) {
            ZipInputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    throw new IOException(String.format("zip file %s did not contain a classes.dex", new Object[]{this.dex}));
                }
            } while (!nextEntry.getName().equals("classes.dex"));
            long size = nextEntry.getSize();
            if (size > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else {
                i = (int) size;
            }
            this.sizeHint = i;
        } else if (b != 0) {
            throw new RuntimeException("InputDex already used");
        }
        return this.mContents;
    }

    public int getSizeHint(InputStream inputStream) {
        int i = this.sizeHint;
        if (i > 0) {
            return i;
        }
        int available = inputStream.available();
        if (available <= 1) {
            return -1;
        }
        return available;
    }

    public String toString() {
        return String.format("InputDex:[%s]", new Object[]{this.dex.assetName});
    }

    public InputDex(DexManifest.Dex dex2, InputStream inputStream) {
        this.dex = dex2;
        String str = dex2.assetName;
        try {
            str = str.endsWith(XZS_ASSET_SUFFIX) ? str.substring(0, str.length() - 9) : str;
            if (str.endsWith(".xz")) {
                str = str.substring(0, str.length() - 3);
                inputStream = new XzInputStream(inputStream);
            }
            if (str.endsWith(".jar")) {
                str = str.substring(0, str.length() - 4);
                this.mState = 1;
            }
            if (str.endsWith(DexManifest.DEX_EXT)) {
                this.mContents = inputStream;
                return;
            }
            throw new RuntimeException(AnonymousClass00U.A0L("malformed dex asset name: ", dex2.assetName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            Fs.safeClose((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void patch(X.C14400pL r8, com.facebook.quicklog.LightweightQuickPerformanceLogger r9) {
        /*
            r7 = this;
            r6 = 47463943(0x2d43e07, float:3.1186202E-37)
            if (r9 == 0) goto L_0x0008
            r9.markerStart(r6)
        L_0x0008:
            r5 = 2
            java.io.InputStream r4 = r7.getDexContents()     // Catch:{ all -> 0x002c }
            java.lang.String r0 = "dex"
            if (r4 == 0) goto L_0x0023
            long r2 = com.facebook.superpack.SuperpackFile.createSuperpackFileNative((java.lang.String) r0, (java.io.InputStream) r4)     // Catch:{ all -> 0x0025 }
            r1 = -1
            com.facebook.superpack.SuperpackFile r0 = new com.facebook.superpack.SuperpackFile     // Catch:{ all -> 0x0025 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "patchAndCloseInput"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0025 }
            r0.<init>(r1)     // Catch:{ all -> 0x0025 }
        L_0x0022:
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0023:
            r0 = 0
            goto L_0x0022
        L_0x0025:
            r0 = move-exception
            if (r4 == 0) goto L_0x002b
            r4.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            if (r9 == 0) goto L_0x0032
            r9.markerEnd(r6, r5)
        L_0x0032:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.InputDex.patch(X.0pL, com.facebook.quicklog.LightweightQuickPerformanceLogger):void");
    }
}
