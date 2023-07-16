package X;

/* renamed from: X.3a0  reason: invalid class name and case insensitive filesystem */
public final class C62443a0 {
    public static byte[] A00 = {15, 16, 33, 20, 14, 16, 10, 20, 15, -77, -91, -77, -77, -87, -81, -82, -97, -87, -92, -8, -10, -24, -11, -15, -28, -16, -24};

    public static void A01(AnonymousClass0A3 r3, String str) {
        r3.A0T(A00(9, 10, 0), str);
    }

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 64, i4);
        }
        return C18250wR.A0b(A1W);
    }

    public static void A02(AnonymousClass0A3 r3, String str) {
        r3.A0T(A00(9, 10, 0), str);
    }
}
