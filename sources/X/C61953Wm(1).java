package X;

/* renamed from: X.3Wm  reason: invalid class name and case insensitive filesystem */
public final class C61953Wm {
    public static byte[] A00 = {-77, -65, -67, 126, -71, -66, -61, -60, -79, -73, -62, -79, -67, 126, -71, -66, -60, -75, -62, -79, -77, -60, -71, -65, -66, -61, 126, -77, -65, -59, -66, -60, -62, -55, -81, -61, -75, -60, -60, -71, -66, -73, -61, -91, -90, -73, -86, -92, -90, -96, -86, -91, -56, -70, -56, -56, -66, -60, -61, -76, -66, -71};

    public static String A00() {
        return A01(52, 10, 34);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 51, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
