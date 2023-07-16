package X;

import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;
import com.instagram.service.session.UserSession;

/* renamed from: X.3wz  reason: invalid class name and case insensitive filesystem */
public final class C66083wz implements C147138nS {
    public final UserSession A00;

    public C66083wz(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new C25971pk((CreatorMessagingSelectionScreenRepository) userSession.A01(CreatorMessagingSelectionScreenRepository.class, C18250wR.A0g(userSession, 4)), userSession);
    }
}
