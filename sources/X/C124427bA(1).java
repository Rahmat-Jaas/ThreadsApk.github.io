package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bA  reason: invalid class name and case insensitive filesystem */
public final class C124427bA implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C124427bA(C11630kW r1, UserSession userSession) {
        AnonymousClass0wJ.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass57B(this.A00, this.A01);
    }
}
