package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.7yg  reason: invalid class name and case insensitive filesystem */
public final class C134977yg implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public C134977yg(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public final void run() {
        AnonymousClass586 r0 = this.A00.A01;
        AnonymousClass6DS r4 = r0.A04;
        if (r4 == null) {
            r4 = new AnonymousClass52S(r0);
            r0.A04 = r4;
        }
        if (r4 instanceof AnonymousClass52T) {
            AnonymousClass52T r42 = (AnonymousClass52T) r4;
            r42.A01.Bln(new C1373588g("A biometric is valid but not recognized.", 104));
            AnonymousClass7Kz.A07().A07.Bb8("verify_biometric_fail", C121257Ff.A00(r42.A02.A01));
        }
    }
}
