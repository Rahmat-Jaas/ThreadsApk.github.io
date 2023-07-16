package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass0YP;
import X.AnonymousClass7C2;
import X.C04220Ms;
import X.C14260p5;
import X.C14340pE;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C83224qz;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

public final class LifecycleCoroutineScopeImpl implements C83224qz, C14260p5 {
    public final AnonymousClass062 A00;
    public final C27952Ew2 A01;

    public LifecycleCoroutineScopeImpl(AnonymousClass062 r3, C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 2);
        this.A00 = r3;
        this.A01 = ew2;
        if (((C14340pE) r3).A00 == AnonymousClass061.DESTROYED) {
            AnonymousClass7C2.A00((CancellationException) null, ew2);
        }
    }

    public final void A00(AnonymousClass0YP r4) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2((Object) r4, (Object) this, (C146958n9) null, 33), this, 3);
    }

    public final C27952Ew2 Aa1() {
        return this.A01;
    }

    public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
        AnonymousClass062 r2 = this.A00;
        if (((C14340pE) r2).A00.compareTo(AnonymousClass061.DESTROYED) <= 0) {
            r2.A08(this);
            AnonymousClass7C2.A00((CancellationException) null, this.A01);
        }
    }

    public LifecycleCoroutineScopeImpl() {
    }
}
