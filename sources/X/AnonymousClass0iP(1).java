package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0iP  reason: invalid class name */
public final class AnonymousClass0iP implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, AnonymousClass00U.A0J("ErrorReportingThread-", this.A00.getAndIncrement()));
    }
}
