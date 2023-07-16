package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;

/* renamed from: X.2SH  reason: invalid class name */
public final class AnonymousClass2SH {
    public static final void A00(C27783EtE etE, UserSession userSession, String str, String str2, String str3) {
        String A03;
        String str4;
        UserSession userSession2 = userSession;
        if (C63803iN.A0F(userSession)) {
            A03 = C67373zR.A00(userSession);
        } else {
            A03 = C67363zQ.A03(userSession);
            C04220Ms.A06(A03);
        }
        if (C67373zR.A0D(userSession)) {
            str4 = "PAGE";
        } else {
            str4 = "USER";
        }
        C696049g A00 = C62173Xp.A00(userSession);
        C696049g.A00(A00);
        AnonymousClass3CV r4 = A00.A02;
        C27783EtE etE2 = etE;
        String str5 = str3;
        if (r4 == null || r4.A00 == null || r4.A01 == null) {
            etE.A73("share_to_fb_destination_type", str4);
            etE.A73("share_to_fb_destination_id", A03);
            etE.A73("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            etE.A73("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (A03.length() == 0) {
                C67303zK.A06(str3, userSession);
            }
        } else {
            C67303zK.A03(etE2, userSession2, r4, A03, str4, str5, true);
        }
        if (str2 != null) {
            etE.A73("waterfall_id", str2);
        }
        etE.A73("attempt_id", str);
    }
}
