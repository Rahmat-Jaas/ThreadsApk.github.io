package X;

import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.3wy  reason: invalid class name and case insensitive filesystem */
public final class C66073wy implements C147138nS {
    public final UserSession A00;

    public C66073wy(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new FanClubGiftingViewModel((AnonymousClass490) userSession.A01(AnonymousClass490.class, C18250wR.A0f(userSession, 4)), new FanClubGiftingApi(userSession));
    }
}
