package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.3xB  reason: invalid class name and case insensitive filesystem */
public final class C66173xB implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C66173xB(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        return new AnonymousClass10A(new AnonymousClass37P(this.A00, userSession), (AnonymousClass48v) userSession.A01(AnonymousClass48v.class, new KtLambdaShape29S0100000_I2_9(userSession, 26)));
    }
}
