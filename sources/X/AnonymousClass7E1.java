package X;

import android.os.Build;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt$ResetCallbackObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;

/* renamed from: X.7E1  reason: invalid class name */
public final class AnonymousClass7E1 {
    public C12560m7 A00;

    public static void A00(C121597Gy r4, C109576kE r5, AnonymousClass7E1 r6) {
        String str;
        C12560m7 r3 = r6.A00;
        if (r3 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else if (r3.A15()) {
            str = "Unable to start authentication. Called after onSaveInstanceState().";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) r3.A0O("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                biometricFragment = new BiometricFragment();
                AnonymousClass01J r0 = new AnonymousClass01J(r3);
                r0.A0E(biometricFragment, "androidx.biometric.BiometricFragment");
                r0.A01();
                r3.A0b();
            }
            biometricFragment.A09(r4, r5);
            return;
        }
        Log.e("BiometricPromptCompat", str);
    }

    public final void A01(C121597Gy r4, C109576kE r5) {
        int i = r5.A00;
        if (i == 0) {
            i = 15;
        } else if ((i & 255) == 255) {
            throw C18190wL.A0a("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT >= 30 || (i & 32768) == 0) {
            A00(r4, r5, this);
            return;
        }
        throw C18190wL.A0a("Crypto-based authentication is not supported for device credential prior to API 30.");
    }

    public AnonymousClass7E1(AnonymousClass6DS r5, Fragment fragment, Executor executor) {
        AnonymousClass586 r2;
        if (executor != null) {
            FragmentActivity activity = fragment.getActivity();
            C12560m7 childFragmentManager = fragment.getChildFragmentManager();
            if (activity != null) {
                r2 = (AnonymousClass586) new AnonymousClass7IU(activity).A01(AnonymousClass586.class);
                if (r2 != null) {
                    fragment.mLifecycleRegistry.A07(new BiometricPrompt$ResetCallbackObserver(r2));
                }
            } else {
                r2 = null;
            }
            this.A00 = childFragmentManager;
            if (r2 != null) {
                r2.A0H = executor;
                r2.A04 = r5;
                return;
            }
            return;
        }
        throw C18190wL.A0a("Executor must not be null.");
    }

    public AnonymousClass7E1(AnonymousClass6DS r4, FragmentActivity fragmentActivity, Executor executor) {
        if (executor != null) {
            C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            AnonymousClass586 r0 = (AnonymousClass586) new AnonymousClass7IU(fragmentActivity).A01(AnonymousClass586.class);
            this.A00 = supportFragmentManager;
            if (r0 != null) {
                r0.A0H = executor;
                r0.A04 = r4;
                return;
            }
            return;
        }
        throw C18190wL.A0a("Executor must not be null.");
    }
}
