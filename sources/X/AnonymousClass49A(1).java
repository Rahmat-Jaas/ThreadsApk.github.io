package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.49A  reason: invalid class name */
public final class AnonymousClass49A implements AnonymousClass0i4 {
    public final AnonymousClass49B A00;
    public final UserSession A01;

    public AnonymousClass49A(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = (AnonymousClass49B) userSession.A01(AnonymousClass49B.class, new KtLambdaShape75S0100000_I2_55(userSession, 42));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass49A.class);
    }

    public AnonymousClass49A() {
    }
}
