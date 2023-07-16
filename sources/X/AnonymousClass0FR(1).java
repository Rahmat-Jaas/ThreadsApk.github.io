package X;

import android.os.Build;

/* renamed from: X.0FR  reason: invalid class name */
public final class AnonymousClass0FR {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A00 = z;
    }
}
