package X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0B4  reason: invalid class name */
public final class AnonymousClass0B4 extends InputStream {
    public InputStream A00;
    public AnonymousClass0AF A01;
    public int A02;
    public IOException A03 = null;
    public C02840Dc A04 = null;
    public AnonymousClass0AN A05;
    public boolean A06 = false;
    public final C05490Ty A07 = new C05490Ty();

    public AnonymousClass0B4(InputStream inputStream) {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        A00(inputStream, bArr, -1);
    }

    public AnonymousClass0B4(InputStream inputStream, byte[] bArr, int i) {
        A00(inputStream, bArr, i);
    }

    public final void close() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A00 = null;
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

    private void A00(InputStream inputStream, byte[] bArr, int i) {
        AnonymousClass0AN r0;
        this.A00 = inputStream;
        this.A02 = i;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = AnonymousClass0B3.A01;
            int length = bArr2.length;
            if (i2 < length) {
                if (bArr[i2] == bArr2[i2]) {
                    i2++;
                } else {
                    throw new AnonymousClass0V7();
                }
            } else if (AnonymousClass0U9.A01(bArr, length, 2, length + 2)) {
                try {
                    if (bArr[length] == 0) {
                        byte b = bArr[length + 1];
                        if ((b & 255) < 16) {
                            AnonymousClass0AF r02 = new AnonymousClass0AF();
                            r02.A00 = b;
                            this.A01 = r02;
                            if (b == 0) {
                                r0 = new C05520Ub();
                            } else if (b == 1) {
                                r0 = new C05640Uo();
                            } else if (b != 4) {
                                if (b == 10) {
                                    try {
                                        r0 = new AnonymousClass0UR();
                                    } catch (NoSuchAlgorithmException unused) {
                                    }
                                }
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Unsupported Check ID ");
                                stringBuffer.append(b);
                                throw new AnonymousClass0V8(stringBuffer.toString());
                            } else {
                                r0 = new C05530Uc();
                            }
                            this.A05 = r0;
                            return;
                        }
                    }
                    throw new AnonymousClass0V8();
                } catch (AnonymousClass0V8 unused2) {
                    throw new AnonymousClass0V8("Unsupported options in XZ Stream Header");
                }
            } else {
                throw new AnonymousClass0VZ("XZ Stream Header is corrupt");
            }
        }
    }

    public final int available() {
        Throwable th;
        if (this.A00 != null) {
            th = this.A03;
            if (th == null) {
                C02840Dc r0 = this.A04;
                if (r0 == null) {
                    return 0;
                }
                return r0.A03.available();
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.IndexOutOfBoundsException} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b7, code lost:
        r1 = new X.AnonymousClass0VZ("XZ Stream Footer does not match Stream Header");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bf, code lost:
        r0 = new X.AnonymousClass0VZ("XZ Stream Footer is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c5, code lost:
        r0 = new X.AnonymousClass0VZ("XZ Stream Footer is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cb, code lost:
        r0 = new X.AnonymousClass0VZ("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d1, code lost:
        r0 = new X.AnonymousClass0VZ("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r4.A00 != r6.A00) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r4.A03 != r6.A03) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r4.A01 != r6.A01) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (java.util.Arrays.equals(r4.A04.A01(), r6.A04.A01()) == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        r4 = new java.io.DataInputStream(r9);
        r0 = r6.A02;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r3 = r3 + 1;
        r0 = r0 >> 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        if (r0 != 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r2 = (int) (3 & (4 - ((((long) (r3 + 1)) + r6.A01) + 4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        if (r2 <= 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r4.readUnsignedByte() != 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        r12 = r10.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
        if (((r12 >>> (r8 << 3)) & 255) != ((long) r4.readUnsignedByte())) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0121, code lost:
        if (r8 < 4) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0123, code lost:
        r5 = new byte[12];
        new java.io.DataInputStream(r7.A00).readFully(r5);
        r1 = r5[10];
        r8 = X.AnonymousClass0B3.A00;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r1 != r8[0]) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0145, code lost:
        if (r5[11] != r8[1]) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014c, code lost:
        if (X.AnonymousClass0U9.A01(r5, 4, 6, 0) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0152, code lost:
        if (r5[8] != 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0154, code lost:
        r2 = r5[9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015c, code lost:
        if ((r2 & 255) >= 16) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r8 = r8 | ((long) ((r5[r4 + 4] & 255) << (r4 << 3)));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016d, code lost:
        if (r4 < 4) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016f, code lost:
        r8 = (r8 + 1) * 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0177, code lost:
        if (r7.A01.A00 != r2) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0179, code lost:
        r3 = r6.A02;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        r5 = r5 + 1;
        r3 = r3 >> 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0184, code lost:
        if (r3 != 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0195, code lost:
        if (((((((long) (r5 + 1)) + r6.A01) + 4) + 3) & -4) != r8) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0197, code lost:
        r7.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x019a, code lost:
        if (r17 <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019c, code lost:
        return r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a3, code lost:
        r1 = new X.AnonymousClass0VZ("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        throw new X.AnonymousClass0V8();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r4 = r21
            r5 = r20
            if (r20 < 0) goto L_0x01f3
            if (r21 < 0) goto L_0x01f3
            int r1 = r20 + r21
            if (r1 < 0) goto L_0x01f3
            r6 = r19
            int r0 = r6.length
            if (r1 > r0) goto L_0x01f3
            r17 = 0
            if (r21 == 0) goto L_0x01f2
            r7 = r18
            java.io.InputStream r0 = r7.A00
            if (r0 == 0) goto L_0x01ea
            java.io.IOException r0 = r7.A03
            if (r0 != 0) goto L_0x01e9
            boolean r0 = r7.A06
            r11 = -1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            return r11
        L_0x0025:
            X.0Dc r3 = r7.A04     // Catch:{ IOException -> 0x01e3 }
            if (r3 != 0) goto L_0x0036
            java.io.InputStream r2 = r7.A00     // Catch:{ 0CR -> 0x0060 }
            X.0AN r1 = r7.A05     // Catch:{ 0CR -> 0x0060 }
            int r0 = r7.A02     // Catch:{ 0CR -> 0x0060 }
            X.0Dc r3 = new X.0Dc     // Catch:{ 0CR -> 0x0060 }
            r3.<init>(r2, r1, r0)     // Catch:{ 0CR -> 0x0060 }
            r7.A04 = r3     // Catch:{ 0CR -> 0x0060 }
        L_0x0036:
            int r0 = r3.read(r6, r5, r4)     // Catch:{ IOException -> 0x01e3 }
            if (r0 <= 0) goto L_0x0043
            int r17 = r17 + r0
            int r5 = r5 + r0
            int r4 = r4 - r0
            if (r4 <= 0) goto L_0x01f2
            goto L_0x0025
        L_0x0043:
            if (r0 != r11) goto L_0x0025
            X.0Ty r8 = r7.A07     // Catch:{ IOException -> 0x01e3 }
            X.0Dc r9 = r7.A04     // Catch:{ IOException -> 0x01e3 }
            int r0 = r9.A06     // Catch:{ IOException -> 0x01e3 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x01e3 }
            X.0DD r0 = r9.A08     // Catch:{ IOException -> 0x01e3 }
            long r0 = r0.A00     // Catch:{ IOException -> 0x01e3 }
            long r2 = r2 + r0
            X.0AN r0 = r9.A09     // Catch:{ IOException -> 0x01e3 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x01e3 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x01e3 }
            long r2 = r2 + r0
            long r0 = r9.A01     // Catch:{ IOException -> 0x01e3 }
            r8.A00(r2, r0)     // Catch:{ IOException -> 0x01e3 }
            r0 = 0
            r7.A04 = r0     // Catch:{ IOException -> 0x01e3 }
            goto L_0x0025
        L_0x0060:
            X.0Ty r6 = r7.A07     // Catch:{ IOException -> 0x01e3 }
            java.io.InputStream r0 = r7.A00     // Catch:{ IOException -> 0x01e3 }
            java.util.zip.CRC32 r10 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x01e3 }
            r10.<init>()     // Catch:{ IOException -> 0x01e3 }
            r8 = 0
            r10.update(r8)     // Catch:{ IOException -> 0x01e3 }
            java.util.zip.CheckedInputStream r9 = new java.util.zip.CheckedInputStream     // Catch:{ IOException -> 0x01e3 }
            r9.<init>(r0, r10)     // Catch:{ IOException -> 0x01e3 }
            long r3 = X.AnonymousClass0U9.A00(r9)     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A02     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r5 = "XZ Index is corrupt"
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01d7
            X.0Ty r4 = new X.0Ty     // Catch:{ IOException -> 0x01e3 }
            r4.<init>()     // Catch:{ IOException -> 0x01e3 }
            r13 = 0
        L_0x0085:
            long r0 = r6.A02     // Catch:{ IOException -> 0x01e3 }
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b2
            long r2 = X.AnonymousClass0U9.A00(r9)     // Catch:{ IOException -> 0x01e3 }
            long r0 = X.AnonymousClass0U9.A00(r9)     // Catch:{ IOException -> 0x01e3 }
            r4.A00(r2, r0)     // Catch:{ 0As -> 0x019d }
            long r2 = r4.A00     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A00     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x01dd
            long r2 = r4.A03     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A03     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x01dd
            long r2 = r4.A01     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A01     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x01dd
            r0 = 1
            long r13 = r13 + r0
            goto L_0x0085
        L_0x00b2:
            long r2 = r4.A00     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A00     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x01d1
            long r2 = r4.A03     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A03     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x01d1
            long r2 = r4.A01     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A01     // Catch:{ IOException -> 0x01e3 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x01d1
            X.0AN r0 = r4.A04     // Catch:{ IOException -> 0x01e3 }
            byte[] r1 = r0.A01()     // Catch:{ IOException -> 0x01e3 }
            X.0AN r0 = r6.A04     // Catch:{ IOException -> 0x01e3 }
            byte[] r0 = r0.A01()     // Catch:{ IOException -> 0x01e3 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x01e3 }
            if (r0 == 0) goto L_0x01d1
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x01e3 }
            r4.<init>(r9)     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A02     // Catch:{ IOException -> 0x01e3 }
            r3 = 0
        L_0x00e4:
            int r3 = r3 + 1
            r16 = 7
            long r0 = r0 >> r16
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00e4
            int r0 = r3 + 1
            long r2 = (long) r0     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A01     // Catch:{ IOException -> 0x01e3 }
            long r2 = r2 + r0
            r14 = 4
            long r2 = r2 + r14
            long r12 = r14 - r2
            r0 = 3
            long r0 = r0 & r12
            int r2 = (int) r0     // Catch:{ IOException -> 0x01e3 }
        L_0x00ff:
            if (r2 <= 0) goto L_0x010a
            int r0 = r4.readUnsignedByte()     // Catch:{ IOException -> 0x01e3 }
            if (r0 != 0) goto L_0x01a3
            int r2 = r2 + -1
            goto L_0x00ff
        L_0x010a:
            long r12 = r10.getValue()     // Catch:{ IOException -> 0x01e3 }
        L_0x010e:
            int r0 = r8 << 3
            long r9 = r12 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r0
            int r0 = r4.readUnsignedByte()     // Catch:{ IOException -> 0x01e3 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x01e3 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01cb
            int r8 = r8 + 1
            r3 = 4
            if (r8 < r3) goto L_0x010e
            r0 = 12
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x01e3 }
            java.io.InputStream r1 = r7.A00     // Catch:{ IOException -> 0x01e3 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e3 }
            r0.readFully(r5)     // Catch:{ IOException -> 0x01e3 }
            r0 = 10
            byte r1 = r5[r0]     // Catch:{ IOException -> 0x01e3 }
            byte[] r8 = X.AnonymousClass0B3.A00     // Catch:{ IOException -> 0x01e3 }
            r4 = 0
            byte r0 = r8[r4]     // Catch:{ IOException -> 0x01e3 }
            java.lang.String r2 = "XZ Stream Footer is corrupt"
            if (r1 != r0) goto L_0x01c5
            r0 = 11
            byte r1 = r5[r0]     // Catch:{ IOException -> 0x01e3 }
            r0 = 1
            byte r0 = r8[r0]     // Catch:{ IOException -> 0x01e3 }
            if (r1 != r0) goto L_0x01c5
            r0 = 6
            boolean r0 = X.AnonymousClass0U9.A01(r5, r3, r0, r4)     // Catch:{ IOException -> 0x01e3 }
            if (r0 == 0) goto L_0x01bf
            r0 = 8
            byte r0 = r5[r0]     // Catch:{ 0V8 -> 0x01af }
            if (r0 != 0) goto L_0x01a9
            r0 = 9
            byte r2 = r5[r0]     // Catch:{ 0V8 -> 0x01af }
            r1 = r2 & 255(0xff, float:3.57E-43)
            r0 = 16
            if (r1 >= r0) goto L_0x01a9
            r8 = 0
        L_0x0160:
            int r0 = r4 + 4
            byte r0 = r5[r0]     // Catch:{ IOException -> 0x01e3 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r4 << 3
            int r1 = r1 << r0
            long r0 = (long) r1     // Catch:{ IOException -> 0x01e3 }
            long r8 = r8 | r0
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x0160
            r0 = 1
            long r8 = r8 + r0
            long r8 = r8 * r14
            X.0AF r0 = r7.A01     // Catch:{ IOException -> 0x01e3 }
            int r0 = r0.A00     // Catch:{ IOException -> 0x01e3 }
            if (r0 != r2) goto L_0x01b7
            long r3 = r6.A02     // Catch:{ IOException -> 0x01e3 }
            r5 = 0
        L_0x017c:
            int r5 = r5 + 1
            long r3 = r3 >> r16
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
            int r0 = r5 + 1
            long r2 = (long) r0     // Catch:{ IOException -> 0x01e3 }
            long r0 = r6.A01     // Catch:{ IOException -> 0x01e3 }
            long r2 = r2 + r0
            long r2 = r2 + r14
            r0 = 3
            long r2 = r2 + r0
            r0 = -4
            long r2 = r2 & r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01b7
            r0 = 1
            r7.A06 = r0     // Catch:{ IOException -> 0x01e3 }
            if (r17 <= 0) goto L_0x0024
            return r17
        L_0x019d:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01a3:
            X.0VZ r1 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01be
        L_0x01a9:
            X.0V8 r0 = new X.0V8     // Catch:{ 0V8 -> 0x01af }
            r0.<init>()     // Catch:{ 0V8 -> 0x01af }
            throw r0     // Catch:{ 0V8 -> 0x01af }
        L_0x01af:
            java.lang.String r0 = "Unsupported options in XZ Stream Footer"
            X.0V8 r1 = new X.0V8     // Catch:{ IOException -> 0x01e3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01be
        L_0x01b7:
            java.lang.String r0 = "XZ Stream Footer does not match Stream Header"
            X.0VZ r1 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e3 }
        L_0x01be:
            throw r1     // Catch:{ IOException -> 0x01e3 }
        L_0x01bf:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01c5:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01cb:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01d1:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01d7:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
            goto L_0x01e2
        L_0x01dd:
            X.0VZ r0 = new X.0VZ     // Catch:{ IOException -> 0x01e3 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x01e3 }
        L_0x01e2:
            throw r0     // Catch:{ IOException -> 0x01e3 }
        L_0x01e3:
            r1 = move-exception
            r7.A03 = r1
            if (r17 == 0) goto L_0x01f8
            return r17
        L_0x01e9:
            throw r0
        L_0x01ea:
            java.lang.String r0 = "Stream closed"
            X.0As r1 = new X.0As
            r1.<init>(r0)
            throw r1
        L_0x01f2:
            return r17
        L_0x01f3:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
        L_0x01f8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B4.read(byte[], int, int):int");
    }
}
