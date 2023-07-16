package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nX  reason: invalid class name */
public final class AnonymousClass1nX extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nX(C697249u r3) {
        super("maybeLogResurrection", 354);
        this.A00 = r3;
    }

    public final void loggedRun() {
        C697249u r0 = this.A00;
        UserSession userSession = r0.A06;
        Context context = r0.A05;
        AnonymousClass0wJ.A1N(userSession, context);
        SharedPreferences A04 = C28161tl.A04(userSession);
        long j = A04.getLong("last_resurrection_logged_date", 0);
        if (C63173fJ.A05(AnonymousClass0TJ.A06, 18303363909685226L) || j == 0 || C18240wQ.A09(j) > 86400000) {
            C33292Fd.A00(context, userSession).A01(C306622k.RESURRECTION);
            AnonymousClass0wJ.A12(A04.edit(), "last_resurrection_logged_date", System.currentTimeMillis());
        }
    }
}
