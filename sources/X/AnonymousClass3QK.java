package X;

/* renamed from: X.3QK  reason: invalid class name */
public final class AnonymousClass3QK {
    public static byte[] A00 = {11, 19, 20, 21, 30, 36, 21, 14, 22, 25, 30, 9, 95, 73, 95, 95, 69, 67, 66, 115, 69, 72, 120, 126, 104, Byte.MAX_VALUE, 99, 108, 96, 104};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 118, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
