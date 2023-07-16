package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.HashMap;

/* renamed from: X.3LL  reason: invalid class name */
public final class AnonymousClass3LL {
    public static final void A00(C10300i6 r4, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "caa_login_client_events_ig"), 120);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C09120et A0X = C18190wL.A0X();
            AnonymousClass14G r3 = new AnonymousClass14G();
            r3.A0A("event", str);
            r3.A0A("event_flow", str2);
            if (str4 == null || str4.length() == 0) {
                str4 = "home_page";
            }
            r3.A0A("event_step", str4);
            r3.A0A("event_category", str3);
            r3.A0C("extra_client_data", hashMap);
            r3.A09("exception_code", (Long) null);
            r3.A0A("exception_message", str5);
            r3.A0A("waterfall_id", A0X.A0D());
            A0I.A0P(r3, "core");
            A0I.A0P(new AnonymousClass14H(), "login_params");
            A0I.Bb4();
        }
    }
}
