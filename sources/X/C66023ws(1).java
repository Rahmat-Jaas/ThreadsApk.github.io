package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3ws  reason: invalid class name and case insensitive filesystem */
public final class C66023ws implements C147138nS {
    public final UserSession A00;

    public C66023ws(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        return new AnonymousClass10F(AnonymousClass2MV.A00(userSession), new AnonymousClass1oR(r0), new AnonymousClass34C(userSession), userSession.multipleAccountHelper);
    }
}
