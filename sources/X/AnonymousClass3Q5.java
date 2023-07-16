package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3Q5  reason: invalid class name */
public final class AnonymousClass3Q5 {
    public static byte[] A00 = {99, 98, 113, 110, 100, 98, 88, 110, 99, 29, 5, 2, 3, 8, 50, 3, 24, 0, 15, 8, 31, 2, 20, 2, 2, 24, 30, 31, 46, 24, 21, 97, 103, 113, 102, 122, 117, 121, 113, 18, 1, 22, DalvikInternals.IOPRIO_CLASS_SHIFT, 2, DalvikInternals.IOPRIO_CLASS_SHIFT, 7, 5, 16, DalvikInternals.IOPRIO_CLASS_SHIFT, 11, 10, 59, 7, 11, 0, 1};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 43, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
