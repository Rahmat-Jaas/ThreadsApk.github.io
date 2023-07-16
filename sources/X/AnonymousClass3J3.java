package X;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

/* renamed from: X.3J3  reason: invalid class name */
public final class AnonymousClass3J3 {
    public static final LifecycleCoroutineScopeImpl A00(AnonymousClass062 r6) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C04220Ms.A0B(r6, 0);
        while (true) {
            AtomicReference atomicReference = r6.A00;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            AnonymousClass8bb r2 = new AnonymousClass8bb((C148838sG) null);
            C141478bg r1 = AnonymousClass6ZB.A00;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(r6, C25235DiG.A01(r2, r1.A06()));
            if (atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                C25237DiI.A00((Integer) null, r1.A06(), new KtSLambdaShape5S0200000_I2(lifecycleCoroutineScopeImpl, (C146958n9) null, 5), lifecycleCoroutineScopeImpl, 2);
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static void A01(AnonymousClass066 r2, AnonymousClass0YP r3, C84714tk r4) {
        C25817DsW.A06(A00(r2.getLifecycle()), new IDxFlowShape93S0200000_1_I2(r3, r4, 34));
    }
}
