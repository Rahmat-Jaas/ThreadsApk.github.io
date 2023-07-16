package X;

import android.app.Application;
import java.io.File;

/* renamed from: X.0LY  reason: invalid class name */
public final class AnonymousClass0LY extends C07410bT {
    public final C04170Mn A00(AnonymousClass0ND r6) {
        C04170Mn r4 = new C04170Mn((Throwable) null);
        r4.A03(AnonymousClass0MU.A4b, "anr");
        r4.A03(AnonymousClass0MU.A6J, AnonymousClass00U.A0V("android_", r6.A00, "anr"));
        return r4;
    }

    public final void A03(AnonymousClass0ND r3, File file, File file2) {
        boolean z;
        if (r3 == AnonymousClass0ND.LARGE_REPORT) {
            synchronized (C06910aa.class) {
                z = C06910aa.A0D;
            }
            if (!z) {
                super.A03(r3, file, file2);
            }
        }
    }

    public AnonymousClass0LY(Application application, C07390bR r2, C04840Pi r3) {
        super(application, r2, r3);
    }

    public final AnonymousClass0PD A01() {
        return AnonymousClass0PD.ANR;
    }

    public final Integer A02() {
        return AnonymousClass006.A01;
    }
}
