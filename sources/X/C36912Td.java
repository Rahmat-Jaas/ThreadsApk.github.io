package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Td  reason: invalid class name and case insensitive filesystem */
public final class C36912Td {
    public static final C32165H8c A00(UserSession userSession, Integer num, String str, String str2) {
        AnonymousClass0wJ.A1N(userSession, str);
        C04220Ms.A0B(num, 2);
        C04220Ms.A0B(str2, 3);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        String A0j = C18180wK.A0j("third_party_sharing/%s/get_location_to_share_url/", new Object[]{str});
        C04220Ms.A06(A0j);
        A0P.A0J(A0j);
        A0P.A0O("share_to_app", AnonymousClass3OR.A00(num));
        A0P.A0O("containermodule", str2);
        A0P.A0R("exposed_to_experiment", C63413hR.A05(userSession));
        A0P.A0P("qe_universe_name", C63413hR.A04(userSession));
        return AnonymousClass0wJ.A0T(A0P, C21751Sa.class, AnonymousClass3OL.class);
    }
}
