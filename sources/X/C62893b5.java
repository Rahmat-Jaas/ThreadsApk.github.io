package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3b5  reason: invalid class name and case insensitive filesystem */
public final class C62893b5 {
    public static void A00(AnonymousClass0A3 r2, AnonymousClass0V3 r3, C09120et r4, String str, Map map) {
        r3.A0A("event", str);
        r3.A0A("event_flow", "aymh");
        r3.A0A("event_step", "home_page");
        r3.A0A("event_category", "prefill_login_signal");
        r3.A0A("waterfall_id", r4.A0D());
        r3.A0C("extra_client_data", map);
        r2.A0P(r3, "core");
        r2.A0P(new AnonymousClass14E(), "aymh_params");
        r2.Bb4();
    }

    public static final void A03(C10300i6 r6, String str, String str2) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "caa_aymh_client_events_ig"), 119);
        if (AnonymousClass0wJ.A1U(A0I)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            C09120et A0X = C18190wL.A0X();
            A0y.put("credential_type", str);
            A0y.put("error", str2);
            A00(A0I, new AnonymousClass14F(), A0X, "ig_aymh_load_account_failed", A0y);
        }
    }

    public static final void A01(C10300i6 r4, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "caa_aymh_client_events_ig"), 119);
        if (AnonymousClass0wJ.A1U(A0I)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            C09120et A0X = C18190wL.A0X();
            A0y.put("credential_type", str);
            A00(A0I, new AnonymousClass14F(), A0X, "ig_aymh_load_account_attempted", A0y);
        }
    }

    public static final void A02(C10300i6 r3, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0W(r3), "caa_aymh_client_events_ig"), 119);
        if (AnonymousClass0wJ.A1U(A0I)) {
            AnonymousClass14F r2 = new AnonymousClass14F();
            r2.A0A("event", str);
            r2.A0A("event_flow", "aymh");
            r2.A0A("event_step", "home_page");
            r2.A0A("event_category", "prefill_login_signal");
            A0I.A0P(r2, "core");
            A0I.A0P(new AnonymousClass14E(), "aymh_params");
            A0I.Bb4();
        }
    }

    public static final void A04(C10300i6 r4, String str, List list) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "caa_aymh_client_events_ig"), 119);
        if (AnonymousClass0wJ.A1U(A0I)) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            C09120et A0X = C18190wL.A0X();
            A0y.put("profile_uid", list.toString());
            A0y.put("credential_type", str);
            A00(A0I, new AnonymousClass14F(), A0X, "ig_aymh_load_account_succeeded", A0y);
        }
    }
}
