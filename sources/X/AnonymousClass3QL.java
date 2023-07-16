package X;

/* renamed from: X.3QL  reason: invalid class name */
public final class AnonymousClass3QL {
    public static byte[] A00 = {3, 4, 21, 8, 2, 4, -2, 8, 3, -69, -77, -70, -71, -80, -86, -71, -64, -72, -83, -80, -67, -41, -55, -41, -41, -51, -45, -46, -61, -51, -56, 43, 46, 38, 22, 29, 24, 26, 26, 24, 10, 23, 19, 6, 18, 10};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 60, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
