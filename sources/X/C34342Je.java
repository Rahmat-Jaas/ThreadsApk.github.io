package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2Je  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34342Je {
    public static void A00(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        AnonymousClass0wJ.A1O(user, userSession);
        AnonymousClass0wJ.A1R(fragmentActivity, str);
        String id = user.getId();
        AnonymousClass0wJ.A1N(id, userSession);
        C04220Ms.A0B(str, 3);
        C25586DoM.A02(userSession, id, "user_list", str);
        C60113Ns.A01(fragmentActivity, userSession);
        throw null;
    }
}
