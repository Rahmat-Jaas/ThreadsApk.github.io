package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bF  reason: invalid class name and case insensitive filesystem */
public final class C124477bF implements C147138nS {
    public final C84874u0 A00;
    public final UserSession A01;

    public /* synthetic */ C124477bF(UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = A0J;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(C884157y.class)) {
            return new C884157y(this.A00, this.A01);
        }
        StringBuilder A0s = C18190wL.A0s("Attempting to create a ");
        A0s.append(cls);
        A0s.append(" using ");
        throw C18190wL.A0a(C18180wK.A0i(C86124wJ.A16(this).B5C(), A0s));
    }
}
