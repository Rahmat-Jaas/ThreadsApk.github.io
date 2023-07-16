package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1nJ  reason: invalid class name */
public final class AnonymousClass1nJ extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nJ(C697249u r7, int i) {
        super("maybePrefetchWithSSP", 1858708590, i, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r4 = this.A00;
        UserSession userSession = r4.A06;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36317835433349141L)) {
            new AnonymousClass3FM(userSession, r4.A05).A00(AnonymousClass006.A00, AnonymousClass0wJ.A0y());
        }
    }
}
