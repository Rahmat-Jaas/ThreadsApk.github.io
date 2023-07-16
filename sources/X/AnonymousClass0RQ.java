package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.0RQ  reason: invalid class name */
public final class AnonymousClass0RQ implements C04050Mb {
    public Context A00;

    public final void CWp(C04170Mn r4, AnonymousClass0ND r5) {
        ActivityManager activityManager = (ActivityManager) this.A00.getSystemService("activity");
        if (activityManager != null) {
            r4.A01(AnonymousClass0MU.A21, activityManager.getMemoryClass());
            r4.A01(AnonymousClass0MU.A1e, activityManager.getLargeMemoryClass());
        }
    }

    public AnonymousClass0RQ(Context context) {
        this.A00 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0K;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
