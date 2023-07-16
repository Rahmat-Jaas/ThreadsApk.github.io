package X;

import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xS  reason: invalid class name and case insensitive filesystem */
public final class C66343xS implements C147138nS {
    public final UserSession A00;
    public final String A01;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new FanClubMemberListViewModel((FanClubMemberListRepository) userSession.A01(FanClubMemberListRepository.class, C18250wR.A0g(userSession, 6)), userSession, this.A01);
    }

    public C66343xS(UserSession userSession, String str) {
        AnonymousClass0wJ.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
