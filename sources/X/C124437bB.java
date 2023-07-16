package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bB  reason: invalid class name and case insensitive filesystem */
public final class C124437bB implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C124437bB(C11630kW r1, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new AnonymousClass57O(this.A00, userSession, C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327430390032403L));
    }
}
