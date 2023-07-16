package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.826  reason: invalid class name */
public final class AnonymousClass826 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public AnonymousClass826(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public final void run() {
        BiometricFragment biometricFragment = this.A01;
        BiometricFragment.A03(biometricFragment, this.A02, this.A00);
        biometricFragment.A06();
    }
}
