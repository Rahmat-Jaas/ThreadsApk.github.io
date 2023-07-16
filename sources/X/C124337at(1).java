package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7at  reason: invalid class name and case insensitive filesystem */
public final class C124337at implements C147138nS {
    public final UserSession A00;

    public C124337at(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass57D.class)) {
            return new AnonymousClass57D(this.A00);
        }
        StringBuilder A0s = C18190wL.A0s("Attempting to create a ");
        A0s.append(cls);
        A0s.append(" using ");
        throw C18190wL.A0a(C18180wK.A0i(C86124wJ.A16(this).B5C(), A0s));
    }
}
