package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;

/* renamed from: X.2r7  reason: invalid class name and case insensitive filesystem */
public final class C49272r7 {
    public static final C32165H8c A00(C11630kW r4, UserSession userSession, boolean z) {
        AnonymousClass0wJ.A1M(userSession, 1, r4);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("clips/user/set_default_share_to_fb_enabled/");
        A0O.A0R("default_share_to_fb_enabled", z);
        A0O.A0O("sharing_mode", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0O.A0O("container_module", r4.getModuleName());
        A0O.A0R("enable_oa_reuse_on_fb", true);
        return AnonymousClass0wJ.A0S(A0O);
    }
}
