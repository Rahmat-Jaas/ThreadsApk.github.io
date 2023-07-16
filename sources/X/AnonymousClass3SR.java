package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3SR  reason: invalid class name */
public final class AnonymousClass3SR {
    public UserSession A00;
    public boolean A01 = false;

    public static synchronized void A00(AnonymousClass3SR r1, boolean z) {
        synchronized (r1) {
            r1.A01 = z;
        }
    }

    public AnonymousClass3SR(UserSession userSession) {
        this.A00 = userSession;
    }
}
