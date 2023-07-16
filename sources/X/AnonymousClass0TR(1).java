package X;

/* renamed from: X.0TR  reason: invalid class name */
public final class AnonymousClass0TR implements AnonymousClass09H {
    public int A00;

    public AnonymousClass0TR(int i) {
        this.A00 = i;
    }

    public final int ADW(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] == 64 && (bArr[i4 + 1] & 192) == 0) || (bArr[i4] == Byte.MAX_VALUE && (bArr[i4 + 1] & 192) == 192)) {
                int i5 = i4 + 1;
                int i6 = i4 + 2;
                int i7 = i4 + 3;
                int i8 = (((((((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16)) | ((bArr[i6] & 255) << 8)) | (bArr[i7] & 255)) << 2) - ((this.A00 + i4) - i)) >>> 2;
                int i9 = (i8 & 4194303) | (((-((i8 >>> 22) & 1)) << 22) & 1073741823) | 1073741824;
                bArr[i4] = (byte) (i9 >>> 24);
                bArr[i5] = (byte) (i9 >>> 16);
                bArr[i6] = (byte) (i9 >>> 8);
                bArr[i7] = (byte) i9;
            }
            i4 += 4;
        }
        int i10 = i4 - i;
        this.A00 += i10;
        return i10;
    }
}
