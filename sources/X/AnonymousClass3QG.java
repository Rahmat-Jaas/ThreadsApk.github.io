package X;

/* renamed from: X.3QG  reason: invalid class name */
public final class AnonymousClass3QG {
    public static byte[] A00 = {119, 97, 119, 119, 109, 107, 106, 91, 109, 96, 6, 5, 29, 45, 20, 19, 17, 45, 1, 6, 19, 0, 6, 45, 1, 6, 19, 6, 23, 45, 28, 19, 31, 23, 93, 91, 77, 90, 70, 73, 69, 77};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 111, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
