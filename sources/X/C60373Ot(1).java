package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ot  reason: invalid class name and case insensitive filesystem */
public final class C60373Ot {
    public static final void A00(UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1N(userSession, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_xposting_to_fb_destination_picker"), 1531);
        A0I.A0T("action_name", str);
        A0I.A0T("surface", str2);
        A0I.Bb4();
    }

    public static final void A01(UserSession userSession, String str, String str2, String str3, long j) {
        AnonymousClass0wJ.A1N(userSession, str);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_xposting_to_fb_destination_picker"), 1531);
        A0I.A0T("action_name", str);
        A0I.A0S("number_of_destinations", Long.valueOf(j));
        A0I.A0T("exception_message", str3);
        A0I.A0T("surface", str2);
        A0I.Bb4();
    }
}
