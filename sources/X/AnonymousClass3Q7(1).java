package X;

/* renamed from: X.3Q7  reason: invalid class name */
public final class AnonymousClass3Q7 {
    public static byte[] A00 = {80, 81, 98, 85, 79, 81, 75, 85, 80, 112, 98, 112, 112, 102, 108, 107, 92, 102, 97, 53, 51, 34, 47, 52, 49, 34, 51, 38, 47, 36, 58, 57, 55, 41, 54, 50, 37, 49, 41};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 126, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
