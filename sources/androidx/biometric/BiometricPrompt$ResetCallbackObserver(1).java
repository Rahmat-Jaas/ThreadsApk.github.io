package androidx.biometric;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.AnonymousClass586;
import X.C86144wL;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;

public class BiometricPrompt$ResetCallbackObserver implements AnonymousClass065 {
    public final WeakReference A00;

    @OnLifecycleEvent(AnonymousClass060.ON_DESTROY)
    public void resetCallback() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass586) weakReference.get()).A04 = null;
        }
    }

    public BiometricPrompt$ResetCallbackObserver(AnonymousClass586 r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
