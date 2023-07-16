package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.3xp  reason: invalid class name and case insensitive filesystem */
public final class C66573xp implements C147138nS {
    public final C84874u0 A00;
    public final AnonymousClass1oQ A01;
    public final UserSession A02;
    public final AnonymousClass0ZU A03;
    public final AnonymousClass0YY A04;

    public /* synthetic */ C66573xp(AnonymousClass1oQ r5, UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C79314jq r2 = C79314jq.A00;
        KtLambdaShape62S0100000_I2_42 ktLambdaShape62S0100000_I2_42 = new KtLambdaShape62S0100000_I2_42(userSession, 16);
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r5;
        this.A00 = A0J;
        this.A04 = r2;
        this.A03 = ktLambdaShape62S0100000_I2_42;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        AnonymousClass1oQ r4 = this.A01;
        C79314jq r1 = (C79314jq) this.A04;
        return new CAO(this.A00, (C31153Gh5) r1.invoke(this.A02), (C31153Gh5) this.A03.invoke(), r4);
    }
}
