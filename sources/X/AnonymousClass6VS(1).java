package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6VS  reason: invalid class name */
public final class AnonymousClass6VS {
    public static void A00(AnonymousClass6BF r7, UserSession userSession, User user) {
        C13330nS A01 = C13330nS.A01((C11630kW) null, userSession);
        user.A02();
        B5H A012 = B5H.A01(userSession.getUserId());
        B5H A00 = B5H.A00(user);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "ig_ro_growth_friction"), 1428);
        AnonymousClass28U r3 = AnonymousClass28U.FRICTION_INTERVENTION;
        AnonymousClass0A2 r2 = A0I.A00;
        if (r2.isSampled()) {
            A0I.A0O(AnonymousClass6B9.FOLLOW, "category");
            A0I.A0O(r7, "event");
            A0I.A0T("intervention_name", "Follow Friction");
            r2.A7c(A00, "target_user_ig_id");
            A0I.A0O(r3, "subevent");
            r2.A7c(A012, "viewer_user_ig_id");
            A0I.Bb4();
        }
    }
}
