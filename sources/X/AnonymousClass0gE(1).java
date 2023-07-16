package X;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.0gE  reason: invalid class name */
public final class AnonymousClass0gE {
    public static AnonymousClass0gE A01;
    public final ScheduledThreadPoolExecutor A00 = new ScheduledThreadPoolExecutor(3);

    public static synchronized AnonymousClass0gE A00() {
        AnonymousClass0gE r0;
        synchronized (AnonymousClass0gE.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new AnonymousClass0gE();
                A01 = r0;
            }
        }
        return r0;
    }
}
