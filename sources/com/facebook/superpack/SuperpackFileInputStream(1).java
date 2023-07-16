package com.facebook.superpack;

import X.AnonymousClass0LU;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SuperpackFileInputStream extends InputStream {
    public int A00;
    public int A01;
    public int A02;
    public Boolean A03;
    public byte[] A04;
    public final SuperpackFile A05;

    public final synchronized int available() {
        return this.A00 - this.A02;
    }

    public final synchronized void mark(int i) {
        this.A01 = this.A02;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized void reset() {
        this.A02 = this.A01;
    }

    public final synchronized long skip(long j) {
        if (j < 0) {
            return 0;
        }
        int i = this.A02;
        long j2 = (long) i;
        int i2 = this.A00;
        if (j2 + j > ((long) i2)) {
            j = (long) (i2 - i);
        }
        this.A02 = (int) (j2 + j);
        return j;
    }

    public static int getDefaultThreadNum(String str) {
        if (str.equals("spo")) {
            return Runtime.getRuntime().availableProcessors();
        }
        return 1;
    }

    public final void close() {
        if (this.A03.booleanValue()) {
            this.A05.close();
        }
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile) {
        int i;
        superpackFile.getClass();
        this.A05 = superpackFile;
        this.A02 = 0;
        synchronized (superpackFile) {
            if (superpackFile.mPtr != 0) {
                i = superpackFile.mLength;
            } else {
                throw new IllegalStateException();
            }
        }
        this.A00 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A03 = false;
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str, int i) {
        long j;
        Throwable th;
        SuperpackArchive superpackArchive;
        IllegalArgumentException illegalArgumentException;
        FileInputStream fileInputStream;
        file.getClass();
        if (!str.matches("spo")) {
            j = 0;
        } else {
            j = SuperpackArchive.getThreadNumOption(i);
        }
        try {
            superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(file.getPath(), str, j), (String[]) null);
            try {
                if (superpackArchive.hasNext()) {
                    SuperpackFile next = superpackArchive.next();
                    if (!superpackArchive.hasNext()) {
                        SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, true);
                        superpackArchive.close();
                        return superpackFileInputStream;
                    }
                    illegalArgumentException = new IllegalArgumentException();
                } else {
                    illegalArgumentException = new IllegalArgumentException();
                }
                throw illegalArgumentException;
            } catch (Throwable unused) {
            }
        } catch (RuntimeException e) {
            AnonymousClass0LU.A0E("SuperpackArchive", "Failed to read superpack file, retrying.", e);
            fileInputStream = new FileInputStream(file);
            superpackArchive = new SuperpackArchive(SuperpackArchive.readNative((InputStream) fileInputStream, str, 0), (String[]) null);
            fileInputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream.close();
            throw th;
        }
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str, int i) {
        long threadNumOption;
        IllegalArgumentException illegalArgumentException;
        inputStream.getClass();
        if (!str.matches("spo")) {
            threadNumOption = 0;
        } else {
            threadNumOption = SuperpackArchive.getThreadNumOption(i);
        }
        SuperpackArchive superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, str, threadNumOption), (String[]) null);
        try {
            if (superpackArchive.hasNext()) {
                SuperpackFile next = superpackArchive.next();
                if (!superpackArchive.hasNext()) {
                    SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, true);
                    superpackArchive.close();
                    return superpackFileInputStream;
                }
                illegalArgumentException = new IllegalArgumentException();
            } else {
                illegalArgumentException = new IllegalArgumentException();
            }
            throw illegalArgumentException;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile, Boolean bool) {
        this(superpackFile);
        this.A03 = bool;
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str) {
        int i;
        if (str.equals("spo")) {
            i = Runtime.getRuntime().availableProcessors();
        } else {
            i = 1;
        }
        return createFromSingletonArchiveFile(file, str, i);
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str) {
        int i;
        if (str.equals("spo")) {
            i = Runtime.getRuntime().availableProcessors();
        } else {
            i = 1;
        }
        return createFromSingletonArchiveInputStream(inputStream, str, i);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x005a=Splitter:B:43:0x005a, B:19:0x001e=Splitter:B:19:0x001e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            r8 = r14
            monitor-enter(r11)
            r9 = r12
            if (r12 == 0) goto L_0x0060
            r10 = r13
            if (r13 < 0) goto L_0x005a
            if (r14 < 0) goto L_0x005a
            int r0 = r14 + r13
            int r4 = r12.length     // Catch:{ all -> 0x0069 }
            if (r0 > r4) goto L_0x005a
            int r7 = r11.A02     // Catch:{ all -> 0x0069 }
            int r1 = r11.A00     // Catch:{ all -> 0x0069 }
            if (r7 != r1) goto L_0x0018
            r0 = -1
            monitor-exit(r11)
            return r0
        L_0x0018:
            int r0 = r14 + r7
            if (r0 <= r1) goto L_0x001e
            int r8 = r1 - r7
        L_0x001e:
            com.facebook.superpack.SuperpackFile r3 = r11.A05     // Catch:{ all -> 0x0069 }
            monitor-enter(r3)     // Catch:{ all -> 0x0069 }
            long r5 = r3.mPtr     // Catch:{ all -> 0x0066 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            if (r7 < 0) goto L_0x0048
            if (r8 < 0) goto L_0x0048
            int r0 = r13 + r8
            if (r0 > r4) goto L_0x0042
            int r1 = r7 + r8
            int r0 = r3.mLength     // Catch:{ all -> 0x0066 }
            if (r1 > r0) goto L_0x0054
            com.facebook.superpack.SuperpackFile.readBytesNative(r5, r7, r8, r9, r10)     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0069 }
            int r0 = r11.A02     // Catch:{ all -> 0x0069 }
            int r0 = r0 + r8
            r11.A02 = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            return r8
        L_0x0042:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            goto L_0x0059
        L_0x0048:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            goto L_0x0059
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            goto L_0x0059
        L_0x0054:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
        L_0x0059:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            goto L_0x0068
        L_0x0060:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.superpack.SuperpackFileInputStream.read(byte[], int, int):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r3 = this;
            monitor-enter(r3)
            byte[] r0 = r3.A04     // Catch:{ all -> 0x0027 }
            r2 = 1
            if (r0 != 0) goto L_0x000a
            byte[] r0 = new byte[r2]     // Catch:{ all -> 0x0027 }
            r3.A04 = r0     // Catch:{ all -> 0x0027 }
        L_0x000a:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x0027 }
            r0 = -1
            if (r1 == r0) goto L_0x0025
            if (r1 != r2) goto L_0x001b
            byte[] r1 = r3.A04     // Catch:{ all -> 0x0027 }
            r0 = 0
            byte r0 = r1[r0]     // Catch:{ all -> 0x0027 }
            if (r0 >= 0) goto L_0x0025
            goto L_0x0023
        L_0x001b:
            java.lang.String r1 = "Unexpected number of bytes read"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0023:
            int r0 = r0 + 256
        L_0x0025:
            monitor-exit(r3)
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.superpack.SuperpackFileInputStream.read():int");
    }
}
