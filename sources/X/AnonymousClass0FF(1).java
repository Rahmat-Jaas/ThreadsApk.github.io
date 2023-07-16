package X;

import java.util.concurrent.Executor;

/* renamed from: X.0FF  reason: invalid class name */
public final class AnonymousClass0FF implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
