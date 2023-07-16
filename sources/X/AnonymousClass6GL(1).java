package X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: X.6GL  reason: invalid class name */
public final class AnonymousClass6GL {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return AnonymousClass0wJ.A1T(runningAppProcessInfo.importance, 100);
    }
}
