package X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0jH  reason: invalid class name and case insensitive filesystem */
public final class C10980jH implements Executor {
    public boolean A00 = false;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final Executor A02;

    public C10980jH(Executor executor) {
        this.A02 = executor;
    }

    public static void A01(C10980jH r2) {
        C11050jO r1;
        synchronized (r2) {
            if (!r2.A00 && (r1 = (C11050jO) r2.A01.poll()) != null) {
                r2.A00 = true;
                r2.A02.execute(r1);
            }
        }
    }

    public static C10980jH A00() {
        if (C11240jm.A02 == null) {
            synchronized (C11240jm.class) {
                if (C11240jm.A02 == null) {
                    int max = Math.max(0, Math.min(5, 32));
                    if (max != 5) {
                        AnonymousClass0LU.A0O("RtiExecutor", "Core pool size override from %d to %d", 5, Integer.valueOf(max));
                    }
                    C11240jm.A02 = new ThreadPoolExecutor(max, 128, 1, TimeUnit.SECONDS, C11240jm.A00, C11240jm.A01);
                }
            }
        }
        return new C10980jH(C11240jm.A02);
    }

    public final void execute(Runnable runnable) {
        this.A01.add(new C11050jO(this, runnable));
        A01(this);
    }
}
