package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bM  reason: invalid class name and case insensitive filesystem */
public final class C124547bM implements C147138nS {
    public final C21839C2o A00;
    public final UserSession A01;
    public final String A02;

    public C124547bM(C21839C2o c2o, UserSession userSession, String str) {
        AnonymousClass0wJ.A1Q(userSession, c2o);
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = c2o;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str = this.A02;
        return new C882357g(this.A00, this.A01, str);
    }
}
