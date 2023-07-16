package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.85K  reason: invalid class name */
public final class AnonymousClass85K implements ThreadFactory {
    public final String A00;

    public AnonymousClass85K(String str) {
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName(this.A00);
        return newThread;
    }
}
