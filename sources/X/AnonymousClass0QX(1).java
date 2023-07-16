package X;

import android.app.ActivityManager;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import java.util.Map;

/* renamed from: X.0QX  reason: invalid class name */
public final class AnonymousClass0QX {
    public static ActivityManager A0U;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public ActivityManager.MemoryInfo A0K;
    public C02750Cs A0L;
    public C02790Cx A0M;
    public ClassLoadingStats.SnapshotStats A0N;
    public AnonymousClass0Hx A0O;
    public String A0P;
    public Map A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A01(java.util.Map r6) {
        /*
            java.lang.String r1 = X.C03010Du.A00
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 != 0) goto L_0x000c
            return r5
        L_0x000c:
            java.lang.String r0 = "/sys/fs/bpf/"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ IOException -> 0x003d }
            boolean r4 = com.facebook.bpf.BpfCounters.A00     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x001b
            int r2 = com.facebook.bpf.BpfCounters.openBpfMapImpl(r0)     // Catch:{ IOException -> 0x003d }
            goto L_0x001c
        L_0x001b:
            r2 = -1
        L_0x001c:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0033 }
            r3.<init>()     // Catch:{ all -> 0x0033 }
            r0 = -1
            if (r2 <= r0) goto L_0x0029
            if (r4 == 0) goto L_0x0029
            com.facebook.bpf.BpfCounters.getBpfCountersImpl(r3, r2)     // Catch:{ all -> 0x0033 }
        L_0x0029:
            if (r2 <= r0) goto L_0x004d
            if (r4 == 0) goto L_0x004d
            com.facebook.bpf.BpfCounters.closeBpfMapImpl(r2)     // Catch:{ IOException -> 0x0031 }
            goto L_0x004d
        L_0x0031:
            r2 = move-exception
            goto L_0x003f
        L_0x0033:
            r1 = move-exception
            r0 = -1
            if (r2 <= r0) goto L_0x003c
            if (r4 == 0) goto L_0x003c
            com.facebook.bpf.BpfCounters.closeBpfMapImpl(r2)     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r1     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r2 = move-exception
            r3 = r5
        L_0x003f:
            java.lang.String r1 = "FbPerfStats"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "Failed to read Bpf counters map."
            android.util.Log.w(r1, r0, r2)
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            return r5
        L_0x0050:
            if (r6 != 0) goto L_0x0053
            return r3
        L_0x0053:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x005b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r6.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005b
            long r2 = r1.longValue()
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.put(r4, r0)
            goto L_0x005b
        L_0x008a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QX.A01(java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass0QX r23, boolean r24) {
        /*
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Object r2 = com.facebook.common.perfcounter.PerfCounter.A02
            monitor-enter(r2)
            int r0 = com.facebook.common.perfcounter.PerfCounter.A01     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x000f
            com.facebook.common.perfcounter.PerfCounter.nativeReport(r1)     // Catch:{ all -> 0x010c }
        L_0x000f:
            monitor-exit(r2)
            java.lang.String r0 = "user-only-instructions"
            java.lang.Long r3 = A00(r0, r1)
            java.lang.String r0 = "process-user-kernel-instructions"
            java.lang.Long r11 = A00(r0, r1)
            java.lang.String r0 = "process-user-only-instructions"
            java.lang.Long r10 = A00(r0, r1)
            java.lang.String r0 = "main-th-user-kernel-instructions"
            java.lang.Long r7 = A00(r0, r1)
            java.lang.String r0 = "main-th-user-only-instructions"
            java.lang.Long r6 = A00(r0, r1)
            java.lang.String r0 = "user-kernel-instructions"
            java.lang.Long r5 = A00(r0, r1)
            java.lang.String r0 = "perf_cpu_clock"
            java.lang.Long r17 = A00(r0, r1)
            java.lang.String r0 = "perf_task_clock"
            java.lang.Long r22 = A00(r0, r1)
            r8 = -1
            r12 = r23
            if (r24 == 0) goto L_0x00eb
            long r1 = r12.A0E
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            long r15 = r3.longValue()
            int r0 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            long r15 = r15 - r1
        L_0x0055:
            long r3 = r12.A0H
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            long r1 = r11.longValue()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            long r8 = r1 - r3
        L_0x0065:
            long r1 = r12.A0G
            r20 = -1
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            long r13 = r10.longValue()
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            long r13 = r13 - r1
        L_0x0076:
            long r0 = r12.A0J
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00e1
            long r10 = r7.longValue()
            int r2 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00e1
            long r10 = r10 - r0
        L_0x0085:
            long r0 = r12.A0F
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00de
            long r6 = r6.longValue()
            int r2 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00de
            long r6 = r6 - r0
        L_0x0094:
            long r0 = r12.A0I
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00db
            long r4 = r5.longValue()
            int r2 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00db
            long r4 = r4 - r0
        L_0x00a3:
            long r0 = r12.A06
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x00d8
            long r2 = r17.longValue()
            int r17 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r17 == 0) goto L_0x00d8
            long r2 = r2 - r0
        L_0x00b2:
            long r0 = r12.A07
            r18 = r0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            long r0 = r22.longValue()
            int r17 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r17 == 0) goto L_0x00d5
            long r0 = r0 - r18
        L_0x00c4:
            r12.A0E = r15
            r12.A0H = r8
            r12.A0G = r13
            r12.A0J = r10
            r12.A0F = r6
            r12.A0I = r4
            r12.A06 = r2
            r12.A07 = r0
            return
        L_0x00d5:
            r0 = -1
            goto L_0x00c4
        L_0x00d8:
            r2 = -1
            goto L_0x00b2
        L_0x00db:
            r4 = -1
            goto L_0x00a3
        L_0x00de:
            r6 = -1
            goto L_0x0094
        L_0x00e1:
            r10 = -1
            goto L_0x0085
        L_0x00e4:
            r13 = -1
            goto L_0x0076
        L_0x00e7:
            r15 = -1
            goto L_0x0055
        L_0x00eb:
            long r15 = r3.longValue()
            long r8 = r11.longValue()
            long r13 = r10.longValue()
            long r10 = r7.longValue()
            long r6 = r6.longValue()
            long r4 = r5.longValue()
            long r2 = r17.longValue()
            long r0 = r22.longValue()
            goto L_0x00c4
        L_0x010c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QX.A02(X.0QX, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        if (r12.A0C >= 0) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018d, code lost:
        if (r12.A0D >= 0) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r13) {
        /*
            r12 = this;
            boolean r0 = r12.A0T
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r12.A0S
            if (r0 != 0) goto L_0x01b9
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0036
            boolean r0 = r12.A0R
            if (r0 == 0) goto L_0x0036
            r2 = 1
            A02(r12, r2)
            java.lang.Object r1 = com.facebook.common.perfcounter.PerfCounter.A02
            monitor-enter(r1)
            int r0 = com.facebook.common.perfcounter.PerfCounter.A01     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x002a
            if (r0 != r2) goto L_0x0020
            com.facebook.common.perfcounter.PerfCounter.nativeEnd()     // Catch:{ all -> 0x0027 }
        L_0x0020:
            int r0 = com.facebook.common.perfcounter.PerfCounter.A01     // Catch:{ all -> 0x0027 }
            int r0 = r0 + -1
            com.facebook.common.perfcounter.PerfCounter.A01 = r0     // Catch:{ all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002a:
            monitor-exit(r1)
            r0 = 0
            r12.A0R = r0
            java.util.Map r0 = r12.A0Q
            java.util.Map r0 = A01(r0)
            r12.A0Q = r0
        L_0x0036:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0073
            java.util.concurrent.atomic.AtomicReference r1 = com.facebook.common.dextricks.stats.ClassLoadingStats.A00
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x019a
            X.081 r0 = new X.081
            r0.<init>()
        L_0x0047:
            com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats r2 = r12.A0N
            int r7 = r0.getClassLoadsAttempted()
            int r1 = r2.A00
            int r7 = r7 - r1
            int r8 = r0.getClassLoadsFailed()
            int r1 = r2.A01
            int r8 = r8 - r1
            int r9 = r0.getDexFileQueries()
            int r1 = r2.A02
            int r9 = r9 - r1
            int r10 = r0.getLocatorAssistedClassLoads()
            int r1 = r2.A04
            int r10 = r10 - r1
            int r11 = r0.getIncorrectDfaGuesses()
            int r0 = r2.A03
            int r11 = r11 - r0
            com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats r6 = new com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A0N = r6
        L_0x0073:
            java.util.HashSet r8 = X.C15020qa.A07
            r8.size()
            boolean r0 = r12.A0T
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r12.A0S
            if (r0 != 0) goto L_0x01b9
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00ea
            int r4 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r4)
            r12.A01 = r0
            long r2 = android.os.Process.getElapsedCpuTime()
            long r0 = r12.A09
            long r2 = r2 - r0
            r12.A09 = r2
            int r0 = r12.A02
            if (r4 != r0) goto L_0x00e2
            long r2 = android.os.SystemClock.currentThreadTimeMillis()
            long r0 = r12.A0C
            long r2 = r2 - r0
            r12.A0C = r2
            int r2 = android.os.Process.myTid()
            java.lang.String r1 = "/proc/self/task/"
            java.lang.String r0 = "/stat"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r2)
            long[] r1 = X.C02800Cy.A00(r0)
            r0 = 2
            r2 = r1[r0]
            long r0 = r12.A0D
            long r2 = r2 - r0
        L_0x00ba:
            r12.A0D = r2
            long r1 = r12.A09
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            boolean r0 = r12.A0S
            if (r0 == 0) goto L_0x00ea
            int r1 = r12.A02
            r0 = -1
            if (r1 == r0) goto L_0x00ea
            long r1 = r12.A0C
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ea
        L_0x00d3:
            java.lang.String r1 = "LitePerfStats"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "Negative values detected for PerfStats, discarding stats."
            android.util.Log.w(r1, r0)
            return
        L_0x00e2:
            r0 = -1
            r12.A02 = r0
            r2 = -1
            r12.A0C = r2
            goto L_0x00ba
        L_0x00ea:
            if (r5 == 0) goto L_0x01a2
            long r1 = r12.A03
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            long r1 = r12.A04
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            long r1 = r12.A05
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
        L_0x0100:
            X.0Cz r7 = X.AnonymousClass0D0.A00()
            long r2 = r12.A03
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0196
            long r0 = r7.A00
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0196
            long r0 = r0 - r2
            r12.A03 = r0
        L_0x0113:
            long r3 = r12.A04
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0193
            long r1 = r7.A02
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0193
            long r1 = r1 - r3
            r12.A04 = r1
        L_0x0122:
            long r3 = r12.A05
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0130
            long r1 = r7.A04
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0130
            long r5 = r1 - r3
        L_0x0130:
            r12.A05 = r5
        L_0x0132:
            java.lang.String r0 = "/proc/self/stat"
            long[] r4 = X.C02800Cy.A00(r0)
            r0 = 0
            r2 = r4[r0]
            long r0 = r12.A0B
            long r2 = r2 - r0
            r12.A0B = r2
            r0 = 2
            r2 = r4[r0]
            long r0 = r12.A0A
            long r2 = r2 - r0
            r12.A0A = r2
            r0 = 5
            r2 = r4[r0]
            long r0 = r12.A08
            long r2 = r2 - r0
            r12.A08 = r2
            X.0Cx r0 = new X.0Cx
            r0.<init>()
            r12.A0M = r0
            int r1 = r8.size()
            X.0Hx r0 = new X.0Hx
            r0.<init>(r1)
            r12.A0O = r0
            X.0Cs r1 = r12.A0L
            if (r1 == 0) goto L_0x0172
            X.0Cs r0 = X.C02750Cs.A00()
            if (r0 == 0) goto L_0x0191
            X.0Cs r0 = r0.A01(r1)
        L_0x0170:
            r12.A0L = r0
        L_0x0172:
            long r1 = r12.A0A
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            long r1 = r12.A0B
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d3
            boolean r0 = r12.A0S
            if (r0 == 0) goto L_0x01a2
            int r1 = r12.A02
            r0 = -1
            if (r1 == r0) goto L_0x01a2
            long r1 = r12.A0D
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a2
            goto L_0x00d3
        L_0x0191:
            r0 = 0
            goto L_0x0170
        L_0x0193:
            r12.A04 = r5
            goto L_0x0122
        L_0x0196:
            r12.A03 = r5
            goto L_0x0113
        L_0x019a:
            java.lang.Object r0 = r1.get()
            com.facebook.common.dextricks.stats.ClassLoadingStats r0 = (com.facebook.common.dextricks.stats.ClassLoadingStats) r0
            goto L_0x0047
        L_0x01a2:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x01b6
            android.app.ActivityManager r0 = A0U
            if (r0 == 0) goto L_0x01b6
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            r12.A0K = r1
            android.app.ActivityManager r0 = A0U
            r0.getMemoryInfo(r1)
        L_0x01b6:
            r0 = 1
            r12.A0S = r0
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QX.A03(int):void");
    }

    public AnonymousClass0QX(ActivityManager activityManager) {
        A0U = activityManager;
    }

    public static Long A00(String str, Map map) {
        long j;
        if (map.get(str) != null) {
            j = ((Number) map.get(str)).longValue();
        } else {
            j = -1;
        }
        return Long.valueOf(j);
    }

    public AnonymousClass0QX() {
        this.A0T = false;
        this.A0S = false;
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A0P = "not set";
        this.A09 = -1;
        this.A0C = -1;
        this.A0B = -1;
        this.A0A = -1;
        this.A0D = -1;
        this.A03 = -1;
        this.A04 = -1;
        this.A05 = -1;
        this.A0M = null;
        this.A0K = null;
        this.A0L = null;
        this.A0O = null;
        this.A0N = null;
        this.A0Q = null;
        this.A0E = -1;
        this.A0H = -1;
        this.A0G = -1;
        this.A0J = -1;
        this.A0F = -1;
        this.A0I = -1;
        this.A06 = -1;
        this.A07 = -1;
        this.A0R = false;
    }
}
