package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7Ch  reason: invalid class name and case insensitive filesystem */
public final class C120747Ch {
    public static final C120747Ch A00 = new C120747Ch();

    public static final void A00(AnonymousClass6BF r7, GrowthFrictionInterventionDetail growthFrictionInterventionDetail, UserSession userSession, User user, Integer num) {
        AnonymousClass28U r6;
        AnonymousClass6B9 r1;
        C13330nS A01 = C13330nS.A01((C11630kW) null, userSession);
        B5H A012 = B5H.A01(userSession.getUserId());
        B5H A013 = B5H.A01(user.getId());
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A01, "ig_ro_growth_friction"), 1428);
        String str = growthFrictionInterventionDetail.A00;
        if (C04220Ms.A0I(str, "Friction") || !C04220Ms.A0I(str, "Disable")) {
            r6 = AnonymousClass28U.FRICTION_INTERVENTION;
        } else {
            r6 = AnonymousClass28U.DISABLE_INTERVENTION;
        }
        AnonymousClass0A2 r4 = A0I.A00;
        if (r4.isSampled()) {
            if (num.intValue() != 2) {
                r1 = AnonymousClass6B9.TAG;
            } else {
                r1 = AnonymousClass6B9.MENTION;
            }
            A0I.A0O(r1, "category");
            A0I.A0O(r7, "event");
            A0I.A0T("intervention_name", growthFrictionInterventionDetail.A02);
            r4.A7c(A013, "target_user_ig_id");
            A0I.A0O(r6, "subevent");
            r4.A7c(A012, "viewer_user_ig_id");
            A0I.Bb4();
        }
    }
}
