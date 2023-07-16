package X;

import android.app.ActivityManager;

/* renamed from: X.6Ht  reason: invalid class name and case insensitive filesystem */
public final class C99006Ht {
    public static final boolean A00() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.lastTrimLevel;
        boolean z = false;
        if (!(i == 0 || i == 20 || i == 40 || i == 5 || i == 60 || i == 10)) {
            z = true;
        }
        if (z) {
            StringBuilder A0s = C18190wL.A0s("level: ");
            A0s.append(i);
            A0s.append(", importance: ");
            A0s.append(runningAppProcessInfo.importance);
            C86144wL.A1T(A0s);
            A0s.append(runningAppProcessInfo.importanceReasonCode);
            A0s.append(", lru: ");
            C10450iM.A03("OsMemoryState", C86144wL.A0v(A0s, runningAppProcessInfo.lru));
        }
        return z;
    }
}
