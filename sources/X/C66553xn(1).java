package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xn  reason: invalid class name and case insensitive filesystem */
public final class C66553xn implements C147138nS {
    public final AnonymousClass23Q A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new C19480zw(this.A00, userSession, AnonymousClass6VR.A00(userSession), this.A02, this.A03);
    }

    public C66553xn(AnonymousClass23Q r1, UserSession userSession, String str, boolean z) {
        AnonymousClass0wJ.A1P(userSession, r1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = r1;
        this.A03 = z;
    }
}
