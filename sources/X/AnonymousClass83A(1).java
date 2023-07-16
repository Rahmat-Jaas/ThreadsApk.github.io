package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.83A  reason: invalid class name */
public final class AnonymousClass83A implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass77I A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0MJ A05;

    public AnonymousClass83A(Activity activity, AnonymousClass77I r2, UserSession userSession, User user, String str, AnonymousClass0MJ r6) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = user;
        this.A04 = str;
        this.A05 = r6;
    }

    public final void run() {
        AnonymousClass77I.A00(this.A00, new AnonymousClass7q6(this.A05), this.A02, this.A03, this.A04, true);
        throw null;
    }
}
