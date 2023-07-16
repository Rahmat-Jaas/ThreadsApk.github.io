package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.85R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass85R implements ThreadFactory {
    public static final AnonymousClass85R A00 = new AnonymousClass85R();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
