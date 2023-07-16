package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape122S0000000_1_I2;

/* renamed from: X.3bE  reason: invalid class name and case insensitive filesystem */
public final class C62973bE {
    public static void A01(Context context) {
        C63643hy.A04(new AnonymousClass4QO(context));
    }

    public static void A02(Context context, AnonymousClass3XX r4) {
        String errorTitle;
        Object obj = r4.A00;
        if (obj != null) {
            C85814vo r2 = (C85814vo) obj;
            if (r2.isFeedbackRequired()) {
                return;
            }
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                if (r2.getErrorTitle() == null) {
                    errorTitle = context.getString(2131826851);
                } else {
                    errorTitle = r2.getErrorTitle();
                }
                A04(context, r2.getErrorMessage(), errorTitle);
                return;
            }
            return;
        }
        A01(context);
    }

    public static C25828Dsm A00(Context context) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131826851);
        A0W.A0P(new IDxCListenerShape122S0000000_1_I2(3), 2131826195);
        return A0W;
    }

    public static void A03(Context context, CharSequence charSequence, String str) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0p(charSequence);
        A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
        if (str != null) {
            A0W.A02 = str;
        }
        C63643hy.A04(new AnonymousClass4QN(A0W));
    }

    public static void A04(Context context, CharSequence charSequence, String str) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0p(charSequence);
        A0W.A0P((DialogInterface.OnClickListener) null, 2131826195);
        if (str != null) {
            A0W.A02 = str;
        }
        C63643hy.A04(new AnonymousClass4QN(A0W));
    }
}
