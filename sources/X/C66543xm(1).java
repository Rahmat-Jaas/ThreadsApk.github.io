package X;

import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xm  reason: invalid class name and case insensitive filesystem */
public final class C66543xm implements C147138nS {
    public final SubscribedAndRecommendedCreatorListRepository A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;

    public C66543xm(SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, UserSession userSession, String str, boolean z) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = subscribedAndRecommendedCreatorListRepository;
        this.A03 = z;
        this.A02 = str;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new C195610i(this.A00, userSession, this.A02, this.A03);
    }
}
