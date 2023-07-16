package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2qz  reason: invalid class name and case insensitive filesystem */
public final class C49192qz {
    public static final void A00(UserSession userSession, String str, String str2, boolean z) {
        String valueOf;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_fb_xposting_toggle"), 1221);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("toggle_name", "ig_fb_xposting_setting_option");
            C18230wP.A1G(A0I, str);
            A0I.A0T("toggle_surface", "ig_feed_composer");
            if (A0g == null) {
                valueOf = "unknown";
            } else {
                valueOf = String.valueOf(A0g.A00);
            }
            A0I.A0Q("toggle_state", C18190wL.A0Z(A0I, "account_type", valueOf, z));
            A0I.A0T("toggle_context", str2);
            A0I.Bb4();
        }
    }
}
