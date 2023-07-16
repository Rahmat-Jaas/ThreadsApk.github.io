package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0EW  reason: invalid class name */
public abstract class AnonymousClass0EW extends C12950ml {
    public final Handler A00;

    public AnonymousClass0EW(Handler handler) {
        this.A00 = handler;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get(j, timeUnit);
        }
        throw new IllegalStateException("Must not call get() function from this Handler thread. Will deadlock!");
    }

    public final Object get() {
        if (Looper.myLooper() != this.A00.getLooper() || isDone()) {
            return super.get();
        }
        throw new IllegalStateException("Must not call get() function from this Handler thread. Will deadlock!");
    }
}
