package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7be  reason: invalid class name and case insensitive filesystem */
public final class C124727be implements C147138nS {
    public final UserSession A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public C124727be(UserSession userSession, User user, String str, String str2) {
        C18180wK.A1P(userSession, 1, str);
        this.A00 = userSession;
        this.A01 = user;
        this.A03 = str;
        this.A02 = str2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new C21953C9n(new C23417Crk(this.A00, this.A01, this.A03, this.A02));
    }
}
