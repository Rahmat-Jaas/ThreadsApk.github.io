package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4WF  reason: invalid class name */
public final class AnonymousClass4WF extends AbstractExecutorService {
    public static final AnonymousClass4WF A00 = new AnonymousClass4WF();

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List shutdownNow() {
        return Collections.emptyList();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
