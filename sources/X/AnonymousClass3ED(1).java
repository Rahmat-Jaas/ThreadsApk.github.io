package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3ED  reason: invalid class name */
public final class AnonymousClass3ED {
    public final C13330nS A00;

    public AnonymousClass3ED(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = C13330nS.A01(r2, userSession);
    }

    public final void A00(String str, Map map) {
        AnonymousClass0wJ.A1N(str, map);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ads_consent_value_engagement"), 14);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18230wP.A1G(A0I, str);
            A0I.A0T("event_target", "consent_growth_bottom_sheet");
            A0I.A0V("event_target_info", map);
            A0I.Bb4();
        }
    }
}
