package X;

/* renamed from: X.0TU  reason: invalid class name */
public final class AnonymousClass0TU implements AnonymousClass09H {
    public int A00;

    public AnonymousClass0TU(int i) {
        this.A00 = i + 4;
    }

    public final int ADW(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = i4 + 1;
            if ((bArr[i5] & 248) == 240) {
                int i6 = i4 + 3;
                if ((bArr[i6] & 248) == 248) {
                    int i7 = i4 + 2;
                    int i8 = (((((((bArr[i5] & 7) << 19) | ((bArr[i4] & 255) << 11)) | ((bArr[i6] & 7) << 8)) | (bArr[i7] & 255)) << 1) - ((this.A00 + i4) - i)) >>> 1;
                    bArr[i5] = (byte) (240 | ((i8 >>> 19) & 7));
                    bArr[i4] = (byte) (i8 >>> 11);
                    bArr[i6] = (byte) (((i8 >>> 8) & 7) | 248);
                    bArr[i7] = (byte) i8;
                    i4 = i7;
                }
            }
            i4 += 2;
        }
        int i9 = i4 - i;
        this.A00 += i9;
        return i9;
    }
}
