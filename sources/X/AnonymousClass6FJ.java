package X;

import android.os.Build;

/* renamed from: X.6FJ  reason: invalid class name */
public final class AnonymousClass6FJ {
    public static final int A00(C114276sy r3) {
        if (r3 == null || r3.A00 != 2) {
            return 0;
        }
        if (Build.VERSION.SDK_INT <= 32) {
            return 1;
        }
        return 3;
    }
}
