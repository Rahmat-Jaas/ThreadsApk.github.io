package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.44Y  reason: invalid class name */
public final class AnonymousClass44Y implements C11630kW, AnonymousClass0i4 {
    public static final String __redex_internal_original_name = "QPAnalyticsLoggerImpl";
    public final UserSession A00;

    public final void A00(String str, String str2, String str3, Map map, boolean z, boolean z2) {
        C04220Ms.A0B(str, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A00), "ig_quick_promotion_events"), 1414);
        if (AnonymousClass0wJ.A1U(A0I)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("triggers_fired", map.toString());
            String str4 = "true";
            String str5 = "false";
            if (z) {
                str5 = str4;
            }
            A0y.put("skipping_cache", str5);
            if (!z2) {
                str4 = "false";
            }
            A0y.put("skipping_cooldown", str4);
            A0y.put("source", str2);
            A0y.put("cache_state", str3);
            A0I.A0T("qp_location", str);
            A0I.A1g(A0y);
            A0I.Bb4();
        }
    }

    public final String getModuleName() {
        return "quick_promotion";
    }

    public final void onSessionWillEnd() {
        this.A00.A03(AnonymousClass44Y.class);
    }

    public AnonymousClass44Y(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void A01(String str, String str2, boolean z) {
        AnonymousClass0wJ.A1N(str, str2);
        if (z) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A00), "qp_eligibility_waterfall"), 2547);
            A0I.A0S("promotion_id", AnonymousClass0wJ.A0d(str2));
            C18190wL.A1I(A0I, str);
            A0I.Bb4();
        }
    }
}
