package X;

import android.app.Application;

/* renamed from: X.0Lz  reason: invalid class name and case insensitive filesystem */
public final class C04030Lz extends C06010Xh {
    public final /* synthetic */ AnonymousClass0OK A00;

    public C04030Lz(AnonymousClass0OK r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        C13810oL.A01("GlobalCleanup", -1259358585);
        try {
            Application application = this.A00.A0L;
            return new C04320Nd(application, new C06090Xp(), application.getDir("errorreporting", 0));
        } finally {
            C13810oL.A00(-1089685624);
        }
    }
}
