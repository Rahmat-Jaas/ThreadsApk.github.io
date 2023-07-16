package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.85P  reason: invalid class name */
public final class AnonymousClass85P implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new C135447zV(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public AnonymousClass85P(String str) {
        C13320nQ.A02(str, "Name must not be null");
        this.A00 = str;
    }
}
