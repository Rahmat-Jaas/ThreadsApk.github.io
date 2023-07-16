package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2KP  reason: invalid class name */
public final class AnonymousClass2KP {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, fragmentActivity);
        String userId = userSession.getUserId();
        C04220Ms.A0B(userId, A1Y ? 1 : 0);
        C10650ih.A02(fragmentActivity, C62333Yi.A01().A04(fragmentActivity, C15430rJ.A01(AnonymousClass00U.A0d("instagram://accountquality/?actor_id=", userId, "&source=", str))));
    }
}
