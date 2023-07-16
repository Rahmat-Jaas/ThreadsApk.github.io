package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.85I  reason: invalid class name */
public final class AnonymousClass85I implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
