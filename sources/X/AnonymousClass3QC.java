package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3QC  reason: invalid class name */
public final class AnonymousClass3QC {
    public static byte[] A00 = {8, 20, 20, 16, 19, 90, 79, 79, 8, 5, 12, 16, 78, 9, 14, 19, 20, 1, 7, 18, 1, DalvikInternals.IOPRIO_CLASS_SHIFT, 78, 3, 15, DalvikInternals.IOPRIO_CLASS_SHIFT, 79, 82, 85, 88, 89, 84, 83, 82, 84, 87, 84, 87, 80, 84, 84, 85, 82, 78, 86, 81, 80, 91, 97, 80, 75, 83, 92, 91, 76, 15, 25, 15, 15, 21, 19, 18, 35, 21, 24};

    public static String A00(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 48, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
