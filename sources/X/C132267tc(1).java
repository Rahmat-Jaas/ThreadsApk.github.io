package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7tc  reason: invalid class name and case insensitive filesystem */
public final class C132267tc implements AnonymousClass0i1 {
    public final List A00;
    public final C125887eE A01;
    public final C125887eE A02;
    public final AnonymousClass01V A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132267tc(UserSession userSession) {
        AnonymousClass01V r4 = AnonymousClass01V.A0p;
        this.A03 = r4;
        boolean A032 = C19573AyZ.A03(userSession);
        C04220Ms.A06(r4);
        C125887eE r2 = new C125887eE(new C1199677v(r4, AnonymousClass6aE.A00, A032));
        this.A02 = r2;
        C125887eE r0 = new C125887eE(new C1199677v(r4, AnonymousClass6aE.A01, A032));
        this.A01 = r0;
        this.A00 = C06750aI.A18(C86144wL.A0w(r0), C86144wL.A0w(r2));
    }
}
