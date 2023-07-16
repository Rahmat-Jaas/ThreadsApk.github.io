package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bL  reason: invalid class name and case insensitive filesystem */
public final class C124537bL implements C147138nS {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public C124537bL(UserSession userSession, String str, String str2) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new C883157o(this.A00, this.A01, this.A02);
    }
}
