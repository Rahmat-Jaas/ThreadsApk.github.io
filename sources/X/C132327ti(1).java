package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7ti  reason: invalid class name and case insensitive filesystem */
public final class C132327ti implements AnonymousClass0i1 {
    public final AnonymousClass76K A00;
    public final C121547Gq A01;
    public final C104486br A02;
    public final C104496bs A03;
    public final C1200878l A04;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132327ti(UserSession userSession) {
        C104486br r4 = new C104486br(GP0.A00(userSession));
        this.A02 = r4;
        C104496bs r3 = new C104496bs(userSession);
        this.A03 = r3;
        C1200878l r2 = new C1200878l(AnonymousClass3Zs.A03(userSession).A02(D2R.A0l, C1200878l.class), "dcp_ig_models");
        this.A04 = r2;
        C04220Ms.A0B(userSession, 0);
        C121547Gq r1 = new C121547Gq(((C132267tc) C86124wJ.A0n(userSession, C132267tc.class, 12)).A00);
        this.A01 = r1;
        this.A00 = new AnonymousClass76K(r1, r4, r3, r2);
    }
}
