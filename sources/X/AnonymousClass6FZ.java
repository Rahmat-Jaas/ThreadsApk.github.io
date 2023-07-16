package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.6FZ  reason: invalid class name */
public final class AnonymousClass6FZ {
    public static FingerprintManager A00(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
