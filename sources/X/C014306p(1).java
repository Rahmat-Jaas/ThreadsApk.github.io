package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.06p  reason: invalid class name and case insensitive filesystem */
public final class C014306p extends AnonymousClass0DX {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final C002000x A04 = new C002000x();
    public final ArrayList A05 = new ArrayList();
    public final WeakHashMap A06 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.C014306p r14) {
        /*
            monitor-enter(r14)
            r6 = 0
            r12 = -1
            java.util.ArrayList r0 = r14.A05     // Catch:{ all -> 0x00ad }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x00ad }
        L_0x000a:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x00ad }
            X.0Dk r1 = (X.C02920Dk) r1     // Catch:{ all -> 0x00ad }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ad }
            long r2 = r1.A04     // Catch:{ all -> 0x00ad }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            boolean r4 = X.C02920Dk.A00(r1, r2)     // Catch:{ all -> 0x00ad }
        L_0x0024:
            boolean r0 = r1.A05     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0049
            java.lang.ref.WeakReference r0 = r1.A08     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0049
            java.lang.String r3 = "The wakelock "
            java.lang.String r2 = r1.A07     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = " was garbage collected before being released."
            java.lang.String r3 = X.AnonymousClass00U.A0V(r3, r2, r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "WakeLockMetricsCollector"
            r0 = 0
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ad }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ad }
            boolean r0 = X.C02920Dk.A00(r1, r2)     // Catch:{ all -> 0x00ad }
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r4 != 0) goto L_0x004f
            r2 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r2 = 1
        L_0x0050:
            boolean r0 = r1.A05     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0057
            int r6 = r6 + 1
            goto L_0x0060
        L_0x0057:
            if (r2 == 0) goto L_0x0060
            long r2 = r1.A03     // Catch:{ all -> 0x00ad }
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            r12 = r2
        L_0x0060:
            java.lang.ref.WeakReference r0 = r1.A08     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x000a
            X.00x r10 = r14.A04     // Catch:{ all -> 0x00ad }
            java.lang.String r9 = r1.A07     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x00ad }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0077
            r7 = 0
            goto L_0x007b
        L_0x0077:
            long r7 = r0.longValue()     // Catch:{ all -> 0x00ad }
        L_0x007b:
            long r4 = r1.A02     // Catch:{ all -> 0x00ad }
            boolean r0 = r1.A05     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0096
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ad }
            long r0 = r1.A01     // Catch:{ all -> 0x00ad }
            long r2 = r2 - r0
        L_0x0088:
            long r4 = r4 + r2
            long r7 = r7 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00ad }
            r10.put(r9, r0)     // Catch:{ all -> 0x00ad }
            r11.remove()     // Catch:{ all -> 0x00ad }
            goto L_0x000a
        L_0x0096:
            r2 = 0
            goto L_0x0088
        L_0x0099:
            r4 = 0
            goto L_0x0024
        L_0x009b:
            int r0 = r14.A00     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a9
            if (r6 != 0) goto L_0x00a9
            long r2 = r14.A03     // Catch:{ all -> 0x00ad }
            long r0 = r14.A02     // Catch:{ all -> 0x00ad }
            long r12 = r12 - r0
            long r2 = r2 + r12
            r14.A03 = r2     // Catch:{ all -> 0x00ad }
        L_0x00a9:
            r14.A00 = r6     // Catch:{ all -> 0x00ad }
            monitor-exit(r14)
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014306p.A00(X.06p):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        AnonymousClass076 r0;
        synchronized (this) {
            r0 = new AnonymousClass076(false);
        }
        return r0;
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r14) {
        long j;
        long j2;
        long j3;
        long j4;
        AnonymousClass076 r142 = (AnonymousClass076) r14;
        synchronized (this) {
            AnonymousClass0DZ.A00(r142);
            A00(this);
            r142.A00 = this.A01;
            long j5 = this.A03;
            if (this.A00 > 0) {
                j = SystemClock.uptimeMillis() - this.A02;
            } else {
                j = 0;
            }
            r142.A01 = j5 + j;
            if (r142.A02) {
                C002000x r8 = r142.A03;
                r8.clear();
                ArrayList arrayList = this.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C02920Dk r4 = (C02920Dk) arrayList.get(i);
                    long j6 = r4.A02;
                    if (r4.A05) {
                        j3 = SystemClock.uptimeMillis() - r4.A01;
                    } else {
                        j3 = 0;
                    }
                    long j7 = j6 + j3;
                    String str = r4.A07;
                    Long l = (Long) r8.get(str);
                    if (l == null) {
                        j4 = 0;
                    } else {
                        j4 = l.longValue();
                    }
                    r8.put(str, Long.valueOf(j4 + j7));
                }
                C002000x r6 = this.A04;
                int size2 = r6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) r6.A02[i2 << 1];
                    Long l2 = (Long) r8.get(str2);
                    if (l2 == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    r8.put(str2, Long.valueOf(j2 + ((Long) r6.A02[(i2 << 1) + 1]).longValue()));
                }
            }
        }
        return true;
    }
}
