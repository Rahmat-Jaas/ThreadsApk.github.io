package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1ni  reason: invalid class name and case insensitive filesystem */
public final class C25471ni extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25471ni(C697249u r7, int i) {
        super("FxIGSSOInfoStatus", 1719297467, i, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        if (AnonymousClass0wJ.A0Y(userSession).A3D()) {
            C49422rM.A00(userSession).A00((C83854s6) null);
        }
    }
}
