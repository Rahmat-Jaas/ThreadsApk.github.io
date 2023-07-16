package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1mw  reason: invalid class name and case insensitive filesystem */
public final class C25351mw extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25351mw(C697249u r3) {
        super("refreshIgZeroHeader", 352);
        this.A00 = r3;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        if (C19308AuC.A02(userSession, "ig_header_refresh")) {
            C04220Ms.A0B(userSession, 0);
            ((C38071KJp) userSession.A01(C38071KJp.class, C77484fr.A00)).A00();
        }
    }
}
