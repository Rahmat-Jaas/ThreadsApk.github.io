package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xF  reason: invalid class name and case insensitive filesystem */
public final class C66213xF implements C147138nS {
    public final UserSession A00;
    public final boolean A01;

    public C66213xF(UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A00;
        return new LAE(new C24742DXy(userSession), userSession, this.A01);
    }
}
