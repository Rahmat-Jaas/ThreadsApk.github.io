package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7tj  reason: invalid class name and case insensitive filesystem */
public final class C132337tj implements AnonymousClass0i1 {
    public final C121547Gq A00;
    public final C1200878l A01;
    public final UserSession A02;
    public final C04530Oa A03;
    public final C04530Oa A04 = C86114wI.A0w(this, 39);

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132337tj(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = new C1200878l(AnonymousClass3Zs.A03(userSession).A02(D2R.A0l, C1200878l.class), "dcp_ig_models");
        C04220Ms.A0B(userSession, 0);
        this.A00 = new C121547Gq(((C132267tc) C86124wJ.A0n(userSession, C132267tc.class, 12)).A00);
        this.A03 = C86114wI.A0w(this, 38);
    }
}
