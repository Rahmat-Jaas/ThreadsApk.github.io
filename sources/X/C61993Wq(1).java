package X;

import com.facebook.pando.TreeJNI;

/* renamed from: X.3Wq  reason: invalid class name and case insensitive filesystem */
public final class C61993Wq {
    public static byte[] A00 = {-20, -19, -2, -15, -21, -19, -25, -15, -20, -45, -59, -45, -45, -55, -49, -50, -65, -55, -60, -76, -78, -92, -79, -83, -96, -84, -92};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] - i3) - 42, i4);
        }
        return C18250wR.A0b(A1W);
    }

    public static String A01(TreeJNI treeJNI) {
        return treeJNI.getStringValue(A00(19, 8, 21));
    }
}
