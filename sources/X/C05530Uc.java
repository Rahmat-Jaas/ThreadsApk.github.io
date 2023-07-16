package X;

/* renamed from: X.0Uc  reason: invalid class name and case insensitive filesystem */
public final class C05530Uc extends AnonymousClass0AN {
    public static final long[] A01;
    public long A00 = -1;

    static {
        long[] jArr = new long[256];
        A01 = jArr;
        int i = 0;
        do {
            long j = (long) i;
            int i2 = 0;
            do {
                int i3 = ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1));
                j >>>= 1;
                if (i3 == 0) {
                    j ^= -3932672073523589310L;
                }
                i2++;
            } while (i2 < 8);
            jArr[i] = j;
            i++;
        } while (i < 256);
    }

    public C05530Uc() {
        this.A00 = 8;
        this.A01 = "CRC64";
    }

    public final void A00(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            long[] jArr = A01;
            byte b = bArr[i];
            long j = this.A00;
            this.A00 = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i++;
        }
    }

    public final byte[] A01() {
        long j = this.A00 ^ -1;
        this.A00 = -1;
        byte[] bArr = new byte[8];
        int i = 0;
        do {
            bArr[i] = (byte) ((int) (j >> (i << 3)));
            i++;
        } while (i < 8);
        return bArr;
    }
}
