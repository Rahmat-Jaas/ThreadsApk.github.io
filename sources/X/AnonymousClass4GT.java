package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4GT  reason: invalid class name */
public final class AnonymousClass4GT implements C82884qQ {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;

    public final boolean CW4(C58743Gz r6) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        boolean z = true;
        if (new JSP(context, userSession).A00(new C212319o(userSession), true) != 1) {
            z = false;
        }
        if (C18210wN.A1W(z) || this.A00 != C28161tl.A04(userSession).getBoolean("allow_contacts_sync", false)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4GT(UserSession userSession, Context context, boolean z) {
        this.A01 = context;
        this.A00 = z;
        this.A02 = userSession;
    }
}
