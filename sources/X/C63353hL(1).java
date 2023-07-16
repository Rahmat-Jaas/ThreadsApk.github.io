package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.service.session.UserSession;

/* renamed from: X.3hL  reason: invalid class name and case insensitive filesystem */
public final class C63353hL {
    public static final void A06(UserSession userSession, String str, String str2, String str3) {
        C18180wK.A1P(userSession, 0, str3);
        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
        USLEBaseShape0S0000000 A00 = A00(userSession);
        A02(A00, A01(A00, A0g, "primary_click", str), str2, str3);
    }

    public static String A01(AnonymousClass0A3 r1, AnonymousClass266 r2, String str, String str2) {
        r1.A0T("event_name", str);
        r1.A0T("entry_point", str2);
        if (r2 != null) {
            return String.valueOf(r2.A00);
        }
        return null;
    }

    public static void A02(AnonymousClass0A3 r3, String str, String str2, String str3) {
        r3.A0T("ig_user_account_type", str);
        r3.A0T(C63383hO.A01(40, 10, 59), str2);
        r3.A0T("waterfall_id", str3);
        r3.Bb4();
    }

    public static USLEBaseShape0S0000000 A00(C10300i6 r2) {
        USLEBaseShape0S0000000 A0B = USLEBaseShape0S0000000.A0B(C13330nS.A02(r2));
        A0B.A0T("flow_name", "ig_feed_crossposting_to_fb");
        return A0B;
    }

    public static final void A03(ShareType shareType, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(userSession, shareType);
        if (str != null) {
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
            if (shareType == ShareType.FOLLOWERS_SHARE || (shareType == ShareType.IGTV && str.equals("video_feed_composer"))) {
                USLEBaseShape0S0000000 A00 = A00(userSession);
                A02(A00, A01(A00, A0g, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, str), str2, str3);
            }
        }
    }

    public static final void A04(ShareType shareType, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(userSession, shareType);
        if (str != null) {
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
            if (shareType == ShareType.FOLLOWERS_SHARE || (shareType == ShareType.IGTV && str.equals("video_feed_composer"))) {
                USLEBaseShape0S0000000 A00 = A00(userSession);
                A02(A00, A01(A00, A0g, "request", str), str2, str3);
            }
        }
    }

    public static final void A05(ShareType shareType, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass0wJ.A1N(userSession, shareType);
        if (str != null) {
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
            if (shareType == ShareType.FOLLOWERS_SHARE || (shareType == ShareType.IGTV && str.equals("video_feed_composer"))) {
                USLEBaseShape0S0000000 A00 = A00(userSession);
                A02(A00, A01(A00, A0g, "success", str), str2, str3);
            }
        }
    }
}
