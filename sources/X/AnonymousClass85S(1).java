package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.85S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass85S implements ThreadFactory {
    public static final ThreadFactory A00 = new AnonymousClass85S();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
