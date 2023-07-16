package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.api.base.IDxACallbackShape0S1120000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zC  reason: invalid class name and case insensitive filesystem */
public final class C67233zC implements CallerContextable {
    public static final C61453Tm A08 = new C61453Tm();
    public static final CallerContext A09 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "StoryShareToFBController";
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final C83824s3 A07;

    public static final void A02(C67233zC r14, Integer num, String str, boolean z, boolean z2) {
        String str2;
        Integer num2 = num;
        if (num.intValue() != 0) {
            str2 = "CLOSE_FRIEND";
        } else {
            str2 = "EVERYONE";
        }
        C67233zC r6 = r14;
        UserSession userSession = r14.A06;
        USLEBaseShape0S0000000 A0M = C18230wP.A0M(userSession);
        C18230wP.A1G(A0M, "server_setting_update_attempt");
        String str3 = str;
        boolean z3 = z2;
        boolean z4 = z;
        C18250wR.A0w(A0M, C18210wN.A0R(A0M, C18190wL.A0Z(A0M, "xposting_setting_location", str3, z3), "user_interaction", z4));
        if (C49312rB.A00(userSession)) {
            AnonymousClass3U2.A00.A00(userSession, new AnonymousClass4L4(r6, num2, str3, z4, z3), "STORY", str2, z4);
        } else if (!C04220Ms.A0I(str2, "CLOSE_FRIEND")) {
            H1T A0P = C18180wK.A0P(userSession);
            A0P.A0J("ig_fb_xposting/user_setting/update/");
            A0P.A0R("xpost_setting_status_to_update", z4);
            C18250wR.A16(A0P);
            C32165H8c A0T = C18180wK.A0T(A0P, C22161Tp.class, C60353Or.class);
            A0T.A00 = new IDxACallbackShape0S1120000_1_I2(r14, str3, 1, z3, z4);
            C31155GhB.A05(A0T, 671, 2, true, true);
        }
    }

    public final void A04(Integer num, String str, boolean z) {
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(str, 2);
        if (num.intValue() != 0) {
            this.A02 = z;
            C83824s3 r0 = this.A07;
            if (r0 != null) {
                r0.CKJ();
            }
            AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(this.A06), "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", z);
        } else {
            UserSession userSession = this.A06;
            boolean A002 = C61453Tm.A00(userSession);
            USLEBaseShape0S0000000 A0M = C18230wP.A0M(userSession);
            C18180wK.A1F(A0M, "user_update_setting_attempt", str, A002, true);
            C18250wR.A0w(A0M, Boolean.valueOf(z));
            this.A03 = z;
            A00(this);
            AnonymousClass0wJ.A11(C28161tl.A03(userSession), "self_story_sharing_option_dialog_show_times", Integer.MAX_VALUE);
        }
        A02(this, num, str, z, true);
    }

    public final void A05(Integer num, boolean z) {
        if (num.intValue() != 0) {
            if (this.A02 != z) {
                this.A02 = z;
                C83824s3 r0 = this.A07;
                if (r0 != null) {
                    r0.CKJ();
                }
            }
        } else if (this.A03 != z) {
            this.A03 = z;
            A00(this);
        }
    }

    public static final void A00(C67233zC r0) {
        C83824s3 r02 = r0.A07;
        if (r02 != null) {
            r02.CKK();
        }
    }

    public final void A03() {
        UserSession userSession = this.A06;
        this.A03 = C61453Tm.A00(userSession);
        this.A02 = AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", false);
        A00(this);
    }

    public final boolean A06() {
        if (!this.A03 || this.A01 || !C67373zR.A08(this.A06)) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        if (!this.A02 || this.A01 || !C67373zR.A08(this.A06)) {
            return false;
        }
        return true;
    }

    public C67233zC(UserSession userSession, C83824s3 r7) {
        this.A06 = userSession;
        this.A07 = r7;
        this.A03 = C61453Tm.A00(userSession);
        this.A02 = AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", false);
        this.A04 = C61453Tm.A00(userSession);
        SharedPreferences A042 = C28161tl.A04(userSession);
        if (!A042.contains("story_last_server_xposting_turn_on_time_in_second")) {
            AnonymousClass0wJ.A11(A042.edit(), "story_last_server_xposting_turn_on_time_in_second", (int) C18200wM.A0A());
        }
    }

    public static final void A01(C67233zC r5, Integer num, String str, String str2, boolean z, boolean z2) {
        boolean A002;
        boolean z3;
        Integer num2;
        String str3;
        String str4;
        int intValue = num.intValue();
        UserSession userSession = r5.A06;
        if (intValue != 0) {
            A002 = AnonymousClass3Zu.A02(userSession).getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", false);
            z3 = r5.A02;
            num2 = AnonymousClass006.A0N;
        } else {
            A002 = C61453Tm.A00(userSession);
            z3 = r5.A03;
            num2 = AnonymousClass006.A01;
        }
        USLEBaseShape0S0000000 A042 = USLEBaseShape0S0000000.A04(C13330nS.A02(userSession));
        switch (num2.intValue()) {
            case 1:
                str3 = "ig_story_share_to_fb";
                break;
            case 2:
                str3 = "ig_reels_share_to_fb";
                break;
            default:
                str3 = "ig_cf_story_share_to_fb";
                break;
        }
        A042.A0T("flow_name", str3);
        if (z) {
            str4 = "server_setting_updated_success";
        } else {
            str4 = "server_setting_updated_failed";
        }
        C18230wP.A1G(A042, str4);
        AnonymousClass0wJ.A1C(A042, str, str2, A002, z2);
        C18250wR.A0w(A042, Boolean.valueOf(z3));
    }
}
