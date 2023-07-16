package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.49B  reason: invalid class name */
public final class AnonymousClass49B implements AnonymousClass0i4 {
    public final AnonymousClass49V A00;
    public final UserSession A01;

    public AnonymousClass49B(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = (AnonymousClass49V) userSession.A01(AnonymousClass49V.class, new KtLambdaShape75S0100000_I2_55(userSession, 43));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49B.class);
    }

    public AnonymousClass49B() {
    }
}
