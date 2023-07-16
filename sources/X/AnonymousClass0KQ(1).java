package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0KQ  reason: invalid class name */
public final class AnonymousClass0KQ implements ThreadFactory {
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public AnonymousClass0KQ() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.A01 = threadGroup;
        this.A00 = AnonymousClass00U.A0L("AudioRecorder", "-");
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.A01, runnable, AnonymousClass00U.A0J(this.A00, this.A02.getAndIncrement()), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
