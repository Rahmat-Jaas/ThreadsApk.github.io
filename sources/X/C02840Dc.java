package X;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.BCJDecoder;

/* renamed from: X.0Dc  reason: invalid class name and case insensitive filesystem */
public final class C02840Dc extends InputStream {
    public long A00 = -1;
    public long A01 = 0;
    public long A02 = -1;
    public InputStream A03;
    public long A04;
    public boolean A05 = false;
    public final int A06;
    public final DataInputStream A07;
    public final AnonymousClass0DD A08;
    public final AnonymousClass0AN A09;
    public final InputStream A0A;

    public final int available() {
        return this.A03.available();
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    public C02840Dc(InputStream inputStream, AnonymousClass0AN r19, int i) {
        AnonymousClass0VZ r0;
        AnonymousClass0VI bCJDecoder;
        InputStream inputStream2 = inputStream;
        InputStream inputStream3 = inputStream2;
        this.A0A = inputStream3;
        AnonymousClass0AN r15 = r19;
        this.A09 = r15;
        DataInputStream dataInputStream = new DataInputStream(inputStream3);
        this.A07 = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        byte b = bArr[0];
        if (b != 0) {
            int i2 = ((b & 255) + 1) << 2;
            this.A06 = i2;
            dataInputStream.readFully(bArr, 1, i2 - 1);
            int i3 = i2 - 4;
            if (AnonymousClass0U9.A01(bArr, 0, i3, i3)) {
                byte b2 = bArr[1];
                if ((b2 & 60) == 0) {
                    int i4 = (b2 & 3) + 1;
                    long[] jArr = new long[i4];
                    byte[][] bArr2 = new byte[i4][];
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
                    try {
                        this.A04 = (9223372036854775804L - ((long) i2)) - ((long) r15.A00);
                        if ((bArr[1] & 64) != 0) {
                            long A002 = AnonymousClass0U9.A00(byteArrayInputStream);
                            this.A00 = A002;
                            if (A002 == 0 || A002 > this.A04) {
                                r0 = new AnonymousClass0VZ();
                                throw r0;
                            }
                            this.A04 = A002;
                        }
                        if ((bArr[1] & 128) != 0) {
                            this.A02 = AnonymousClass0U9.A00(byteArrayInputStream);
                        }
                        int i5 = 0;
                        while (i5 < i4) {
                            jArr[i5] = AnonymousClass0U9.A00(byteArrayInputStream);
                            long A003 = AnonymousClass0U9.A00(byteArrayInputStream);
                            if (A003 <= ((long) byteArrayInputStream.available())) {
                                bArr2[i5] = new byte[((int) A003)];
                                byteArrayInputStream.read(bArr2[i5]);
                                i5++;
                            } else {
                                r0 = new AnonymousClass0VZ();
                                throw r0;
                            }
                        }
                        int available = byteArrayInputStream.available();
                        while (available > 0) {
                            if (byteArrayInputStream.read() == 0) {
                                available--;
                            } else {
                                throw new AnonymousClass0V8("Unsupported options in XZ Block Header");
                            }
                        }
                        AnonymousClass0VI[] r3 = new AnonymousClass0VI[i4];
                        for (int i6 = 0; i6 < i4; i6++) {
                            if (jArr[i6] == 33) {
                                bCJDecoder = new AnonymousClass09t(bArr2[i6]);
                            } else if (jArr[i6] == 3) {
                                bCJDecoder = new C021009u(bArr2[i6]);
                            } else {
                                long j = jArr[i6];
                                if (j < 4 || j > 9) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("Unknown Filter ID ");
                                    stringBuffer.append(jArr[i6]);
                                    throw new AnonymousClass0V8(stringBuffer.toString());
                                }
                                bCJDecoder = new BCJDecoder(jArr[i6], bArr2[i6]);
                            }
                            r3[i6] = bCJDecoder;
                        }
                        int i7 = 0;
                        while (true) {
                            int i8 = i4 - 1;
                            if (i7 < i8) {
                                if (r3[i7].Bhw()) {
                                    i7++;
                                } else {
                                    throw new AnonymousClass0V8("Unsupported XZ filter chain");
                                }
                            } else if (r3[i8].BaJ()) {
                                int i9 = 0;
                                for (int i10 = 0; i10 < i4; i10++) {
                                    if (r3[i10].ACb()) {
                                        i9++;
                                    }
                                }
                                if (i9 <= 3) {
                                    int i11 = i;
                                    if (i >= 0) {
                                        int i12 = 0;
                                        for (int i13 = 0; i13 < i4; i13++) {
                                            i12 += r3[i13].AvE();
                                        }
                                        if (i12 > i11) {
                                            throw new AnonymousClass0V9(i12);
                                        }
                                    }
                                    AnonymousClass0DD r1 = new AnonymousClass0DD(inputStream2);
                                    this.A08 = r1;
                                    this.A03 = r1;
                                    int i14 = i4 - 1;
                                    InputStream inputStream4 = r1;
                                    while (i14 >= 0) {
                                        InputStream Ap9 = r3[i14].Ap9(inputStream4);
                                        this.A03 = Ap9;
                                        i14--;
                                        inputStream4 = Ap9;
                                    }
                                    return;
                                }
                                throw new AnonymousClass0V8("Unsupported XZ filter chain");
                            } else {
                                throw new AnonymousClass0V8("Unsupported XZ filter chain");
                            }
                        }
                    } catch (IOException unused) {
                        throw new AnonymousClass0VZ("XZ Block Header is corrupt");
                    }
                } else {
                    throw new AnonymousClass0V8("Unsupported options in XZ Block Header");
                }
            } else {
                throw new AnonymousClass0VZ("XZ Block Header is corrupt");
            }
        } else {
            throw new AnonymousClass0CR();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r7 == -1) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r15, int r16, int r17) {
        /*
            r14 = this;
            boolean r0 = r14.A05
            r9 = -1
            if (r0 == 0) goto L_0x0006
            return r9
        L_0x0006:
            java.io.InputStream r8 = r14.A03
            r10 = r17
            r1 = r16
            int r7 = r8.read(r15, r1, r10)
            r6 = 1
            if (r7 <= 0) goto L_0x0056
            X.0AN r0 = r14.A09
            r0.A00(r15, r1, r7)
            long r4 = r14.A01
            long r0 = (long) r7
            long r4 = r4 + r0
            r14.A01 = r4
            X.0DD r0 = r14.A08
            long r2 = r0.A00
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            long r0 = r14.A04
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0050
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0050
            long r0 = r14.A02
            r11 = -1
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x003e
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
        L_0x003e:
            if (r7 < r10) goto L_0x0044
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00ad
        L_0x0044:
            int r0 = r8.read()
            if (r0 == r9) goto L_0x0058
            X.0VZ r0 = new X.0VZ
            r0.<init>()
            throw r0
        L_0x0050:
            X.0VZ r0 = new X.0VZ
            r0.<init>()
            throw r0
        L_0x0056:
            if (r7 != r9) goto L_0x00ad
        L_0x0058:
            X.0DD r0 = r14.A08
            long r3 = r0.A00
            long r1 = r14.A00
            r10 = -1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0090
        L_0x0068:
            long r8 = r14.A02
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            long r0 = r14.A01
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0090
        L_0x0074:
            r8 = 1
            long r8 = r8 + r3
            r0 = 3
            long r3 = r3 & r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0096
            java.io.DataInputStream r0 = r14.A07
            int r0 = r0.readUnsignedByte()
            if (r0 != 0) goto L_0x008a
            r3 = r8
            goto L_0x0074
        L_0x008a:
            X.0VZ r0 = new X.0VZ
            r0.<init>()
            throw r0
        L_0x0090:
            X.0VZ r0 = new X.0VZ
            r0.<init>()
            throw r0
        L_0x0096:
            X.0AN r2 = r14.A09
            int r0 = r2.A00
            byte[] r1 = new byte[r0]
            java.io.DataInputStream r0 = r14.A07
            r0.readFully(r1)
            byte[] r0 = r2.A01()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x00ae
            r14.A05 = r6
        L_0x00ad:
            return r7
        L_0x00ae:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r0 = "Integrity check ("
            r1.append(r0)
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ") does not match"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.0VZ r0 = new X.0VZ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02840Dc.read(byte[], int, int):int");
    }
}
