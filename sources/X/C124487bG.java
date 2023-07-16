package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bG  reason: invalid class name and case insensitive filesystem */
public final class C124487bG implements C147138nS {
    public final H8Q A00;
    public final UserSession A01;

    public C124487bG(H8Q h8q, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = h8q;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new CBI(new EQ2(this.A00, this.A01));
    }
}
