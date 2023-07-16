package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7td  reason: invalid class name and case insensitive filesystem */
public final class C132277td implements AnonymousClass0i1 {
    public final C146908n4 A00;
    public final UserSession A01;
    public final C04530Oa A02;
    public final Context A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132277td(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A03 = context;
        C04530Oa A15 = C86104wH.A15(this, 13);
        this.A02 = A15;
        this.A00 = AnonymousClass6XE.A00.A00(context, C86154wM.A0K(A15), userSession, false);
    }
}
