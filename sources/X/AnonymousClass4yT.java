package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;

/* renamed from: X.4yT  reason: invalid class name */
public final class AnonymousClass4yT extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ C114046sb A00;

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public AnonymousClass4yT(C114046sb r1) {
        this.A00 = r1;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.A00.A00();
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C121597Gy r3;
        if (authenticationResult != null) {
            r3 = AnonymousClass7FF.A02(authenticationResult.getCryptoObject());
        } else {
            r3 = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = AnonymousClass6DP.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new C106686fR(r3, i2));
    }
}
