package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ng  reason: invalid class name and case insensitive filesystem */
public final class C04350Ng {
    public static ExecutorService A00;
    public static final ExecutorService A01;
    public static final ExecutorService A02;
    public static final ExecutorService A03;
    public static final ScheduledExecutorService A04 = new ScheduledThreadPoolExecutor(3, new C04340Nf("scheduled", 10));
    public static final ExecutorService A05;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A05 = new ThreadPoolExecutor(0, 4, 15, timeUnit, new LinkedBlockingQueue(), new C04340Nf("main", 5));
        TimeUnit timeUnit2 = timeUnit;
        A00 = new ThreadPoolExecutor(1, 1, 15, timeUnit2, new LinkedBlockingQueue(), new C04340Nf("single", 0));
        TimeUnit timeUnit3 = timeUnit;
        A01 = new ThreadPoolExecutor(0, 4, 10, timeUnit3, new LinkedBlockingQueue(), new C04340Nf(AppStateModule.APP_STATE_BACKGROUND, 10));
        A03 = new ThreadPoolExecutor(1, 4, 10, timeUnit2, new LinkedBlockingQueue(), new C04340Nf("sender", 10));
        A02 = new ThreadPoolExecutor(0, 4, 10, timeUnit3, new LinkedBlockingQueue(), new C04340Nf("startup", 0));
    }
}
