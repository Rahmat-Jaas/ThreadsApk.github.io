package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRCallbackShape819S0100000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6N4  reason: invalid class name */
public final class AnonymousClass6N4 {
    public static final void A00(Activity activity, UserSession userSession, String str, String str2) {
        FragmentActivity fragmentActivity;
        Activity activity2 = activity;
        AnonymousClass0wJ.A1Q(activity, str2);
        UserSession userSession2 = userSession;
        User A0P = C18210wN.A0P(userSession, str2);
        if (A0P != null) {
            if (!A0P.BRq()) {
                AnonymousClass03G.A00(activity2.getWindow(), true);
            }
            C37006Jih jih = C37006Jih.A00;
            if (activity2 instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activity2;
            } else {
                fragmentActivity = null;
            }
            jih.A00(activity2, fragmentActivity, userSession2, A0P, new IDxRCallbackShape819S0100000_2_I2(activity2, 0), str, A0P.BK7());
        }
    }
}
