package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3wr  reason: invalid class name and case insensitive filesystem */
public final class C66013wr implements C147138nS {
    public final UserSession A00;

    public C66013wr(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        C31153Gh5 A002 = C04220Ms.A0B(userSession, 0);
        EAB A003 = AnonymousClass2MX.A00(userSession);
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        return new CA5(A002, new AnonymousClass1oR(r0), A003);
    }
}
