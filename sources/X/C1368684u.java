package X;

import java.util.concurrent.Executor;

/* renamed from: X.84u  reason: invalid class name and case insensitive filesystem */
public final class C1368684u implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
