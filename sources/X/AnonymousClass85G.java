package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.85G  reason: invalid class name */
public final class AnonymousClass85G implements Executor {
    public static final Executor A01 = new AnonymousClass85G();
    public final Handler A00 = AnonymousClass0wJ.A0F();

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
