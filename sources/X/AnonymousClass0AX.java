package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0AX  reason: invalid class name */
public final class AnonymousClass0AX extends InputStream {
    public IOException A00 = null;
    public InputStream A01;
    public AnonymousClass0B4 A02;
    public boolean A03 = false;
    public final int A04;

    public AnonymousClass0AX(InputStream inputStream) {
        this.A01 = inputStream;
        this.A04 = -1;
        this.A02 = new AnonymousClass0B4(inputStream);
    }

    public final int available() {
        Throwable th;
        if (this.A01 != null) {
            th = this.A00;
            if (th == null) {
                AnonymousClass0B4 r0 = this.A02;
                if (r0 == null) {
                    return 0;
                }
                return r0.available();
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }

    public final void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A01 = null;
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a A[Catch:{ 0V7 -> 0x0078, IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0033 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            if (r10 < 0) goto L_0x0090
            if (r11 < 0) goto L_0x0090
            int r1 = r10 + r11
            if (r1 < 0) goto L_0x0090
            int r0 = r9.length
            if (r1 > r0) goto L_0x0090
            r7 = 0
            if (r11 == 0) goto L_0x008f
            java.io.InputStream r0 = r8.A01
            if (r0 == 0) goto L_0x0087
            java.io.IOException r0 = r8.A00
            if (r0 != 0) goto L_0x0086
            boolean r0 = r8.A03
            r3 = -1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            X.0B4 r0 = r8.A02     // Catch:{ IOException -> 0x0080 }
            if (r0 != 0) goto L_0x0061
            java.io.InputStream r0 = r8.A01     // Catch:{ IOException -> 0x0080 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0080 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0080 }
            r0 = 12
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0080 }
        L_0x002b:
            r6 = 0
            r5 = 1
            int r0 = r2.read(r4, r6, r5)     // Catch:{ IOException -> 0x0080 }
            if (r0 != r3) goto L_0x003a
            r8.A03 = r5     // Catch:{ IOException -> 0x0080 }
        L_0x0035:
            boolean r0 = r8.A03     // Catch:{ IOException -> 0x0080 }
            if (r0 == 0) goto L_0x0061
            goto L_0x0075
        L_0x003a:
            r1 = 3
            r2.readFully(r4, r5, r1)     // Catch:{ IOException -> 0x0080 }
            byte r0 = r4[r6]     // Catch:{ IOException -> 0x0080 }
            if (r0 != 0) goto L_0x004f
            byte r0 = r4[r5]     // Catch:{ IOException -> 0x0080 }
            if (r0 != 0) goto L_0x004f
            r0 = 2
            byte r0 = r4[r0]     // Catch:{ IOException -> 0x0080 }
            if (r0 != 0) goto L_0x004f
            byte r0 = r4[r1]     // Catch:{ IOException -> 0x0080 }
            if (r0 == 0) goto L_0x002b
        L_0x004f:
            r1 = 4
            r0 = 8
            r2.readFully(r4, r1, r0)     // Catch:{ IOException -> 0x0080 }
            java.io.InputStream r2 = r8.A01     // Catch:{ 0V7 -> 0x0078 }
            int r1 = r8.A04     // Catch:{ 0V7 -> 0x0078 }
            X.0B4 r0 = new X.0B4     // Catch:{ 0V7 -> 0x0078 }
            r0.<init>(r2, r4, r1)     // Catch:{ 0V7 -> 0x0078 }
            r8.A02 = r0     // Catch:{ 0V7 -> 0x0078 }
            goto L_0x0035
        L_0x0061:
            X.0B4 r0 = r8.A02     // Catch:{ IOException -> 0x0080 }
            int r0 = r0.read(r9, r10, r11)     // Catch:{ IOException -> 0x0080 }
            if (r0 <= 0) goto L_0x006f
            int r7 = r7 + r0
            int r10 = r10 + r0
            int r11 = r11 - r0
            if (r11 <= 0) goto L_0x008f
            goto L_0x001c
        L_0x006f:
            if (r0 != r3) goto L_0x001c
            r0 = 0
            r8.A02 = r0     // Catch:{ IOException -> 0x0080 }
            goto L_0x001c
        L_0x0075:
            if (r7 == 0) goto L_0x001b
            return r7
        L_0x0078:
            java.lang.String r1 = "Garbage after a valid XZ Stream"
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x0080 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0080 }
            throw r0     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            r1 = move-exception
            r8.A00 = r1
            if (r7 == 0) goto L_0x0095
            return r7
        L_0x0086:
            throw r0
        L_0x0087:
            java.lang.String r0 = "Stream closed"
            X.0As r1 = new X.0As
            r1.<init>(r0)
            throw r1
        L_0x008f:
            return r7
        L_0x0090:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
        L_0x0095:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AX.read(byte[], int, int):int");
    }
}
