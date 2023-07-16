package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.5vU  reason: invalid class name */
public final class AnonymousClass5vU extends C132127tN {
    public static AnonymousClass5vU A00(UserSession userSession) {
        Class<AnonymousClass5vU> cls = AnonymousClass5vU.class;
        AnonymousClass5vU r1 = (AnonymousClass5vU) userSession.A00(cls);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass5vU r12 = new AnonymousClass5vU(new C130137om(), userSession);
        userSession.A04(cls, r12);
        return r12;
    }

    public AnonymousClass5vU(AnonymousClass8iR r1, UserSession userSession) {
        super(r1, userSession);
    }
}
