package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.7yi  reason: invalid class name and case insensitive filesystem */
public final class C134997yi implements Runnable {
    public final WeakReference A00;

    public final void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A05();
        }
    }

    public C134997yi(BiometricFragment biometricFragment) {
        this.A00 = C86144wL.A0w(biometricFragment);
    }
}
