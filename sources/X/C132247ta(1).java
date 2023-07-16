package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7ta  reason: invalid class name and case insensitive filesystem */
public final class C132247ta implements AnonymousClass0i1 {
    public final C121547Gq A00;
    public final C1199677v A01;
    public final C125887eE A02;
    public final AnonymousClass01V A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132247ta(UserSession userSession) {
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        this.A03 = r3;
        boolean A032 = C19573AyZ.A03(userSession);
        C04220Ms.A06(r3);
        C1199677v r1 = new C1199677v(r3, AnonymousClass6aE.A00, A032);
        this.A01 = r1;
        C125887eE r0 = new C125887eE(r1);
        this.A02 = r0;
        this.A00 = new C121547Gq(C06750aI.A18(C86144wL.A0w(r0)));
    }
}
