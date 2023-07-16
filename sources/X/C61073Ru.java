package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3Ru  reason: invalid class name and case insensitive filesystem */
public final class C61073Ru {
    public final C13330nS A00;

    public static void A00(C35425Iuu iuu, C61073Ru r3, String str, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A00, "direct_icebreaker_settings_events"), 528);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1E(iuu, A0I);
            A0I.A0V("event_data", map);
            A0I.A1J(str);
            A0I.Bb4();
        }
    }

    public C61073Ru(C11630kW r2, UserSession userSession) {
        this.A00 = C13330nS.A01(r2, userSession);
    }
}
