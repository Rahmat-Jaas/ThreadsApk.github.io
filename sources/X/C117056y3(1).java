package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.6y3  reason: invalid class name and case insensitive filesystem */
public final class C117056y3 {
    public static Object A00(AnonymousClass7HU r3) {
        boolean z;
        C13320nQ.A04("Must not be called on the main application thread");
        C13320nQ.A02(r3, "Task must not be null");
        synchronized (r3.A04) {
            z = r3.A02;
        }
        if (!z) {
            C129627mD r1 = new C129627mD((AnonymousClass6Cv) null);
            Executor executor = C103456Zg.A01;
            r3.A09(r1, executor);
            r3.A08(r1, executor);
            AnonymousClass7HU.A01(r1, r3, executor);
            r1.A00.await();
        }
        if (r3.A0C()) {
            return r3.A04();
        }
        if (r3.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r3.A03());
    }

    public static Object A01(AnonymousClass7HU r3, TimeUnit timeUnit, long j) {
        boolean z;
        C13320nQ.A04("Must not be called on the main application thread");
        C13320nQ.A02(r3, "Task must not be null");
        C13320nQ.A02(timeUnit, "TimeUnit must not be null");
        synchronized (r3.A04) {
            z = r3.A02;
        }
        if (!z) {
            C129627mD r1 = new C129627mD((AnonymousClass6Cv) null);
            Executor executor = C103456Zg.A01;
            r3.A09(r1, executor);
            r3.A08(r1, executor);
            AnonymousClass7HU.A01(r1, r3, executor);
            if (!r1.A00.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (r3.A0C()) {
            return r3.A04();
        }
        if (r3.A05) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r3.A03());
    }
}
