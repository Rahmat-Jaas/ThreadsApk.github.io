package X;

import com.instagram.fanclub.api.FanClubApi;
import com.instagram.service.session.UserSession;

/* renamed from: X.37u  reason: invalid class name and case insensitive filesystem */
public final class C565937u {
    public final FanClubApi A00;
    public final UserSession A01;

    public /* synthetic */ C565937u(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        this.A01 = userSession;
        this.A00 = fanClubApi;
    }
}
