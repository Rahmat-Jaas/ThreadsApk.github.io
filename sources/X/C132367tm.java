package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tm  reason: invalid class name and case insensitive filesystem */
public final class C132367tm implements AnonymousClass0i1 {
    public C146918n5 A00;
    public final UserSession A01;
    public final C04530Oa A02 = C86134wK.A0w(this, 3);
    public final C121547Gq A03;
    public final C1193174m A04;
    public final C108746is A05;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132367tm(UserSession userSession) {
        this.A01 = userSession;
        C04220Ms.A0B(userSession, 0);
        C121547Gq r4 = new C121547Gq(((C132297tf) C86124wJ.A0n(userSession, C132297tf.class, 43)).A00);
        this.A03 = r4;
        C1193174m r3 = new C1193174m(r4);
        this.A04 = r3;
        C108746is A002 = C98706Gp.A00(userSession);
        this.A05 = A002;
        this.A00 = new C125927eI(r4, r3, A002, C86154wM.A0K(this.A02));
    }
}
