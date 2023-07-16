package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.3zK  reason: invalid class name and case insensitive filesystem */
public final class C67303zK implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67303zK.class);
    public static final String __redex_internal_original_name = "CrosspostingDestinationUtil";

    public static final C84024sQ A00(UserSession userSession, User user) {
        C04220Ms.A0B(userSession, 1);
        if (user == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() - user.A01;
        C41840MeW meW = user.A05;
        if (meW.AsF() != null && C60413Oy.A01(userSession, currentTimeMillis)) {
            user.A1m(new AnonymousClass18O((AnonymousClass18S) null, (AnonymousClass18T) null));
            C18210wN.A1J(userSession, user);
            user.A1t(userSession);
            AnonymousClass0wJ.A0y().put("stale_destination_info_duration_in_ms", String.valueOf(currentTimeMillis));
            C60413Oy.A00(userSession, "clear_stale_destination_info", currentTimeMillis);
        }
        return meW.AsF();
    }

    public static final C33841Hva A01(UserSession userSession, AnonymousClass3D3 r5, Integer num) {
        C04220Ms.A0B(userSession, 0);
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18190wL.A1H(A0P, userSession, "server_fetch_attempt");
        A0P.A0Q("user_interaction", C18190wL.A0Z(A0P, "entry_point", C49202r0.A00(num), false));
        C18220wO.A1G(A0P, A02(userSession));
        H1T A0P2 = AnonymousClass0wJ.A0P(userSession);
        A0P2.A0J("ig_fb_xposting/account_linking/user_xposting_destination/");
        C32165H8c A0T = C18180wK.A0T(A0P2, AnonymousClass1TZ.class, C60293Ol.class);
        A0T.A00 = new IDxACallbackShape15S0300000_1_I2(17, (Object) num, (Object) userSession, (Object) r5);
        return A0T;
    }

    public static final void A03(C27783EtE etE, UserSession userSession, AnonymousClass3CV r5, String str, String str2, String str3, boolean z) {
        String str4;
        C04220Ms.A0B(str, 0);
        String str5 = r5.A00;
        if (str5 != null && (str4 = r5.A01) != null) {
            if (z) {
                if (str5.equals("FB_USER")) {
                    str2 = "USER";
                } else {
                    str2 = "PAGE";
                }
                str = str4;
            }
            if (!str4.equals(str)) {
                C60373Ot.A00(userSession, "crossposting_destination_not_match_user_selection_in_destination_picker", "story_publish");
            }
            C62173Xp.A00(userSession).A02 = null;
            etE.A73("share_to_fb_destination_type", str2);
            etE.A73("share_to_fb_destination_id", str);
            etE.A73("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            etE.A73("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (str.length() == 0) {
                A06(str3, userSession);
            }
        }
    }

    public static final void A04(AnonymousClass18S r6, AnonymousClass18T r7, UserSession userSession, String str) {
        User A002;
        String A01;
        String A003;
        C04220Ms.A0B(userSession, 0);
        if (!C60343Oq.A01(userSession) && (A002 = C04660Oo.A00(userSession)) != null) {
            C84024sQ A004 = A00(userSession, A002);
            if (str != null && str.equals("relink") && ((A004 == null || (((A01 = C59123Jp.A01(A004)) == null || AnonymousClass8bQ.A0n(A01)) && ((A003 = C59123Jp.A00(A004)) == null || AnonymousClass8bQ.A0n(A003)))) && (!(r7 == null && r6 == null) && ((C28161tl.A04(userSession).getInt("upsells_cancel_count_for_link_switcher", 0) < 2 || !C28161tl.A04(userSession).getBoolean("upsells_eligibility_for_link_switcher_reset", false)) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313686494676600L))))) {
                AnonymousClass0wJ.A11(C28161tl.A03(userSession), "upsells_cancel_count_for_link_switcher", 0);
                AnonymousClass0wJ.A11(C28161tl.A03(userSession), "dialog_after_sharing_story_show_times", 0);
                AnonymousClass0wJ.A11(C28161tl.A03(userSession), "self_story_sharing_option_dialog_show_times", 0);
                AnonymousClass0wJ.A11(C28161tl.A03(userSession), "feed_fb_autoshare_upsell_dialog_display_count", 0);
                AnonymousClass0wJ.A13(C28161tl.A03(userSession), "upsells_eligibility_for_link_switcher_reset", true);
            }
            A002.A1m(new AnonymousClass18O(r6, r7));
            C18210wN.A1J(userSession, A002);
            A002.A1t(userSession);
        }
    }

    public static final void A05(UserSession userSession, AnonymousClass3D3 r5, Integer num) {
        C04220Ms.A0B(userSession, 0);
        if (C67373zR.A0E(userSession)) {
            C31155GhB.A05(A01(userSession, r5, num), 686, 3, true, true);
        }
    }

    public static final void A06(String str, UserSession userSession) {
        C04220Ms.A0B(str, 0);
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18180wK.A1E(A0P, userSession, "empty_destination_id", str, false);
        A0P.Bb4();
    }

    public static final HashMap A02(UserSession userSession) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (C04660Oo.A00(userSession) != null) {
            A0y.put("page_token_id", C62953bC.A02(userSession, "page_id"));
        }
        return A0y;
    }
}
