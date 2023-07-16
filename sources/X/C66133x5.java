package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3x5  reason: invalid class name and case insensitive filesystem */
public final class C66133x5 implements C147138nS {
    public final UserSession A00;

    public C66133x5(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(C19440zs.class)) {
            return new C19440zs(this.A00);
        }
        throw C18190wL.A0a("Unknown ViewModel class for Birthday Effects");
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}
