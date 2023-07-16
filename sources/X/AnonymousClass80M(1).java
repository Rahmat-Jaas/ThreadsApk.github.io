package X;

import android.os.Bundle;
import androidx.biometric.BiometricFragment;
import java.security.GeneralSecurityException;
import java.security.Signature;

/* renamed from: X.80M  reason: invalid class name */
public final class AnonymousClass80M implements Runnable {
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ C106686fR A01;

    public AnonymousClass80M(BiometricFragment biometricFragment, C106686fR r2) {
        this.A00 = biometricFragment;
        this.A01 = r2;
    }

    public final void run() {
        Signature signature;
        AnonymousClass586 r0 = this.A00.A01;
        AnonymousClass6DS r5 = r0.A04;
        if (r5 == null) {
            r5 = new AnonymousClass52S(r0);
            r0.A04 = r5;
        }
        C106686fR r3 = this.A01;
        if (r5 instanceof AnonymousClass52T) {
            AnonymousClass52T r52 = (AnonymousClass52T) r5;
            AnonymousClass7Kz.A07().A07.Bb8("verify_biometric", C121257Ff.A00(r52.A02.A01));
            C121597Gy r02 = r3.A01;
            if (r02 == null || (signature = r02.A00) == null) {
                try {
                    signature = AnonymousClass583.A00(r52.A00, r52.A03);
                } catch (GeneralSecurityException unused) {
                    signature = null;
                }
            }
            r52.A01.Blo(new C108876j6(Bundle.EMPTY, r52.A03, signature));
        }
    }
}
