package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.85B  reason: invalid class name */
public final class AnonymousClass85B implements Executor {
    public static final Handler A00 = AnonymousClass0wJ.A0F();

    public final void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
