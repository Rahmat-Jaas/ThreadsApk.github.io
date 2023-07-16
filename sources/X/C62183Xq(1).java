package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Xq  reason: invalid class name and case insensitive filesystem */
public final class C62183Xq {
    public static final boolean A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return C28161tl.A04(userSession).getBoolean("auto_cross_post_to_facebook_feed", false);
    }

    public final void A02(UserSession userSession, String str, boolean z, boolean z2) {
        AnonymousClass0wJ.A1M(userSession, 0, str);
        boolean z3 = C28161tl.A04(userSession).getBoolean("auto_cross_post_to_facebook_feed", false);
        AnonymousClass0wJ.A13(C28161tl.A03(userSession), "auto_cross_post_to_facebook_feed", z);
        if (z3 != z) {
            AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
            if (!z && !A03.A09(A03.A00)) {
                AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A03), "PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", C18200wM.A0A());
            }
            A03.A00 = System.currentTimeMillis();
        }
        if (A01(userSession)) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_feed_auto_xposting_to_fb_setting"), 1223);
            A0I.A0T("event_name", "client_setting_updated");
            Boolean A0Z = C18190wL.A0Z(A0I, "xposting_setting_location", str, z);
            Boolean A0R = C18210wN.A0R(A0I, A0Z, "client_setting", z2);
            A0I.A0Q("user_interaction", A0R);
            A0I.Bb4();
            USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
            A0O.A0T("event_name", "client_setting_updated");
            A0O.A0T("xposting_setting_location", str);
            A0O.A0Q("client_setting", A0Z);
            A0O.A0Q("user_interaction", A0R);
            A0O.Bb4();
        }
    }

    public static final boolean A01(UserSession userSession) {
        if ((AnonymousClass266.A04 == C04660Oo.A01(userSession) || C35692Ol.A00(userSession).A05(C67263zF.A02, "ig_to_fb_feed_share")) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36310753032274151L)) {
            return true;
        }
        return false;
    }
}
