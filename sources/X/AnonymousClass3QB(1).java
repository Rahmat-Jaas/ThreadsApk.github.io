package X;

/* renamed from: X.3QB  reason: invalid class name */
public final class AnonymousClass3QB {
    public static byte[] A00 = {56, 57, 42, 53, 63, 57, 3, 53, 56, 107, 125, 107, 107, 113, 119, 118, 71, 113, 124, 0, 6, 16, 7, 27, 20, 24, 16};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 38, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
