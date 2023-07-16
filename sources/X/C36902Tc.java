package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.2Tc  reason: invalid class name and case insensitive filesystem */
public final class C36902Tc {
    public static final C32165H8c A00(UserSession userSession, Integer num) {
        C04220Ms.A0B(num, 1);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        String A0j = C18180wK.A0j("invites/get_user_invite_message/", new Object[0]);
        C04220Ms.A06(A0j);
        A0P.A0J(A0j);
        A0P.A0O("medium", C36892Tb.A00(num));
        return AnonymousClass0wJ.A0T(A0P, AnonymousClass1TC.class, AnonymousClass3OJ.class);
    }
}
