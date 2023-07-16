package X;

import android.app.ActivityThread;

/* renamed from: X.0Ep  reason: invalid class name */
public final class AnonymousClass0Ep {
    public static ActivityThread A00;

    public static ActivityThread A00() {
        ActivityThread activityThread = A00;
        if (activityThread != null) {
            return activityThread;
        }
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        A00 = currentActivityThread;
        return currentActivityThread;
    }
}
