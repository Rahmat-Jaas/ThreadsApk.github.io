package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3xe  reason: invalid class name and case insensitive filesystem */
public final class C66463xe implements C147138nS {
    public final AnonymousClass495 A00;
    public final UserSession A01;
    public final String A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass10B(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ C66463xe(UserSession userSession) {
        String str;
        AnonymousClass495 A002 = AnonymousClass2O7.A00(userSession);
        C84624tY A0I = C18250wR.A0R(userSession).A0I();
        if (A0I != null) {
            str = A0I.AhE();
        } else {
            str = null;
        }
        AnonymousClass0wJ.A1O(userSession, A002);
        this.A01 = userSession;
        this.A00 = A002;
        this.A02 = str;
    }
}
