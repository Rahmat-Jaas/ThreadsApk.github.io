package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tq  reason: invalid class name and case insensitive filesystem */
public final class C132407tq implements AnonymousClass0i1 {
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06 = AnonymousClass0OY.A02(C74194Zz.A00);
    public final C04530Oa A07;
    public final C04530Oa A08;
    public final C04530Oa A09;
    public final C04530Oa A0A;
    public final C04530Oa A0B;

    public C132407tq(Context context, UserSession userSession, AnonymousClass0YY r7) {
        AnonymousClass0wJ.A1M(userSession, 1, context);
        this.A09 = AnonymousClass0OY.A02(C86164wN.A0v(r7, userSession, 47));
        this.A02 = AnonymousClass0OY.A02(C86164wN.A0v(context, userSession, 46));
        this.A08 = C86104wH.A15(userSession, 49);
        this.A0B = C86134wK.A0w(userSession, 1);
        this.A05 = C86104wH.A15(userSession, 47);
        this.A04 = C86104wH.A15(this, 46);
        this.A01 = AnonymousClass0OY.A02(AnonymousClass8GO.A00);
        this.A03 = C86104wH.A15(this, 45);
        this.A00 = AnonymousClass0OY.A02(AnonymousClass8GN.A00);
        this.A0A = C86134wK.A0w(this, 0);
        this.A07 = C86104wH.A15(this, 48);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
