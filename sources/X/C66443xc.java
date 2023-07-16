package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xc  reason: invalid class name and case insensitive filesystem */
public final class C66443xc implements C147138nS {
    public final C84874u0 A00;
    public final UserSession A01;
    public final AnonymousClass0YY A02;

    public /* synthetic */ C66443xc(UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C79304jp r1 = C79304jp.A00;
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = A0J;
        this.A02 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new AnonymousClass10L(this.A00, (C31153Gh5) ((C79304jp) this.A02).invoke(userSession), userSession);
    }
}
