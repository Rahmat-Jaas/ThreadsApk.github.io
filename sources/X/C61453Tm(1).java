package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Tm  reason: invalid class name and case insensitive filesystem */
public final class C61453Tm {
    public static final boolean A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return C28161tl.A04(userSession).getBoolean("auto_cross_post_to_facebook_story", false);
    }

    public final void A01(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        Integer num2;
        String str2;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1R(str, num);
        if (num.intValue() != 0) {
            AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(userSession), "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", z);
            num2 = AnonymousClass006.A0N;
        } else {
            boolean A00 = A00(userSession);
            AnonymousClass0wJ.A13(C28161tl.A03(userSession), "auto_cross_post_to_facebook_story", z);
            if (A00 && !z) {
                AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
                if (!A03.A09(A03.A02)) {
                    AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A03), "PREFERENCE_STORY_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", C18200wM.A0A());
                }
                A03.A02 = System.currentTimeMillis();
            }
            num2 = AnonymousClass006.A01;
        }
        USLEBaseShape0S0000000 A04 = USLEBaseShape0S0000000.A04(C13330nS.A02(userSession));
        switch (num2.intValue()) {
            case 1:
                str2 = "ig_story_share_to_fb";
                break;
            case 2:
                str2 = "ig_reels_share_to_fb";
                break;
            default:
                str2 = "ig_cf_story_share_to_fb";
                break;
        }
        A04.A0T("flow_name", str2);
        C18180wK.A1F(A04, "client_setting_updated", str, z, z2);
        A04.Bb4();
    }
}
