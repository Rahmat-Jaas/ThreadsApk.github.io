package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3UW  reason: invalid class name */
public final class AnonymousClass3UW {
    public boolean A00 = false;
    public UserSession A01;

    public static synchronized void A00(AnonymousClass3UW r1, boolean z) {
        synchronized (r1) {
            r1.A00 = z;
        }
    }

    public final synchronized void A01(AnonymousClass3YL r6) {
        synchronized (this) {
            if (!this.A00) {
                A00(this, true);
                C32165H8c A0R = C18180wK.A0R(C67473zc.A00(C67463zb.A00(), AnonymousClass16B.class, "IGPaymentsAccountDisabledRiskQuery"), this.A01);
                C63873iU.A0F(A0R, this, r6, 41);
                C31155GhB.A05(A0R, 216, 3, false, false);
            }
        }
    }

    public AnonymousClass3UW(UserSession userSession) {
        this.A01 = userSession;
    }
}
