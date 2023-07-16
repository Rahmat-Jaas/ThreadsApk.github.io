package X;

import java.lang.reflect.Array;

/* renamed from: X.5sU  reason: invalid class name */
public final class AnonymousClass5sU extends C105176d0 {
    public static final byte[] A03 = new byte[0];
    public C134767yJ A00;
    public byte[] A01 = A03;
    public final int[] A02 = new int[32];

    public final C134767yJ A00() {
        C134767yJ r8;
        int[] iArr;
        int i;
        C134767yJ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C114786tt r12 = this.A00;
        int i2 = r12.A01;
        int i3 = r12.A00;
        if (i2 < 40 || i3 < 40) {
            r8 = new C134767yJ(i2, i3);
            if (this.A01.length < i2) {
                this.A01 = new byte[i2];
            }
            int i4 = 0;
            do {
                iArr = this.A02;
                iArr[i4] = 0;
                i4++;
            } while (i4 < 32);
            for (int i5 = 1; i5 < 5; i5++) {
                byte[] A012 = r12.A01(this.A01, (i3 * i5) / 5);
                int i6 = (i2 << 2) / 5;
                for (int i7 = i2 / 5; i7 < i6; i7++) {
                    int i8 = (A012[i7] & 255) >> 3;
                    iArr[i8] = iArr[i8] + 1;
                }
            }
            int length = iArr.length;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (iArr[i12] > i9) {
                    i9 = iArr[i12];
                    i11 = i12;
                }
                if (iArr[i12] > i10) {
                    i10 = iArr[i12];
                }
            }
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = i15 - i11;
                int i17 = iArr[i15] * i16 * i16;
                if (i17 > i14) {
                    i13 = i15;
                    i14 = i17;
                }
            }
            if (i11 <= i13) {
                int i18 = i11;
                i11 = i13;
                i13 = i18;
            }
            if (i11 - i13 > (length >> 4)) {
                int i19 = i11 - 1;
                int i20 = i19;
                int i21 = -1;
                while (i19 > i13) {
                    int i22 = i19 - i13;
                    int i23 = i22 * i22 * (i11 - i19) * (i10 - iArr[i19]);
                    if (i23 > i21) {
                        i20 = i19;
                        i21 = i23;
                    }
                    i19--;
                }
                int i24 = i20 << 3;
                byte[] A002 = r12.A00();
                for (int i25 = 0; i25 < i3; i25++) {
                    int i26 = i25 * i2;
                    for (int i27 = 0; i27 < i2; i27++) {
                        if ((A002[i26 + i27] & 255) < i24) {
                            r8.A01(i27, i25);
                        }
                    }
                }
            } else {
                throw LXG.A00;
            }
        } else {
            byte[] A003 = r12.A00();
            int i28 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i28++;
            }
            int i29 = i3 >> 3;
            if ((i3 & 7) != 0) {
                i29++;
            }
            int i30 = i3 - 8;
            int i31 = i2 - 8;
            int[] iArr2 = new int[2];
            iArr2[1] = i28;
            iArr2[0] = i29;
            int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
            for (int i32 = 0; i32 < i29; i32++) {
                int i33 = i32 << 3;
                int i34 = i30;
                if (i33 > i34) {
                    i33 = i34;
                }
                for (int i35 = 0; i35 < i28; i35++) {
                    int i36 = i35 << 3;
                    int i37 = i31;
                    if (i36 > i37) {
                        i36 = i37;
                    }
                    int i38 = (i33 * i2) + i36;
                    byte b = 255;
                    int i39 = 0;
                    int i40 = 0;
                    byte b2 = 0;
                    do {
                        int i41 = 0;
                        do {
                            byte b3 = A003[i38 + i41] & 255;
                            i40 += b3;
                            if (b3 < b) {
                                b = b3;
                            }
                            if (b3 > b2) {
                                b2 = b3;
                            }
                            i41++;
                        } while (i41 < 8);
                        i = b2 - b;
                        if (i > 24) {
                            while (true) {
                                i39++;
                                i38 += i2;
                                if (i39 >= 8) {
                                    break;
                                }
                                int i42 = 0;
                                do {
                                    i40 += A003[i38 + i42] & 255;
                                    i42++;
                                } while (i42 < 8);
                            }
                        }
                        i39++;
                        i38 += i2;
                    } while (i39 < 8);
                    int i43 = i40 >> 6;
                    if (i <= 24) {
                        i43 = b >> 1;
                        if (i32 > 0 && i35 > 0) {
                            int[] iArr4 = iArr3[i32 - 1];
                            int i44 = i35 - 1;
                            int i45 = ((iArr4[i35] + (iArr3[i32][i44] << 1)) + iArr4[i44]) >> 2;
                            if (b < i45) {
                                i43 = i45;
                            }
                        }
                    }
                    iArr3[i32][i35] = i43;
                }
            }
            r8 = new C134767yJ(i2, i3);
            for (int i46 = 0; i46 < i29; i46++) {
                int i47 = i46 << 3;
                int i48 = i30;
                if (i47 > i48) {
                    i47 = i48;
                }
                int i49 = i29 - 3;
                int i50 = 2;
                if (i46 >= 2) {
                    i50 = Math.min(i46, i49);
                }
                for (int i51 = 0; i51 < i28; i51++) {
                    int i52 = i51 << 3;
                    int i53 = i31;
                    if (i52 > i53) {
                        i52 = i53;
                    }
                    int i54 = i28 - 3;
                    int i55 = 2;
                    if (i51 >= 2) {
                        i55 = Math.min(i51, i54);
                    }
                    int i56 = -2;
                    int i57 = 0;
                    do {
                        int[] iArr5 = iArr3[i50 + i56];
                        i57 += iArr5[i55 - 2] + iArr5[i55 - 1] + iArr5[i55] + iArr5[i55 + 1] + iArr5[i55 + 2];
                        i56++;
                    } while (i56 <= 2);
                    byte b4 = i57 / 25;
                    int i58 = (i47 * i2) + i52;
                    int i59 = 0;
                    while (i59 < 8) {
                        int i60 = 0;
                        do {
                            if ((A003[i58 + i60] & 255) <= b4) {
                                r8.A01(i52 + i60, i47 + i59);
                            }
                            i60++;
                        } while (i60 < 8);
                        i59++;
                        i58 += i2;
                    }
                }
            }
        }
        this.A00 = r8;
        return r8;
    }

    public AnonymousClass5sU(C114786tt r2) {
        super(r2);
    }
}
