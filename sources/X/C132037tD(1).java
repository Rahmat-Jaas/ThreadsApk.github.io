package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tD  reason: invalid class name and case insensitive filesystem */
public final class C132037tD implements AnonymousClass0i4 {
    public C143368gb A00;
    public final UserSession A01;
    public final String A02;

    public final void onSessionWillEnd() {
        C143368gb r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
    }

    public C132037tD(UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
    }
}
