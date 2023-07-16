package org.tukaani.xz;

import X.AnonymousClass09H;
import X.C02330As;
import java.io.IOException;
import java.io.InputStream;

public final class SimpleInputStream extends InputStream {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public IOException A03 = null;
    public InputStream A04;
    public boolean A05 = false;
    public final AnonymousClass09H A06;
    public final byte[] A07 = new byte[4096];

    public SimpleInputStream(InputStream inputStream, AnonymousClass09H r3) {
        this.A04 = inputStream;
        this.A06 = r3;
    }

    public final int available() {
        Throwable th;
        if (this.A04 != null) {
            th = this.A03;
            if (th == null) {
                return this.A00;
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }

    public final void close() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A04 = null;
            }
        }
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ IOException -> 0x0079 }, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[Catch:{ IOException -> 0x0079 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            if (r10 < 0) goto L_0x0085
            if (r11 < 0) goto L_0x0085
            int r1 = r10 + r11
            if (r1 < 0) goto L_0x0085
            int r0 = r9.length
            if (r1 > r0) goto L_0x0085
            r3 = 0
            if (r11 != 0) goto L_0x000f
            return r3
        L_0x000f:
            java.io.InputStream r0 = r8.A04
            if (r0 == 0) goto L_0x007d
            java.io.IOException r1 = r8.A03
            if (r1 != 0) goto L_0x008a
            r7 = 0
        L_0x0018:
            int r0 = r8.A00     // Catch:{ IOException -> 0x0079 }
            int r1 = java.lang.Math.min(r0, r11)     // Catch:{ IOException -> 0x0079 }
            byte[] r4 = r8.A07     // Catch:{ IOException -> 0x0079 }
            int r0 = r8.A01     // Catch:{ IOException -> 0x0079 }
            java.lang.System.arraycopy(r4, r0, r9, r10, r1)     // Catch:{ IOException -> 0x0079 }
            int r6 = r8.A01     // Catch:{ IOException -> 0x0079 }
            int r6 = r6 + r1
            r8.A01 = r6     // Catch:{ IOException -> 0x0079 }
            int r5 = r8.A00     // Catch:{ IOException -> 0x0079 }
            int r5 = r5 - r1
            r8.A00 = r5     // Catch:{ IOException -> 0x0079 }
            int r10 = r10 + r1
            int r11 = r11 - r1
            int r7 = r7 + r1
            int r1 = r6 + r5
            int r0 = r8.A02     // Catch:{ IOException -> 0x0079 }
            int r1 = r1 + r0
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 != r2) goto L_0x0042
            int r5 = r5 + r0
            java.lang.System.arraycopy(r4, r6, r4, r3, r5)     // Catch:{ IOException -> 0x0079 }
            r8.A01 = r3     // Catch:{ IOException -> 0x0079 }
            r6 = 0
        L_0x0042:
            r1 = -1
            if (r11 == 0) goto L_0x0075
            boolean r0 = r8.A05     // Catch:{ IOException -> 0x0079 }
            if (r0 != 0) goto L_0x0075
            int r0 = r8.A00     // Catch:{ IOException -> 0x0079 }
            int r6 = r6 + r0
            int r0 = r8.A02     // Catch:{ IOException -> 0x0079 }
            int r6 = r6 + r0
            int r2 = r2 - r6
            java.io.InputStream r0 = r8.A04     // Catch:{ IOException -> 0x0079 }
            int r0 = r0.read(r4, r6, r2)     // Catch:{ IOException -> 0x0079 }
            if (r0 != r1) goto L_0x0062
            r0 = 1
            r8.A05 = r0     // Catch:{ IOException -> 0x0079 }
            int r0 = r8.A02     // Catch:{ IOException -> 0x0079 }
            r8.A00 = r0     // Catch:{ IOException -> 0x0079 }
            r8.A02 = r3     // Catch:{ IOException -> 0x0079 }
            goto L_0x0018
        L_0x0062:
            int r2 = r8.A02     // Catch:{ IOException -> 0x0079 }
            int r2 = r2 + r0
            r8.A02 = r2     // Catch:{ IOException -> 0x0079 }
            X.09H r1 = r8.A06     // Catch:{ IOException -> 0x0079 }
            int r0 = r8.A01     // Catch:{ IOException -> 0x0079 }
            int r0 = r1.ADW(r4, r0, r2)     // Catch:{ IOException -> 0x0079 }
            r8.A00 = r0     // Catch:{ IOException -> 0x0079 }
            int r2 = r2 - r0
            r8.A02 = r2     // Catch:{ IOException -> 0x0079 }
            goto L_0x0018
        L_0x0075:
            if (r7 > 0) goto L_0x0078
            r7 = -1
        L_0x0078:
            return r7
        L_0x0079:
            r0 = move-exception
            r8.A03 = r0
            throw r0
        L_0x007d:
            java.lang.String r0 = "Stream closed"
            X.0As r1 = new X.0As
            r1.<init>(r0)
            throw r1
        L_0x0085:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
        L_0x008a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.SimpleInputStream.read(byte[], int, int):int");
    }

    static {
        try {
            Class.forName("org.tukaani.xz.SimpleInputStream");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
