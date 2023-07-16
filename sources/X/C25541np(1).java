package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1np  reason: invalid class name and case insensitive filesystem */
public final class C25541np extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25541np(C697249u r7, int i, boolean z, boolean z2) {
        super("maybePrefetchVideoTabFeed", 678, i, z, z2);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r1 = this.A00;
        if (C18543AhJ.A00 != null) {
            UserSession userSession = r1.A06;
            if (!C34742Ks.A00(userSession)) {
                AnonymousClass3LM.A01().A0A(userSession);
            }
        }
    }
}
