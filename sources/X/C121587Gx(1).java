package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.7Gx  reason: invalid class name and case insensitive filesystem */
public final class C121587Gx {
    public final C142628fK A00;
    public final C104216bQ A01;
    public final BiometricManager A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0.hasEnrolledFingerprints() == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00() {
        /*
            r3 = this;
            X.8fK r0 = r3.A00
            X.7Te r0 = (X.C122617Te) r0
            android.content.Context r1 = r0.A00
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            r2 = 0
            if (r0 == 0) goto L_0x0015
            boolean r2 = r0.isDeviceSecure()
        L_0x0015:
            X.6bQ r0 = r3.A01
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = "BiometricManager"
            java.lang.String r0 = "Failure in canAuthenticate(). FingerprintManager was null."
            android.util.Log.e(r1, r0)
            r1 = 1
        L_0x0021:
            r0 = r1
            if (r2 == 0) goto L_0x0028
            r0 = -1
            if (r1 != 0) goto L_0x0028
            r0 = 0
        L_0x0028:
            return r0
        L_0x0029:
            android.content.Context r1 = r0.A00
            android.hardware.fingerprint.FingerprintManager r0 = X.AnonymousClass6FZ.A00(r1)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isHardwareDetected()
            if (r0 == 0) goto L_0x0047
            android.hardware.fingerprint.FingerprintManager r0 = X.AnonymousClass6FZ.A00(r1)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.hasEnrolledFingerprints()
            r1 = 0
            if (r0 != 0) goto L_0x0021
        L_0x0044:
            r1 = 11
            goto L_0x0021
        L_0x0047:
            r1 = 12
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121587Gx.A00():int");
    }

    private int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = AnonymousClass7AZ.A02();
        if (!(A022 == null || (A002 = AnonymousClass7FF.A00(AnonymousClass7FF.A01())) == null)) {
            try {
                Object A0Z = C86154wM.A0Z(A002, this.A02, A022);
                if (A0Z instanceof Integer) {
                    return AnonymousClass0wJ.A04(A0Z);
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A023 = A02();
        if (AnonymousClass7FG.A01(((C122617Te) this.A00).A00, Build.MODEL) || A023 != 0) {
            return A023;
        }
        return A00();
    }

    private int A02() {
        BiometricManager biometricManager = this.A02;
        if (biometricManager != null) {
            return AnonymousClass7AZ.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A02;
            if (biometricManager != null) {
                return AnonymousClass6DR.A00(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (i != 15 && i != 255) {
            return -2;
        } else {
            Context context = ((C122617Te) this.A00).A00;
            Class cls = KeyguardManager.class;
            if (context.getSystemService(cls) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(cls);
                if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                    return 11;
                }
                return 0;
            } else if (i2 == 29) {
                if ((i & 255) == 255) {
                    return A02();
                }
                return A01();
            } else if (context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return 12;
            } else {
                return A00();
            }
        }
    }

    public C121587Gx(C142628fK r5) {
        BiometricManager biometricManager;
        this.A00 = r5;
        int i = Build.VERSION.SDK_INT;
        C104216bQ r0 = null;
        if (i >= 29) {
            biometricManager = r5.ATO();
        } else {
            biometricManager = null;
        }
        this.A02 = biometricManager;
        this.A01 = i <= 29 ? new C104216bQ(((C122617Te) r5).A00) : r0;
    }
}
