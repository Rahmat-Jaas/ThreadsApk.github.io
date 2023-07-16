package X;

import android.app.Application;
import com.facebook.redex.IDxFunctionShape367S0100000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.3xw  reason: invalid class name and case insensitive filesystem */
public final class C66643xw implements C147138nS {
    public final Application A00;
    public final C84874u0 A01;
    public final C39777Kzl A02;
    public final UserSession A03;
    public final Integer A04;
    public final AnonymousClass0ZU A05;
    public final AnonymousClass0YY A06;

    public /* synthetic */ C66643xw(Application application, C39777Kzl kzl, UserSession userSession, Integer num) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C79324jr r2 = C79324jr.A00;
        KtLambdaShape62S0100000_I2_42 ktLambdaShape62S0100000_I2_42 = new KtLambdaShape62S0100000_I2_42(userSession, 39);
        AnonymousClass0wJ.A1O(userSession, num);
        this.A03 = userSession;
        this.A04 = num;
        this.A02 = kzl;
        this.A01 = A0J;
        this.A06 = r2;
        this.A05 = ktLambdaShape62S0100000_I2_42;
        this.A00 = application;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        String str;
        UserSession userSession = this.A03;
        C31153Gh5 A09 = H89.A00(userSession, AnonymousClass006.A15).A03.A0E(new IDxFunctionShape367S0100000_1_I2(this, 0)).A09();
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        if (A0N == null || (str = A0N.A01) == null) {
            str = "uniqueDeviceId";
        }
        EAB A002 = AnonymousClass2MX.A00(userSession);
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        AnonymousClass3EK r5 = new AnonymousClass3EK(r0);
        Integer num = this.A04;
        C84874u0 r2 = this.A01;
        return new C89(this.A00, r2, A09, (C31153Gh5) this.A05.invoke(), r5, A002, this.A02, userSession, num, str);
    }
}
