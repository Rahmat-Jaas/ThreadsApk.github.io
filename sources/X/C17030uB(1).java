package X;

import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0uB  reason: invalid class name and case insensitive filesystem */
public final class C17030uB {
    public int A00 = 0;
    public int A01 = 0;
    public long A02;
    public C08860eQ A03;
    public AnonymousClass0PM A04;
    public AnonymousClass0L5 A05;
    public C17000u8 A06;
    public Runnable A07;
    public Runnable A08;
    public Future A09;
    public boolean A0A;
    public final Handler A0B;
    public final AnonymousClass0PW A0C;
    public final ExecutorService A0D;
    public final ScheduledExecutorService A0E;
    public final RealtimeSinceBootClock A0F;
    public final C16990u7 A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r8.A0A != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r3.BON(r6) == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01() {
        /*
            r8 = this;
            r7 = r8
            monitor-enter(r7)
            java.lang.String r5 = "ConnectionRetryManager"
            r4 = 0
            X.0u8 r0 = r8.A06     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "next is called before having a strategy."
            X.AnonymousClass0LU.A0C(r5, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x0010:
            X.0PM r0 = r8.A04     // Catch:{ all -> 0x00de }
            boolean r0 = r0.ACc()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00dc
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x0024
            goto L_0x00dc
        L_0x0024:
            int r0 = r8.A01     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x002e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00de }
            r8.A02 = r0     // Catch:{ all -> 0x00de }
        L_0x002e:
            X.0PW r0 = r8.A0C     // Catch:{ all -> 0x00de }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00de }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00de }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x0041
            boolean r0 = r8.A0A     // Catch:{ all -> 0x00da }
            r6 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r6 = 0
        L_0x0042:
            X.0u8 r3 = r8.A06     // Catch:{ all -> 0x00de }
            boolean r2 = r3.BON(r6)     // Catch:{ all -> 0x00de }
            X.0u9 r1 = r3.BEG()     // Catch:{ all -> 0x00de }
            X.0u9 r0 = X.C17010u9.BACK_TO_BACK     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x007b
            if (r1 != r0) goto L_0x0075
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x005c
            r0.cancel(r4)     // Catch:{ all -> 0x00de }
            r0 = 0
            r8.A09 = r0     // Catch:{ all -> 0x00de }
        L_0x005c:
            X.0L5 r0 = r8.A05     // Catch:{ all -> 0x00de }
            X.0K0 r0 = r0.A00()     // Catch:{ all -> 0x00de }
            int r2 = r0.A02     // Catch:{ all -> 0x00de }
            int r1 = r0.A06     // Catch:{ all -> 0x00de }
            int r0 = r0.A03     // Catch:{ all -> 0x00de }
            X.0r1 r3 = new X.0r1     // Catch:{ all -> 0x00de }
            r3.<init>(r2, r1, r0)     // Catch:{ all -> 0x00de }
            r8.A06 = r3     // Catch:{ all -> 0x00de }
            boolean r0 = r3.BON(r6)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x007b
        L_0x0075:
            java.lang.String r0 = "No more retry!"
            X.AnonymousClass0LU.A0C(r5, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x007b:
            int r1 = r3.Bhp(r6)     // Catch:{ all -> 0x00de }
            java.util.concurrent.Future r0 = r8.A09     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x0089
            r0.cancel(r4)     // Catch:{ all -> 0x00de }
            r0 = 0
            r8.A09 = r0     // Catch:{ all -> 0x00de }
        L_0x0089:
            int r0 = r8.A01     // Catch:{ all -> 0x00de }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x00de }
            if (r1 > 0) goto L_0x00b6
            android.os.Handler r0 = r8.A0B     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00ad
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x00de }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x00de }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00de }
            if (r1 != r0) goto L_0x00ad
            java.lang.Runnable r0 = r8.A08     // Catch:{ all -> 0x00de }
            r0.run()     // Catch:{ all -> 0x00de }
            X.0Cr r0 = X.C02740Cr.A01     // Catch:{ all -> 0x00de }
        L_0x00aa:
            r8.A09 = r0     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x00ad:
            java.util.concurrent.ExecutorService r1 = r8.A0D     // Catch:{ all -> 0x00de }
            java.lang.Runnable r0 = r8.A08     // Catch:{ all -> 0x00de }
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00aa
        L_0x00b6:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00de }
            java.util.concurrent.ScheduledExecutorService r4 = r8.A0E     // Catch:{ all -> 0x00de }
            java.lang.Runnable r3 = r8.A08     // Catch:{ all -> 0x00de }
            long r1 = (long) r1     // Catch:{ all -> 0x00de }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00de }
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x00de }
            r8.A09 = r0     // Catch:{ all -> 0x00de }
            X.0eQ r3 = r8.A03     // Catch:{ all -> 0x00de }
            if (r3 == 0) goto L_0x00dc
            java.lang.String r2 = "retry in %d seconds"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x00de }
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)     // Catch:{ all -> 0x00de }
            r3.Bb6(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x00da:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r7)
            return
        L_0x00de:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17030uB.A01():void");
    }

    public static void A00(C17030uB r4) {
        Future future = r4.A09;
        if (future != null) {
            future.cancel(false);
            r4.A09 = null;
        }
        AnonymousClass0K0 A002 = r4.A05.A00();
        r4.A06 = new C15250r0(A002.A04, A002.A07, A002.A05);
        C16990u7 r1 = r4.A0G;
        r1.A00 = r1.A01;
        r4.A01 = 0;
    }

    public C17030uB(Handler handler, C08860eQ r5, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0PW r7, AnonymousClass0PM r8, AnonymousClass0L5 r9, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A0F = realtimeSinceBootClock;
        this.A0C = r7;
        this.A0D = executorService;
        this.A0E = scheduledExecutorService;
        this.A0B = handler;
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r5;
        AnonymousClass0K0 A002 = r9.A00();
        this.A0G = new C16990u7(A002.A02, A002.A03);
    }
}
