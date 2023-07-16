package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.6ve  reason: invalid class name and case insensitive filesystem */
public final class C115626ve {
    public static void A00(BiometricPrompt.Builder builder) {
        builder.setConfirmationRequired(true);
    }

    public static void A01(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
