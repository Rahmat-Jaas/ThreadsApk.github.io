package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0R2  reason: invalid class name */
public final class AnonymousClass0R2 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0BO A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public AnonymousClass0R2(Context context, AnonymousClass0BO r2, UserSession userSession, User user) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = user;
    }

    public final void run() {
        AnonymousClass0BO r3 = this.A01;
        C07540bg r0 = r3.A01;
        Context context = this.A00;
        UserSession userSession = this.A02;
        r0.A00(context, userSession);
        AnonymousClass0BO.A04(context, r3, userSession, this.A03);
    }
}
