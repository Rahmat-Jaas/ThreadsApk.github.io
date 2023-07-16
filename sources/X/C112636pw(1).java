package X;

import androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;

/* renamed from: X.6pw  reason: invalid class name and case insensitive filesystem */
public final class C112636pw {
    public final C112626pv A00;
    public final AnonymousClass061 A01;
    public final AnonymousClass062 A02;
    public final C14260p5 A03;

    public final void A00() {
        this.A02.A08(this.A03);
        C112626pv r1 = this.A00;
        r1.A00 = true;
        r1.A00();
    }

    public C112636pw(C112626pv r4, AnonymousClass061 r5, AnonymousClass062 r6, C148838sG r7) {
        AnonymousClass0wJ.A1O(r6, r5);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        LifecycleController$$ExternalSyntheticLambda0 lifecycleController$$ExternalSyntheticLambda0 = new LifecycleController$$ExternalSyntheticLambda0(this, r7);
        this.A03 = lifecycleController$$ExternalSyntheticLambda0;
        if (((C14340pE) r6).A00 == AnonymousClass061.DESTROYED) {
            r7.AC7((CancellationException) null);
            A00();
            return;
        }
        r6.A07(lifecycleController$$ExternalSyntheticLambda0);
    }
}
