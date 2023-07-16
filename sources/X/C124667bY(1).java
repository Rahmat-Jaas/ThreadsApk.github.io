package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bY  reason: invalid class name and case insensitive filesystem */
public final class C124667bY implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;

    public C124667bY(C11630kW r1, UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1R(userSession, r1);
        this.A02 = str;
        this.A03 = z;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str = this.A02;
        boolean z = this.A03;
        UserSession userSession = this.A01;
        C11630kW r2 = this.A00;
        return new AnonymousClass58B(new C24805DaJ(r2, userSession), r2, userSession, str, z);
    }
}
