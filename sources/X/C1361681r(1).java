package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.81r  reason: invalid class name and case insensitive filesystem */
public final class C1361681r implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C1361681r(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void run() {
        C30907Gas A002 = C30907Gas.A00(this.A00);
        UserSession userSession = this.A01;
        synchronized (A002) {
            if (A002.A03 && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342163464577357812L)) {
                A002.A05.AKp(new C28577FSy(A002, userSession));
            }
        }
    }
}
