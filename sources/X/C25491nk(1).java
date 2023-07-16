package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nk  reason: invalid class name and case insensitive filesystem */
public final class C25491nk extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25491nk(C697249u r7) {
        super("ClipsFlashCacheWarmup", 1452655717, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r1 = this.A00;
        if (C18543AhJ.A00 != null) {
            UserSession userSession = r1.A06;
            if (!C34742Ks.A00(userSession)) {
                AnonymousClass3LM.A01();
                Context context = r1.A05;
                AnonymousClass0wJ.A1N(context, userSession);
                new C19741B8l(context, userSession).DB0();
            }
        }
    }
}
