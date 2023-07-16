package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.7b3  reason: invalid class name and case insensitive filesystem */
public final class C124397b3 implements C147138nS {
    public final C11630kW A00;
    public final UserSession A01;

    public C124397b3(C11630kW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A01;
        C11630kW r3 = this.A00;
        return new C882657j(new C107756hG(r3, userSession), (C131957t5) userSession.A01(C131957t5.class, new KtLambdaShape29S0100000_I2_9(userSession, 24)), r3);
    }
}
