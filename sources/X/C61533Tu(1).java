package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
public final class C61533Tu {
    public static final C61533Tu A00 = new C61533Tu();

    public final boolean A00(UserSession userSession, String str) {
        AnonymousClass0TJ A0D = C18250wR.A0D(str, 1);
        if (C63803iN.A0E(A0D, userSession, 2342165702254861777L)) {
            return true;
        }
        String A0C = C63803iN.A0C(A0D, userSession, 36885642994516387L);
        if (A0C.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(A0C);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (C04220Ms.A0I(jSONArray.get(i), str)) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) C18190wL.A0f(AnonymousClass2KC.A00(userSession).A00), "one_link_debug_event"), 2461);
                C18210wN.A1B(A0I, "");
                C18210wN.A19(A0I, "");
                C18190wL.A1I(A0I, "");
                A0I.A0T("caller_context", "");
                A0I.A0T("caller_name", str);
                A0I.A0T("event", "pdp_caller_name_parse_error");
                A0I.A0T("auth_policy", "");
                A0I.Bb4();
                return true;
            }
        }
        return false;
    }
}
