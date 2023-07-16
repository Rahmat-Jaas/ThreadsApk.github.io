package X;

import android.content.Context;

/* renamed from: X.2Qn  reason: invalid class name and case insensitive filesystem */
public final class C36232Qn {
    public static void A00(Context context, int i) {
        int i2;
        Object[] objArr;
        Integer valueOf;
        int ceil = (int) Math.ceil((double) (((float) i) / 60.0f));
        if (ceil > 1) {
            i2 = 2131836054;
            objArr = new Object[1];
            valueOf = Integer.valueOf(ceil);
        } else {
            i2 = 2131836055;
            objArr = new Object[1];
            valueOf = Integer.valueOf(i);
        }
        objArr[0] = valueOf;
        C62973bE.A03(context, context.getString(i2, objArr), context.getString(2131836056));
    }
}
