package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4GH  reason: invalid class name */
public final class AnonymousClass4GH implements C82884qQ {
    public final Context A00;
    public final UserSession A01;

    public final boolean CW4(C58743Gz r5) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return C18190wL.A1a(C63693i8.A03(context, userSession, "ig_qp_fx_native_auth_token_existence_filter", userSession.getUserId()));
    }

    public AnonymousClass4GH(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
