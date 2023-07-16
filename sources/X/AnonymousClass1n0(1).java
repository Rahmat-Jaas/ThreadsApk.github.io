package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1n0  reason: invalid class name */
public final class AnonymousClass1n0 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n0(C697249u r3) {
        super("initFbAuthTokenRetriever", 369);
        this.A00 = r3;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        C04220Ms.A0B(userSession, 0);
        userSession.A01(C692747q.class, new KtLambdaShape116S0100000_I2_96(userSession, 23));
    }
}
