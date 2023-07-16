package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.854  reason: invalid class name */
public final class AnonymousClass854 implements Executor {
    public final Handler A00 = new C86844zD(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
