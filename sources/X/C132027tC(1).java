package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tC  reason: invalid class name and case insensitive filesystem */
public final class C132027tC implements AnonymousClass0i4 {
    public C107896hU A00;
    public C112466pe A01;
    public final UserSession A02;

    public final void onSessionWillEnd() {
        this.A02.A03(C132027tC.class);
    }

    public C132027tC(UserSession userSession) {
        this.A02 = userSession;
    }
}
