package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3Wl  reason: invalid class name and case insensitive filesystem */
public final class C61943Wl {
    public static byte[] A00 = {73, 72, 91, 68, 78, 72, 114, 68, 73, 80, 72, 79, 78, 69, Byte.MAX_VALUE, 78, 85, 77, 66, 69, 82, 27, DalvikInternals.IOPRIO_CLASS_SHIFT, 27, 27, 1, 7, 6, 55, 1, 12, 92, 90, 76, 91, 71, 72, 68, 76, 49, 34, 53, 46, 33, 46, 36, 38, 51, 46, 40, 41, 24, 36, 40, 35, 34};

    public static String A00() {
        return A01(31, 8, 29);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 52, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
