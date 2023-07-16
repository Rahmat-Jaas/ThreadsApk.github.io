package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xM  reason: invalid class name and case insensitive filesystem */
public final class C66283xM implements C147138nS {
    public final C8A A00;
    public final UserSession A01;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        C31153Gh5 A002 = C04220Ms.A0B(userSession, 0);
        EAB A003 = AnonymousClass2MX.A00(userSession);
        C8A c8a = this.A00;
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        return new C195210b(A002, c8a, new AnonymousClass1oT(r0), A003, userSession);
    }

    public C66283xM(C8A c8a, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, c8a);
        this.A01 = userSession;
        this.A00 = c8a;
    }
}
