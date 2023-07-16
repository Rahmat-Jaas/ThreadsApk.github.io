package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.825  reason: invalid class name */
public final class AnonymousClass825 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public AnonymousClass825(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public final void run() {
        AnonymousClass586 r0 = this.A01.A01;
        AnonymousClass6DS r4 = r0.A04;
        if (r4 == null) {
            r4 = new AnonymousClass52S(r0);
            r0.A04 = r4;
        }
        int i = this.A00;
        CharSequence charSequence = this.A02;
        if (r4 instanceof AnonymousClass52T) {
            AnonymousClass52T r42 = (AnonymousClass52T) r4;
            r42.A01.Bln(new C1373588g(charSequence.toString(), i));
            AnonymousClass7Kz.A07().A07.Bb8("verify_biometric_fail", C121257Ff.A00(r42.A02.A01));
        }
    }
}
