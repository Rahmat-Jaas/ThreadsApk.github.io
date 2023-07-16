package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bf  reason: invalid class name and case insensitive filesystem */
public final class C124737bf implements C147138nS {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C124737bf(UserSession userSession, String str, String str2, boolean z) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass8v9(this.A00, this.A02, this.A01, this.A03);
    }
}
