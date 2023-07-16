package X;

import com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xG  reason: invalid class name and case insensitive filesystem */
public final class C66223xG implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C66223xG(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new AnonymousClass10Q(new BCAApprovePostsForPromotionRepository(userSession), this.A00, userSession);
    }
}
