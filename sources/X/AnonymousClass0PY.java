package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0PY  reason: invalid class name */
public final class AnonymousClass0PY extends AnonymousClass087 {
    public static final C04560Oe A0B = new AnonymousClass088();
    public Boolean A00 = null;
    public final C03710Kk A01;
    public final Map A02;
    public final Random A03;
    public final ExecutorService A04;
    public final C04560Oe A05;
    public final C04560Oe A06;
    public final C04560Oe A07;
    public volatile AnonymousClass0IK A08;
    public volatile AnonymousClass0KJ A09;
    public volatile AnonymousClass0IA A0A;

    public final void CdK(String str, String str2) {
        this.A04.execute(new AnonymousClass0IG(this, str, str2, (Throwable) null));
    }

    static {
        C14080om.A00();
    }

    public AnonymousClass0PY(C03710Kk r3, Random random, ExecutorService executorService, C04560Oe r6, C04560Oe r7) {
        C04560Oe r1 = A0B;
        this.A07 = r6;
        this.A06 = r7;
        this.A04 = executorService;
        this.A01 = r3;
        this.A03 = random;
        this.A05 = r1;
        this.A02 = new HashMap();
    }

    public final void CdE(String str) {
        C16740tf r0 = (C16740tf) this.A05.get();
        if (str != null) {
            AnonymousClass09N r4 = r0.A01;
            synchronized (r4) {
                Queue queue = r4.A00;
                if (queue.size() == 20) {
                    queue.remove();
                }
                queue.offer(new AnonymousClass09M(str, SystemClock.uptimeMillis()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (((java.lang.Boolean) r4.A06.get()).booleanValue() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CuV(X.AnonymousClass0IH r18) {
        /*
            r17 = this;
            r4 = r17
            java.lang.Boolean r0 = r4.A00
            if (r0 != 0) goto L_0x000d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
        L_0x000d:
            X.0Oe r9 = r4.A07
            java.lang.Object r0 = r9.get()
            com.facebook.common.util.TriState r8 = com.facebook.common.util.TriState.YES
            if (r0 == r8) goto L_0x0027
            X.0Oe r0 = r4.A06
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r16 = 0
            if (r0 == 0) goto L_0x0029
        L_0x0027:
            r16 = 1
        L_0x0029:
            X.0Kk r0 = r4.A01
            long r14 = r0.now()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            r5 = r18
            java.lang.String r2 = r5.A01
            java.util.Map r10 = r4.A02
            monitor-enter(r10)
            java.lang.Object r3 = r10.get(r2)     // Catch:{ all -> 0x0108 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0108 }
            r6 = 0
            r1 = 1
            if (r3 == 0) goto L_0x0073
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0108 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0108 }
            int r13 = r0.intValue()     // Catch:{ all -> 0x0108 }
            java.lang.Object r0 = r3.get(r6)     // Catch:{ all -> 0x0108 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0108 }
            long r6 = r0.longValue()     // Catch:{ all -> 0x0108 }
            long r11 = r14 - r6
            r6 = 120(0x78, double:5.93E-322)
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r0 = 100
            if (r13 >= r0) goto L_0x0070
            long r6 = (long) r13     // Catch:{ all -> 0x0108 }
            r11 = 1
            long r6 = r6 + r11
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0108 }
            r3.set(r1, r0)     // Catch:{ all -> 0x0108 }
            r11 = 0
            goto L_0x0092
        L_0x0070:
            int r11 = r13 + 1
            goto L_0x0074
        L_0x0073:
            r11 = 1
        L_0x0074:
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0108 }
            r6 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0108 }
            java.lang.Long[] r0 = new java.lang.Long[]{r3, r0}     // Catch:{ all -> 0x0108 }
            java.util.List r3 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0108 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0108 }
            r0.<init>(r3)     // Catch:{ all -> 0x0108 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0108 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0108 }
        L_0x0092:
            monitor-exit(r10)     // Catch:{ all -> 0x0108 }
            if (r16 == 0) goto L_0x0098
            if (r11 != 0) goto L_0x009e
        L_0x0097:
            return
        L_0x0098:
            int r0 = r5.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x009e:
            r6 = 256(0x100, double:1.265E-321)
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x00b3
            java.lang.String r6 = "softReport category: "
            java.lang.String r3 = " message: "
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass00U.A0d(r6, r2, r3, r0)
            com.facebook.systrace.Systrace.A09(r0)
        L_0x00b3:
            if (r11 == 0) goto L_0x0097
            int r3 = r5.A00
            r12 = r2
            X.0Oe r0 = r4.A06
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cc
            java.lang.Object r0 = r9.get()
            if (r0 != r8) goto L_0x00d6
        L_0x00cc:
            java.lang.Boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e9
        L_0x00d6:
            java.util.Random r0 = r4.A03
            int r0 = r0.nextInt()
            int r0 = r0 % r3
            if (r0 != 0) goto L_0x0097
            if (r3 == r1) goto L_0x00e9
            java.lang.String r1 = " [freq="
            java.lang.String r0 = "]"
            java.lang.String r12 = X.AnonymousClass00U.A04(r3, r2, r1, r0)
        L_0x00e9:
            if (r12 == 0) goto L_0x0097
            java.lang.String r3 = r5.A02
            java.lang.String r0 = " | "
            java.lang.String r2 = X.AnonymousClass00U.A0V(r2, r0, r3)
            java.lang.Throwable r0 = r5.A03
            X.08H r1 = new X.08H
            r1.<init>(r2, r0)
            java.util.concurrent.ExecutorService r0 = r4.A04
            X.0IC r9 = new X.0IC
            r13 = r3
            r14 = r1
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r0.execute(r9)
            return
        L_0x0108:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0108 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PY.CuV(X.0IH):void");
    }

    public final void CdL(String str, Throwable th) {
        this.A04.execute(new AnonymousClass0IG(this, str, th.getMessage(), th));
    }

    public final void CYW(String str, String str2) {
        C16740tf.A00(str, str2);
    }
}
