package X;

import com.instagram.payout.api.PayoutApi;
import com.instagram.service.session.UserSession;

/* renamed from: X.7aw  reason: invalid class name and case insensitive filesystem */
public final class C124367aw implements C147138nS {
    public final UserSession A00;

    public C124367aw(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new AnonymousClass57V(C102146Tz.A00(new PayoutApi(userSession), userSession));
    }
}
