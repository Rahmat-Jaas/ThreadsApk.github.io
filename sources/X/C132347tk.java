package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tk  reason: invalid class name and case insensitive filesystem */
public final class C132347tk implements AnonymousClass0i1 {
    public final Context A00;
    public final UserSession A01;
    public final C04530Oa A02 = C86104wH.A15(this, 28);
    public final C04530Oa A03 = C86104wH.A15(this, 29);
    public final C04530Oa A04 = C86104wH.A15(this, 30);

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132347tk(UserSession userSession, Context context) {
        AnonymousClass0wJ.A1O(userSession, context);
        this.A01 = userSession;
        this.A00 = context;
    }
}
