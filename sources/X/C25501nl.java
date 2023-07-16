package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1nl  reason: invalid class name and case insensitive filesystem */
public final class C25501nl extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25501nl(C697249u r7) {
        super("ClipsPrefetchOnAppForeground", 1008921948, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r1 = this.A00;
        if (C18543AhJ.A00 != null) {
            UserSession userSession = r1.A06;
            if (!C34742Ks.A00(userSession)) {
                AnonymousClass3LM.A01();
                C04220Ms.A0B(userSession, 0);
                BC7 A002 = C34782Kw.A00(userSession);
                A002.A01 = "clips_viewer";
                C691847d.A02(A002);
            }
        }
    }
}
