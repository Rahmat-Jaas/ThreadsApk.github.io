package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7;

/* renamed from: X.1nm  reason: invalid class name and case insensitive filesystem */
public final class C25511nm extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25511nm(C697249u r7) {
        super("ClipsPrefetchFaslCacheViewOnAppForeground", 585832230, 3, false, false);
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
                C691847d.A02((C692047h) userSession.A01(C692047h.class, new KtLambdaShape23S0200000_I2_7(36, context, userSession)));
            }
        }
    }
}
