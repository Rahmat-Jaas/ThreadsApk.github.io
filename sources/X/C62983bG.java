package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3bG  reason: invalid class name and case insensitive filesystem */
public final class C62983bG {
    public static byte[] A00 = {52, 53, 38, 57, 51, 53, 15, 57, 52, 31, 7, 0, 1, 10, 48, 1, 26, 2, DalvikInternals.IOPRIO_CLASS_SHIFT, 10, 29, 3, 21, 3, 3, 25, 31, 30, 47, 25, 20, 88, 94, 72, 95, 67, 76, 64, 72, 3, 16, 7, 28, 19, 28, 22, 20, 1, 28, 26, 27, 42, 22, 26, 17, 16};

    public static String A00() {
        return A03(9, 12, 69);
    }

    public static String A01() {
        return A03(31, 8, 7);
    }

    public static String A02(int i) {
        return A03(i, 9, 122);
    }

    public static String A03(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 42, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
