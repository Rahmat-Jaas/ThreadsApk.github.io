package X;

import com.facebook.common.dextricks.Constants;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0C2  reason: invalid class name */
public final class AnonymousClass0C2 extends InputStream {
    public int A00 = 0;
    public DataInputStream A01;
    public IOException A02 = null;
    public AnonymousClass0Tb A03;
    public boolean A04 = false;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public final AnonymousClass09Y A08;
    public final AnonymousClass0Ta A09 = new AnonymousClass0Ta(Constants.LOAD_RESULT_PGO_ATTEMPTED);

    public AnonymousClass0C2(InputStream inputStream, int i) {
        this.A01 = new DataInputStream(inputStream);
        if (i < 4096 || i > 2147483632) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unsupported dictionary size ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        this.A08 = new AnonymousClass09Y((i + 15) & -16);
    }

    public final int available() {
        Throwable th;
        if (this.A01 != null) {
            th = this.A02;
            if (th == null) {
                return this.A00;
            }
        } else {
            th = new C02330As("Stream closed");
        }
        throw th;
    }

    public final void close() {
        DataInputStream dataInputStream = this.A01;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
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

    public final int read(byte[] bArr, int i, int i2) {
        Throwable th;
        int i3;
        AnonymousClass0VZ r0;
        AnonymousClass09Y r12;
        byte[] bArr2;
        int length;
        int i4;
        int[] iArr;
        int i5;
        int length2;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0) {
            byte[] bArr3 = bArr;
            if (i3 <= bArr3.length) {
                int i10 = 0;
                if (i2 != 0) {
                    if (this.A01 != null) {
                        th = this.A02;
                        if (th == null) {
                            if (!this.A04) {
                                while (true) {
                                    try {
                                        if (this.A00 == 0) {
                                            int readUnsignedByte = this.A01.readUnsignedByte();
                                            if (readUnsignedByte != 0) {
                                                if (readUnsignedByte < 224 && readUnsignedByte != 1) {
                                                    if (this.A06) {
                                                        r0 = new AnonymousClass0VZ();
                                                        break;
                                                    }
                                                } else {
                                                    this.A07 = true;
                                                    this.A06 = false;
                                                    AnonymousClass09Y r02 = this.A08;
                                                    r02.A05 = 0;
                                                    r02.A04 = 0;
                                                    r02.A00 = 0;
                                                    r02.A01 = 0;
                                                    byte[] bArr4 = r02.A06;
                                                    bArr4[bArr4.length - 1] = 0;
                                                }
                                                if (readUnsignedByte < 128) {
                                                    if (readUnsignedByte > 2) {
                                                        r0 = new AnonymousClass0VZ();
                                                        break;
                                                    }
                                                    this.A05 = false;
                                                    this.A00 = this.A01.readUnsignedShort() + 1;
                                                } else {
                                                    this.A05 = true;
                                                    int i11 = (readUnsignedByte & 31) << 16;
                                                    this.A00 = i11;
                                                    this.A00 = i11 + this.A01.readUnsignedShort() + 1;
                                                    int readUnsignedShort = this.A01.readUnsignedShort() + 1;
                                                    if (readUnsignedByte < 192) {
                                                        if (this.A07) {
                                                            r0 = new AnonymousClass0VZ();
                                                            break;
                                                        } else if (readUnsignedByte >= 160) {
                                                            this.A03.A00();
                                                        }
                                                    } else {
                                                        this.A07 = false;
                                                        int readUnsignedByte2 = this.A01.readUnsignedByte();
                                                        if (readUnsignedByte2 > 224) {
                                                            r0 = new AnonymousClass0VZ();
                                                            break;
                                                        }
                                                        int i12 = readUnsignedByte2 / 45;
                                                        int i13 = readUnsignedByte2 - ((i12 * 9) * 5);
                                                        int i14 = i13 / 9;
                                                        int i15 = i13 - (i14 * 9);
                                                        if (i15 + i14 > 4) {
                                                            r0 = new AnonymousClass0VZ();
                                                            break;
                                                        }
                                                        this.A03 = new AnonymousClass0Tb(this.A08, this.A09, i15, i14, i12);
                                                    }
                                                    AnonymousClass0Ta r7 = this.A09;
                                                    DataInputStream dataInputStream = this.A01;
                                                    if (readUnsignedShort >= 5) {
                                                        if (dataInputStream.readUnsignedByte() != 0) {
                                                            r0 = new AnonymousClass0VZ();
                                                            break;
                                                        }
                                                        r7.A00 = dataInputStream.readInt();
                                                        r7.A03 = -1;
                                                        r7.A02 = 0;
                                                        int i16 = readUnsignedShort - 5;
                                                        r7.A01 = i16;
                                                        dataInputStream.readFully(r7.A04, 0, i16);
                                                    } else {
                                                        r0 = new AnonymousClass0VZ();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                this.A04 = true;
                                            }
                                            if (this.A04) {
                                                if (i10 != 0) {
                                                    return i10;
                                                }
                                            }
                                        }
                                        int min = Math.min(this.A00, i8);
                                        if (this.A05) {
                                            r12 = this.A08;
                                            bArr2 = r12.A06;
                                            length = bArr2.length;
                                            int i17 = length;
                                            int i18 = r12.A04;
                                            if (length - i18 > min) {
                                                i17 = i18 + min;
                                            }
                                            r12.A01 = i17;
                                            AnonymousClass0Tb r10 = this.A03;
                                            AnonymousClass09Y r9 = r10.A01;
                                            int i19 = r9.A03;
                                            if (i19 > 0) {
                                                r9.A00(r9.A02, i19);
                                            }
                                            while (true) {
                                                int i20 = r9.A04;
                                                if (i20 >= r9.A01) {
                                                    break;
                                                }
                                                int i21 = i20 & r10.A00;
                                                AnonymousClass0Ta r1 = r10.A06;
                                                short[][] sArr = r10.A0F;
                                                AnonymousClass09J r72 = r10.A05;
                                                int i22 = r72.A00;
                                                if (r1.A00(sArr[i22], i21) == 0) {
                                                    AnonymousClass0Te r73 = r10.A04;
                                                    AnonymousClass09Y r3 = r73.A03.A01;
                                                    int i23 = r3.A04;
                                                    int i24 = i23 - 1;
                                                    if (0 >= i23) {
                                                        i24 += r3.A06.length;
                                                    }
                                                    int i25 = r73.A01;
                                                    AnonymousClass0Ti r8 = r73.A00[((r3.A06[i24] & 255) >> (8 - i25)) + ((i23 & r73.A02) << i25)];
                                                    AnonymousClass0Tb r74 = r8.A01.A03;
                                                    AnonymousClass09J r4 = r74.A05;
                                                    boolean z = false;
                                                    if (r4.A00 < 7) {
                                                        z = true;
                                                    }
                                                    int i26 = 1;
                                                    if (!z) {
                                                        AnonymousClass09Y r32 = r74.A01;
                                                        int i27 = r74.A07[0];
                                                        int i28 = r32.A04;
                                                        int i29 = (i28 - i27) - 1;
                                                        if (i27 >= i28) {
                                                            i29 += r32.A06.length;
                                                        }
                                                        int i30 = r32.A06[i29] & 255;
                                                        int i31 = 256;
                                                        int i32 = 1;
                                                        do {
                                                            i30 <<= 1;
                                                            int i33 = i30 & i31;
                                                            int A002 = r74.A06.A00(r8.A00, i31 + i33 + i32);
                                                            i32 = (i32 << 1) | A002;
                                                            i31 &= (i33 ^ -1) ^ (-A002);
                                                        } while (i32 < 256);
                                                        i26 = i32;
                                                    } else {
                                                        do {
                                                            i26 = r74.A06.A00(r8.A00, i26) | (i26 << 1);
                                                        } while (i26 < 256);
                                                    }
                                                    AnonymousClass09Y r75 = r74.A01;
                                                    byte b = (byte) i26;
                                                    byte[] bArr5 = r75.A06;
                                                    int i34 = r75.A04;
                                                    int i35 = i34 + 1;
                                                    r75.A04 = i35;
                                                    bArr5[i34] = b;
                                                    if (r75.A00 < i35) {
                                                        r75.A00 = i35;
                                                    }
                                                    int i36 = r4.A00;
                                                    if (i36 <= 3) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = i36 - 6;
                                                        if (i36 <= 9) {
                                                            i7 = i36 - 3;
                                                        }
                                                    }
                                                    r4.A00 = i7;
                                                } else {
                                                    if (r1.A00(r10.A09, i22) == 0) {
                                                        int i37 = 7;
                                                        if (i22 >= 7) {
                                                            i37 = 10;
                                                        }
                                                        r72.A00 = i37;
                                                        int[] iArr2 = r10.A07;
                                                        iArr2[3] = iArr2[2];
                                                        iArr2[2] = iArr2[1];
                                                        iArr2[1] = iArr2[0];
                                                        i4 = r10.A02.A00(i21);
                                                        short[][] sArr2 = r10.A0D;
                                                        int i38 = 3;
                                                        if (i4 < 6) {
                                                            i38 = i4 - 2;
                                                        }
                                                        short[] sArr3 = sArr2[i38];
                                                        int i39 = 1;
                                                        do {
                                                            i39 = r1.A00(sArr3, i39) | (i39 << 1);
                                                            length2 = sArr3.length;
                                                        } while (i39 < length2);
                                                        int i40 = i39 - length2;
                                                        if (i40 >= 4) {
                                                            int i41 = (i40 >> 1) - 1;
                                                            int i42 = ((i40 & 1) | 2) << i41;
                                                            iArr2[0] = i42;
                                                            if (i40 >= 14) {
                                                                int i43 = i41 - 4;
                                                                int i44 = 0;
                                                                do {
                                                                    r1.A01();
                                                                    int i45 = r1.A03 >>> 1;
                                                                    r1.A03 = i45;
                                                                    int i46 = r1.A00;
                                                                    int i47 = (i46 - i45) >>> 31;
                                                                    r1.A00 = i46 - (i45 & (i47 - 1));
                                                                    i44 = (i44 << 1) | (1 - i47);
                                                                    i43--;
                                                                } while (i43 != 0);
                                                                i42 = (i44 << 4) | i42;
                                                                iArr2[0] = i42;
                                                                short[] sArr4 = r10.A08;
                                                                i6 = 0;
                                                                int i48 = 0;
                                                                int i49 = 1;
                                                                while (true) {
                                                                    int A003 = r1.A00(sArr4, i49);
                                                                    i49 = (i49 << 1) | A003;
                                                                    int i50 = i48 + 1;
                                                                    i6 |= A003 << i48;
                                                                    if (i49 >= sArr4.length) {
                                                                        break;
                                                                    }
                                                                    i48 = i50;
                                                                }
                                                            } else {
                                                                short[] sArr5 = r10.A0E[i40 - 4];
                                                                i6 = 0;
                                                                int i51 = 0;
                                                                int i52 = 1;
                                                                while (true) {
                                                                    int A004 = r1.A00(sArr5, i52);
                                                                    i52 = (i52 << 1) | A004;
                                                                    int i53 = i51 + 1;
                                                                    i6 |= A004 << i51;
                                                                    if (i52 >= sArr5.length) {
                                                                        break;
                                                                    }
                                                                    i51 = i53;
                                                                }
                                                            }
                                                            i40 = i6 | i42;
                                                        }
                                                        iArr2[0] = i40;
                                                    } else {
                                                        if (r1.A00(r10.A0A, i22) != 0) {
                                                            if (r1.A00(r10.A0B, i22) == 0) {
                                                                iArr = r10.A07;
                                                                i5 = iArr[1];
                                                            } else {
                                                                int A005 = r1.A00(r10.A0C, i22);
                                                                iArr = r10.A07;
                                                                if (A005 == 0) {
                                                                    i5 = iArr[2];
                                                                } else {
                                                                    i5 = iArr[3];
                                                                    iArr[3] = iArr[2];
                                                                }
                                                                iArr[2] = iArr[1];
                                                            }
                                                            iArr[1] = iArr[0];
                                                            iArr[0] = i5;
                                                        } else if (r1.A00(r10.A0G[i22], i21) == 0) {
                                                            int i54 = 11;
                                                            if (i22 < 7) {
                                                                i54 = 9;
                                                            }
                                                            r72.A00 = i54;
                                                            i4 = 1;
                                                        }
                                                        int i55 = 11;
                                                        if (i22 < 7) {
                                                            i55 = 8;
                                                        }
                                                        r72.A00 = i55;
                                                        i4 = r10.A03.A00(i21);
                                                    }
                                                    r9.A00(r10.A07[0], i4);
                                                }
                                            }
                                            AnonymousClass0Ta r03 = r10.A06;
                                            r03.A01();
                                            if (r03.A02 > r03.A01) {
                                                r0 = new AnonymousClass0VZ();
                                                break;
                                            }
                                        } else {
                                            r12 = this.A08;
                                            DataInputStream dataInputStream2 = this.A01;
                                            bArr2 = r12.A06;
                                            length = bArr2.length;
                                            int i56 = r12.A04;
                                            int min2 = Math.min(length - i56, min);
                                            dataInputStream2.readFully(bArr2, i56, min2);
                                            int i57 = r12.A04 + min2;
                                            r12.A04 = i57;
                                            if (r12.A00 < i57) {
                                                r12.A00 = i57;
                                            }
                                        }
                                        int i58 = r12.A04;
                                        int i59 = r12.A05;
                                        int i60 = i58 - i59;
                                        if (i58 == length) {
                                            r12.A04 = 0;
                                        }
                                        System.arraycopy(bArr2, i59, bArr3, i9, i60);
                                        r12.A05 = r12.A04;
                                        i9 += i60;
                                        i8 -= i60;
                                        i10 += i60;
                                        int i61 = this.A00 - i60;
                                        this.A00 = i61;
                                        if (i61 == 0) {
                                            AnonymousClass0Ta r2 = this.A09;
                                            if (!(r2.A02 == r2.A01 && r2.A00 == 0 && r12.A03 <= 0)) {
                                                r0 = new AnonymousClass0VZ();
                                            }
                                        }
                                        if (i8 <= 0) {
                                            break;
                                        }
                                    } catch (IOException e) {
                                        this.A02 = e;
                                        throw e;
                                    }
                                }
                                throw r0;
                            }
                            return -1;
                        }
                        throw th;
                    }
                    throw new C02330As("Stream closed");
                }
                return i10;
            }
        }
        th = new IndexOutOfBoundsException();
        throw th;
    }
}
