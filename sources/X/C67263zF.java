package X;

import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.api.base.IDxACallbackShape0S1120000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3zF  reason: invalid class name and case insensitive filesystem */
public final class C67263zF implements CallerContextable {
    public static final CallerContext A02 = CallerContext.A01(__redex_internal_original_name);
    public static final C62183Xq A03 = new C62183Xq();
    public static final String __redex_internal_original_name = "FeedShareToFBController";
    public AnonymousClass3HQ A00;
    public final UserSession A01;

    public static final void A03(C67263zF r14, String str, boolean z, boolean z2) {
        C67263zF r13 = r14;
        UserSession userSession = r14.A01;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_feed_auto_xposting_to_fb_setting"), 1223);
        A0I.A0T("event_name", "server_setting_update_attempt");
        String str2 = str;
        boolean z3 = z2;
        Boolean A0Z = C18190wL.A0Z(A0I, "xposting_setting_location", str, z3);
        boolean z4 = z;
        Boolean A0R = C18210wN.A0R(A0I, A0Z, "user_interaction", z4);
        A0I.A0Q("user_attempted_client_setting", A0R);
        A0I.Bb4();
        USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
        A0O.A0T("event_name", "server_setting_update_attempt");
        A0O.A0T("xposting_setting_location", str);
        A0O.A0Q("user_interaction", A0Z);
        A0O.A0Q("user_attempted_client_setting", A0R);
        A0O.Bb4();
        if (C49312rB.A00(userSession)) {
            AnonymousClass3U2.A00.A00(userSession, new AnonymousClass4L2(r13, str, z3, z4), "FEED", "EVERYONE", z4);
            return;
        }
        H1T A0P = C18180wK.A0P(userSession);
        A0P.A0J("ig_fb_xposting/fb_feed/user_setting/update/");
        A0P.A0R("xpost_setting_status_to_update", z4);
        C18250wR.A16(A0P);
        C32165H8c A0T = C18180wK.A0T(A0P, C22161Tp.class, C60353Or.class);
        boolean z5 = z4;
        A0T.A00 = new IDxACallbackShape0S1120000_1_I2(r13, str2, 0, z3, z5);
        C31155GhB.A05(A0T, 669, 3, true, true);
    }

    public final void A04(UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1M(userSession, 0, str);
        C62183Xq r1 = A03;
        if (C62183Xq.A01(userSession)) {
            UserSession userSession2 = this.A01;
            boolean A002 = C62183Xq.A00(userSession2);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession2), "ig_feed_auto_xposting_to_fb_setting"), 1223);
            A0I.A0T("event_name", "user_update_setting_attempt");
            Boolean A0R = C18210wN.A0R(A0I, C18190wL.A0Z(A0I, "xposting_setting_location", str, A002), "client_setting", true);
            Boolean A0R2 = C18210wN.A0R(A0I, A0R, "user_interaction", z);
            A0I.A0Q("user_attempted_client_setting", A0R2);
            A0I.Bb4();
            boolean A003 = C62183Xq.A00(userSession2);
            USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession2);
            A0O.A0T("event_name", "user_update_setting_attempt");
            A0O.A0Q("client_setting", C18190wL.A0Z(A0O, "xposting_setting_location", str, A003));
            A0O.A0Q("user_interaction", A0R);
            A0O.A0Q("user_attempted_client_setting", A0R2);
            A0O.Bb4();
            A03(this, str, z, true);
            return;
        }
        r1.A02(userSession, str, z, true);
    }

    public static final void A00(C67263zF r5, String str, String str2) {
        UserSession userSession = r5.A01;
        boolean A002 = C62183Xq.A00(userSession);
        C04220Ms.A0B(str2, 4);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_feed_auto_xposting_to_fb_setting"), 1223);
        C18230wP.A1G(A0I, "server_setting_fetch_success");
        AnonymousClass0wJ.A1C(A0I, str, str2, A002, false);
        A0I.Bb4();
        boolean A003 = C62183Xq.A00(userSession);
        USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
        C18230wP.A1G(A0O, "server_setting_fetch_success");
        AnonymousClass0wJ.A1C(A0O, str, str2, A003, false);
        A0O.Bb4();
    }

    public static final void A01(C67263zF r4, String str, String str2, boolean z, boolean z2) {
        UserSession userSession = r4.A01;
        boolean A002 = C62183Xq.A00(userSession);
        C04220Ms.A0B("server_setting_updated_success", 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_feed_auto_xposting_to_fb_setting"), 1223);
        C18230wP.A1G(A0I, "server_setting_updated_success");
        AnonymousClass0wJ.A1C(A0I, str, str2, A002, z);
        Boolean valueOf = Boolean.valueOf(z2);
        C18250wR.A0w(A0I, valueOf);
        boolean A003 = C62183Xq.A00(userSession);
        USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
        C18230wP.A1G(A0O, "server_setting_updated_success");
        AnonymousClass0wJ.A1C(A0O, str, str2, A003, z);
        C18250wR.A0w(A0O, valueOf);
    }

    public static final void A02(C67263zF r5, String str, boolean z, boolean z2) {
        UserSession userSession = r5.A01;
        boolean A002 = C62183Xq.A00(userSession);
        C04220Ms.A0B("server_setting_updated_failed", 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_feed_auto_xposting_to_fb_setting"), 1223);
        C18230wP.A1G(A0I, "server_setting_updated_failed");
        AnonymousClass0wJ.A1C(A0I, str, (String) null, A002, z);
        Boolean valueOf = Boolean.valueOf(z2);
        C18250wR.A0w(A0I, valueOf);
        boolean A003 = C62183Xq.A00(userSession);
        USLEBaseShape0S0000000 A0O = C18200wM.A0O(userSession);
        C18230wP.A1G(A0O, "server_setting_updated_failed");
        AnonymousClass0wJ.A1C(A0O, str, (String) null, A003, z);
        C18250wR.A0w(A0O, valueOf);
    }

    public C67263zF(UserSession userSession) {
        this.A01 = userSession;
        SharedPreferences A04 = C28161tl.A04(userSession);
        if (!A04.contains("feed_last_server_xposting_turn_on_time_in_second")) {
            AnonymousClass0wJ.A11(A04.edit(), "feed_last_server_xposting_turn_on_time_in_second", (int) C18200wM.A0A());
        }
    }
}
