package X;

import android.content.Context;

/* renamed from: X.3hO  reason: invalid class name and case insensitive filesystem */
public final class C63383hO {
    public static byte[] A00 = {-13, -12, 5, -8, -14, -12, -18, -10, 4, -8, -13, -101, -100, -83, -96, -102, -100, -106, -96, -101, -7, -12, -18, -10, -7, -20, -8, -16, -21, -29, -22, -23, -32, -38, -23, -16, -24, -35, -32, -19, -39, -53, -39, -39, -49, -43, -44, -59, -49, -54, 25, 20, 25, 21, 4, 24, 10, 10, 9, 4, 14, 9, -2, 1, -7, -23, -16, -21, -19, -2, -7, -4, -23, -13, -18, -17, -8, -2, -13, -16, -13, -17, -4, -48, -50, -64, -51, -55, -68, -56, -64, -54, -71, -58, -67, -70, -67, -73, -75, -56, -67, -61, -62, -77, -73, -61, -72, -71};

    public static String A00() {
        return A01(83, 8, 48);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 43, i4);
        }
        return C18250wR.A0b(A1W);
    }

    public static void A03(H1T h1t, String str) {
        h1t.A0O(A01(11, 9, 12), str);
    }

    public static boolean A04(Object obj) {
        return A01(28, 12, 80).equals(obj);
    }

    public static boolean A05(Object obj) {
        return A01(83, 8, 48).equals(obj);
    }

    public static void A02(Context context, H1T h1t) {
        h1t.A0O(A01(11, 9, 12), C09140ev.A00(context));
        h1t.A0O("guid", C09140ev.A02.A05(context));
    }
}
