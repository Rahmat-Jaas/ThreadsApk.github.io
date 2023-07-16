package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.851  reason: invalid class name */
public final class AnonymousClass851 implements Executor {
    public final Handler A00 = AnonymousClass0wJ.A0F();

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
