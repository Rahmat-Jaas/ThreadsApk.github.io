package X;

import android.content.Context;

/* renamed from: X.1se  reason: invalid class name and case insensitive filesystem */
public final class C27521se extends C62213Xu {
    public C62213Xu A00;

    public final void startDeviceValidation(Context context, String str) {
        C62213Xu r0 = this.A00;
        if (r0 != null) {
            r0.startDeviceValidation(context, str);
        }
    }

    public C27521se() {
        try {
            this.A00 = (C62213Xu) Class.forName("com.instagram.nux.deviceverification.impl.VerificationPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            AnonymousClass0LU.A0E("DeviceVerificationPlugin", "Failed to instantiate Device Verification Plugin", th);
        }
    }
}
