package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2SK  reason: invalid class name */
public final class AnonymousClass2SK {
    public static void A00(UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        boolean A00 = C62183Xq.A00(userSession);
        boolean A002 = C61453Tm.A00(userSession);
        if (str2 != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_fb_xposting_client"), 1219);
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
            C18210wN.A1B(A0I, str2);
            C18230wP.A1G(A0I, str);
            C18250wR.A0y(A0I, str4);
            A0I.A0T("ig_userid", userSession.getUserId());
            A0I.A0Q("story_auto_xposting_status", C18210wN.A0R(A0I, C18190wL.A0Z(A0I, AnonymousClass3Q4.A00(9, 10, 83), str3, A00), "feed_auto_xposting_status", A002));
            if (A0g != null) {
                str5 = String.valueOf(A0g.A00);
            } else {
                str5 = null;
            }
            A0I.A0T("ig_user_account_type", str5);
            A0I.Bb4();
        }
    }
}
