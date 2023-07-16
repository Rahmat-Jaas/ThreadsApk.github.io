package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3Wp  reason: invalid class name and case insensitive filesystem */
public final class C61983Wp {
    public static byte[] A00 = {6, 7, 20, 11, 1, 7, 61, 11, 6, 111, 121, 111, 111, 117, 115, 114, 67, 117, 120, 23, 20, 12, 60, 5, 2, 0, 60, 16, 23, 2, 17, 23, 60, 16, 23, 2, 23, 6, 60, DalvikInternals.IOPRIO_CLASS_SHIFT, 2, 14, 6, 123, 125, 107, 124, 96, 111, 99, 107};

    public static String A00() {
        return A01(9, 10, 78);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 82, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
