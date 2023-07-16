package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.3ES  reason: invalid class name */
public final class AnonymousClass3ES {
    public final Context A00;

    public AnonymousClass3ES(Context context) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
    }

    public final void A00(C82714q9 r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3HM A01 = AnonymousClass3NS.A01(userSession).A01(AnonymousClass2AP.A06);
        A01.A00(new AnonymousClass4EC(A01, r3, this, userSession));
    }
}
