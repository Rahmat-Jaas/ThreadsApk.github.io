package X;

/* renamed from: X.3Q8  reason: invalid class name */
public final class AnonymousClass3Q8 {
    public static byte[] A00 = {104, 105, 122, 101, 111, 105, 83, 101, 104, 52, 34, 52, 52, 46, 40, 41, 24, 46, 35, 68, 66, 84, 67, 95, 80, 92, 84};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 100, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
