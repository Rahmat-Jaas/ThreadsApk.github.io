package X;

import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.smartcapture.logging.SCEventNames;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0lc  reason: invalid class name and case insensitive filesystem */
public class C12270lc implements UserFlowLogger {
    public static final AtomicInteger A05 = new AtomicInteger(1);
    public final LightweightQuickPerformanceLogger A00;
    public final Set A01;
    public final Set A02;
    public final boolean A03;
    public final boolean A04;

    public C12270lc(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this(lightweightQuickPerformanceLogger, false, true);
    }

    public final void A02(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.A00.markerEndForUserFlow(i, i2, 111);
            }
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotateCrucialForUserFlow(i, i2, str, str2);
        } else {
            A00(str, str3, i, 10087);
        }
    }

    public final void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, SCEventNames.Params.SESSION_END_REASON, str2);
        synchronized (this) {
            if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
                lightweightQuickPerformanceLogger.markerEndForUserFlow(i, str, i2, 4);
            } else {
                A00(AnonymousClass00U.A0L("flowCancelAtPoint|", str2), str3, i, 10294);
            }
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowDrop(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.A00.markerDropForUserFlow(i, i2);
            }
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowEndAbort(long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
                this.A00.markerEndForUserFlow(i, (String) null, i2, 105);
            } else {
                A00("flowEndAbort", "", i, 10294);
            }
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, (String) null, str, str2);
    }

    public final void flowEndFail(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
                this.A00.markerEndForUserFlow(i, i2, 3);
            } else {
                A00(AnonymousClass00U.A0L("flowEndFail|", str), str3, i, 10294);
            }
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowMarkError(long j, String str, String str2) {
        MarkerEditor withMarker = this.A00.withMarker((int) j, (int) (j >>> 32));
        withMarker.annotate("uf_has_error", true);
        PointEditor pointEditor = withMarker.pointEditor(str);
        if (str2 != null) {
            pointEditor.addPointData("uf_debug_info", str2);
        }
        withMarker.markerEditingCompleted();
    }

    public final void flowMarkPoint(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            MarkerEditor withMarker = this.A00.withMarker(i, i2);
            withMarker.pointEditor(str).addPointData("uf_debug_info", str2);
            withMarker.markerEditingCompleted();
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        A00(str, str2, i, 10088);
    }

    public final void flowStart(long j, String str, boolean z, long j2) {
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j2;
        A01(userFlowConfig, (String) null, j, false);
    }

    public final boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        return A01(userFlowConfig, str, j, true);
    }

    public final Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        long j2 = ((long) i) | (((long) i2) << 32);
        UserFlowConfig userFlowConfig = new UserFlowConfig(str, z);
        userFlowConfig.mTtlMs = j;
        if (A01(userFlowConfig, (String) null, j2, true)) {
            return Long.valueOf(j2);
        }
        return null;
    }

    public final long generateFlowId(int i, int i2) {
        return ((long) i) | (((long) i2) << 32);
    }

    public final PointEditor markPointWithEditor(long j, String str, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            return this.A00.withMarker(i, i2).pointEditor(str);
        }
        A00(str, str2, i, 10088);
        return C08690e6.A00;
    }

    public final synchronized void onAppBackgrounded() {
        Set set = this.A02;
        Set set2 = this.A01;
        set.removeAll(set2);
        set2.clear();
    }

    public final MarkerEditor withFlow(long j) {
        return this.A00.withMarker((int) j, (int) (j >>> 32));
    }

    private void A00(String str, String str2, int i, short s) {
        EventBuilder annotate = this.A00.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate("uf_invalid_reason", str);
        if (!TextUtils.isEmpty(str2)) {
            annotate = annotate.annotate("uf_unstarted_debug_info", str2);
        }
        annotate.report();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r24 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean A01(com.facebook.quicklog.reliability.UserFlowConfig r20, java.lang.String r21, long r22, boolean r24) {
        /*
            r19 = this;
            r2 = r19
            r0 = r22
            monitor-enter(r2)
            java.util.Set r4 = r2.A02     // Catch:{ all -> 0x0078 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0078 }
            boolean r4 = r4.add(r3)     // Catch:{ all -> 0x0078 }
            r7 = 1
            r6 = 0
            r5 = 0
            if (r4 != 0) goto L_0x0015
            r5 = 1
        L_0x0015:
            int r9 = (int) r0     // Catch:{ all -> 0x0078 }
            r4 = 32
            long r0 = r22 >>> r4
            int r10 = (int) r0     // Catch:{ all -> 0x0078 }
            boolean r0 = r2.A03     // Catch:{ all -> 0x0078 }
            r4 = r20
            if (r0 == 0) goto L_0x0026
            if (r5 == 0) goto L_0x003a
            if (r24 != 0) goto L_0x002a
            goto L_0x002c
        L_0x0026:
            if (r5 == 0) goto L_0x003a
            if (r24 == 0) goto L_0x003a
        L_0x002a:
            monitor-exit(r2)
            return r6
        L_0x002c:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r2.A00     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "trigger_source_of_restart"
            java.lang.String r0 = r4.mTriggerSource     // Catch:{ all -> 0x0078 }
            r5.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0078 }
            r0 = 111(0x6f, float:1.56E-43)
            r5.markerEndForUserFlow(r9, r10, r0)     // Catch:{ all -> 0x0078 }
        L_0x003a:
            boolean r12 = r4.mCancelOnBackground     // Catch:{ all -> 0x0078 }
            r11 = r21
            if (r21 == 0) goto L_0x0053
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r2.A00     // Catch:{ all -> 0x0078 }
            long r13 = r4.mTtlMs     // Catch:{ all -> 0x0078 }
            r8.markerStartForUserFlow((int) r9, (int) r10, (java.lang.String) r11, (boolean) r12, (long) r13)     // Catch:{ all -> 0x0078 }
        L_0x0047:
            boolean r0 = r2.A04     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r4.mTriggerSource     // Catch:{ all -> 0x0078 }
            r8.markerAnnotateCrucialForUserFlow((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0069
        L_0x0053:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r2.A00     // Catch:{ all -> 0x0078 }
            long r0 = r4.mTtlMs     // Catch:{ all -> 0x0078 }
            r13 = r8
            r14 = r9
            r15 = r10
            r16 = r12
            r17 = r0
            r13.markerStartForUserFlow(r14, r15, r16, r17)     // Catch:{ all -> 0x0078 }
            goto L_0x0047
        L_0x0062:
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r4.mTriggerSource     // Catch:{ all -> 0x0078 }
            r8.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0078 }
        L_0x0069:
            if (r12 == 0) goto L_0x0071
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0078 }
            r0.add(r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x0071:
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0078 }
            r0.remove(r3)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r2)
            return r7
        L_0x0078:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12270lc.A01(com.facebook.quicklog.reliability.UserFlowConfig, java.lang.String, long, boolean):boolean");
    }

    public final /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    public final long flowStartForMarker(int i, String str, boolean z) {
        long incrementAndGet = ((long) i) | (((long) A05.incrementAndGet()) << 32);
        A01(new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), (String) null, incrementAndGet, false);
        return incrementAndGet;
    }

    public final long generateNewFlowId(int i) {
        return ((long) i) | (((long) A05.incrementAndGet()) << 32);
    }

    public final /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    public final void flowAnnotate(long j, String str, double d, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        String str3 = str;
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotate(i, i2, str3, d);
        } else {
            A00(str, str2, i, 10087);
        }
    }

    public final /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    public final void flowAnnotate(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotate(i2, i3, str, i);
        } else {
            A00(str, str2, i2, 10087);
        }
    }

    public final /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    public final void flowAnnotate(long j, String str, long j2, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        String str3 = str;
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotate(i, i2, str3, j2);
        } else {
            A00(str, str2, i, 10087);
        }
    }

    public final /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    public final void flowAnnotate(long j, String str, String str2, String str3) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotate(i, i2, str, str2);
        } else {
            A00(str, str3, i, 10087);
        }
    }

    public final /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    public final void flowAnnotate(long j, String str, boolean z, String str2) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerAnnotate(i, i2, str, z);
        } else {
            A00(str, str2, i, 10087);
        }
    }

    public C12270lc(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, boolean z, boolean z2) {
        this.A02 = new HashSet();
        this.A01 = new HashSet();
        lightweightQuickPerformanceLogger.getClass();
        this.A00 = lightweightQuickPerformanceLogger;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    public final /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    public final /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    public final /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    public final void flowEndSuccess(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        synchronized (this) {
            if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
                this.A00.markerEndForUserFlow(i, i2, 2);
            } else {
                A00("flowEndSuccess", str, i, 10294);
            }
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public final void flowMarkPoint(long j, String str) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        if (!this.A03 || this.A02.contains(Long.valueOf(j))) {
            this.A00.markerPoint(i, i2, str);
        } else {
            A00(str, "", i, 10088);
        }
    }

    public final void flowStart(long j, String str, boolean z) {
        A01(new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), (String) null, j, false);
    }

    public final boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        return A01(userFlowConfig, (String) null, j, true);
    }

    public final /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    public final void flowStart(long j, UserFlowConfig userFlowConfig) {
        A01(userFlowConfig, (String) null, j, false);
    }

    public final void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        UserFlowConfig userFlowConfig2 = userFlowConfig;
        A01(userFlowConfig2, str, j, false);
    }
}
