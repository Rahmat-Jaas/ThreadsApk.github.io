package X;

import com.instagram.service.session.UserSession;
import java.util.Locale;

/* renamed from: X.2Tg  reason: invalid class name and case insensitive filesystem */
public final class C36942Tg {
    public static final C32165H8c A00(UserSession userSession, Integer num, String str, String str2) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(str, num);
        C04220Ms.A0B(str2, 3);
        if (AnonymousClass8bP.A0j(str, " ", false)) {
            return null;
        }
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        String format = String.format((Locale) null, "third_party_sharing/%s/get_profile_to_share_url/", new Object[]{str});
        C04220Ms.A06(format);
        A0P.A0J(format);
        A0P.A0O("share_to_app", AnonymousClass3OR.A00(num));
        A0P.A0O("containermodule", str2);
        A0P.A0R("exposed_to_experiment", C63413hR.A05(userSession));
        A0P.A0P("qe_universe_name", C63413hR.A04(userSession));
        return AnonymousClass0wJ.A0T(A0P, C21771Sc.class, AnonymousClass3OO.class);
    }
}
