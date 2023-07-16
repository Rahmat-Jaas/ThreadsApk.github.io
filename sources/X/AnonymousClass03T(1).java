package X;

import android.os.Build;

/* renamed from: X.03T  reason: invalid class name */
public final class AnonymousClass03T {
    public final AnonymousClass03U A00;

    public AnonymousClass03T(AnonymousClass03Y r3) {
        AnonymousClass03U r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new C05180Rs(r3);
        } else if (i >= 29) {
            r0 = new C005402k(r3);
        } else {
            r0 = new C005502l(r3);
        }
        this.A00 = r0;
    }

    public AnonymousClass03T() {
        AnonymousClass03U r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new C05180Rs();
        } else if (i >= 29) {
            r0 = new C005402k();
        } else {
            r0 = new C005502l();
        }
        this.A00 = r0;
    }
}
