package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bP  reason: invalid class name and case insensitive filesystem */
public final class C124577bP implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final String A02;

    public C124577bP(C11630kW r1, UserSession userSession, String str) {
        AnonymousClass0wJ.A1Q(userSession, r1);
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str = this.A02;
        UserSession userSession = this.A01;
        C11630kW r2 = this.A00;
        return new C883757u(new C24805DaJ(r2, userSession), r2, userSession, str);
    }
}
