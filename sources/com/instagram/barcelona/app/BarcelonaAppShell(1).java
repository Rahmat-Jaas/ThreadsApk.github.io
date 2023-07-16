package com.instagram.barcelona.app;

import X.AnonymousClass00U;
import X.AnonymousClass07R;
import X.AnonymousClass0KY;
import X.C10620ie;
import X.C16070sR;
import X.C16290sn;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.io.File;

public class BarcelonaAppShell extends Application implements AnonymousClass07R, C16290sn {
    public AnonymousClass0KY A00;
    public boolean A01 = false;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public C10620ie A06;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r0 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r5 = this;
            r4 = r5
            boolean r0 = r5.A01
            java.lang.String r2 = "BarcelonaAppShell"
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "We have already installed multidex successfully"
            android.util.Log.w(r2, r0)
            return
        L_0x000d:
            com.facebook.common.time.AwakeTimeSinceBootClock r3 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r3.now()
            r5.A05 = r0
            monitor-enter(r4)     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            X.0Kf r1 = X.C03670Kf.A00(r5)     // Catch:{ all -> 0x0070 }
            boolean r0 = r1.A1O     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0066
            boolean r0 = r1.A1P     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0037
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x0070 }
            X.0KX r0 = r0.A00     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0066
        L_0x0037:
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x0070 }
            X.0KX r0 = r0.A00     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "optsvc"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0070 }
            r1 = 6
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r1 = 4
        L_0x0055:
            boolean r0 = r5.A01     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "Have already loaded FB multidex"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0070 }
        L_0x005e:
            r0 = 0
            com.facebook.common.dextricks.DexLibLoader.loadAll((android.content.Context) r5, (int) r1, (com.facebook.quicklog.LightweightQuickPerformanceLogger) r0)     // Catch:{ all -> 0x0070 }
            r0 = 1
            r5.A01 = r0     // Catch:{ all -> 0x0070 }
            goto L_0x0069
        L_0x0066:
            androidx.multidex.MultiDex.A01(r5)     // Catch:{ all -> 0x0070 }
        L_0x0069:
            long r0 = r3.now()
            r5.A03 = r0
            return
        L_0x0070:
            r2 = move-exception
            long r0 = r3.now()
            r5.A03 = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.app.BarcelonaAppShell.A00():void");
    }

    public final File getCacheDir() {
        C10620ie r1 = this.A06;
        File cacheDir = super.getCacheDir();
        if (r1 != null) {
            return r1.A00(cacheDir);
        }
        return cacheDir;
    }

    public final File getDir(String str, int i) {
        File A012;
        C10620ie r0 = this.A06;
        if (r0 == null || (A012 = r0.A01(str, i)) == null) {
            return super.getDir(str, i);
        }
        return A012;
    }

    public final Resources getResources() {
        C10620ie r1 = this.A06;
        if (r1 instanceof C16070sR) {
            if (this instanceof C16290sn) {
                Resources AzU = ((C16070sR) r1).AzU();
                if (AzU != null) {
                    return AzU;
                }
            } else {
                throw new IllegalStateException(AnonymousClass00U.A0L(getClass().getName(), " illegally implements HasOverridingResources without HasBaseResourcesAccess."));
            }
        }
        return super.getResources();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C10620ie r0 = this.A06;
        if (r0 != null) {
            r0.A02(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (X.AnonymousClass0SH.A03(r5, X.AnonymousClass00U.A0L("classtracinglogger_enable_", r1)) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0147, code lost:
        if (r0 != false) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r20 = this;
            r10 = 1676221939(0x63e91df3, float:8.600499E21)
            com.facebook.profilo.provider.constants.ExternalProvider r0 = com.facebook.profilo.provider.constants.ExternalProviders.A02
            com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike r7 = r0.A08()
            r8 = 6
            r9 = 23
            r12 = 0
            r11 = 0
            int r4 = r7.A00(r8, r9, r10, r11, r12)
            r5 = r20
            super.onCreate()
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)
            if (r0 == 0) goto L_0x0028
            r1 = -1641569462(0xffffffff9e27a34a, float:-8.874674E-21)
            java.lang.String r0 = "BarcelonaAppShell.onCreate"
            X.C13930oX.A01(r0, r1)
        L_0x0028:
            java.lang.String r1 = "pretosproc"
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x032f }
            X.0KX r0 = r0.A00     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x032f }
        L_0x0034:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x02cf
            java.lang.String r1 = "fdidsync"
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x032f }
            X.0KX r0 = r0.A00     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x032f }
        L_0x0046:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x02cf
            com.facebook.common.dextricks.verifier.Verifier.disableRuntimeVerification(r5)     // Catch:{ all -> 0x032f }
            r5.A00()     // Catch:{ all -> 0x032f }
            X.0KY r0 = r5.A00     // Catch:{ all -> 0x032f }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "Can't find current process's name"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x032f }
            r1.<init>(r0)     // Catch:{ all -> 0x032f }
            goto L_0x0064
        L_0x0060:
            r0 = 0
            goto L_0x0046
        L_0x0062:
            r0 = 0
            goto L_0x0034
        L_0x0064:
            r0 = -2084718944(0xffffffff83bdb6a0, float:-1.115035E-36)
            goto L_0x02bf
        L_0x0069:
            boolean r0 = X.AnonymousClass0JB.A00     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x012a
            X.0et r0 = X.C09120et.A03(r5)     // Catch:{ all -> 0x032f }
            X.0dK r0 = r0.A0H     // Catch:{ all -> 0x032f }
            X.0ZU r0 = r0.A00     // Catch:{ all -> 0x032f }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x032f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x032f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x0090
            r0 = 36314128876308284(0x8103820000073c, double:3.028539554412932E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x012a
        L_0x0090:
            X.0KY r0 = r5.A00     // Catch:{ all -> 0x032f }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x032f }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x032f }
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()     // Catch:{ all -> 0x02ca }
            if (r0 == 0) goto L_0x00ab
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x00ab
            boolean r0 = com.facebook.endtoend.EndToEnd.A04()     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            java.lang.String r0 = "classtracinglogger_enable_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ all -> 0x02ca }
            boolean r1 = X.AnonymousClass0SH.A03(r5, r0)     // Catch:{ all -> 0x02ca }
            r0 = 0
            if (r1 == 0) goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.sLoggerEnabled = r0     // Catch:{ all -> 0x02ca }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x032f }
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.initialize()     // Catch:{ all -> 0x032f }
            X.0KY r0 = r5.A00     // Catch:{ all -> 0x032f }
            boolean r1 = r0.A03()     // Catch:{ all -> 0x032f }
            java.lang.String r10 = r0.A01     // Catch:{ all -> 0x032f }
            java.lang.Class<X.0LT> r7 = X.AnonymousClass0LT.class
            monitor-enter(r7)     // Catch:{ all -> 0x032f }
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.sEnabled     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
            boolean r0 = X.AnonymousClass0LT.A02(r5)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x011b
            if (r10 != 0) goto L_0x00e0
            java.lang.String r0 = "Process name is unknown"
            X.AnonymousClass0LU.A01(r7, r0)     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x00e0:
            java.lang.String r2 = "DeadCodeDetection"
            r1 = 19
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ all -> 0x0117 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0117 }
            X.C13820oM.A00(r0)     // Catch:{ all -> 0x0117 }
            r0.start()     // Catch:{ all -> 0x0117 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x011b
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0117 }
            r6.<init>(r0)     // Catch:{ all -> 0x0117 }
            X.0LR r3 = new X.0LR     // Catch:{ all -> 0x0117 }
            r3.<init>(r5, r10)     // Catch:{ all -> 0x0117 }
            r0 = 60000(0xea60, double:2.9644E-319)
            r6.postDelayed(r3, r0)     // Catch:{ all -> 0x0117 }
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r6.postDelayed(r3, r0)     // Catch:{ all -> 0x0117 }
            X.0LS r2 = new X.0LS     // Catch:{ all -> 0x0117 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0117 }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r6.postDelayed(r2, r0)     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x0117:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x032f }
            goto L_0x02ce
        L_0x011b:
            monitor-exit(r7)     // Catch:{ all -> 0x032f }
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.sEnabled     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x012a
            boolean r0 = r5.A01     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x012a
            com.facebook.common.dextricks.DexLibLoader.loadAll(r5)     // Catch:{ all -> 0x032f }
            r0 = 1
            r5.A01 = r0     // Catch:{ all -> 0x032f }
        L_0x012a:
            r0 = 36310581233320078(0x8100480000008e, double:3.026296010701979E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            boolean r2 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x032f }
            r0 = 36310581233451151(0x8100480002008f, double:3.02629601078487E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x032f }
            if (r2 != 0) goto L_0x0149
            r3 = 0
            if (r0 == 0) goto L_0x014a
        L_0x0149:
            r3 = 1
        L_0x014a:
            r0 = 36592056210227265(0x82004800030041, double:3.204301919506842E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            long r6 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x032f }
            r1 = 3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
            r2 = 3
            goto L_0x0167
        L_0x015f:
            r1 = 4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 2
            if (r0 != 0) goto L_0x0167
            r2 = 4
        L_0x0167:
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.sEnabled     // Catch:{ all -> 0x032f }
            r1 = 1
            if (r0 != 0) goto L_0x0182
            if (r3 == 0) goto L_0x0182
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C08450dR.A00     // Catch:{ all -> 0x032f }
            boolean r0 = r0.getAndSet(r1)     // Catch:{ all -> 0x032f }
            if (r0 != 0) goto L_0x0182
            X.0gW r1 = X.AnonymousClass0gN.A00()     // Catch:{ all -> 0x032f }
            X.0eu r0 = new X.0eu     // Catch:{ all -> 0x032f }
            r0.<init>(r2)     // Catch:{ all -> 0x032f }
            r1.AKp(r0)     // Catch:{ all -> 0x032f }
        L_0x0182:
            X.0gM r3 = new X.0gM     // Catch:{ all -> 0x032f }
            r3.<init>()     // Catch:{ all -> 0x032f }
            r0 = 36881859128328451(0x8307db00000103, double:3.387574451856718E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = X.C07960cV.A03(r0)     // Catch:{ all -> 0x032f }
            X.C04220Ms.A0B(r0, r11)     // Catch:{ all -> 0x032f }
            r3.A04 = r0     // Catch:{ all -> 0x032f }
            r0 = 36592610263499289(0x8200c900290219, double:3.2046523050270636E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            long r1 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x032f }
            int r0 = (int) r1     // Catch:{ all -> 0x032f }
            r3.A02 = r0     // Catch:{ all -> 0x032f }
            r0 = 36594693319952160(0x8202ae00000720, double:3.205969638315654E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            long r1 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x032f }
            int r0 = (int) r1     // Catch:{ all -> 0x032f }
            r3.A01 = r0     // Catch:{ all -> 0x032f }
            r0 = 36594693320017697(0x8202ae00010721, double:3.2059696383571E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            long r1 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x032f }
            int r0 = (int) r1     // Catch:{ all -> 0x032f }
            r3.A00 = r0     // Catch:{ all -> 0x032f }
            r0 = 36311135287181743(0x8100c9002f01af, double:3.026646396595092E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x032f }
            r3.A06 = r0     // Catch:{ all -> 0x032f }
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x032f }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x032f }
            r0 = r0 ^ 1
            r3.A05 = r0     // Catch:{ all -> 0x032f }
            r0 = 36592610263958043(0x8200c90030021b, double:3.2046523053171815E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            long r1 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x032f }
            int r0 = (int) r1     // Catch:{ all -> 0x032f }
            r3.A03 = r0     // Catch:{ all -> 0x032f }
            r0 = 36311135287378353(0x8100c9003201b1, double:3.026646396719429E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x032f }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x032f }
            r3.A07 = r0     // Catch:{ all -> 0x032f }
            X.0mI r0 = new X.0mI     // Catch:{ all -> 0x032f }
            r0.<init>(r3)     // Catch:{ all -> 0x032f }
            X.AnonymousClass0gN.A00 = r0     // Catch:{ all -> 0x032f }
            java.util.concurrent.ExecutorService r2 = X.C04350Ng.A02     // Catch:{ all -> 0x032f }
            X.0OK r1 = X.C08470dV.A01     // Catch:{ all -> 0x032f }
            r1.getClass()     // Catch:{ all -> 0x032f }
            X.0da r0 = new X.0da     // Catch:{ all -> 0x032f }
            r0.<init>(r1)     // Catch:{ all -> 0x032f }
            r2.execute(r0)     // Catch:{ all -> 0x032f }
            X.0gW r1 = X.AnonymousClass0gN.A00()     // Catch:{ all -> 0x032f }
            X.0fB r0 = new X.0fB     // Catch:{ all -> 0x032f }
            r0.<init>()     // Catch:{ all -> 0x032f }
            r1.AKp(r0)     // Catch:{ all -> 0x032f }
            X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x032f }
            X.0KY r0 = r5.A00     // Catch:{ all -> 0x032f }
            boolean r0 = r0.A03()     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x023c
            java.lang.String r1 = "com.instagram.barcelona.process.main.BarcelonaApplicationForMainProcess"
        L_0x0232:
            boolean r0 = r5.A01     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x023f
            X.0sI r0 = X.C15990sI.A00     // Catch:{ all -> 0x032f }
            X.AnonymousClass0E9.A00(r5, r0)     // Catch:{ all -> 0x032f }
            goto L_0x023f
        L_0x023c:
            java.lang.String r1 = "com.instagram.barcelona.process.secondary.BarcelonaApplicationForSecondaryProcess"
            goto L_0x0232
        L_0x023f:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x02c3 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ Exception -> 0x02c3 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ Exception -> 0x02c3 }
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ Exception -> 0x02c3 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x02c3 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x02c3 }
            X.0ie r0 = (X.C10620ie) r0     // Catch:{ Exception -> 0x02c3 }
            r5.A06 = r0     // Catch:{ all -> 0x032f }
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x026b
            java.lang.String r1 = "Delegate.onCreate"
            r0 = 159541970(0x9826ad2, float:3.1396815E-33)
            X.C13930oX.A01(r1, r0)     // Catch:{ all -> 0x032f }
        L_0x026b:
            X.0k2 r0 = new X.0k2     // Catch:{ all -> 0x02af }
            r0.<init>()     // Catch:{ all -> 0x02af }
            X.AnonymousClass0g5.A00 = r0     // Catch:{ all -> 0x02af }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x02af }
            r1.<init>()     // Catch:{ all -> 0x02af }
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r1.nextInt(r0)     // Catch:{ all -> 0x02af }
            if (r0 != 0) goto L_0x029c
            X.0k2 r0 = new X.0k2     // Catch:{ all -> 0x02af }
            r0.<init>()     // Catch:{ all -> 0x02af }
        L_0x0284:
            X.AnonymousClass0g5.A00 = r0     // Catch:{ all -> 0x02af }
            X.0ie r10 = r5.A06     // Catch:{ all -> 0x02af }
            X.0KY r0 = r5.A00     // Catch:{ all -> 0x02af }
            java.lang.String r11 = r0.A01     // Catch:{ all -> 0x02af }
            long r12 = r5.A02     // Catch:{ all -> 0x02af }
            long r14 = r5.A04     // Catch:{ all -> 0x02af }
            long r2 = r5.A05     // Catch:{ all -> 0x02af }
            long r0 = r5.A03     // Catch:{ all -> 0x02af }
            r18 = r0
            r16 = r2
            r10.A03(r11, r12, r14, r16, r18)     // Catch:{ all -> 0x02af }
            goto L_0x02a2
        L_0x029c:
            X.0D3 r0 = new X.0D3     // Catch:{ all -> 0x02af }
            r0.<init>()     // Catch:{ all -> 0x02af }
            goto L_0x0284
        L_0x02a2:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x02df
            r0 = 965212601(0x3987f9b9, float:2.5935264E-4)
            X.C13930oX.A00(r0)     // Catch:{ all -> 0x032f }
            goto L_0x02df
        L_0x02af:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x02bc
            r0 = 186917910(0xb242416, float:3.16124E-32)
            X.C13930oX.A00(r0)     // Catch:{ all -> 0x032f }
        L_0x02bc:
            r0 = 1049566422(0x3e8f1cd6, float:0.27951688)
        L_0x02bf:
            X.C14030oh.A08(r0, r4)     // Catch:{ all -> 0x032f }
            goto L_0x02ce
        L_0x02c3:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x032f }
            r1.<init>(r0)     // Catch:{ all -> 0x032f }
            goto L_0x02ce
        L_0x02ca:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ all -> 0x032f }
        L_0x02ce:
            throw r1     // Catch:{ all -> 0x032f }
        L_0x02cf:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)
            if (r0 == 0) goto L_0x02db
            r0 = -1250860452(0xffffffffb571625c, float:-8.992263E-7)
            X.C13930oX.A00(r0)
        L_0x02db:
            r0 = -111627687(0xfffffffff958b259, float:-7.032209E34)
            goto L_0x032b
        L_0x02df:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)
            if (r0 == 0) goto L_0x02eb
            r0 = 616268700(0x24bb839c, float:8.132128E-17)
            X.C13930oX.A00(r0)
        L_0x02eb:
            r0 = 36321005118953932(0x8109c3000019cc, double:3.032888117950447E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 != 0) goto L_0x0318
            r0 = 36319003664388965(0x8107f100031365, double:3.031622390024351E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 != 0) goto L_0x0318
            r0 = 36321572054637487(0x810a4700001baf, double:3.0332466503595937E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0328
        L_0x0318:
            X.066 r0 = X.C123907Zw.A00()
            X.062 r1 = r0.getLifecycle()
            com.instagram.barcelona.app.BarcelonaAppShell$1 r0 = new com.instagram.barcelona.app.BarcelonaAppShell$1
            r0.<init>()
            r1.A07(r0)
        L_0x0328:
            r0 = -399085241(0xffffffffe8367147, float:-3.4462412E24)
        L_0x032b:
            X.C14030oh.A08(r0, r4)
            return
        L_0x032f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r8)
            if (r0 == 0) goto L_0x033c
            r0 = 86755245(0x52bc7ad, float:8.077056E-36)
            X.C13930oX.A00(r0)
        L_0x033c:
            r0 = -2139057402(0xffffffff80809306, float:-1.1807686E-38)
            X.C14030oh.A08(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.app.BarcelonaAppShell.onCreate():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:441|442|443|444|445|446|(1:448)|449|450|(7:452|453|454|(1:456)|457|458|(1:(2:461|(1:463))))|465|466|467|468|(2:470|(15:472|473|474|475|476|477|478|479|480|481|482|483|484|485|514)(4:489|490|491|492))(2:499|500)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(30:48|49|50|51|52|(1:54)|55|(1:57)|58|(1:60)|(1:62)|63|(1:65)|66|(1:68)|69|70|71|72|73|(2:77|(1:79))|80|81|82|83|84|(2:88|(1:90))|91|(20:93|94|95|(3:96|(1:100)|101)|643|103|(1:105)(2:106|(1:108)(2:109|(1:111)))|112|(3:113|(1:117)|118)|644|120|(1:122)(2:123|(1:125)(2:126|(1:128)))|130|131|132|(1:136)|137|(1:139)|140|(29:142|145|146|147|148|149|150|151|152|158|159|(1:161)|162|(3:165|(1:167)|168)|169|(1:173)(3:172|174|(1:176))|177|(11:179|180|181|182|(2:185|183)|645|186|(2:189|187)|646|190|199)|200|(1:202)(1:203)|204|(1:206)(1:207)|208|(1:210)|211|(4:(1:(0))|216|218|219)|217|218|219)(2:143|144))|231) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e6, code lost:
        if (r10 > 1) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04dd, code lost:
        if (r10 > 0) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0501, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        X.AnonymousClass0LU.A0E(r28.getSimpleName(), "Error setting CatchMeIfYouCan", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0bd6, code lost:
        if ((!java.util.Arrays.equals(r11, r7)) == false) goto L_0x0c9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0cf7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0cfc, code lost:
        X.C14850qG.A01.add("lib-compressed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0d0f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0d11, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:?, code lost:
        android.util.Log.e("FbSoLoader", "IOException during init", r2);
        r3 = new java.lang.RuntimeException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0d1f, code lost:
        android.util.Log.e("FbSoLoader", "RuntimeException during init", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0d26, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0328 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x034e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x034f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:223:0x0500 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:449:0x0b97 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:497:0x0c84 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:507:0x0c96 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:512:0x0c9b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x01be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0214 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0b49 A[Catch:{ IOException -> 0x0b4a }] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0b9c A[Catch:{ all -> 0x0c97, all -> 0x0c9b, IOException -> 0x0ca3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0bf3 A[Catch:{ all -> 0x0c7e, all -> 0x0c84, all -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0c85 A[Catch:{ all -> 0x0c7e, all -> 0x0c84, all -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0cb7 A[Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0cdd A[SYNTHETIC, Splitter:B:532:0x0cdd] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0d0f A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:405:0x0abf] */
    /* JADX WARNING: Removed duplicated region for block: B:623:0x0df1  */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x0dfa  */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x0e00  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ed A[Catch:{ all -> 0x0500, IOException -> 0x0501 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022b A[Catch:{ all -> 0x0500, IOException -> 0x0501 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0250 A[Catch:{ all -> 0x0500, IOException -> 0x0501 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attachBaseContext(android.content.Context r53) {
        /*
            r52 = this;
            r4 = r52
            r0 = r53
            super.attachBaseContext(r0)
            com.facebook.common.time.AwakeTimeSinceBootClock r16 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r0 = r16.now()
            r4.A02 = r0
            android.app.Application r0 = X.C02720Cp.A00
            if (r0 != 0) goto L_0x0e0f
            X.C02720Cp.A00 = r52
            java.lang.String r0 = "pre_init_qe"
            r8 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r8)
            X.C07960cV.A00 = r0
            int r5 = android.os.Process.myPid()
            java.lang.String r0 = "activity"
            java.lang.Object r3 = r4.getSystemService(r0)
            r3.getClass()
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r0 = r3.getRunningAppProcesses()
            if (r0 == 0) goto L_0x00a2
            java.util.Iterator r2 = r0.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r0 = r1.pid
            if (r0 != r5) goto L_0x0037
            java.lang.String r3 = r1.processName
        L_0x0049:
            X.0KY r0 = X.AnonymousClass0KY.A01(r3)
            r4.A00 = r0
            com.facebook.perf.background.BackgroundStartupDetector r0 = com.facebook.perf.background.BackgroundStartupDetector.A0D
            if (r0 != 0) goto L_0x006e
            android.os.Looper r0 = r4.getMainLooper()
            com.facebook.perf.background.BackgroundStartupDetector r1 = new com.facebook.perf.background.BackgroundStartupDetector
            r1.<init>(r0)
            com.facebook.perf.background.BackgroundStartupDetector.A0D = r1
            r4.registerActivityLifecycleCallbacks(r1)
            X.0KY r0 = X.AnonymousClass0KY.A00()
            r0.A03()
            r0 = 49181(0xc01d, float:6.8917E-41)
            r1.sendEmptyMessage(r0)
        L_0x006e:
            X.0KY r0 = r4.A00
            r32 = r0
            X.0n4 r18 = new X.0n4
            r0 = r18
            r0.<init>(r4)
            r0 = r32
            X.0KX r0 = r0.A00
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r0.A00
            r17 = r0
        L_0x0083:
            java.lang.String r1 = "pretosproc"
            r0 = r17
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0dd9
            java.util.concurrent.ExecutorService r3 = X.C04350Ng.A01
            X.0bI r1 = new X.0bI
            r1.<init>(r3)
            X.C10450iM.A00 = r1
            X.0fx r0 = new X.0fx
            r0.<init>()
            java.lang.Class<com.facebook.jni.NativeSoftErrorReporterProxy> r2 = com.facebook.jni.NativeSoftErrorReporterProxy.class
            monitor-enter(r2)
            goto L_0x00df
        L_0x009f:
            r17 = 0
            goto L_0x0083
        L_0x00a2:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.List r0 = r3.getRunningServices(r0)
            if (r0 == 0) goto L_0x00c1
            java.util.Iterator r2 = r0.iterator()
        L_0x00ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r2.next()
            android.app.ActivityManager$RunningServiceInfo r1 = (android.app.ActivityManager.RunningServiceInfo) r1
            int r0 = r1.pid
            if (r0 != r5) goto L_0x00ae
            java.lang.String r3 = r1.process
            goto L_0x0049
        L_0x00c1:
            r3 = 0
            java.lang.String r0 = "/proc/self/cmdline"
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0e0d }
            r2.<init>(r0)     // Catch:{ all -> 0x0e0d }
            r0 = 128(0x80, float:1.794E-43)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0e0d }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0e0d }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x00da, all -> 0x0e08 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x00da, all -> 0x0e08 }
        L_0x00da:
            r1.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0049
        L_0x00df:
            com.facebook.jni.NativeSoftErrorReporterProxy.sErrorReportingGkReader = r0     // Catch:{ all -> 0x0dd0 }
            com.facebook.jni.NativeSoftErrorReporterProxy.sErrorReportingExecutorService = r3     // Catch:{ all -> 0x0dd0 }
            java.lang.ref.WeakReference r0 = com.facebook.jni.NativeSoftErrorReporterProxy.sFbErrorReporterWeakReference     // Catch:{ all -> 0x0dd0 }
            if (r0 != 0) goto L_0x00f1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0dd0 }
            r0.<init>(r1)     // Catch:{ all -> 0x0dd0 }
            com.facebook.jni.NativeSoftErrorReporterProxy.sFbErrorReporterWeakReference = r0     // Catch:{ all -> 0x0dd0 }
            com.facebook.jni.NativeSoftErrorReporterProxy.flushSoftErrorCacheAsync()     // Catch:{ all -> 0x0dd0 }
        L_0x00f1:
            monitor-exit(r2)
            java.lang.String r27 = "3419628305025917"
            long r2 = X.C08470dV.A00
            X.0Jb r0 = X.AnonymousClass0Jc.A00(r4)
            long r0 = r0.A00
            r30 = r0
            r0 = 2342154135907860890(0x208100c70000019a, double:4.058062069592356E-152)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0510
            boolean r9 = r32.A03()
            java.lang.Class<X.0RU> r28 = X.AnonymousClass0RU.class
            monitor-enter(r28)
            r0 = 36592601671008787(0x8200c700020213, double:3.204646871101471E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x050c }
            long r0 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x050c }
            int r5 = (int) r0     // Catch:{ all -> 0x050c }
            r0 = 36592601670943250(0x8200c700010212, double:3.204646871060025E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x050c }
            long r0 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x050c }
            int r6 = (int) r0     // Catch:{ all -> 0x050c }
            X.C05210Rw.A00 = r6     // Catch:{ IOException -> 0x0501 }
            X.C05210Rw.A01 = r5     // Catch:{ IOException -> 0x0501 }
            r7 = 1
            r15 = 0
            if (r9 == 0) goto L_0x0139
            r15 = 2
        L_0x0139:
            java.lang.Class<X.0co> r0 = X.C08130co.class
            java.lang.String r29 = r0.getName()     // Catch:{ IOException -> 0x0501 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0501 }
            int r0 = r0.flags     // Catch:{ IOException -> 0x0501 }
            r1 = r0 & 2
            r0 = 0
            if (r1 == 0) goto L_0x014b
            r0 = 1
        L_0x014b:
            X.C07850cI.A0E = r0     // Catch:{ IOException -> 0x0501 }
            X.0cI r1 = new X.0cI     // Catch:{ IOException -> 0x0501 }
            r1.<init>()     // Catch:{ IOException -> 0x0501 }
            X.C07850cI.A0B = r1     // Catch:{ IOException -> 0x0501 }
            r0 = -100000(0xfffffffffffe7960, float:NaN)
            X.AnonymousClass0IR.A03(r1, r0)     // Catch:{ IOException -> 0x0501 }
            X.C07850cI.A07 = r15     // Catch:{ IOException -> 0x0501 }
            if (r6 <= 0) goto L_0x0160
            X.C07850cI.A00 = r6     // Catch:{ IOException -> 0x0501 }
        L_0x0160:
            if (r5 <= 0) goto L_0x0164
            X.C07850cI.A04 = r5     // Catch:{ IOException -> 0x0501 }
        L_0x0164:
            boolean r0 = X.C07850cI.A0E     // Catch:{ IOException -> 0x0501 }
            r11 = 3
            java.lang.String r9 = "CatchMeIfYouCan"
            if (r0 == 0) goto L_0x019a
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ IOException -> 0x0501 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x0501 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = "initializing CMIYC, flags = 0x%08x"
            java.lang.String.format(r5, r0, r1)     // Catch:{ IOException -> 0x0501 }
            int r0 = X.C07850cI.A00     // Catch:{ IOException -> 0x0501 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0501 }
            r0 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0501 }
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0501 }
            int r0 = X.C07850cI.A04     // Catch:{ IOException -> 0x0501 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0501 }
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r6, r1, r0}     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = "instacrash config l1 %d l2 %d l3 %d interval %d"
            java.lang.String.format(r5, r0, r1)     // Catch:{ IOException -> 0x0501 }
        L_0x019a:
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()     // Catch:{ IOException -> 0x0501 }
            if (r0 == 0) goto L_0x01a8
            X.C07850cI.A01 = r11     // Catch:{ IOException -> 0x0501 }
            r0 = 5
            X.C07850cI.A02 = r0     // Catch:{ IOException -> 0x0501 }
            r0 = 7
            X.C07850cI.A03 = r0     // Catch:{ IOException -> 0x0501 }
        L_0x01a8:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0501 }
            java.lang.String r1 = r0.dataDir     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = "crash_log"
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x0501 }
            r10.<init>(r1, r0)     // Catch:{ IOException -> 0x0501 }
            r10.createNewFile()     // Catch:{ IOException -> 0x01be }
            r10.setReadable(r7)     // Catch:{ IOException -> 0x01be }
            r10.setWritable(r7)     // Catch:{ IOException -> 0x01be }
        L_0x01be:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0501 }
            java.lang.String r5 = r0.sourceDir     // Catch:{ IOException -> 0x0501 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0501 }
            X.C07850cI.A08 = r0     // Catch:{ IOException -> 0x0501 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0501 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0501 }
            long r13 = r0.lastModified()     // Catch:{ IOException -> 0x0501 }
            long r5 = X.C07850cI.A08     // Catch:{ IOException -> 0x0501 }
            long r5 = r5 - r13
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x0501 }
            if (r0 == 0) goto L_0x01fe
            long r11 = r10.lastModified()     // Catch:{ IOException -> 0x0501 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fe
            X.C05470Tw.A01(r4, r8)     // Catch:{ IOException -> 0x0501 }
            boolean r0 = r10.delete()     // Catch:{ IOException -> 0x0501 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r1 = "unable to delete stale crash log file: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0501 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0501 }
            r0.append(r10)     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0501 }
            android.util.Log.e(r9, r0)     // Catch:{ IOException -> 0x0501 }
        L_0x01fe:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0501 }
            java.lang.String r11 = r0.dataDir     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = "insta_crash_log"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0501 }
            r1.<init>(r11, r0)     // Catch:{ IOException -> 0x0501 }
            r1.createNewFile()     // Catch:{ IOException -> 0x0214 }
            r1.setReadable(r7)     // Catch:{ IOException -> 0x0214 }
            r1.setWritable(r7)     // Catch:{ IOException -> 0x0214 }
        L_0x0214:
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0501 }
            if (r0 == 0) goto L_0x023c
            long r11 = r1.lastModified()     // Catch:{ IOException -> 0x0501 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x023c
            X.C05470Tw.A01(r4, r7)     // Catch:{ IOException -> 0x0501 }
            boolean r0 = r1.delete()     // Catch:{ IOException -> 0x0501 }
            if (r0 != 0) goto L_0x023c
            java.lang.String r11 = "could not delete insta crash log file: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0501 }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0501 }
            r0.append(r1)     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0501 }
            android.util.Log.e(r9, r0)     // Catch:{ IOException -> 0x0501 }
        L_0x023c:
            r11 = 40
            X.0IM r0 = new X.0IM     // Catch:{ IOException -> 0x0501 }
            r0.<init>(r4, r10)     // Catch:{ IOException -> 0x0501 }
            X.C07850cI.A09 = r0     // Catch:{ IOException -> 0x0501 }
            X.0IM r0 = new X.0IM     // Catch:{ IOException -> 0x0501 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0501 }
            X.C07850cI.A0A = r0     // Catch:{ IOException -> 0x0501 }
            r0 = r15 & 2
            if (r0 == 0) goto L_0x050f
            java.util.concurrent.ScheduledExecutorService r12 = java.util.concurrent.Executors.newScheduledThreadPool(r7)     // Catch:{ IOException -> 0x0501 }
            X.0To r10 = new X.0To     // Catch:{ IOException -> 0x0501 }
            r0 = r29
            r10.<init>(r4, r0)     // Catch:{ IOException -> 0x0501 }
            int r0 = X.C07850cI.A04     // Catch:{ IOException -> 0x0501 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0501 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0501 }
            r12.schedule(r10, r0, r13)     // Catch:{ IOException -> 0x0501 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0501 }
            java.lang.String r10 = r0.dataDir     // Catch:{ IOException -> 0x0501 }
            java.lang.String r0 = "crash_lock"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0501 }
            r1.<init>(r10, r0)     // Catch:{ IOException -> 0x0501 }
            r13 = 0
            X.0qs r26 = new X.0qs     // Catch:{ IOException -> 0x0501 }
            r0 = r26
            r0.<init>(r1)     // Catch:{ IOException -> 0x0501 }
            X.0IM r0 = X.C07850cI.A09     // Catch:{ all -> 0x04fc }
            r25 = 14400(0x3840, float:2.0179E-41)
            java.nio.MappedByteBuffer r14 = r0.A02     // Catch:{ all -> 0x04fc }
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04fc }
            r0 = 14400000(0xdbba00, float:2.0178698E-38)
            long r0 = (long) r0     // Catch:{ all -> 0x04fc }
            long r21 = r23 - r0
            r12 = 0
        L_0x0289:
            int r10 = r13 << 3
            long r19 = r14.getLong(r10)     // Catch:{ all -> 0x04fc }
            int r10 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r10 < 0) goto L_0x0299
            int r10 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r10 > 0) goto L_0x0299
            int r12 = r12 + 1
        L_0x0299:
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x0289
            X.C07850cI.A05 = r12     // Catch:{ all -> 0x04fc }
            int r10 = X.C07850cI.A03     // Catch:{ all -> 0x04fc }
            r23 = 1
            if (r12 < r10) goto L_0x02a7
            r10 = 3
            goto L_0x02b3
        L_0x02a7:
            int r10 = X.C07850cI.A02     // Catch:{ all -> 0x04fc }
            if (r12 < r10) goto L_0x02ad
            r10 = 2
            goto L_0x02b3
        L_0x02ad:
            int r13 = X.C07850cI.A01     // Catch:{ all -> 0x04fc }
            r10 = 0
            if (r12 < r13) goto L_0x02b3
            r10 = 1
        L_0x02b3:
            X.0IM r12 = X.C07850cI.A0A     // Catch:{ all -> 0x04fc }
            java.nio.MappedByteBuffer r12 = r12.A02     // Catch:{ all -> 0x04fc }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04fc }
            long r19 = r21 - r0
            r13 = 0
            r1 = 0
        L_0x02bf:
            int r0 = r13 << 3
            long r14 = r12.getLong(r0)     // Catch:{ all -> 0x04fc }
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x02cf
            int r0 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x02cf
            int r1 = r1 + 1
        L_0x02cf:
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x02bf
            X.C07850cI.A06 = r1     // Catch:{ all -> 0x04fc }
            r0 = 10
            if (r1 < r0) goto L_0x02db
            r12 = 3
            goto L_0x02e8
        L_0x02db:
            r0 = 5
            if (r1 < r0) goto L_0x02e0
            r12 = 2
            goto L_0x02e8
        L_0x02e0:
            int r0 = X.C07850cI.A00     // Catch:{ all -> 0x04fc }
            r12 = 0
            if (r1 < r0) goto L_0x02e6
            r12 = 1
        L_0x02e6:
            if (r10 <= r7) goto L_0x034f
        L_0x02e8:
            r0 = 275859109(0x107146a5, float:4.7583292E-29)
            java.io.File r11 = X.C14630pr.A00(r4, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            boolean r0 = r11.exists()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x02fe
            boolean r0 = r11.isDirectory()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 != 0) goto L_0x02fe
            r11.delete()     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x02fe:
            boolean r0 = r11.exists()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 != 0) goto L_0x0307
            r11.mkdir()     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0307:
            boolean r0 = r11.isDirectory()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x0320
            java.lang.String r1 = "disabled_"
            int r0 = X.AnonymousClass0FX.A01()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r11, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.createNewFile()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0328
        L_0x0320:
            java.lang.String r1 = "could not create ditto directory"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0328:
            java.io.File r11 = X.C14790qA.A00(r4)     // Catch:{ all -> 0x04fc }
            java.lang.String r1 = "lock"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x04fc }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x04fc }
            X.0qs r13 = new X.0qs     // Catch:{ IOException | RuntimeException -> 0x034f }
            r13.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x034f }
            java.io.File r11 = X.C14790qA.A00(r4)     // Catch:{ all -> 0x034a }
            java.lang.String r1 = X.C14790qA.A00     // Catch:{ all -> 0x034a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x034a }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x034a }
            r0.createNewFile()     // Catch:{ all -> 0x034a }
            r13.close()     // Catch:{ IOException | RuntimeException -> 0x034f }
            goto L_0x034f
        L_0x034a:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x034e }
        L_0x034e:
            throw r0     // Catch:{ IOException | RuntimeException -> 0x034f }
        L_0x034f:
            boolean r0 = X.C07850cI.A0E     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x0378
            java.util.Locale r19 = java.util.Locale.US     // Catch:{ all -> 0x04fc }
            java.lang.String r14 = "found %d crashes / level %d, %d insta crashes / level %d in last %d seconds"
            int r0 = X.C07850cI.A05     // Catch:{ all -> 0x04fc }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04fc }
            int r0 = X.C07850cI.A06     // Catch:{ all -> 0x04fc }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x04fc }
            java.lang.Object[] r1 = new java.lang.Object[]{r15, r13, r11, r1, r0}     // Catch:{ all -> 0x04fc }
            r0 = r19
            java.lang.String.format(r0, r14, r1)     // Catch:{ all -> 0x04fc }
        L_0x0378:
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            r19 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x03aa
            if (r10 <= r7) goto L_0x03aa
            boolean r0 = X.C07850cI.A0E     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x03a9
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ all -> 0x04fc }
            java.lang.String r11 = "capping remedy level at 1 (wanted %d) because APK is too new (current age %ss: minimum age for aggressive crash mitigation is %ss)"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04fc }
            double r0 = (double) r5     // Catch:{ all -> 0x04fc }
            double r0 = r0 / r19
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x04fc }
            r14 = 4590890196788041902(0x3fb61e4f765fd8ae, double:0.0864)
            java.lang.Double r0 = java.lang.Double.valueOf(r14)     // Catch:{ all -> 0x04fc }
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r1, r0}     // Catch:{ all -> 0x04fc }
            java.lang.String.format(r13, r11, r0)     // Catch:{ all -> 0x04fc }
        L_0x03a9:
            r10 = 1
        L_0x03aa:
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b4
            if (r12 <= r7) goto L_0x03b4
            goto L_0x03b7
        L_0x03b4:
            r23 = r12
            goto L_0x03da
        L_0x03b7:
            boolean r0 = X.C07850cI.A0E     // Catch:{ all -> 0x04fc }
            if (r0 == 0) goto L_0x03da
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ all -> 0x04fc }
            java.lang.String r11 = "capping insta crash remedy level at 1 (wanted %d) because APK is too new (current age %ss: minimum age for aggressive crash mitigation is %ss)"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04fc }
            double r0 = (double) r5     // Catch:{ all -> 0x04fc }
            double r0 = r0 / r19
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x04fc }
            r5 = 4570447457359481746(0x3f6d7dbf487fcb92, double:0.0036)
            java.lang.Double r0 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x04fc }
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r1, r0}     // Catch:{ all -> 0x04fc }
            java.lang.String.format(r13, r11, r0)     // Catch:{ all -> 0x04fc }
        L_0x03da:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x04fc }
            java.lang.String r6 = r0.dataDir     // Catch:{ all -> 0x04fc }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04fc }
            X.C07850cI.A02(r4, r0, r8)     // Catch:{ all -> 0x04fc }
            X.C07850cI.A02(r4, r0, r7)     // Catch:{ all -> 0x04fc }
            java.lang.String r5 = "app_was_disabled"
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x04fc }
            r15.<init>(r6, r5)     // Catch:{ all -> 0x04fc }
            boolean r5 = r15.exists()     // Catch:{ all -> 0x04fc }
            if (r5 == 0) goto L_0x04a8
            android.content.pm.PackageManager r14 = r4.getPackageManager()     // Catch:{ RuntimeException -> 0x049f }
            java.lang.Class<com.facebook.nobreak.CrashLoop$LastState> r5 = com.facebook.nobreak.CrashLoop$LastState.class
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ RuntimeException -> 0x049f }
            r13.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x049f }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0498 }
            r6.<init>()     // Catch:{ NameNotFoundException -> 0x0498 }
            r11 = 642(0x282, float:9.0E-43)
            java.lang.String r5 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.PackageInfo r5 = r14.getPackageInfo(r5, r11)     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.ActivityInfo[] r5 = r5.receivers     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.List r5 = X.C05440Tt.A00(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r6.addAll(r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r11 = 641(0x281, float:8.98E-43)
            java.lang.String r5 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.PackageInfo r5 = r14.getPackageInfo(r5, r11)     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.ActivityInfo[] r5 = r5.activities     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.List r5 = X.C05440Tt.A00(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r6.addAll(r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r11 = 648(0x288, float:9.08E-43)
            java.lang.String r5 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.PackageInfo r5 = r14.getPackageInfo(r5, r11)     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.ProviderInfo[] r5 = r5.providers     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.List r5 = X.C05440Tt.A00(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r6.addAll(r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r11 = 644(0x284, float:9.02E-43)
            java.lang.String r5 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.PackageInfo r5 = r14.getPackageInfo(r5, r11)     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.ServiceInfo[] r5 = r5.services     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.List r5 = X.C05440Tt.A00(r4, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            r6.addAll(r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            X.0Tr r5 = new X.0Tr     // Catch:{ NameNotFoundException -> 0x0498 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.Collections.sort(r6, r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0498 }
            r12.<init>()     // Catch:{ NameNotFoundException -> 0x0498 }
            java.util.Iterator r19 = r6.iterator()     // Catch:{ NameNotFoundException -> 0x0498 }
        L_0x0464:
            boolean r5 = r19.hasNext()     // Catch:{ NameNotFoundException -> 0x0498 }
            if (r5 == 0) goto L_0x047d
            java.lang.Object r5 = r19.next()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.pm.ComponentInfo r5 = (android.content.pm.ComponentInfo) r5     // Catch:{ NameNotFoundException -> 0x0498 }
            java.lang.String r11 = r5.packageName     // Catch:{ NameNotFoundException -> 0x0498 }
            java.lang.String r6 = r5.name     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0498 }
            r5.<init>(r11, r6)     // Catch:{ NameNotFoundException -> 0x0498 }
            r12.add(r5)     // Catch:{ NameNotFoundException -> 0x0498 }
            goto L_0x0464
        L_0x047d:
            java.util.Iterator r6 = r12.iterator()     // Catch:{ NameNotFoundException -> 0x0498 }
        L_0x0481:
            boolean r5 = r6.hasNext()     // Catch:{ NameNotFoundException -> 0x0498 }
            if (r5 == 0) goto L_0x0494
            java.lang.Object r5 = r6.next()     // Catch:{ NameNotFoundException -> 0x0498 }
            android.content.ComponentName r5 = (android.content.ComponentName) r5     // Catch:{ NameNotFoundException -> 0x0498 }
            r5.getClassName()     // Catch:{ NameNotFoundException -> 0x0498 }
            r14.setComponentEnabledSetting(r5, r8, r7)     // Catch:{ NameNotFoundException -> 0x0498 }
            goto L_0x0481
        L_0x0494:
            r14.setComponentEnabledSetting(r13, r8, r7)     // Catch:{ NameNotFoundException -> 0x0498 }
            goto L_0x04a5
        L_0x0498:
            r6 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x049f }
            r5.<init>(r6)     // Catch:{ RuntimeException -> 0x049f }
            throw r5     // Catch:{ RuntimeException -> 0x049f }
        L_0x049f:
            r6 = move-exception
            java.lang.String r5 = "unable to reset crash loop"
            android.util.Log.e(r9, r5, r6)     // Catch:{ all -> 0x04fc }
        L_0x04a5:
            r15.delete()     // Catch:{ all -> 0x04fc }
        L_0x04a8:
            X.0Tw r5 = X.C07850cI.A0D     // Catch:{ all -> 0x04fc }
            if (r5 != 0) goto L_0x04ae
            r13 = 0
            goto L_0x04b0
        L_0x04ae:
            int r13 = r5.A00     // Catch:{ all -> 0x04fc }
        L_0x04b0:
            X.0Tw r5 = X.C07850cI.A0C     // Catch:{ all -> 0x04fc }
            if (r5 != 0) goto L_0x04b6
            r12 = 0
            goto L_0x04b8
        L_0x04b6:
            int r12 = r5.A00     // Catch:{ all -> 0x04fc }
        L_0x04b8:
            boolean r5 = X.C07850cI.A0E     // Catch:{ all -> 0x04fc }
            if (r5 == 0) goto L_0x04d5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04fc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x04fc }
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r9, r6, r5}     // Catch:{ all -> 0x04fc }
            java.lang.String r5 = "handleRemedyLocked %d -> %d, insta crash %d -> %d"
            java.lang.String.format(r5, r6)     // Catch:{ all -> 0x04fc }
        L_0x04d5:
            r5 = r23
            if (r5 > r12) goto L_0x04ef
            if (r10 > r13) goto L_0x04df
            if (r23 > 0) goto L_0x04ef
            if (r10 <= 0) goto L_0x04f8
        L_0x04df:
            r19 = r4
            r20 = r29
            r21 = r10
            r22 = r13
            r23 = r0
            r25 = r8
            X.C07850cI.A03(r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x04fc }
            goto L_0x04f8
        L_0x04ef:
            r9 = r4
            r10 = r29
            r11 = r5
            r13 = r0
            r15 = r7
            X.C07850cI.A03(r9, r10, r11, r12, r13, r15)     // Catch:{ all -> 0x04fc }
        L_0x04f8:
            r26.close()     // Catch:{ IOException -> 0x0501 }
            goto L_0x050f
        L_0x04fc:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x0500 }
        L_0x0500:
            throw r0     // Catch:{ IOException -> 0x0501 }
        L_0x0501:
            r5 = move-exception
            java.lang.String r1 = r28.getSimpleName()     // Catch:{ all -> 0x050c }
            java.lang.String r0 = "Error setting CatchMeIfYouCan"
            X.AnonymousClass0LU.A0E(r1, r0, r5)     // Catch:{ all -> 0x050c }
            goto L_0x050f
        L_0x050c:
            r1 = move-exception
            monitor-exit(r28)
            throw r1
        L_0x050f:
            monitor-exit(r28)
        L_0x0510:
            X.0dY r6 = new X.0dY
            r6.<init>(r4)
            X.0dW r5 = X.C08480dW.A00
            X.0dX r1 = new X.0dX
            r1.<init>(r4)
            java.lang.Object r0 = X.AnonymousClass0NV.A0D
            monitor-enter(r0)
            X.AnonymousClass0NV.A07 = r52     // Catch:{ all -> 0x0dcd }
            X.AnonymousClass0NV.A03 = r27     // Catch:{ all -> 0x0dcd }
            X.AnonymousClass0NV.A09 = r6     // Catch:{ all -> 0x0dcd }
            X.AnonymousClass0NV.A0B = r5     // Catch:{ all -> 0x0dcd }
            X.AnonymousClass0NV.A0A = r1     // Catch:{ all -> 0x0dcd }
            X.AnonymousClass0NV.A0C = r8     // Catch:{ all -> 0x0dcd }
            monitor-exit(r0)     // Catch:{ all -> 0x0dcd }
            X.0nA r0 = X.C13180nA.A01
            if (r0 != 0) goto L_0x0537
            X.0nA r0 = new X.0nA
            r0.<init>()
            X.C13180nA.A01 = r0
        L_0x0537:
            X.0fU r1 = new X.0fU
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            r0.add(r1)
            X.0ge r1 = X.C09770ge.A00
            X.0Oa r0 = X.C10310i8.A00
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            r1 = -448521401(0xffffffffe5441b47, float:-5.788044E22)
            java.lang.String r0 = "BasicConfig.getConfig"
            X.C13930oX.A01(r0, r1)
            X.01P r10 = new X.01P     // Catch:{ IOException -> 0x0d7d }
            r10.<init>()     // Catch:{ IOException -> 0x0d7d }
            boolean r9 = com.facebook.endtoend.EndToEnd.A03()     // Catch:{ IOException -> 0x0d7d }
            r0 = r17
            java.lang.String r6 = ""
            if (r17 != 0) goto L_0x0566
            r0 = r6
        L_0x0566:
            X.0OH r7 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0d7d }
            r0 = r32
            java.lang.String r11 = r0.A01     // Catch:{ IOException -> 0x0d7d }
            if (r11 != 0) goto L_0x0572
            r11 = r6
        L_0x0572:
            X.0bR r13 = new X.0bR     // Catch:{ IOException -> 0x0d7d }
            r13.<init>()     // Catch:{ IOException -> 0x0d7d }
            X.0Xs r1 = X.C06110Xs.A00     // Catch:{ IOException -> 0x0d7d }
            r23 = 5
            java.lang.String r5 = "BasicAddOns.getAddOns"
            r0 = 1514426368(0x5a445000, float:1.38142641E16)
            X.C13810oL.A01(r5, r0)     // Catch:{ IOException -> 0x0d7d }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0d72 }
            r12.<init>()     // Catch:{ all -> 0x0d72 }
            X.0Zi r0 = new X.0Zi     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r10, r2)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            r5 = 1
            X.0Zl r0 = new X.0Zl     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r1, r13)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0aO r0 = new X.0aO     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r13, r10, r9)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            r0 = 36602926772260878(0x820a2b0000100e, double:3.211176506709139E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x0d72 }
            long r0 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x0d72 }
            int r9 = (int) r0     // Catch:{ all -> 0x0d72 }
            X.0aC r0 = new X.0aC     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r13, r9)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0a0 r0 = new X.0a0     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r13, r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0Z9 r0 = new X.0Z9     // Catch:{ all -> 0x0d72 }
            r0.<init>(r4, r13, r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZE r0 = new X.0ZE     // Catch:{ all -> 0x0d72 }
            r0.<init>(r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZN r0 = new X.0ZN     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZP r0 = new X.0ZP     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            r0 = 36311723694621375(0x810152000002bf, double:3.0270185078292417E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x0d72 }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ all -> 0x0d72 }
            if (r0 == 0) goto L_0x05f6
            X.0Zo r0 = new X.0Zo     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
        L_0x05f6:
            r0 = 30
            long r0 = (long) r0     // Catch:{ all -> 0x0d72 }
            X.0Zw r9 = new X.0Zw     // Catch:{ all -> 0x0d72 }
            r9.<init>(r0)     // Catch:{ all -> 0x0d72 }
            r12.add(r9)     // Catch:{ all -> 0x0d72 }
            X.0a5 r0 = new X.0a5     // Catch:{ all -> 0x0d72 }
            r0.<init>(r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0Za r0 = new X.0Za     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0aB r0 = new X.0aB     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZG r0 = new X.0ZG     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0aH r0 = new X.0aH     // Catch:{ all -> 0x0d72 }
            r0.<init>(r2)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0aN r0 = new X.0aN     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZT r0 = new X.0ZT     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZW r0 = new X.0ZW     // Catch:{ all -> 0x0d72 }
            r0.<init>(r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZA r0 = new X.0ZA     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0ZZ r0 = new X.0ZZ     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0Zr r0 = new X.0Zr     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0Zm r0 = new X.0Zm     // Catch:{ all -> 0x0d72 }
            r0.<init>(r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0a8 r0 = new X.0a8     // Catch:{ all -> 0x0d72 }
            r0.<init>()     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            X.0a9 r0 = new X.0a9     // Catch:{ all -> 0x0d72 }
            r0.<init>(r10)     // Catch:{ all -> 0x0d72 }
            r12.add(r0)     // Catch:{ all -> 0x0d72 }
            r0 = 1084005474(0x409c9c62, float:4.8940897)
            X.C13810oL.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0a7 r0 = new X.0a7     // Catch:{ IOException -> 0x0d7d }
            r0.<init>()     // Catch:{ IOException -> 0x0d7d }
            r12.add(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0Z8 r14 = new X.0Z8     // Catch:{ IOException -> 0x0d7d }
            r14.<init>(r4)     // Catch:{ IOException -> 0x0d7d }
            java.lang.String r1 = "MainAddOnConfig.getConfig"
            r0 = 420878036(0x191616d4, float:7.759428E-24)
            X.C13810oL.A01(r1, r0)     // Catch:{ IOException -> 0x0d7d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0d6d }
            r0.<init>(r12)     // Catch:{ all -> 0x0d6d }
            r14.A00 = r0     // Catch:{ all -> 0x0d6d }
            android.app.Application r1 = r14.A01     // Catch:{ all -> 0x0d6d }
            X.0OM r9 = new X.0OM     // Catch:{ all -> 0x0d6d }
            r9.<init>(r1)     // Catch:{ all -> 0x0d6d }
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x0d6d }
        L_0x069e:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0d6d }
            if (r0 == 0) goto L_0x06e3
            java.lang.Object r12 = r19.next()     // Catch:{ all -> 0x0d6d }
            X.0P4 r12 = (X.AnonymousClass0P4) r12     // Catch:{ all -> 0x0d6d }
            java.lang.String r0 = "MainAddOnConfig.processAddOns."
            java.lang.Class r1 = r12.getClass()     // Catch:{ all -> 0x0d6d }
            java.lang.String r15 = r1.getSimpleName()     // Catch:{ all -> 0x0d6d }
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r15)     // Catch:{ all -> 0x0d6d }
            r0 = -362544981(0xffffffffea6400ab, float:-6.890956E25)
            X.C13810oL.A01(r1, r0)     // Catch:{ all -> 0x0d6d }
            r12.A7o(r9, r14)     // Catch:{ all -> 0x06c5 }
            r0 = -1257669992(0xffffffffb5097a98, float:-5.1214874E-7)
            goto L_0x06d7
        L_0x06c5:
            r13 = move-exception
            java.lang.String r12 = "Lacrima"
            java.lang.String r1 = "Add on error: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x06db }
            X.AnonymousClass0LU.A0L(r12, r1, r13, r0)     // Catch:{ all -> 0x06db }
            X.C04790Pd.A00()     // Catch:{ all -> 0x06db }
            r0 = 2024604289(0x78ad0281, float:2.8072442E34)
        L_0x06d7:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d6d }
            goto L_0x069e
        L_0x06db:
            r1 = move-exception
            r0 = 988371275(0x3ae9594b, float:0.0017803101)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d6d }
            throw r1     // Catch:{ all -> 0x0d6d }
        L_0x06e3:
            r0 = -760183266(0xffffffffd2b0861e, float:-3.79082179E11)
            X.C13810oL.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0C4 r0 = new X.0C4     // Catch:{ IOException -> 0x0d7d }
            r0.<init>()     // Catch:{ IOException -> 0x0d7d }
            r9.A07 = r0     // Catch:{ IOException -> 0x0d7d }
            X.0hM r1 = X.AnonymousClass0hM.A00     // Catch:{ IOException -> 0x0d7d }
            X.0OD r0 = new X.0OD     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A0D = r0     // Catch:{ IOException -> 0x0d7d }
            r0 = r30
            r9.A02 = r0     // Catch:{ IOException -> 0x0d7d }
            X.0gA r1 = new X.0gA     // Catch:{ IOException -> 0x0d7d }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0d7d }
            X.0OD r0 = new X.0OD     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A0F = r0     // Catch:{ IOException -> 0x0d7d }
            X.0g8 r0 = new X.0g8     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0d7d }
            r9.A0A = r0     // Catch:{ IOException -> 0x0d7d }
            X.0fz r1 = new X.0fz     // Catch:{ IOException -> 0x0d7d }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0d7d }
            X.0OD r0 = new X.0OD     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A08 = r0     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r11)     // Catch:{ IOException -> 0x0d7d }
            r9.A09 = r0     // Catch:{ IOException -> 0x0d7d }
            r9.A0E = r7     // Catch:{ IOException -> 0x0d7d }
            r0 = 36313171098797399(0x8102a300030557, double:3.027933852058388E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ IOException -> 0x0d7d }
            if (r0 == 0) goto L_0x08b3
            X.0h3 r1 = X.AnonymousClass0h3.A00     // Catch:{ IOException -> 0x0d7d }
            X.0OD r0 = new X.0OD     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
        L_0x073b:
            r9.A0C = r0     // Catch:{ IOException -> 0x0d7d }
            X.0fK r0 = new X.0fK     // Catch:{ IOException -> 0x0d7d }
            r0.<init>()     // Catch:{ IOException -> 0x0d7d }
            r9.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0hP r0 = new X.0hP     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0d7d }
            r9.A04 = r0     // Catch:{ IOException -> 0x0d7d }
            r0 = 36311126694363547(0x8100c70003019b, double:3.026640962462264E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            boolean r0 = X.C07960cV.A05(r0)     // Catch:{ IOException -> 0x0d7d }
            if (r0 == 0) goto L_0x0774
            java.lang.Integer r0 = X.AnonymousClass006.A0Q     // Catch:{ IOException -> 0x0d7d }
            X.0OC r1 = new X.0OC     // Catch:{ IOException -> 0x0d7d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0fD r0 = new X.0fD     // Catch:{ IOException -> 0x0d7d }
            r0.<init>()     // Catch:{ IOException -> 0x0d7d }
            r1.A00 = r0     // Catch:{ IOException -> 0x0d7d }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ IOException -> 0x0d7d }
            r1.A02 = r0     // Catch:{ IOException -> 0x0d7d }
            X.0YB r0 = r1.A00()     // Catch:{ IOException -> 0x0d7d }
            r9.A00(r0)     // Catch:{ IOException -> 0x0d7d }
        L_0x0774:
            X.C08470dV.A02 = r10     // Catch:{ IOException -> 0x0d7d }
            X.0Oe r0 = r9.A0D     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x0785
            java.lang.String r1 = X.AnonymousClass0M0.A00()     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A0D = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x0785:
            X.0Oe r0 = r9.A08     // Catch:{ IOException -> 0x0d7d }
            java.lang.String r1 = "0"
            java.lang.String r10 = "lacrima"
            if (r0 != 0) goto L_0x0799
            java.lang.String r0 = "LacrimaConfigBuilder.setDeviceId not called, using 0"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A08 = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x0799:
            X.0Oe r0 = r9.A0F     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07a9
            java.lang.String r0 = "LacrimaConfigBuilder.setUserId not called, using 0"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A0F = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07a9:
            X.0Oe r0 = r9.A06     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07b9
            java.lang.String r0 = "LacrimaConfigBuilder.setUserIdActorId not called, using 0"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A06 = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07b9:
            X.0Oe r0 = r9.A05     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07c9
            java.lang.String r0 = "LacrimaConfigBuilder.setUserIdActingAccountId not called, using 0"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A05 = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07c9:
            X.0Oe r0 = r9.A0A     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07dd
            java.lang.String r0 = "LacrimaConfigBuilder.setIsEmployee not called, using false"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r9.A0A = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07dd:
            X.0Oe r0 = r9.A0E     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07ed
            java.lang.String r0 = "LacrimaConfigBuilder.setShortProcessName not called, using \"\""
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0d7d }
            r9.A0E = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07ed:
            X.0Oe r0 = r9.A09     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x07fd
            java.lang.String r0 = "LacrimaConfigBuilder.setFullProcessName not called, using \"\""
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OH r0 = new X.0OH     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0d7d }
            r9.A09 = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x07fd:
            int r11 = r9.A00     // Catch:{ IOException -> 0x0d7d }
            if (r11 > 0) goto L_0x080b
            android.app.Application r0 = r9.A0J     // Catch:{ IOException -> 0x0d7d }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ IOException -> 0x0d7d }
            int r11 = r0.targetSdkVersion     // Catch:{ IOException -> 0x0d7d }
            r9.A00 = r11     // Catch:{ IOException -> 0x0d7d }
        L_0x080b:
            android.app.Application r0 = r9.A0J     // Catch:{ IOException -> 0x0d7d }
            r25 = r0
            long r0 = r9.A01     // Catch:{ IOException -> 0x0d7d }
            r45 = r0
            X.0Oe r0 = r9.A0D     // Catch:{ IOException -> 0x0d7d }
            r31 = r0
            X.0Oe r0 = r9.A08     // Catch:{ IOException -> 0x0d7d }
            r32 = r0
            X.0Oe r0 = r9.A0F     // Catch:{ IOException -> 0x0d7d }
            r33 = r0
            X.0Oe r0 = r9.A06     // Catch:{ IOException -> 0x0d7d }
            r34 = r0
            X.0Oe r0 = r9.A05     // Catch:{ IOException -> 0x0d7d }
            r35 = r0
            X.0Oe r0 = r9.A0A     // Catch:{ IOException -> 0x0d7d }
            r36 = r0
            java.util.List r0 = r9.A0K     // Catch:{ IOException -> 0x0d7d }
            r27 = r0
            java.util.List r0 = r9.A0L     // Catch:{ IOException -> 0x0d7d }
            r28 = r0
            java.util.List r0 = r9.A0M     // Catch:{ IOException -> 0x0d7d }
            r29 = r0
            java.util.List r0 = r9.A0N     // Catch:{ IOException -> 0x0d7d }
            r30 = r0
            X.0Oe r0 = r9.A0E     // Catch:{ IOException -> 0x0d7d }
            r37 = r0
            X.0Oe r0 = r9.A09     // Catch:{ IOException -> 0x0d7d }
            r38 = r0
            r15 = 0
            X.0Oe r0 = r9.A0C     // Catch:{ IOException -> 0x0d7d }
            r39 = r0
            r14 = 8
            r13 = 15000(0x3a98, float:2.102E-41)
            r12 = 6
            r7 = 60000(0xea60, float:8.4078E-41)
            long r0 = r9.A02     // Catch:{ IOException -> 0x0d7d }
            r47 = r0
            X.0Oe r0 = r9.A07     // Catch:{ IOException -> 0x0d7d }
            r40 = r0
            X.0Oe r0 = r9.A0B     // Catch:{ IOException -> 0x0d7d }
            r22 = r0
            long r0 = r9.A03     // Catch:{ IOException -> 0x0d7d }
            r49 = r0
            boolean r0 = r9.A0H     // Catch:{ IOException -> 0x0d7d }
            r21 = r0
            X.0hP r0 = r9.A04     // Catch:{ IOException -> 0x0d7d }
            r20 = r0
            boolean r0 = r9.A0G     // Catch:{ IOException -> 0x0d7d }
            r19 = r0
            boolean r0 = r9.A0I     // Catch:{ IOException -> 0x0d7d }
            X.0OK r1 = new X.0OK     // Catch:{ IOException -> 0x0d7d }
            r24 = r1
            r26 = r20
            r41 = r22
            r42 = r11
            r43 = r45
            r45 = r47
            r47 = r49
            r49 = r21
            r50 = r19
            r51 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r50, r51)     // Catch:{ IOException -> 0x0d7d }
            X.C08470dV.A01 = r1     // Catch:{ IOException -> 0x0d7d }
            java.lang.String r11 = "fb.report_source"
            X.0IR r0 = X.AnonymousClass0IR.A01()     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x0899
            java.lang.String r0 = "ExceptionHandlerManager not initialized, initializing."
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ IOException -> 0x0d7d }
            X.AnonymousClass0IR.A00()     // Catch:{ IOException -> 0x0d7d }
        L_0x0899:
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0d7d }
            java.lang.String r9 = "earlyJavaInit"
            r0 = -1182143312(0xffffffffb989ecb0, float:-2.6307022E-4)
            X.C13810oL.A01(r9, r0)     // Catch:{ IOException -> 0x0d7d }
            X.0Oe r0 = r1.A0F     // Catch:{ IOException -> 0x0d7d }
            if (r0 != 0) goto L_0x08af
            X.0NI r0 = new X.0NI     // Catch:{ IOException -> 0x0d7d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d7d }
            r1.A0F = r0     // Catch:{ IOException -> 0x0d7d }
        L_0x08af:
            r0.get()     // Catch:{ IOException -> 0x0d7d }
            goto L_0x08b6
        L_0x08b3:
            r0 = 0
            goto L_0x073b
        L_0x08b6:
            java.lang.String r9 = "KeepReportsForTesting.jest"
            r0 = -1311002601(0xffffffffb1dbb017, float:-6.393758E-9)
            X.C13810oL.A01(r9, r0)     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = X.C02640Cf.A01(r11)     // Catch:{ all -> 0x0d53 }
            if (r9 == 0) goto L_0x08ca
            boolean r0 = r9.equals(r6)     // Catch:{ all -> 0x0d53 }
            if (r0 == 0) goto L_0x08d0
        L_0x08ca:
            java.lang.String r9 = java.lang.System.getProperty(r11)     // Catch:{ all -> 0x0d53 }
            if (r9 == 0) goto L_0x08da
        L_0x08d0:
            java.lang.String r0 = "jest_e2e"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0d53 }
            if (r0 == 0) goto L_0x08da
            X.C04910Pt.A0I = r5     // Catch:{ all -> 0x0d53 }
        L_0x08da:
            r0 = 79613735(0x4becf27, float:4.4859025E-36)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = "FixedLengthFiles.init"
            r0 = -1318890884(0xffffffffb163527c, float:-3.3079735E-9)
            X.C13810oL.A01(r9, r0)     // Catch:{ all -> 0x0d5b }
            java.lang.String r22 = "collector"
            X.0Nh r9 = X.C04360Nh.A00(r22)     // Catch:{ all -> 0x0d4e }
            android.app.Application r0 = r1.A0L     // Catch:{ all -> 0x0d4e }
            r9.A03(r0, r14, r13)     // Catch:{ all -> 0x0d4e }
            java.lang.String r21 = "reports"
            X.0Nh r9 = X.C04360Nh.A00(r21)     // Catch:{ all -> 0x0d4e }
            r9.A03(r0, r12, r7)     // Catch:{ all -> 0x0d4e }
            r7 = 149659373(0x8eb9eed, float:1.4180911E-33)
            X.C13810oL.A00(r7)     // Catch:{ all -> 0x0d5b }
            long r13 = X.AnonymousClass0N9.A00()     // Catch:{ all -> 0x0d5b }
            r19 = 10240(0x2800, double:5.059E-320)
            int r7 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x0922
            X.0Nh r7 = X.C04360Nh.A00(r21)     // Catch:{ all -> 0x0d5b }
            r7.A01()     // Catch:{ all -> 0x0d5b }
            long r13 = X.AnonymousClass0N9.A00()     // Catch:{ all -> 0x0d5b }
            int r7 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x0922
            X.0Nh r7 = X.C04360Nh.A00(r22)     // Catch:{ all -> 0x0d5b }
            r7.A01()     // Catch:{ all -> 0x0d5b }
        L_0x0922:
            X.0Oe r7 = r1.A0V     // Catch:{ all -> 0x0d5b }
            java.lang.Object r13 = r7.get()     // Catch:{ all -> 0x0d5b }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "errorreporting"
            java.io.File r27 = r0.getDir(r7, r8)     // Catch:{ all -> 0x0d5b }
            X.0Oe r14 = r1.A0W     // Catch:{ all -> 0x0d5b }
            java.lang.Object r11 = r14.get()     // Catch:{ all -> 0x0d5b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d5b }
            X.0Oe r0 = r1.A06     // Catch:{ all -> 0x0d5b }
            if (r0 != 0) goto L_0x0943
            X.0M7 r0 = new X.0M7     // Catch:{ all -> 0x0d5b }
            r0.<init>(r1)     // Catch:{ all -> 0x0d5b }
            r1.A06 = r0     // Catch:{ all -> 0x0d5b }
        L_0x0943:
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x0d5b }
            X.0Nn r9 = (X.C04420Nn) r9     // Catch:{ all -> 0x0d5b }
            X.0Oe r0 = r1.A04     // Catch:{ all -> 0x0d5b }
            if (r0 != 0) goto L_0x0954
            X.0Lz r0 = new X.0Lz     // Catch:{ all -> 0x0d5b }
            r0.<init>(r1)     // Catch:{ all -> 0x0d5b }
            r1.A04 = r0     // Catch:{ all -> 0x0d5b }
        L_0x0954:
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0d5b }
            X.0Nd r7 = (X.C04320Nd) r7     // Catch:{ all -> 0x0d5b }
            X.0Q4 r0 = new X.0Q4     // Catch:{ all -> 0x0d5b }
            r24 = r0
            r25 = r7
            r26 = r9
            r28 = r13
            r29 = r11
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0d5b }
            r1.A01 = r0     // Catch:{ all -> 0x0d5b }
            X.0Oe r7 = r1.A09     // Catch:{ all -> 0x0d5b }
            if (r7 != 0) goto L_0x0976
            X.0MG r7 = new X.0MG     // Catch:{ all -> 0x0d5b }
            r7.<init>(r1)     // Catch:{ all -> 0x0d5b }
            r1.A09 = r7     // Catch:{ all -> 0x0d5b }
        L_0x0976:
            java.lang.Object r11 = r7.get()     // Catch:{ all -> 0x0d5b }
            X.0Y5 r11 = (X.AnonymousClass0Y5) r11     // Catch:{ all -> 0x0d5b }
            X.0Mq r9 = new X.0Mq     // Catch:{ all -> 0x0d5b }
            r9.<init>()     // Catch:{ all -> 0x0d5b }
            X.0Mg r7 = new X.0Mg     // Catch:{ all -> 0x0d5b }
            r7.<init>(r9, r11, r0)     // Catch:{ all -> 0x0d5b }
            r1.A00 = r7     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "FixedLengthFiles.maybeAddPoolFiles"
            r0 = -1744852176(0xffffffff97ffab30, float:-1.6522203E-24)
            X.C13810oL.A01(r7, r0)     // Catch:{ all -> 0x0d5b }
            X.0Nh r0 = X.C04360Nh.A00(r22)     // Catch:{ all -> 0x0d49 }
            r0.A02()     // Catch:{ all -> 0x0d49 }
            X.0Nh r0 = X.C04360Nh.A00(r21)     // Catch:{ all -> 0x0d49 }
            r0.A02()     // Catch:{ all -> 0x0d49 }
            r0 = 1182884218(0x4681617a, float:16560.738)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "InternalSettings"
            r0 = 719979804(0x2aea051c, float:4.1570295E-13)
            X.C13810oL.A01(r7, r0)     // Catch:{ all -> 0x0d5b }
            X.0Oe r0 = r1.A0F     // Catch:{ all -> 0x0d44 }
            if (r0 != 0) goto L_0x09b7
            X.0NI r0 = new X.0NI     // Catch:{ all -> 0x0d44 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d44 }
            r1.A0F = r0     // Catch:{ all -> 0x0d44 }
        L_0x09b7:
            X.C04570Of.A01 = r0     // Catch:{ all -> 0x0d44 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0d44 }
            X.0Y1 r0 = (X.AnonymousClass0Y1) r0     // Catch:{ all -> 0x0d44 }
            java.lang.String r9 = "endpoint_override"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception -> 0x09d9 }
            java.lang.String r7 = r0.getString(r9, r15)     // Catch:{ Exception -> 0x09d9 }
            if (r7 == 0) goto L_0x09e1
            X.C04570Of.A00 = r7     // Catch:{ all -> 0x0d44 }
            X.0Oe r0 = X.C04570Of.A01     // Catch:{ all -> 0x0d44 }
            if (r0 == 0) goto L_0x09e1
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0d44 }
            X.0Y1 r0 = (X.AnonymousClass0Y1) r0     // Catch:{ all -> 0x0d44 }
            r0.A01(r9, r7)     // Catch:{ all -> 0x0d44 }
            goto L_0x09e1
        L_0x09d9:
            java.lang.String r0 = "Failed to read from SharedPreferences"
            X.AnonymousClass0LU.A0B(r10, r0)     // Catch:{ all -> 0x0d44 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0d44 }
        L_0x09e1:
            r0 = 1187172631(0x46c2d117, float:24936.545)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d5b }
            X.0Q4 r0 = r1.A01     // Catch:{ all -> 0x0d5b }
            X.C04370Ni.A00(r0)     // Catch:{ all -> 0x0d5b }
            java.util.List r0 = r1.A0M     // Catch:{ all -> 0x0d5b }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0d5b }
        L_0x09f2:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0d5b }
            if (r0 == 0) goto L_0x0a05
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0d5b }
            X.0OE r0 = (X.AnonymousClass0OE) r0     // Catch:{ all -> 0x0d5b }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0d5b }
            r0.BPo(r1)     // Catch:{ all -> 0x0d5b }
            goto L_0x09f2
        L_0x0a05:
            java.lang.String r7 = "sendPendingReports"
            r0 = 1393750242(0x5312f0e2, float:6.3110657E11)
            X.C13810oL.A01(r7, r0)     // Catch:{ all -> 0x0d5b }
            X.0Q4 r0 = r1.A03()     // Catch:{ all -> 0x0d3f }
            java.io.File[] r0 = r0.A04(r6)     // Catch:{ all -> 0x0d3f }
            int r6 = r0.length     // Catch:{ all -> 0x0d3f }
            boolean r0 = r1.A0Z     // Catch:{ all -> 0x0d3f }
            if (r0 == 0) goto L_0x0a66
            if (r6 <= r12) goto L_0x0a66
            java.lang.String r0 = "Send pending reports blocking"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ all -> 0x0d3f }
            X.AnonymousClass0OK.A01(r1, r5)     // Catch:{ all -> 0x0d3f }
            double r11 = java.lang.Math.random()     // Catch:{ all -> 0x0d3f }
            r6 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a89
            X.0Oe r0 = r1.A0X     // Catch:{ all -> 0x0d3f }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x0d3f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d3f }
            X.0Oe r0 = r1.A0R     // Catch:{ all -> 0x0d3f }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x0d3f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d3f }
            X.0Oe r0 = r1.A0Q     // Catch:{ all -> 0x0d3f }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x0d3f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d3f }
            java.lang.Object r7 = r14.get()     // Catch:{ all -> 0x0d3f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0d3f }
            java.lang.String r6 = "Send reports blocking"
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0d3f }
            r0.<init>()     // Catch:{ all -> 0x0d3f }
            X.AnonymousClass0NV.A03(r12, r11, r9, r7, r0)     // Catch:{ all -> 0x0d3f }
            X.AnonymousClass0NV.A04(r10, r6, r0)     // Catch:{ all -> 0x0d3f }
            X.0NV r7 = X.AnonymousClass0NV.A00()     // Catch:{ all -> 0x0d3f }
            java.lang.String r6 = "android_large_soft_error"
            r7.A05(r6, r0)     // Catch:{ all -> 0x0d3f }
            goto L_0x0a89
        L_0x0a66:
            java.lang.String r0 = "Sending pending reports"
            X.AnonymousClass0LU.A0C(r10, r0)     // Catch:{ all -> 0x0d3f }
            X.0Oe r0 = r1.A0E     // Catch:{ all -> 0x0d3f }
            if (r0 != 0) goto L_0x0a76
            X.0Ly r0 = new X.0Ly     // Catch:{ all -> 0x0d3f }
            r0.<init>(r1)     // Catch:{ all -> 0x0d3f }
            r1.A0E = r0     // Catch:{ all -> 0x0d3f }
        L_0x0a76:
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0d3f }
            X.0Pt r6 = (X.C04910Pt) r6     // Catch:{ all -> 0x0d3f }
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x0d3f }
            r6.A03(r0, r8)     // Catch:{ all -> 0x0d3f }
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT     // Catch:{ all -> 0x0d3f }
            r6.A03(r0, r8)     // Catch:{ all -> 0x0d3f }
            r6.A04(r8)     // Catch:{ all -> 0x0d3f }
        L_0x0a89:
            r0 = -1228835463(0xffffffffb6c17579, float:-5.765524E-6)
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d5b }
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0d7d }
            r0 = 640078869(0x2626d415, float:5.7880244E-16)
            X.C13810oL.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OK r0 = X.C08470dV.A01     // Catch:{ IOException -> 0x0d7d }
            X.0Q4 r0 = r0.A03()     // Catch:{ IOException -> 0x0d7d }
            X.C04370Ni.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            X.0OK r0 = X.C08470dV.A01     // Catch:{ IOException -> 0x0d7d }
            X.0Q4 r0 = r0.A03()     // Catch:{ IOException -> 0x0d7d }
            r0.A01 = r2     // Catch:{ IOException -> 0x0d7d }
            java.lang.Class<X.0qG> r20 = X.C14850qG.class
            monitor-enter(r20)     // Catch:{ IOException -> 0x0d7d }
            X.0qZ[] r19 = new X.C15010qZ[]{r15}     // Catch:{ all -> 0x0d7a }
            boolean r0 = X.C14850qG.A02     // Catch:{ all -> 0x0d3d }
            if (r0 != 0) goto L_0x0d2e
            r2 = 2
            boolean r0 = X.C14840qF.A00     // Catch:{ all -> 0x0d3d }
            if (r0 != 0) goto L_0x0abb
            X.C14840qF.A00 = r5     // Catch:{ all -> 0x0d3d }
        L_0x0abb:
            android.os.StrictMode$ThreadPolicy r15 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0d3d }
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r0 == 0) goto L_0x0ac6
            r2 = 0
        L_0x0ac6:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r1 = r0.dataDir     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r0 = "/app_libs"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            X.C14990qW.A02(r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r7 = "lib-xzs"
            java.lang.String r6 = "lib-zstd"
            java.lang.String r3 = "lib-superpack-xz"
            java.lang.String r1 = "lib-superpack-zstd"
            java.lang.String r0 = "lib-superpack-br"
            java.lang.String[] r7 = new java.lang.String[]{r7, r6, r3, r1, r0}     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r6 = 0
        L_0x0ae9:
            r3 = r7[r6]     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r1 = r0.dataDir     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r1, r0, r3)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            X.C14990qW.A02(r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            int r6 = r6 + 1
            r0 = r23
            if (r6 < r0) goto L_0x0ae9
            java.lang.String r7 = ".spo"
            java.lang.String r6 = ".zstd"
            boolean r0 = r7.isEmpty()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r0 == 0) goto L_0x0b1e
            boolean r0 = r6.isEmpty()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r0 == 0) goto L_0x0b1e
            java.lang.String r1 = "FbSoLoader"
            java.lang.String r0 = "Native libs file not compressed. Skipping initializing compressed asset sosource directories."
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r3 = 0
            goto L_0x0b3e
        L_0x0b1e:
            android.content.res.AssetManager r0 = r4.getAssets()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            X.0q9 r3 = X.C14850qG.A00(r0, r7)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r3 != 0) goto L_0x0b3e
            X.0q9 r3 = X.C14850qG.A00(r0, r6)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r3 != 0) goto L_0x0b3e
            java.lang.String r2 = "FbSoLoader unable to determine primary compression type "
            java.lang.String r1 = " or fallback compression type "
            java.lang.String r0 = "of native libs file"
            java.lang.String r0 = X.AnonymousClass00U.A0h(r2, r7, r1, r6, r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
        L_0x0b3d:
            throw r1     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
        L_0x0b3e:
            java.lang.String[] r0 = X.C15020qa.A0A     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            X.C15020qa.A06(r4, r0, r2)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            boolean r14 = X.C15140qn.A02(r4)     // Catch:{ IOException -> 0x0b4a }
            if (r14 != 0) goto L_0x0cac
            goto L_0x0b4b
        L_0x0b4a:
            r14 = 0
        L_0x0b4b:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ IOException -> 0x0ca3 }
            java.lang.String r0 = r0.dataDir     // Catch:{ IOException -> 0x0ca3 }
            java.lang.String r10 = "native_deps"
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0ca3 }
            r2.<init>(r0, r10)     // Catch:{ IOException -> 0x0ca3 }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0ca3 }
            if (r0 == 0) goto L_0x0b67
            boolean r0 = r2.isDirectory()     // Catch:{ IOException -> 0x0ca3 }
            if (r0 != 0) goto L_0x0b67
            r2.delete()     // Catch:{ IOException -> 0x0ca3 }
        L_0x0b67:
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0ca3 }
            if (r0 != 0) goto L_0x0b70
            r2.mkdir()     // Catch:{ IOException -> 0x0ca3 }
        L_0x0b70:
            boolean r0 = r2.isDirectory()     // Catch:{ IOException -> 0x0ca3 }
            if (r0 == 0) goto L_0x0c9f
            java.lang.String r1 = "lock"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0ca3 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0ca3 }
            X.0qs r13 = X.C14990qW.A00(r2, r0)     // Catch:{ IOException -> 0x0ca3 }
            java.lang.String r1 = "state"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0c97 }
            java.lang.String r6 = "rw"
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0c97 }
            r7.<init>(r0, r6)     // Catch:{ all -> 0x0c97 }
            r1 = 0
            byte r0 = r7.readByte()     // Catch:{ EOFException -> 0x0b97 }
            if (r0 != r5) goto L_0x0b97
            r1 = 1
        L_0x0b97:
            r7.close()     // Catch:{ all -> 0x0c97 }
            if (r1 != r5) goto L_0x0bd8
            java.lang.String r1 = "apk_id"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0c97 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0c97 }
            r9.<init>(r0, r6)     // Catch:{ all -> 0x0c97 }
            long r0 = r9.length()     // Catch:{ all -> 0x0c71 }
            int r7 = (int) r0     // Catch:{ all -> 0x0c71 }
            byte[] r11 = new byte[r7]     // Catch:{ all -> 0x0c71 }
            int r0 = r9.read(r11)     // Catch:{ all -> 0x0c71 }
            if (r0 == r7) goto L_0x0bb6
            r11 = 0
        L_0x0bb6:
            r9.close()     // Catch:{ all -> 0x0c97 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = r0.sourceDir     // Catch:{ all -> 0x0c97 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r1)     // Catch:{ all -> 0x0c97 }
            byte[] r7 = X.C14990qW.A04(r4, r0)     // Catch:{ all -> 0x0c97 }
            if (r11 == 0) goto L_0x0bd8
            if (r7 == 0) goto L_0x0bd8
            int r1 = r11.length     // Catch:{ all -> 0x0c97 }
            int r0 = r7.length     // Catch:{ all -> 0x0c97 }
            if (r1 != r0) goto L_0x0bd8
            boolean r0 = java.util.Arrays.equals(r11, r7)     // Catch:{ all -> 0x0c97 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0c9c
        L_0x0bd8:
            X.C15120ql.A00(r2, r8)     // Catch:{ all -> 0x0c97 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = r0.sourceDir     // Catch:{ all -> 0x0c97 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r1)     // Catch:{ all -> 0x0c97 }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0c97 }
            r7.<init>(r0)     // Catch:{ all -> 0x0c97 }
            java.lang.String r0 = "assets/native_deps.txt"
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)     // Catch:{ all -> 0x0c8d }
            if (r0 == 0) goto L_0x0c85
            java.io.InputStream r9 = r7.getInputStream(r0)     // Catch:{ all -> 0x0c8d }
            if (r9 == 0) goto L_0x0c76
            long r0 = r0.getSize()     // Catch:{ all -> 0x0c7e }
            int r11 = (int) r0     // Catch:{ all -> 0x0c7e }
            byte[] r11 = X.C15120ql.A01(r9, r11)     // Catch:{ all -> 0x0c7e }
            r9.close()     // Catch:{ all -> 0x0c8d }
            r7.close()     // Catch:{ all -> 0x0c97 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = r0.sourceDir     // Catch:{ all -> 0x0c97 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r1)     // Catch:{ all -> 0x0c97 }
            byte[] r12 = X.C14990qW.A04(r4, r0)     // Catch:{ all -> 0x0c97 }
            int r9 = r11.length     // Catch:{ all -> 0x0c97 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0c97 }
            java.lang.String r0 = r0.dataDir     // Catch:{ all -> 0x0c97 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r7.<init>(r0, r10)     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = "deps"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0c97 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0c97 }
            r7.<init>(r0, r6)     // Catch:{ all -> 0x0c97 }
            r7.write(r12)     // Catch:{ all -> 0x0c92 }
            r7.writeInt(r9)     // Catch:{ all -> 0x0c92 }
            r7.write(r11)     // Catch:{ all -> 0x0c92 }
            long r0 = r7.getFilePointer()     // Catch:{ all -> 0x0c92 }
            r7.setLength(r0)     // Catch:{ all -> 0x0c92 }
            r7.close()     // Catch:{ all -> 0x0c97 }
            java.lang.String r0 = "apk_id"
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r7.<init>(r2, r0)     // Catch:{ all -> 0x0c97 }
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch:{ all -> 0x0c97 }
            java.lang.String r1 = r0.sourceDir     // Catch:{ all -> 0x0c97 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0c97 }
            r0.<init>(r1)     // Catch:{ all -> 0x0c97 }
            byte[] r0 = X.C14990qW.A04(r4, r0)     // Catch:{ all -> 0x0c97 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0c97 }
            r9.<init>(r7, r6)     // Catch:{ all -> 0x0c97 }
            r9.write(r0)     // Catch:{ all -> 0x0c71 }
            long r0 = r9.getFilePointer()     // Catch:{ all -> 0x0c71 }
            r9.setLength(r0)     // Catch:{ all -> 0x0c71 }
            r9.close()     // Catch:{ all -> 0x0c97 }
            X.C14990qW.A03(r2)     // Catch:{ all -> 0x0c97 }
            X.C15120ql.A00(r2, r5)     // Catch:{ all -> 0x0c97 }
            goto L_0x0c9c
        L_0x0c71:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0c96 }
            goto L_0x0c96
        L_0x0c76:
            java.lang.String r1 = "Failed to read native_deps file from APK"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0c7e }
            r0.<init>(r1)     // Catch:{ all -> 0x0c7e }
            throw r0     // Catch:{ all -> 0x0c7e }
        L_0x0c7e:
            r0 = move-exception
            if (r9 == 0) goto L_0x0c84
            r9.close()     // Catch:{ all -> 0x0c84 }
        L_0x0c84:
            throw r0     // Catch:{ all -> 0x0c8d }
        L_0x0c85:
            java.lang.String r1 = "Could not find native_deps file in APK"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0c8d }
            r0.<init>(r1)     // Catch:{ all -> 0x0c8d }
            throw r0     // Catch:{ all -> 0x0c8d }
        L_0x0c8d:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0c96 }
            goto L_0x0c96
        L_0x0c92:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0c96 }
        L_0x0c96:
            throw r0     // Catch:{ all -> 0x0c97 }
        L_0x0c97:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0c9b }
        L_0x0c9b:
            throw r0     // Catch:{ IOException -> 0x0ca3 }
        L_0x0c9c:
            r13.close()     // Catch:{ IOException -> 0x0ca3 }
        L_0x0c9f:
            boolean r14 = X.C15140qn.A02(r4)     // Catch:{ IOException -> 0x0ca3 }
        L_0x0ca3:
            if (r14 != 0) goto L_0x0cac
            java.lang.String r1 = "NativeDeps"
            java.lang.String r0 = "Failed to extract native deps from APK, falling back to using MinElf to get library dependencies."
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
        L_0x0cac:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r0.<init>()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            X.C14850qG.A01 = r0     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r0 = r19[r8]     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            if (r0 == 0) goto L_0x0cc3
            X.C15020qa.A07(r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.util.ArrayList r1 = X.C14850qG.A01     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            r1.add(r0)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
        L_0x0cc3:
            java.lang.String r1 = "lib-assets"
            X.01b r0 = new X.01b     // Catch:{ IOException -> 0x0cd3, RuntimeException -> 0x0d0f }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0cd3, RuntimeException -> 0x0d0f }
            X.C15020qa.A07(r0)     // Catch:{ IOException -> 0x0cd3, RuntimeException -> 0x0d0f }
            java.util.ArrayList r0 = X.C14850qG.A01     // Catch:{ IOException -> 0x0cd3, RuntimeException -> 0x0d0f }
            r0.add(r1)     // Catch:{ IOException -> 0x0cd3, RuntimeException -> 0x0d0f }
            goto L_0x0cdb
        L_0x0cd3:
            r2 = move-exception
            java.lang.String r1 = "FbSoLoader"
            java.lang.String r0 = "prepend SoSource lib-assets failed"
            android.util.Log.w(r1, r0, r2)     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
        L_0x0cdb:
            if (r3 == 0) goto L_0x0d07
            X.03e r1 = new X.03e     // Catch:{ all -> 0x0d04 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x0d04 }
            int r0 = r3.ordinal()     // Catch:{ all -> 0x0d04 }
            switch(r0) {
                case 0: goto L_0x0cf9;
                case 1: goto L_0x0cf9;
                case 2: goto L_0x0cf1;
                case 3: goto L_0x0cf1;
                case 4: goto L_0x0cf9;
                case 5: goto L_0x0cf9;
                default: goto L_0x0ce9;
            }     // Catch:{ all -> 0x0d04 }
        L_0x0ce9:
            java.lang.String r1 = "Unknown CompressionAlgorithm during FbSoLoader.init()"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0d04 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d04 }
        L_0x0cf0:
            throw r0     // Catch:{ all -> 0x0d04 }
        L_0x0cf1:
            X.C15020qa.A07(r1)     // Catch:{ all -> 0x0cf5 }
            goto L_0x0cfc
        L_0x0cf5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0cf7 }
        L_0x0cf7:
            r0 = move-exception
            goto L_0x0cf0
        L_0x0cf9:
            X.C15020qa.A07(r1)     // Catch:{ all -> 0x0d04 }
        L_0x0cfc:
            java.util.ArrayList r1 = X.C14850qG.A01     // Catch:{ all -> 0x0d04 }
            java.lang.String r0 = "lib-compressed"
            r1.add(r0)     // Catch:{ all -> 0x0d04 }
            goto L_0x0d07
        L_0x0d04:
            r1 = move-exception
            goto L_0x0b3d
        L_0x0d07:
            X.C14850qG.A00 = r52     // Catch:{ IOException -> 0x0d11, RuntimeException -> 0x0d0f }
            android.os.StrictMode.setThreadPolicy(r15)     // Catch:{ all -> 0x0d3d }
            X.C14850qG.A02 = r5     // Catch:{ all -> 0x0d3d }
            goto L_0x0d2e
        L_0x0d0f:
            r3 = move-exception
            goto L_0x0d1f
        L_0x0d11:
            r2 = move-exception
            java.lang.String r1 = "FbSoLoader"
            java.lang.String r0 = "IOException during init"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0d27 }
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0d27 }
            r3.<init>(r2)     // Catch:{ all -> 0x0d27 }
            goto L_0x0d26
        L_0x0d1f:
            java.lang.String r1 = "FbSoLoader"
            java.lang.String r0 = "RuntimeException during init"
            android.util.Log.e(r1, r0, r3)     // Catch:{ all -> 0x0d27 }
        L_0x0d26:
            throw r3     // Catch:{ all -> 0x0d27 }
        L_0x0d27:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r15)     // Catch:{ all -> 0x0d3d }
            X.C14850qG.A02 = r5     // Catch:{ all -> 0x0d3d }
            throw r0     // Catch:{ all -> 0x0d3d }
        L_0x0d2e:
            monitor-exit(r20)     // Catch:{ IOException -> 0x0d7d }
            java.util.concurrent.ExecutorService r2 = X.C04350Ng.A02     // Catch:{ IOException -> 0x0d7d }
            X.0dZ r1 = new X.0dZ     // Catch:{ IOException -> 0x0d7d }
            r0 = r18
            r1.<init>(r0)     // Catch:{ IOException -> 0x0d7d }
            r2.execute(r1)     // Catch:{ IOException -> 0x0d7d }
            goto L_0x0dd3
        L_0x0d3d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0d7a }
        L_0x0d3f:
            r2 = move-exception
            r0 = 622597964(0x251c174c, float:1.3538736E-16)
            goto L_0x0d57
        L_0x0d44:
            r2 = move-exception
            r0 = -332078214(0xffffffffec34e37a, float:-8.747235E26)
            goto L_0x0d57
        L_0x0d49:
            r2 = move-exception
            r0 = -1910398042(0xffffffff8e21a3a6, float:-1.9923576E-30)
            goto L_0x0d57
        L_0x0d4e:
            r2 = move-exception
            r0 = -1127841538(0xffffffffbcc680fe, float:-0.02423143)
            goto L_0x0d57
        L_0x0d53:
            r2 = move-exception
            r0 = -2026074209(0xffffffff873c8f9f, float:-1.4185754E-34)
        L_0x0d57:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x0d5b }
            throw r2     // Catch:{ all -> 0x0d5b }
        L_0x0d5b:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0d65 }
            java.lang.String r0 = "earlyJavaInit exception"
            X.AnonymousClass0OK.A00(r1, r0, r2)     // Catch:{ all -> 0x0d65 }
            throw r2     // Catch:{ all -> 0x0d65 }
        L_0x0d65:
            r1 = move-exception
            X.C04790Pd.A00()     // Catch:{ IOException -> 0x0d7d }
            r0 = -2030818111(0xffffffff86f42cc1, float:-9.184836E-35)
            goto L_0x0d76
        L_0x0d6d:
            r1 = move-exception
            r0 = -1817665404(0xffffffff93a8a084, float:-4.2567443E-27)
            goto L_0x0d76
        L_0x0d72:
            r1 = move-exception
            r0 = 1937327074(0x737943e2, float:1.9748821E31)
        L_0x0d76:
            X.C13810oL.A00(r0)     // Catch:{ IOException -> 0x0d7d }
            goto L_0x0d7c
        L_0x0d7a:
            r1 = move-exception
            monitor-exit(r20)     // Catch:{ IOException -> 0x0d7d }
        L_0x0d7c:
            throw r1     // Catch:{ IOException -> 0x0d7d }
        L_0x0d7d:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not initialize error reporting"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x0dc5 }
            X.0OK r0 = X.C08470dV.A01     // Catch:{ all -> 0x0dc5 }
            if (r0 != 0) goto L_0x0d8d
            r5 = 0
            r3 = 0
            r2 = 0
            goto L_0x0d93
        L_0x0d8d:
            X.0Oe r5 = r0.A0X     // Catch:{ all -> 0x0dc5 }
            X.0Oe r3 = r0.A0R     // Catch:{ all -> 0x0dc5 }
            X.0Oe r2 = r0.A0Q     // Catch:{ all -> 0x0dc5 }
        L_0x0d93:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0dc5 }
            r9.<init>()     // Catch:{ all -> 0x0dc5 }
            X.0IR r0 = X.AnonymousClass0IR.A01()     // Catch:{ all -> 0x0dc5 }
            if (r0 == 0) goto L_0x0db0
            X.0Xm r1 = new X.0Xm     // Catch:{ all -> 0x0dc5 }
            r6 = r1
            r7 = r17
            r8 = r9
            r9 = r5
            r10 = r3
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0dc5 }
            r0 = 100
            X.AnonymousClass0IR.A03(r1, r0)     // Catch:{ all -> 0x0dc5 }
            goto L_0x0dc1
        L_0x0db0:
            java.lang.Thread$UncaughtExceptionHandler r8 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x0dc5 }
            X.0NX r6 = new X.0NX     // Catch:{ all -> 0x0dc5 }
            r7 = r17
            r10 = r5
            r11 = r3
            r12 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0dc5 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch:{ all -> 0x0dc5 }
        L_0x0dc1:
            r0 = -285203073(0xffffffffef00257f, float:-3.965941E28)
            goto L_0x0dd6
        L_0x0dc5:
            r1 = move-exception
            r0 = 638388595(0x260d0973, float:4.893201E-16)
            X.C13930oX.A00(r0)
            throw r1
        L_0x0dcd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0dcd }
            throw r1
        L_0x0dd0:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0dd3:
            r0 = 532308146(0x1fba60b2, float:7.893403E-20)
        L_0x0dd6:
            X.C13930oX.A00(r0)
        L_0x0dd9:
            long r0 = r16.now()
            r4.A04 = r0
            r4.A00()
            r0 = 36311195416134103(0x8100d7002601d7, double:3.026684422386684E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0df4
            X.AnonymousClass740.A00()
        L_0x0df4:
            X.0e3 r1 = X.C08670e3.A00
            X.0Oe r0 = X.C10340iB.A00
            if (r0 != 0) goto L_0x0e00
            X.C10340iB.A00 = r1
            com.facebook.common.dextricks.verifier.Verifier.disableRuntimeVerification(r4)
            return
        L_0x0e00:
            java.lang.String r1 = "Release Channel provider already set"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0e08:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0e0e }
            throw r0
        L_0x0e0d:
            r0 = move-exception
        L_0x0e0e:
            throw r0
        L_0x0e0f:
            java.lang.String r1 = "ApplicationHolder#set previously called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.app.BarcelonaAppShell.attachBaseContext(android.content.Context):void");
    }
}
