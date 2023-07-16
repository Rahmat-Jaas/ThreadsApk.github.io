package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tE  reason: invalid class name and case insensitive filesystem */
public final class C132047tE implements AnonymousClass0i4 {
    public C26285E7m A00;
    public final UserSession A01;
    public final AnonymousClass0ZU A02;
    public final AnonymousClass0ZU A03;
    public final AnonymousClass0ZU A04;

    public C132047tE(UserSession userSession, AnonymousClass0ZU r3, AnonymousClass0ZU r4, AnonymousClass0ZU r5) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public final void onSessionWillEnd() {
        C26285E7m e7m = this.A00;
        if (e7m != null) {
            C691847d.A03(e7m);
        }
    }
}
