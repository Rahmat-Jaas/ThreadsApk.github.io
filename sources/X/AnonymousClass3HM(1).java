package X;

import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;

/* renamed from: X.3HM  reason: invalid class name */
public final class AnonymousClass3HM {
    public final C83654rl A00;
    public final AnonymousClass3II A01;
    public final HashMap A02 = AnonymousClass0wJ.A0y();
    public final C83224qz A03;

    public final void A00(C27713Es3 es3) {
        C04220Ms.A0B(es3, 0);
        A01(es3);
        this.A02.put(es3, C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7((Object) this, (Object) es3, (C146958n9) null, 28), this.A03, 3));
    }

    public final void A01(C27713Es3 es3) {
        C04220Ms.A0B(es3, 0);
        C148838sG r1 = (C148838sG) this.A02.get(es3);
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
    }

    public AnonymousClass3HM(C83654rl r2, AnonymousClass3II r3, C83224qz r4) {
        AnonymousClass0wJ.A1P(r3, r4);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
    }
}
