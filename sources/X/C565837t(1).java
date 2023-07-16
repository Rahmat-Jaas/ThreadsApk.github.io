package X;

import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;

/* renamed from: X.37t  reason: invalid class name and case insensitive filesystem */
public final class C565837t {
    public final FanClubApi A00;
    public final UserSession A01;

    public /* synthetic */ C565837t(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fanClubApi;
    }
}
