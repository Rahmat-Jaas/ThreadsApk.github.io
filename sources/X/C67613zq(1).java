package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.mobileconfig.MobileConfigCxxLogger;
import java.util.Map;

/* renamed from: X.3zq  reason: invalid class name and case insensitive filesystem */
public final class C67613zq implements MobileConfigCxxLogger {
    public final C13330nS A00;

    public final void logCounter(String str, int i) {
        C04220Ms.A0B(str, 0);
    }

    public C67613zq(C10300i6 r2) {
        this.A00 = C13330nS.A02(r2);
    }

    public final void logEvent(String str, Map map) {
        USLEBaseShape0S0000000 A0I;
        AnonymousClass0wJ.A1N(str, map);
        if ("mobile_config_exposure_log".equals(str)) {
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_launcher_config_exposure"), 1252);
            String A0r = C18220wO.A0r("unit_id", map);
            Object obj = map.get("logging_id");
            String A0r2 = C18220wO.A0r("extra_ids", map);
            if (AnonymousClass0wJ.A1U(A0I)) {
                if (A0r == null) {
                    A0r = "";
                }
                A0I.A0T("id", A0r);
                A0I.A0T("config_name", "_");
                if (obj == null) {
                    obj = "";
                }
                A0I.A0U("logging_id", C18180wK.A0n(obj));
                if (A0r2 == null) {
                    A0r2 = "";
                }
                A0I.A0T("extra_ids", A0r2);
            } else {
                return;
            }
        } else if ("mobile_config_error".equals(str) && C63173fJ.A05(AnonymousClass0TJ.A05, 18301860670868535L)) {
            A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "mobile_config_general_cases"), 2413);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("mc_event_name", "mobile_config_error");
                A0I.A0V("str_data", new MV3(map));
            } else {
                return;
            }
        } else {
            return;
        }
        A0I.Bb4();
    }

    public final void logEventImmediately(String str, Map map) {
        AnonymousClass0wJ.A1N(str, map);
        logEvent(str, map);
    }
}
