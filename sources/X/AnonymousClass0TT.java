package X;

/* renamed from: X.0TT  reason: invalid class name */
public final class AnonymousClass0TT implements AnonymousClass09H {
    public static final int[] A01 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    public int A00;

    public AnonymousClass0TT(int i) {
        this.A00 = i;
    }

    public final int ADW(byte[] bArr, int i, int i2) {
        int i3 = (i + i2) - 16;
        int i4 = i;
        while (true) {
            if (i4 <= i3) {
                int i5 = A01[bArr[i4] & 31];
                int i6 = 5;
                int i7 = 0;
                do {
                    if (((i5 >>> i7) & 1) != 0) {
                        int i8 = i6 >>> 3;
                        int i9 = i6 & 7;
                        long j = 0;
                        int i10 = 0;
                        do {
                            j |= (((long) bArr[(i4 + i8) + i10]) & 255) << (i10 << 3);
                            i10++;
                        } while (i10 < 6);
                        long j2 = j >>> i9;
                        if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                            long j3 = (long) ((((((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4) - ((this.A00 + i4) - i)) >>> 4);
                            long j4 = ((((j2 & -77309403137L) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i9) | (((long) ((1 << i9) - 1)) & j);
                            int i11 = 0;
                            do {
                                bArr[i4 + i8 + i11] = (byte) ((int) (j4 >>> (i11 << 3)));
                                i11++;
                            } while (i11 < 6);
                        }
                    }
                    i7++;
                    i6 += 41;
                } while (i7 < 3);
                i4 += 16;
            } else {
                int i12 = i4 - i;
                this.A00 += i12;
                return i12;
            }
        }
    }
}
