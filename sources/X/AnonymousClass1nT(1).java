package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nT  reason: invalid class name */
public final class AnonymousClass1nT extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nT(C697249u r7) {
        super("cpdp_mvp_prefetcher", 2041201927, 5, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r1 = this.A00;
        Context context = r1.A05;
        UserSession userSession = r1.A06;
        AnonymousClass0wJ.A1N(context, userSession);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313342897358281L)) {
            AnonymousClass2L6.A00(userSession, (Long) null);
        }
    }
}
