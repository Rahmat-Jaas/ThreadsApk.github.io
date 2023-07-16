package X;

import android.content.Context;
import com.instagram.contacts.ccu.impl.CCUPluginImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.1mr  reason: invalid class name and case insensitive filesystem */
public final class C25301mr extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25301mr(C697249u r7) {
        super("initCCUPlugin", 362, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r0 = this.A00;
        Context context = r0.A05;
        UserSession userSession = r0.A06;
        if (C34832Lb.A00(context, userSession)) {
            C563036q r02 = C563036q.A01;
            if (r02 == null) {
                r02 = new C563036q();
                C563036q.A01 = r02;
            }
            CCUPluginImpl cCUPluginImpl = r02.A00;
            if (cCUPluginImpl != null) {
                cCUPluginImpl.initScheduler(context, userSession);
            }
        }
    }
}
