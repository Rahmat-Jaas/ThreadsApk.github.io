package X;

import android.app.Application;
import java.io.File;

/* renamed from: X.0LB  reason: invalid class name */
public final class AnonymousClass0LB extends C07410bT {
    public final C04170Mn A00(AnonymousClass0ND r6) {
        C04170Mn r4 = new C04170Mn((Throwable) null);
        r4.A03(AnonymousClass0MU.A6J, AnonymousClass00U.A0V("android_", r6.A00, "soft_error"));
        return r4;
    }

    public final void A03(AnonymousClass0ND r2, File file, File file2) {
        if (r2 == AnonymousClass0ND.LARGE_REPORT) {
            super.A03(r2, file, file2);
        }
    }

    public AnonymousClass0LB(Application application, C07390bR r2, C04840Pi r3) {
        super(application, r2, r3);
    }

    public final AnonymousClass0PD A01() {
        return AnonymousClass0PD.SOFT_ERROR;
    }

    public final Integer A02() {
        return AnonymousClass006.A01;
    }
}
