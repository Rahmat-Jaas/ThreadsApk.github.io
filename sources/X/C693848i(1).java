package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.48i  reason: invalid class name and case insensitive filesystem */
public final class C693848i implements AnonymousClass0i4 {
    public final UserSession A00;

    public C693848i(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C693848i.class);
    }
}
