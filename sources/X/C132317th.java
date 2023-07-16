package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7th  reason: invalid class name and case insensitive filesystem */
public final class C132317th implements AnonymousClass0i1 {
    public C1198077b A00;
    public final C112076ox A01;
    public final C121547Gq A02;
    public final C132247ta A03;
    public final C31580Grx A04;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132317th(UserSession userSession, Context context) {
        C132247ta A002 = C98676Gm.A00(userSession);
        this.A03 = A002;
        C121547Gq r2 = A002.A00;
        this.A02 = r2;
        C31580Grx A012 = AnonymousClass3WK.A01(userSession);
        this.A04 = A012;
        C112076ox r1 = new C112076ox(context, A012);
        this.A01 = r1;
        this.A00 = new C1198077b(r1, r2);
    }
}
