package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0AJ  reason: invalid class name */
public final class AnonymousClass0AJ {
    public static final long A00 = TimeUnit.DAYS.toMillis(1);
    public static final long A01 = TimeUnit.HOURS.toMillis(1);
    public static final AtomicInteger A02 = new AtomicInteger(0);

    public static long A00() {
        long currentTimeMillis;
        synchronized (AnonymousClass0AJ.class) {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis / A00;
    }

    public static long A01() {
        long currentTimeMillis;
        synchronized (AnonymousClass0AJ.class) {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis / A01;
    }

    public static String A02() {
        return C29896Fw7.A00();
    }
}
