package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bb  reason: invalid class name and case insensitive filesystem */
public final class C124697bb implements C147138nS {
    public final C24805DaJ A00;
    public final C21839C2o A01;
    public final UserSession A02;
    public final String A03;

    public C124697bb(C24805DaJ daJ, C21839C2o c2o, UserSession userSession, String str) {
        AnonymousClass0wJ.A1Q(userSession, c2o);
        this.A03 = str;
        this.A02 = userSession;
        this.A01 = c2o;
        this.A00 = daJ;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str = this.A03;
        UserSession userSession = this.A02;
        return new C884057x(this.A00, this.A01, userSession, str);
    }
}
