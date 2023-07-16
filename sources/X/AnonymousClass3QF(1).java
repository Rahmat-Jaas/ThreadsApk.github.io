package X;

/* renamed from: X.3QF  reason: invalid class name */
public final class AnonymousClass3QF {
    public static byte[] A00 = {37, 51, 37, 37, 63, 57, 56, 9, 63, 50, 82, 81, 73, 121, 64, 71, 69, 121, 85, 82, 71, 84, 82, 121, 85, 82, 71, 82, 67, 121, 72, 71, 75, 67, 6, 0, 22, 1, 29, 18, 30, 22};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 26, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
