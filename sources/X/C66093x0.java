package X;

import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3x0  reason: invalid class name and case insensitive filesystem */
public final class C66093x0 implements C147138nS {
    public final UserSession A00;

    public C66093x0(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new C25961pj((FanClubMemberListCategoryRepository) userSession.A01(FanClubMemberListCategoryRepository.class, C18250wR.A0g(userSession, 5)), userSession);
    }
}
