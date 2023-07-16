package X;

import com.instagram.release.buildinfo.BuildInfoStore;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10;
import kotlin.jvm.internal.KtLambdaShape99S0100000_I2_79;

/* renamed from: X.1ng  reason: invalid class name and case insensitive filesystem */
public final class C25451ng extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25451ng(C697249u r7) {
        super("FetchBuildInfo", 2053690886, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        C04220Ms.A0B(userSession, 0);
        Object A01 = userSession.A01(BuildInfoStore.class, new KtLambdaShape99S0100000_I2_79(userSession, 49));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0101000_I2_10(A01, (C146958n9) null, 26), AnonymousClass7Ja.A04(C550531n.A00.AHN(2053690886, 3), C550531n.A01), 3);
    }
}
