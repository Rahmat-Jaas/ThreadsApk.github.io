package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3X0  reason: invalid class name */
public final class AnonymousClass3X0 {
    public static final C11630kW A00 = AnonymousClass446.A00;

    public static final void A01(String str, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A00, userSession), "payments_tap_entry_point"), 2488);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, str);
            String A04 = AnonymousClass1o2.A01("ads_manager").A04();
            C04220Ms.A06(A04);
            C18250wR.A0y(A0I, A04);
            A0I.Bb4();
        }
    }

    public static final void A00(C35394Iu2 iu2, UserSession userSession, String str) {
        AnonymousClass0wJ.A1N(iu2, str);
        C04220Ms.A0B(userSession, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "promoted_posts_start_step_error"), 2532);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18210wN.A1B(A0I, str);
            String A04 = AnonymousClass1o2.A01("boost_posts").A04();
            C04220Ms.A06(A04);
            C18250wR.A0y(A0I, A04);
            C18190wL.A1I(A0I, iu2.toString());
            A0I.A0T("fb_user_id", userSession.getUserId());
            A0I.Bb4();
        }
    }
}
