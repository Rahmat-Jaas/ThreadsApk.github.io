package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.service.session.UserSession;

/* renamed from: X.3WZ  reason: invalid class name */
public final class AnonymousClass3WZ {
    public static final C83964sH A01(Activity activity, UserSession userSession, C83964sH r5) {
        if (!C63803iN.A0E(C18250wR.A0D(userSession, 2), userSession, 36325617913832610L)) {
            return r5;
        }
        return new AnonymousClass4NZ(activity, C49422rM.A00(userSession), r5);
    }

    public static final C84214sk A00(Activity activity, UserSession userSession, C84214sk r5) {
        AnonymousClass0wJ.A1N(r5, activity);
        if (!C63803iN.A0E(C18250wR.A0D(userSession, 2), userSession, 36325617913832610L)) {
            return r5;
        }
        return new C71884Kr(activity, r5, C49422rM.A00(userSession));
    }

    public static final void A02(Activity activity) {
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A0L(2131828441);
        A0W.A0K(2131828440);
        A0W.A0N((DialogInterface.OnClickListener) null, 2131831976);
        A0W.A0r(true);
        AnonymousClass0wJ.A1K(A0W);
    }
}
