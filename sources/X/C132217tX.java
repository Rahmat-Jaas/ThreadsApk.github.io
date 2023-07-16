package X;

import com.instagram.service.session.UserSession;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7tX  reason: invalid class name and case insensitive filesystem */
public final class C132217tX implements AnonymousClass0i1 {
    public UserSession A00;
    public final ReentrantLock A01 = new ReentrantLock();

    public final void onUserSessionWillEnd(boolean z) {
        synchronized (this.A01) {
            if (z) {
                this.A00 = null;
            }
        }
    }

    public C132217tX(UserSession userSession) {
        this.A00 = userSession;
    }
}
