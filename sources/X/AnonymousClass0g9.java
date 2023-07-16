package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;

/* renamed from: X.0g9  reason: invalid class name */
public final class AnonymousClass0g9 {
    public static AnonymousClass0g9 A01;
    public final Handler A00;

    public static synchronized AnonymousClass0g9 A00() {
        AnonymousClass0g9 r1;
        synchronized (AnonymousClass0g9.class) {
            r1 = A01;
            if (r1 == null) {
                HandlerThread handlerThread = new HandlerThread("IgSchedulerExecutor.ScheduledTasksLooper", 9);
                C13820oM.A00(handlerThread);
                handlerThread.start();
                r1 = new AnonymousClass0g9(new Handler(handlerThread.getLooper(), new AnonymousClass0gB()));
                A01 = r1;
            }
        }
        return r1;
    }

    public final void A01(AnonymousClass0gG r5, long j) {
        this.A00.postAtTime(C09690fw.A00(r5), r5, SystemClock.uptimeMillis() + j);
    }

    public final void A02(Runnable runnable) {
        if (runnable != null) {
            this.A00.removeCallbacksAndMessages(runnable);
            return;
        }
        throw new IllegalArgumentException("Command must not be null");
    }

    public AnonymousClass0g9(Handler handler) {
        this.A00 = handler;
    }
}
