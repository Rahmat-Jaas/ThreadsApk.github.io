package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.06X  reason: invalid class name */
public final class AnonymousClass06X implements Closeable {
    public final File A00;
    public final File A01;
    public final long A02;
    public final RandomAccessFile A03;
    public final FileChannel A04;
    public final FileLock A05;

    /* JADX INFO: finally extract failed */
    public static long A00(File file) {
        ZipException zipException;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            long j = 0;
            if (length >= 0) {
                long j2 = length - OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
                if (j2 >= 0) {
                    j = j2;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L);
                        int min = (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, reverseBytes2);
                        byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                        while (true) {
                            int read = randomAccessFile.read(bArr, 0, min);
                            if (read == -1) {
                                break;
                            }
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            min = (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, reverseBytes2);
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        if (value == -1) {
                            return value - 1;
                        }
                        return value;
                    }
                    length--;
                } while (length >= j);
                zipException = new ZipException("End Of Central Directory signature not found");
            } else {
                zipException = new ZipException(AnonymousClass00U.A08(randomAccessFile.length(), "File too short to be a zip file: "));
            }
            throw zipException;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private List A01() {
        AnonymousClass06W r8;
        boolean z;
        IOException th;
        ZipOutputStream zipOutputStream;
        File file = this.A01;
        String A0L = AnonymousClass00U.A0L(file.getName(), ".classes");
        File file2 = this.A00;
        File[] listFiles = file2.listFiles(new IDxFFilterShape519S0100000_I2(this, 0));
        if (listFiles == null) {
            Log.w("MultiDex", AnonymousClass00U.A0V("Failed to list secondary dex dir content (", file2.getPath(), ")."));
        } else {
            for (File file3 : listFiles) {
                file3.getPath();
                file3.length();
                if (!file3.delete()) {
                    Log.w("MultiDex", AnonymousClass00U.A0L("Failed to delete old file ", file3.getPath()));
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry(AnonymousClass00U.A0S("classes", DexManifest.DEX_EXT, 2));
            while (entry != null) {
                r8 = new AnonymousClass06W(file2, AnonymousClass00U.A0S(A0L, ".zip", i));
                arrayList.add(r8);
                int i2 = 0;
                z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    File createTempFile = File.createTempFile(AnonymousClass00U.A0L("tmp-", A0L), ".zip", r8.getParentFile());
                    createTempFile.getPath();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        ZipEntry zipEntry = new ZipEntry("classes.dex");
                        zipEntry.setTime(entry.getTime());
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                        for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        zipOutputStream.close();
                        if (createTempFile.setReadOnly()) {
                            r8.getPath();
                            if (createTempFile.renameTo(r8)) {
                                A03(inputStream);
                                createTempFile.delete();
                                r8.A00 = A00(r8);
                                z = true;
                                r8.getAbsolutePath();
                                r8.length();
                                if (!z) {
                                    r8.delete();
                                    if (r8.exists()) {
                                        Log.w("MultiDex", AnonymousClass00U.A0V("Failed to delete corrupted secondary dex '", r8.getPath(), "'"));
                                    }
                                }
                            } else {
                                th = new IOException(AnonymousClass00U.A0h("Failed to rename \"", createTempFile.getAbsolutePath(), "\" to \"", r8.getAbsolutePath(), "\""));
                            }
                        } else {
                            th = new IOException(AnonymousClass00U.A0h("Failed to mark readonly \"", createTempFile.getAbsolutePath(), "\" (tmp of \"", r8.getAbsolutePath(), "\")"));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        A03(inputStream);
                        createTempFile.delete();
                    }
                    throw th;
                }
                if (z) {
                    i++;
                    entry = zipFile.getEntry(AnonymousClass00U.A0S("classes", DexManifest.DEX_EXT, i));
                } else {
                    th = new IOException(AnonymousClass00U.A07(i, "Could not create zip file ", r8.getAbsolutePath(), " for secondary dex (", ")"));
                    throw th;
                }
            }
            try {
                zipFile.close();
                return arrayList;
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
                return arrayList;
            }
        } catch (IOException e2) {
            Log.w("MultiDex", AnonymousClass00U.A0L("Failed to read crc from ", r8.getAbsolutePath()), e2);
            z = false;
        } catch (Throwable th3) {
            try {
                zipFile.close();
                throw th3;
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
                throw th3;
            }
        }
    }

    public static void A02(Context context, List list, long j, long j2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(AnonymousClass00U.A0L("", "timestamp"), j);
        edit.putLong(AnonymousClass00U.A0L("", "crc"), j2);
        edit.putInt(AnonymousClass00U.A0L("", "dex.number"), list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            AnonymousClass06W r3 = (AnonymousClass06W) it.next();
            edit.putLong(AnonymousClass00U.A0R("", "dex.crc.", i), r3.A00);
            edit.putLong(AnonymousClass00U.A0R("", "dex.time.", i), r3.lastModified());
            i++;
        }
        edit.commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r8.getLong(X.AnonymousClass00U.A0L("", "crc"), -1) != r19) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04(android.content.Context r25, boolean r26) {
        /*
            r24 = this;
            java.lang.String r12 = ""
            r10 = r24
            java.io.File r0 = r10.A01
            r22 = r0
            r22.getPath()
            java.lang.String r21 = "MultiDex"
            java.nio.channels.FileLock r0 = r10.A05
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x014b
            r23 = r25
            if (r26 != 0) goto L_0x010d
            long r0 = r10.A02
            r19 = r0
            r5 = 4
            java.lang.String r4 = "multidex.version"
            r0 = r23
            android.content.SharedPreferences r8 = r0.getSharedPreferences(r4, r5)
            java.lang.String r0 = "timestamp"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r12, r0)
            r6 = -1
            long r13 = r8.getLong(r0, r6)
            long r2 = r22.lastModified()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            r0 = 1
            long r2 = r2 - r0
        L_0x003d:
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "crc"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r12, r0)
            long r2 = r8.getLong(r0, r6)
            int r1 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 != 0) goto L_0x010d
            java.lang.String r1 = r22.getName()     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = ".classes"
            java.lang.String r18 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException -> 0x0128 }
            r0 = r23
            android.content.SharedPreferences r13 = r0.getSharedPreferences(r4, r5)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = "dex.number"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r12, r0)     // Catch:{ IOException -> 0x0128 }
            r0 = 1
            int r17 = r13.getInt(r1, r0)     // Catch:{ IOException -> 0x0128 }
            int r0 = r17 + -1
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x0128 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0128 }
            r11 = 2
        L_0x0076:
            r0 = r17
            if (r11 > r0) goto L_0x0147
            java.lang.String r1 = ".zip"
            r0 = r18
            java.lang.String r1 = X.AnonymousClass00U.A0S(r0, r1, r11)     // Catch:{ IOException -> 0x0128 }
            java.io.File r0 = r10.A00     // Catch:{ IOException -> 0x0128 }
            X.06W r8 = new X.06W     // Catch:{ IOException -> 0x0128 }
            r8.<init>(r0, r1)     // Catch:{ IOException -> 0x0128 }
            boolean r0 = r8.isFile()     // Catch:{ IOException -> 0x0128 }
            if (r0 == 0) goto L_0x00fb
            long r0 = A00(r8)     // Catch:{ IOException -> 0x0128 }
            r8.A00 = r0     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = "dex.crc."
            java.lang.String r0 = X.AnonymousClass00U.A0R(r12, r0, r11)     // Catch:{ IOException -> 0x0128 }
            long r4 = r13.getLong(r0, r6)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = "dex.time."
            java.lang.String r0 = X.AnonymousClass00U.A0R(r12, r0, r11)     // Catch:{ IOException -> 0x0128 }
            long r2 = r13.getLong(r0, r6)     // Catch:{ IOException -> 0x0128 }
            long r0 = r8.lastModified()     // Catch:{ IOException -> 0x0128 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x00bd
            long r14 = r8.A00     // Catch:{ IOException -> 0x0128 }
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x00bd
            r9.add(r8)     // Catch:{ IOException -> 0x0128 }
            int r11 = r11 + 1
            goto L_0x0076
        L_0x00bd:
            java.lang.String r11 = "Invalid extracted dex: "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0128 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x0128 }
            r9.append(r8)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r11 = " (key \""
            r9.append(r11)     // Catch:{ IOException -> 0x0128 }
            r9.append(r12)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r11 = "\"), expected modification time: "
            r9.append(r11)     // Catch:{ IOException -> 0x0128 }
            r9.append(r2)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r2 = ", modification time: "
            r9.append(r2)     // Catch:{ IOException -> 0x0128 }
            r9.append(r0)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = ", expected crc: "
            r9.append(r0)     // Catch:{ IOException -> 0x0128 }
            r9.append(r4)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = ", file crc: "
            r9.append(r0)     // Catch:{ IOException -> 0x0128 }
            long r0 = r8.A00     // Catch:{ IOException -> 0x0128 }
            r9.append(r0)     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = r9.toString()     // Catch:{ IOException -> 0x0128 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0128 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0128 }
            goto L_0x010c
        L_0x00fb:
            java.lang.String r2 = "Missing extracted secondary dex file '"
            java.lang.String r1 = r8.getPath()     // Catch:{ IOException -> 0x0128 }
            java.lang.String r0 = "'"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ IOException -> 0x0128 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0128 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0128 }
        L_0x010c:
            throw r1     // Catch:{ IOException -> 0x0128 }
        L_0x010d:
            java.util.List r9 = r10.A01()
            long r4 = r22.lastModified()
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x011e
            r0 = 1
            long r4 = r4 - r0
        L_0x011e:
            long r0 = r10.A02
            r2 = r23
            r3 = r9
            r6 = r0
            A02(r2, r3, r4, r6)
            goto L_0x0147
        L_0x0128:
            r2 = move-exception
            java.lang.String r1 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            r0 = r21
            android.util.Log.w(r0, r1, r2)
            java.util.List r9 = r10.A01()
            long r2 = r22.lastModified()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x013f
            r0 = 1
            long r2 = r2 - r0
        L_0x013f:
            r0 = r23
            r1 = r9
            r4 = r19
            A02(r0, r1, r2, r4)
        L_0x0147:
            r9.size()
            return r9
        L_0x014b:
            java.lang.String r1 = "MultiDexExtractor was closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06X.A04(android.content.Context, boolean):java.util.List");
    }

    public final void close() {
        this.A05.release();
        this.A04.close();
        this.A03.close();
    }

    public AnonymousClass06X(File file, File file2) {
        file.getPath();
        file2.getPath();
        this.A01 = file;
        this.A00 = file2;
        this.A02 = A00(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.A03 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.A04 = channel;
            file3.getPath();
            this.A05 = channel.lock();
            file3.getPath();
        } catch (IOException | Error | RuntimeException e) {
            A03(this.A04);
            throw e;
        } catch (IOException | Error | RuntimeException e2) {
            A03(this.A03);
            throw e2;
        }
    }

    public static void A03(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
