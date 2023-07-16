package X;

import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Th  reason: invalid class name and case insensitive filesystem */
public final class C36952Th {
    public static C32165H8c A00(ShareLaterMedia shareLaterMedia, UserSession userSession, String str, String str2) {
        String str3;
        String A03;
        H1T h1t = new H1T(userSession);
        String str4 = shareLaterMedia.A05;
        h1t.A0T("media/%s/share/", str4);
        C18250wR.A16(h1t);
        C18240wQ.A18(h1t);
        h1t.A0O("media_id", str4);
        h1t.A0O("caption", shareLaterMedia.A04);
        if (shareLaterMedia.A07) {
            h1t.A0O("waterfall_id", str);
            h1t.A0O("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            C04220Ms.A0B(userSession, 0);
            if (C67373zR.A0D(userSession)) {
                str3 = "PAGE";
            } else {
                str3 = "USER";
            }
            h1t.A0O("share_to_fb_destination_type", str3);
            if (C63803iN.A0F(userSession)) {
                A03 = C67373zR.A00(userSession);
            } else {
                A03 = C67363zQ.A03(userSession);
            }
            h1t.A0O("share_to_fb_destination_id", A03);
            h1t.A0O("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (A03.isEmpty()) {
                C67303zK.A06(str2, userSession);
            }
        }
        if (shareLaterMedia.A0A) {
            h1t.A0O(C28174Ezk.A00(611), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return h1t.A02();
    }
}
