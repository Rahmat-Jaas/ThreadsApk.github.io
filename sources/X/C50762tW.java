package X;

import android.content.Context;

/* renamed from: X.2tW  reason: invalid class name and case insensitive filesystem */
public final class C50762tW {
    public static final void A00(Context context, int i) {
        int i2;
        String string;
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131829742);
        if (i == 1000) {
            i2 = 2131829741;
            string = context.getString(i2);
        } else if (i != 60000) {
            string = AnonymousClass0wJ.A0l(context, Integer.valueOf(i / 1000), 2131829739);
        } else {
            i2 = 2131829740;
            string = context.getString(i2);
        }
        A0W.A0p(string);
        C18180wK.A1M(A0W);
        A0W.A0q(true);
        A0W.A0r(true);
        AnonymousClass0wJ.A1K(A0W);
    }
}
