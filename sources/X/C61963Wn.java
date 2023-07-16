package X;

/* renamed from: X.3Wn  reason: invalid class name and case insensitive filesystem */
public final class C61963Wn {
    public static byte[] A00 = {88, 64, 71, 70, 77, 119, 70, 93, 69, 74, 77, 90, 120, 110, 120, 120, 98, 100, 101, 84, 98, 111, 111, 105, Byte.MAX_VALUE, 104, 116, 123, 119, Byte.MAX_VALUE};

    public static String A00() {
        return A01(22, 8, 61);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 39, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
