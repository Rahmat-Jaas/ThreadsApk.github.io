package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Fh  reason: invalid class name and case insensitive filesystem */
public final class C58383Fh {
    public final long A00;
    public final long A01;
    public final UserSession A02;
    public final AnonymousClass3ZL A03;

    public C58383Fh(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        this.A01 = C63803iN.A03(r2, userSession, 36599989014760840L);
        this.A00 = C63803iN.A03(r2, userSession, 36599989014695303L) * 604800000;
        this.A03 = AnonymousClass3Zu.A03(userSession);
    }

    public final void A00(Activity activity, AnonymousClass3TG r5) {
        C22661Yy A002 = C49372rH.A00(r5);
        C37032Jj9 A0L = C18210wN.A0L(this.A02);
        A0L.A0d = false;
        C18200wM.A16(activity, A002, A0L);
    }
}
