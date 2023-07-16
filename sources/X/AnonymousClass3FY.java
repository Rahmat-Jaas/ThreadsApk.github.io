package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3FY  reason: invalid class name */
public final class AnonymousClass3FY {
    public final C13330nS A00;
    public final C11630kW A01;
    public final UserSession A02;

    public AnonymousClass3FY(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = C13330nS.A01(r2, userSession);
    }

    public final void A00(String str, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "instagram_wellbeing_safety_check_action"), 2334);
        A0I.A0T("surface", "evergreen_safety_check");
        C18250wR.A11(A0I, "quick_promotion", map);
        C18210wN.A1A(A0I, "click");
        C18190wL.A1I(A0I, str);
        A0I.Bb4();
    }
}
