package X;

import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.56h  reason: invalid class name and case insensitive filesystem */
public final class C880156h extends M5J {
    public C143348gZ A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape76S0100000_I2_56(this, 10));
    public final C31580Grx A02;
    public final AnonymousClass0ZU A03;

    public C880156h(C31580Grx grx, AnonymousClass0ZU r4) {
        C04220Ms.A0B(grx, 1);
        this.A02 = grx;
        this.A03 = r4;
    }

    public final void A09() {
        this.A00 = this.A02.A03(new C126417fD().build(), (C83334rD) this.A01.getValue());
    }

    public final void A0A() {
        C143348gZ r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
    }
}
