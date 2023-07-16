package X;

/* renamed from: X.3Q9  reason: invalid class name */
public final class AnonymousClass3Q9 {
    public static byte[] A00 = {87, 86, 69, 90, 80, 86, 108, 90, 87, 119, 111, 104, 105, 98, 88, 105, 114, 106, 101, 98, 117, 88, 78, 88, 88, 66, 68, 69, 116, 66, 79, 121, Byte.MAX_VALUE, 105, 126, 98, 109, 97, 105};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 54, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
