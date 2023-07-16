package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.3xX  reason: invalid class name and case insensitive filesystem */
public final class C66393xX implements C147138nS {
    public final int A00;
    public final C11630kW A01;
    public final UserSession A02;

    public C66393xX(C11630kW r2, UserSession userSession, int i) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        return new AnonymousClass109(new AnonymousClass37P(this.A01, userSession), (AnonymousClass48v) userSession.A01(AnonymousClass48v.class, new KtLambdaShape29S0100000_I2_9(userSession, 26)), this.A00);
    }
}
