package X;

import android.app.Application;
import com.facebook.redex.IDxFunctionShape367S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3xv  reason: invalid class name and case insensitive filesystem */
public final class C66633xv implements C147138nS {
    public final Application A00;
    public final C84874u0 A01;
    public final C39777Kzl A02;
    public final UserSession A03;
    public final Integer A04;
    public final AnonymousClass0YY A05;

    public /* synthetic */ C66633xv(Application application, C39777Kzl kzl, UserSession userSession, Integer num) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C79334js r1 = C79334js.A00;
        C04220Ms.A0B(userSession, 1);
        C04220Ms.A0B(num, 3);
        this.A03 = userSession;
        this.A00 = application;
        this.A04 = num;
        this.A02 = kzl;
        this.A01 = A0J;
        this.A05 = r1;
    }

    public final C62793ak create(Class cls) {
        String str;
        C04220Ms.A0B(cls, 0);
        UserSession userSession = this.A03;
        C31153Gh5 gh5 = H89.A00(userSession, AnonymousClass006.A15).A03;
        C31153Gh5 A002 = C04220Ms.A0B(userSession, 0);
        C31153Gh5 A09 = gh5.A0E(new IDxFunctionShape367S0100000_1_I2(this, 1)).A09();
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        if (A0N == null || (str = A0N.A01) == null) {
            str = "uniqueDeviceId";
        }
        Application application = this.A00;
        EAB A003 = AnonymousClass2MX.A00(userSession);
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        AnonymousClass1oR r5 = new AnonymousClass1oR(r0);
        Integer num = this.A04;
        return new C8J(application, this.A01, A002, A09, r5, A003, this.A02, userSession, num, str);
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }
}
