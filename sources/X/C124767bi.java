package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7bi  reason: invalid class name and case insensitive filesystem */
public final class C124767bi implements C147138nS {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C124767bi(UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass58W(this.A00, this.A01, this.A04, this.A05);
    }
}
