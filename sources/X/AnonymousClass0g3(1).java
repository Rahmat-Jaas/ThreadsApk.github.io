package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0g3  reason: invalid class name */
public final class AnonymousClass0g3 extends ThreadPoolExecutor {
    public boolean A00 = true;
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    private synchronized AtomicInteger A00(int i) {
        AtomicInteger atomicInteger;
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        atomicInteger = (AtomicInteger) map.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            map.put(valueOf, atomicInteger);
        }
        return atomicInteger;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0g3(java.util.concurrent.BlockingQueue r11, java.util.concurrent.ThreadFactory r12, java.util.concurrent.TimeUnit r13, int r14, long r15) {
        /*
            r10 = this;
            r3 = 128(0x80, float:1.794E-43)
            X.0g4 r9 = new X.0g4
            r9.<init>()
            r1 = r10
            r7 = r11
            r8 = r12
            r6 = r13
            r2 = r14
            r4 = r15
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r10.A01 = r0
            r0 = 1
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0g3.<init>(java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.TimeUnit, int, long):void");
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (this.A00 && (runnable instanceof AnonymousClass0gG)) {
            A00(((AnonymousClass0gG) runnable).getRunnableId()).decrementAndGet();
        }
    }

    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (this.A00 && (runnable instanceof AnonymousClass0gG)) {
            A00(((AnonymousClass0gG) runnable).getRunnableId()).incrementAndGet();
        }
    }
}
