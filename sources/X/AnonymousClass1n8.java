package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1n8  reason: invalid class name */
public final class AnonymousClass1n8 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n8(C697249u r7) {
        super("initCameraLeakDetector", 381, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        if (userSession != null && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36314004322256656L) && C41114Lwl.A02 == null) {
            C41114Lwl.A02 = new C41114Lwl();
        }
    }
}
