package X;

/* renamed from: X.3QI  reason: invalid class name */
public final class AnonymousClass3QI {
    public static byte[] A00 = {57, 56, 43, 52, 62, 56, 2, 52, 57, 11, 29, 11, 11, 17, 23, 22, 39, 17, 28, 86, 80, 70, 81, 77, 66, 78, 70};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 79, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
