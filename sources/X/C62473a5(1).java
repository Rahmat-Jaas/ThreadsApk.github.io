package X;

import android.content.Context;

/* renamed from: X.3a5  reason: invalid class name and case insensitive filesystem */
public final class C62473a5 {
    public static byte[] A00 = {88, 90, 90, 86, 76, 87, 77, 74, 22, 93, 80, 74, 88, 91, 85, 92, 102, 77, 86, 77, 73, 102, 77, 78, 86, 102, 95, 88, 90, 77, 86, 75, 22, 22, 20, 20, 24, 2, 25, 3, 4, 88, 16, 18, 25, 18, 5, 22, 3, 18, 40, 3, 0, 24, 40, 17, 22, 20, 3, 24, 5, 40, 3, 24, 3, 7, 40, 28, 18, 14, 88, 9, 8, 27, 4, 14, 8, 50, 4, 9, 118, 110, 105, 104, 99, 89, 104, 115, 107, 100, 99, 116, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 54, 106, 124, 119, 125, 70, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 70, 124, 119, 120, 123, 117, 124, 70, 110, 113, 120, 109, 106, 120, 105, 105, 54};

    public static final C32165H8c A00(C10300i6 r3, String str, String str2) {
        C04220Ms.A0B(r3, 0);
        H1T A0O = AnonymousClass0wJ.A0O(r3);
        A0O.A0J(A01(92, 43, 74));
        A0O.A0B(AnonymousClass1T5.class, AnonymousClass3NF.class);
        A0O.A0O(A01(71, 9, 62), str2);
        return C18200wM.A0T(A0O, A01(80, 12, 85), str);
    }

    public static final void A02(Context context, C63873iU r6, C10300i6 r7) {
        C04220Ms.A0B(r7, 0);
        H1T A0O = AnonymousClass0wJ.A0O(r7);
        A0O.A0J(A01(33, 38, 36));
        A0O.A0O(A01(71, 9, 62), C09140ev.A00(context));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1RQ.class, AnonymousClass3NH.class);
        A0T.A00 = r6;
        C31155GhB.A03(A0T);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] A1W = C18220wO.A1W(A00, i, i2);
        int i4 = 0;
        while (i4 < A1W.length) {
            i4 = C18250wR.A02(A1W, (A1W[i4] ^ i3) ^ 83, i4);
        }
        return C18250wR.A0b(A1W);
    }
}
