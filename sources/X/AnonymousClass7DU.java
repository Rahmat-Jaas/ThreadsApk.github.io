package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.service.session.UserSession;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7DU  reason: invalid class name */
public final class AnonymousClass7DU {
    public final UserSession A00;
    public final C11630kW A01;
    public final C109456k2 A02;

    public AnonymousClass7DU(C11630kW r2, C109456k2 r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final C15730rn A00(AnonymousClass7DU r6, String str) {
        String str2;
        int A0G;
        UserSession userSession = r6.A00;
        String B1c = C12090lI.A00(userSession).B1c();
        if (B1c == null || (A0G = AnonymousClass8bP.A0G(B1c, '.', 0, 6)) <= 0) {
            str2 = null;
        } else {
            str2 = C18230wP.A0s(B1c, 0, A0G);
        }
        C15730rn A002 = C15730rn.A00(r6.A01, AnonymousClass00U.A0L("payflows_", str));
        A002.A0D("client_app_user_id", userSession.getUserId());
        A002.A0D(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, str2);
        C109456k2 r2 = r6.A02;
        String str3 = r2.A01;
        C04220Ms.A06(str3);
        Locale locale = Locale.getDefault();
        C04220Ms.A06(locale);
        A002.A0D("product", C18190wL.A0r(locale, str3));
        A002.A0D("other_profile_id", r2.A02);
        A002.A0D("flow_name", "checkout_init");
        A002.A0D(C63833iQ.A07(374, 10, 93), r2.A00);
        A002.A0D("event_name", str);
        A002.A0D("event_type", DexOptimization.OPT_KEY_CLIENT);
        return A002;
    }

    public static String A01(HashMap hashMap) {
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        Iterator A0u = C18190wL.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            String A0p = C18200wM.A0p(A0o);
            String A0u2 = C18230wP.A0u(A0o);
            A0K.A0U(A0p);
            if (A0u2 == null) {
                A0K.A0H();
            } else {
                A0K.A0Y(A0u2);
            }
        }
        A0K.A0G();
        A0K.close();
        return C18190wL.A0n(A0d);
    }
}
