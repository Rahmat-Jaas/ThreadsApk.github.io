package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3WB  reason: invalid class name */
public final class AnonymousClass3WB {
    public static final void A00(C11630kW r1, UserSession userSession, String str, String str2, String str3, String str4) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1Q(str, str2);
        C04220Ms.A0B(str3, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "instagram_bc_partner_promotion_action"), 1711);
        C18210wN.A1A(A0I, str4);
        A0I.A0T("media_id", str);
        A0I.A0T("media_type", "feed");
        A0I.A0T("sponsor_igid", str2);
        C18240wQ.A16(A0I, str3);
    }

    public static final void A01(C11630kW r1, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass0wJ.A1Q(str, str2);
        C18230wP.A1R(str3, 4, str4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "instagram_bc_approve_partner_promotion_action_complete"), 1703);
        A0I.A0T("media_id", str);
        A0I.A0T("sponsor_igid", str2);
        A0I.A0Q("is_success", C18190wL.A0Z(A0I, "action", str3, z));
        C18240wQ.A16(A0I, str4);
    }

    public static final void A02(C11630kW r1, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(r1, userSession), "instagram_bc_story_ad_eligibility_check"), 1714);
        A0I.A0Q("is_request_success", Boolean.valueOf(z));
        if (str != null) {
            A0I.A0T("error_identifier", str);
        }
        if (str2 != null) {
            A0I.A0T("sponsor_igid", str2);
        }
        if (str3 != null) {
            A0I.A0T("camera_session_id", str3);
        }
        if (str4 != null) {
            A0I.A0T("media_id", str4);
        }
        A0I.Bb4();
    }
}
