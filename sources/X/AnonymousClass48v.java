package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.48v  reason: invalid class name */
public final class AnonymousClass48v implements AnonymousClass0i4 {
    public final UserSession A00;
    public final C86074wE A01;
    public final C86074wE A02;
    public final C86094wG A03;
    public final C86094wG A04;

    public AnonymousClass48v(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        Lr0 lr0 = DIV.A01;
        C27457Enn A0z = C18190wL.A0z(lr0);
        this.A02 = A0z;
        this.A04 = C18230wP.A0x((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(lr0);
        this.A01 = A0z2;
        this.A03 = C18230wP.A0x((C148838sG) null, A0z2);
    }

    public final void onSessionWillEnd() {
    }
}
