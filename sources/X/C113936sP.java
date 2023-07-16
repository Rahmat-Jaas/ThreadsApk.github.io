package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;

/* renamed from: X.6sP  reason: invalid class name and case insensitive filesystem */
public final class C113936sP {
    public AnonymousClass7E1 A00;
    public final AnonymousClass6DS A01;
    public final C121597Gy A02;
    public final C109576kE A03;
    public final C145348kM A04;
    public final C107266gT A05;
    public final Executor A06;

    public final void A00() {
        String str;
        AnonymousClass7E1 r0 = this.A00;
        if (r0 != null) {
            C12560m7 r1 = r0.A00;
            if (r1 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) r1.A0O("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    str = "Unable to cancel authentication. BiometricFragment not found.";
                } else {
                    biometricFragment.A07(3);
                    return;
                }
            }
            Log.e("BiometricPromptCompat", str);
        }
    }

    public final void A01(Fragment fragment) {
        C145348kM r0;
        C109576kE r3 = this.A03;
        Fragment fragment2 = fragment;
        if (r3 != null) {
            Executor executor = this.A06;
            AnonymousClass6DS r02 = this.A01;
            r02.getClass();
            AnonymousClass7E1 r1 = new AnonymousClass7E1(r02, fragment, executor);
            this.A00 = r1;
            C121597Gy r03 = this.A02;
            if (r03 == null) {
                AnonymousClass7E1.A00((C121597Gy) null, r3, r1);
            } else {
                r1.A01(r03, r3);
            }
        } else {
            C1203379t A07 = AnonymousClass7Kz.A07();
            AnonymousClass7Ic r4 = new AnonymousClass7Ic(AnonymousClass7Ic.A08, fragment2, (FragmentActivity) null, A07, A07.A09);
            C107266gT r32 = this.A05;
            Executor executor2 = this.A06;
            C145348kM r12 = this.A04;
            if (executor2 == null || r12 == null) {
                r0 = new C128637jy();
            } else {
                r0 = new C128647jz(r12, executor2);
            }
            AnonymousClass7Ic.A02(r0, r32, r4);
        }
    }

    public C113936sP(AnonymousClass6DS r1, C121597Gy r2, C109576kE r3, C145348kM r4, C107266gT r5, Executor executor) {
        this.A06 = executor;
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
    }
}
