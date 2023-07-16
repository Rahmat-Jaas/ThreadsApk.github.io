package X;

import android.os.Build;

/* renamed from: X.30H  reason: invalid class name */
public final class AnonymousClass30H {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        }
        A00 = i;
    }
}
