package X;

import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;

/* renamed from: X.3On  reason: invalid class name and case insensitive filesystem */
public final class C60313On {
    public static final C32165H8c A00(ShareLaterMedia shareLaterMedia, UserSession userSession, Integer num, String str, String str2) {
        String A03;
        String str3;
        String str4;
        UserSession userSession2 = userSession;
        String str5 = str2;
        C18180wK.A1Q(userSession, 0, str5);
        String str6 = shareLaterMedia.A05;
        C04220Ms.A06(str6);
        String str7 = shareLaterMedia.A04;
        if (C60343Oq.A01(userSession)) {
            A03 = C67373zR.A00(userSession);
        } else {
            A03 = C67363zQ.A03(userSession);
            C04220Ms.A06(A03);
        }
        if (C67373zR.A0D(userSession)) {
            str3 = "PAGE";
        } else {
            str3 = "USER";
        }
        String str8 = null;
        H1T A0P = C18180wK.A0P(userSession);
        A0P.A0T("media/%s/share/", str6);
        C18250wR.A16(A0P);
        C18240wQ.A18(A0P);
        A0P.A0O("media_id", str6);
        A0P.A0O("caption", str7);
        if (1 - num.intValue() != 0) {
            str4 = "ig_self_story";
        } else {
            str4 = "ig_feed_after_story_posted";
        }
        A0P.A0O(C28174Ezk.A00(823), str4);
        C696049g A00 = C62173Xp.A00(userSession);
        C696049g.A00(A00);
        AnonymousClass3CV r7 = A00.A02;
        if (r7 != null) {
            str8 = r7.A00;
        }
        if (str8 == null || r7.A01 == null) {
            A0P.A0O("share_to_fb_destination_type", str3);
            A0P.A0O("share_to_fb_destination_id", A03);
            A0P.A0O("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0P.A0O("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (A03.length() == 0) {
                C67303zK.A06(str5, userSession);
            }
        } else {
            C67303zK.A03(A0P, userSession2, r7, A03, str3, str5, false);
        }
        A0P.A0O("use_fb_post_time", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str != null) {
            A0P.A0O("waterfall_id", str);
        }
        return A0P.A02();
    }

    public static final C32165H8c A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        H1T A0P = C18180wK.A0P(userSession);
        C18220wO.A1K(A0P, "ig_fb_xposting/opt_in_upsell/is_eligible/");
        return AnonymousClass0wJ.A0T(A0P, C21831Si.class, C60323Oo.class);
    }
}
