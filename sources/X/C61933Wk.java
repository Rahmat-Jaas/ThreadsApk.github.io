package X;

/* renamed from: X.3Wk  reason: invalid class name and case insensitive filesystem */
public final class C61933Wk {
    public static byte[] A00 = {33, 32, 51, 44, 38, 32, 26, 44, 33, 57, 33, 38, 39, 44, 22, 39, 60, 36, 43, 44, 59, 4, 18, 4, 4, 30, 24, 25, 40, 30, 19, 118, 112, 102, 113, 109, 98, 110, 102, 39, 52, 35, 56, 55, 56, 50, 48, 37, 56, 62, 63, 14, 50, 62, 53, 52};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 88, i4);
        }
        return C18250wR.A0b(A1W);
    }

    public static void A01(H1T h1t, String str, int i, int i2, int i3) {
        h1t.A0O(A00(i, i2, i3), str);
    }
}
