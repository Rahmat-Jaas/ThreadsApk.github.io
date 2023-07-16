package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4w7  reason: invalid class name and case insensitive filesystem */
public interface C86004w7 extends ExecutorService {
    ListenableFuture CwP(Runnable runnable);

    ListenableFuture CwQ(Callable callable);
}
