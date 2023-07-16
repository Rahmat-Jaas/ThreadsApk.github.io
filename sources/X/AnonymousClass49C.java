package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.49C  reason: invalid class name */
public final class AnonymousClass49C implements AnonymousClass0i4 {
    public static final long A02 = C18210wN.A06();
    public C62083Xb A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49C.class);
    }

    public AnonymousClass49C(UserSession userSession) {
        this.A01 = userSession;
    }
}
