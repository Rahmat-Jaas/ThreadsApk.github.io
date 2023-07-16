package X;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.76D  reason: invalid class name */
public final class AnonymousClass76D {
    public static final AnonymousClass76D A03 = new AnonymousClass76D();
    public final Executor A00;
    public final ExecutorService A01;
    public final ScheduledExecutorService A02;

    public AnonymousClass76D() {
        ThreadPoolExecutor threadPoolExecutor;
        String property = System.getProperty("java.runtime.name");
        if (property == null || !property.toLowerCase(Locale.US).contains("android")) {
            threadPoolExecutor = Executors.newCachedThreadPool();
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(AnonymousClass75K.A01, AnonymousClass75K.A02, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = threadPoolExecutor2;
        }
        this.A01 = threadPoolExecutor;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = new AnonymousClass85E();
    }
}
