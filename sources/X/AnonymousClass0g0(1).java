package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0g0  reason: invalid class name */
public final class AnonymousClass0g0 extends Thread {
    public static final AtomicInteger A07 = new AtomicInteger();
    public List A00;
    public boolean A01 = false;
    public final int A02;
    public final int A03;
    public final AnonymousClass0k8 A04;
    public final boolean A05;
    public volatile AnonymousClass0gG A06;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r3 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r3 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        if (r5.isEmpty() != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        r3 = r6.A00();
        r2 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r2.hasNext() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        ((X.AnonymousClass0gF) r2.next()).onFinishTask(r12.A06, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r12.A06 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A02
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x00db
            X.0k8 r6 = r12.A04
            int r11 = r12.A03
            int[] r10 = r6.A03
            java.util.List r7 = r6.A00
            java.util.List r8 = r6.A01
            java.util.concurrent.atomic.AtomicInteger r9 = r6.A02
            X.0gG r0 = r6.A01(r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x00b5
            X.0gG r0 = X.C09690fw.A00(r0)
            r12.A06 = r0
        L_0x0021:
            X.0gG r0 = r12.A06
            if (r0 == 0) goto L_0x0005
            java.util.List r5 = r12.A00
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0047
            int r3 = r6.A00()
            java.util.Iterator r2 = r5.iterator()
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            X.0gF r1 = (X.AnonymousClass0gF) r1
            X.0gG r0 = r12.A06
            r1.onStartTask(r0, r3)
            goto L_0x0035
        L_0x0047:
            X.0gG r0 = r12.A06
            X.0Ru r1 = r0.getFuryContext()
            r4 = 0
            if (r1 == 0) goto L_0x0062
            int r0 = r1.BIZ()
            X.0Ru r3 = X.C07650br.A01(r1, r0)
        L_0x0058:
            X.0k2 r2 = X.AnonymousClass0g5.A00
            if (r2 == 0) goto L_0x0064
            X.0gG r0 = r12.A06
            r2.A05(r0)
            goto L_0x0064
        L_0x0062:
            r3 = r4
            goto L_0x0058
        L_0x0064:
            X.0gG r0 = r12.A06     // Catch:{ all -> 0x006a }
            r0.run()     // Catch:{ all -> 0x006a }
            goto L_0x0085
        L_0x006a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0072
            X.0gG r0 = r12.A06     // Catch:{ all -> 0x00cd }
            r2.A03(r0)     // Catch:{ all -> 0x00cd }
        L_0x0072:
            java.lang.String r0 = "IG_EXECUTOR_TASK"
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x00cd }
            boolean r0 = r12.A05     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00cc
            if (r2 == 0) goto L_0x0082
            X.0gG r0 = r12.A06
            r2.A04(r0)
        L_0x0082:
            if (r3 == 0) goto L_0x0091
            goto L_0x008e
        L_0x0085:
            if (r2 == 0) goto L_0x008c
            X.0gG r0 = r12.A06
            r2.A04(r0)
        L_0x008c:
            if (r3 == 0) goto L_0x0091
        L_0x008e:
            r3.close()
        L_0x0091:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00b1
            int r3 = r6.A00()
            java.util.Iterator r2 = r5.iterator()
        L_0x009f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r1 = r2.next()
            X.0gF r1 = (X.AnonymousClass0gF) r1
            X.0gG r0 = r12.A06
            r1.onFinishTask(r0, r3)
            goto L_0x009f
        L_0x00b1:
            r12.A06 = r4
            goto L_0x0005
        L_0x00b5:
            r9.decrementAndGet()
            int r0 = r11 + -1
            java.lang.Object r0 = r8.get(r0)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r12)
        L_0x00c3:
            java.util.concurrent.locks.LockSupport.park()
            X.0gG r0 = r12.A06
            if (r0 == 0) goto L_0x00c3
            goto L_0x0021
        L_0x00cc:
            throw r1     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            if (r2 == 0) goto L_0x00d5
            X.0gG r0 = r12.A06
            r2.A04(r0)
        L_0x00d5:
            if (r3 == 0) goto L_0x00da
            r3.close()
        L_0x00da:
            throw r1
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0g0.run():void");
    }

    public AnonymousClass0g0(AnonymousClass0k8 r3, List list, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = list;
        this.A05 = z;
        setName(AnonymousClass00U.A0J("SIMPLE_WORKER", A07.getAndIncrement()));
    }
}
