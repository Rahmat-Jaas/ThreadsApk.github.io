package X;

/* renamed from: X.3QH  reason: invalid class name */
public final class AnonymousClass3QH {
    public static byte[] A00 = {4, 5, 22, 9, 3, 5, 63, 9, 4, 117, 111, 72, 107, 115, 90, 125, Byte.MAX_VALUE, 89, 114, 125, 126, 112, 121, 120, 52, 34, 52, 52, 46, 40, 41, 24, 46, 35, 113, 114, 106, 67, 100, 102, 73, 108, 118, 117, 124, 70, 100, 105, 105, 103, 100, 102, 110, 87, 96, 116, 112, 96, 118, 113, 125, 126, 102, 86, 111, 104, 106, 86, 122, 125, 104, 123, 125, 86, 122, 125, 104, 125, 108, 86, 103, 104, 100, 108, 96, 102, 112, 103, 123, 116, 120, 112};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 16, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
