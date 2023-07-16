package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3WY  reason: invalid class name */
public final class AnonymousClass3WY {
    public static final void A00(UserSession userSession, String str, String str2, String str3, boolean z) {
        C04220Ms.A0B(userSession, 0);
        USLEBaseShape0S0000000 A04 = USLEBaseShape0S0000000.A04(C13330nS.A02(userSession));
        A04.A0T("flow_name", "ig_reels_share_to_fb");
        C18230wP.A1G(A04, str2);
        AnonymousClass0wJ.A1C(A04, str, str3, z, false);
        A04.Bb4();
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3, boolean z) {
        USLEBaseShape0S0000000 A0M = C18230wP.A0M(userSession);
        C18230wP.A1G(A0M, str2);
        AnonymousClass0wJ.A1C(A0M, str, str3, z, false);
        A0M.Bb4();
    }

    public static final void A02(UserSession userSession, String str, String str2, boolean z, boolean z2) {
        USLEBaseShape0S0000000 A04 = USLEBaseShape0S0000000.A04(C18220wO.A0W(userSession));
        A04.A0T("flow_name", "ig_reels_share_to_fb");
        C18230wP.A1G(A04, str);
        A04.A0Q("client_setting", C18190wL.A0Z(A04, "xposting_setting_location", "reels", z));
        C18250wR.A0w(A04, C18190wL.A0Z(A04, "server_setting", str2, z2));
    }
}
