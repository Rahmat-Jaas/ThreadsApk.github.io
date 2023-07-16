package X;

import android.content.Context;

/* renamed from: X.6X8  reason: invalid class name */
public final class AnonymousClass6X8 {
    public static int A00;

    public static final int A00(Context context) {
        C04220Ms.A0B(context, 0);
        int i = A00;
        if (i != 0) {
            return i;
        }
        if (!AnonymousClass0FX.A02()) {
            A00 = -1;
            return -1;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo("com.google.ar.core", 128).versionCode;
            A00 = i2;
            return i2;
        } catch (Throwable unused) {
            A00 = -1;
            return -1;
        }
    }
}
