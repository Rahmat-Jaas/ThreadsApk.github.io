package X;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.06e  reason: invalid class name and case insensitive filesystem */
public final class C013206e {
    public static int A00(InputStream inputStream) {
        byte[] A03 = A03(inputStream, 2);
        long j = 0;
        int i = 0;
        do {
            j += ((long) (A03[i] & 255)) << (i << 3);
            i++;
        } while (i < 2);
        return (int) j;
    }

    public static long A01(InputStream inputStream) {
        byte[] A03 = A03(inputStream, 4);
        long j = 0;
        int i = 0;
        do {
            j += ((long) (A03[i] & 255)) << (i << 3);
            i++;
        } while (i < 4);
        return j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A05(byte[] r3) {
        /*
            r0 = 1
            java.util.zip.Deflater r2 = new java.util.zip.Deflater
            r2.<init>(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0023 }
            r1.write(r3)     // Catch:{ all -> 0x001e }
            r1.close()     // Catch:{ all -> 0x0023 }
            r2.end()
            byte[] r0 = r0.toByteArray()
            return r0
        L_0x001e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r2.end()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013206e.A05(byte[]):byte[]");
    }

    public static void A02(OutputStream outputStream, int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 << 3)) & 255));
        }
        outputStream.write(bArr);
    }

    public static byte[] A03(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(AnonymousClass00U.A0J("Not enough bytes to read: ", i));
            }
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ DataFormatException -> 0x002e, all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ DataFormatException -> 0x002e, all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A04(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            byte[] r7 = new byte[r10]     // Catch:{ all -> 0x0069 }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x0069 }
            r5 = 0
            r4 = 0
            r3 = 0
        L_0x000e:
            boolean r0 = r2.finished()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0039
            boolean r0 = r2.needsDictionary()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0039
            if (r4 >= r9) goto L_0x0039
            int r1 = r8.read(r6)     // Catch:{ all -> 0x0069 }
            if (r1 < 0) goto L_0x005b
            r2.setInput(r6, r5, r1)     // Catch:{ all -> 0x0069 }
            int r0 = r10 - r3
            int r0 = r2.inflate(r7, r3, r0)     // Catch:{ DataFormatException -> 0x002e }
            int r3 = r3 + r0
            int r4 = r4 + r1
            goto L_0x000e
        L_0x002e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0069 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            r1.<init>(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0068
        L_0x0039:
            if (r4 != r9) goto L_0x004d
            boolean r0 = r2.finished()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0045
            r2.end()
            return r7
        L_0x0045:
            java.lang.String r0 = "Inflater did not finish"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            r1.<init>(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0068
        L_0x004d:
            java.lang.String r1 = "Didn't read enough bytes during decompression. expected="
            java.lang.String r0 = " actual="
            java.lang.String r0 = X.AnonymousClass00U.A01(r9, r4, r1, r0)     // Catch:{ all -> 0x0069 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            r1.<init>(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0068
        L_0x005b:
            java.lang.String r1 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.String r0 = " bytes"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r9)     // Catch:{ all -> 0x0069 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            r1.<init>(r0)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            r2.end()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013206e.A04(java.io.InputStream, int, int):byte[]");
    }
}
