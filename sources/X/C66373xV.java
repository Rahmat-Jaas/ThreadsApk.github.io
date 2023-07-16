package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xV  reason: invalid class name and case insensitive filesystem */
public final class C66373xV implements C147138nS {
    public final UserSession A00;
    public final String A01;

    public final C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass101.class)) {
            return new AnonymousClass101(this.A00, this.A01);
        }
        throw C18190wL.A0a("Unknown View Model Class While Creating ContactOptionsViewModel");
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public C66373xV(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
