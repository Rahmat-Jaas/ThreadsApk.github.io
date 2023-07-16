package X;

import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;

/* renamed from: X.81q  reason: invalid class name and case insensitive filesystem */
public final class C1361581q implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C1361581q(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void run() {
        UserSession userSession = this.A01;
        if (C18190wL.A1a(C18200wM.A0s(PendingMediaStore.A01(userSession).A06.keySet()))) {
            EAW.A0I.A00(this.A00, userSession);
        }
    }
}
