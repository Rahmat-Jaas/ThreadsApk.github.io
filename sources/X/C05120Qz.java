package X;

import android.os.Looper;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0Qz  reason: invalid class name and case insensitive filesystem */
public final class C05120Qz implements Runnable {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public C05120Qz(AnonymousClass01V r1, UserSession userSession, User user, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = user;
        this.A03 = str;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new AnonymousClass0R1(this.A00, this.A01, this.A02, this.A03));
    }
}
