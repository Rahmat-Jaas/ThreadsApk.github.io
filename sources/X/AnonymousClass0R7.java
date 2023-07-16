package X;

import android.app.ActivityManager;

/* renamed from: X.0R7  reason: invalid class name */
public final class AnonymousClass0R7 implements C04050Mb {
    public C04560Oe A00;

    public final boolean BNv(Integer num) {
        if (num == AnonymousClass006.A00) {
            return true;
        }
        return false;
    }

    public final void CWp(C04170Mn r8, AnonymousClass0ND r9) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        AnonymousClass0QI r1 = (AnonymousClass0QI) this.A00.get();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = r1.A02;
        synchronized (runningAppProcessInfo2) {
            if (AnonymousClass0QI.A00(r1) || r1.A00 > 0) {
                runningAppProcessInfo.importance = runningAppProcessInfo2.importance;
                runningAppProcessInfo.lastTrimLevel = runningAppProcessInfo2.lastTrimLevel;
            }
        }
        r8.A01(AnonymousClass0MU.A1w, runningAppProcessInfo.importance);
        r8.A01(AnonymousClass0MU.A1x, runningAppProcessInfo.lastTrimLevel);
    }

    public AnonymousClass0R7(C04560Oe r1) {
        this.A00 = r1;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0p;
    }
}
