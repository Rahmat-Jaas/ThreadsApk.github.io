package X;

/* renamed from: X.0TS  reason: invalid class name */
public final class AnonymousClass0TS implements AnonymousClass09H {
    public int A00;

    public AnonymousClass0TS(int i) {
        this.A00 = i;
    }

    public final int ADW(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & 252) == 72) {
                int i5 = i4 + 3;
                if ((bArr[i5] & 3) == 1) {
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    int i8 = (((((bArr[i4] & 3) << 24) | ((bArr[i6] & 255) << 16)) | ((bArr[i7] & 255) << 8)) | (bArr[i5] & 252)) - ((this.A00 + i4) - i);
                    bArr[i4] = (byte) (((i8 >>> 24) & 3) | 72);
                    bArr[i6] = (byte) (i8 >>> 16);
                    bArr[i7] = (byte) (i8 >>> 8);
                    bArr[i5] = (byte) ((bArr[i5] & 3) | i8);
                }
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.A00 += i9;
        return i9;
    }
}
