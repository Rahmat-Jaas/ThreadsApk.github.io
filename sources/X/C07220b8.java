package X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ProcessTopState;
import com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$SplashTransition;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.0b8  reason: invalid class name and case insensitive filesystem */
public final class C07220b8 implements AnonymousClass0PC, AnonymousClass0N6 {
    public static final Object A0R = new ApplicationLifecycleDetector$SplashTransition();
    public static final Object A0S = new ApplicationLifecycleDetector$ProcessTopState();
    public C06040Xk A00;
    public C04410Nm A01;
    public Integer A02 = AnonymousClass006.A01;
    public boolean A03;
    public boolean A04;
    public WeakReference A05;
    public boolean A06;
    public final Application A07;
    public final C019409a A08;
    public final AnonymousClass0ME A09;
    public final C04100Mg A0A;
    public final AnonymousClass0N5 A0B = new C07170b2(this);
    public final AnonymousClass0NA A0C = new C07160az(this);
    public final C06150Xw A0D;
    public final AnonymousClass0Y6 A0E;
    public final C06560Zx A0F;
    public final C07180b3 A0G = new C07180b3(this);
    public final C07190b4 A0H = new C07190b4(this);
    public final C07200b5 A0I = new C07200b5(this);
    public final AnonymousClass0Q4 A0J;
    public final AnonymousClass0QI A0K;
    public final Object A0L = new Object();
    public final Object A0M = new Object();
    public final boolean A0N;
    public final C019809f A0O;
    public final C06820aQ A0P;
    public final boolean A0Q;

    public final synchronized AnonymousClass09Z A04() {
        Integer num;
        AnonymousClass09Z r3;
        Object obj;
        AnonymousClass09Z r1;
        C019409a r2 = this.A08;
        synchronized (r2) {
            if (r2.A04) {
                num = AnonymousClass006.A0u;
            } else {
                num = AnonymousClass006.A1L;
            }
            r3 = new AnonymousClass09Z(num);
            WeakReference weakReference = r2.A03;
            if (weakReference == null || (obj = weakReference.get()) == null || (r1 = (AnonymousClass09Z) r2.A08.get(obj)) == null) {
                for (Map.Entry entry : r2.A08.entrySet()) {
                    if (((AnonymousClass09Z) entry.getValue()).A00.compareTo(r3.A00) < 0) {
                        r3.A01 = entry.getKey();
                        r3.A00 = ((AnonymousClass09Z) entry.getValue()).A00;
                        r3.A02 = C019409a.A01(r3.A01);
                        r3.A04 = ((AnonymousClass09Z) entry.getValue()).A04;
                        r3.A03 = ((AnonymousClass09Z) entry.getValue()).A03;
                    }
                }
            } else {
                r3.A01 = obj;
                r3.A00 = r1.A00;
                r3.A02 = C019409a.A01(obj);
                r3.A04 = r1.A04;
                r3.A03 = r1.A03;
            }
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r4.A09 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r4.A09 = true;
        r4.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.A03 = r1.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C04790Pd.A00();
        X.C06150Xw.A01(r4, r1, "Exception on start");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = r12.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r12 = this;
            r3 = 1
            java.lang.Object r2 = r12.A0M
            monitor-enter(r2)
            boolean r0 = r12.A04     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            return
        L_0x000a:
            r12.A04 = r3     // Catch:{ all -> 0x0119 }
            X.0Q4 r0 = r12.A0J     // Catch:{ all -> 0x0119 }
            X.0Xk r1 = r0.A03     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r1, r0)     // Catch:{ all -> 0x0119 }
            r12.A00 = r1     // Catch:{ all -> 0x0119 }
            X.0NQ r0 = X.AnonymousClass0NQ.A0B     // Catch:{ all -> 0x0119 }
            r1.A0A(r0)     // Catch:{ all -> 0x0119 }
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            X.0Xw r4 = r12.A0D
            if (r4 == 0) goto L_0x0078
            monitor-enter(r4)
            X.0Nu r1 = r4.A04     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0077
            boolean r0 = r4.A09     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0077
            r4.A09 = r3     // Catch:{ all -> 0x0074 }
            r4.A08 = r3     // Catch:{ all -> 0x0074 }
            long r0 = r1.A0B()     // Catch:{ Exception -> 0x0035 }
            r4.A03 = r0     // Catch:{ Exception -> 0x0035 }
            goto L_0x003e
        L_0x0035:
            r1 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "Exception on start"
            X.C06150Xw.A01(r4, r1, r0)     // Catch:{ all -> 0x0074 }
        L_0x003e:
            short r2 = r4.A0H     // Catch:{ all -> 0x0074 }
            if (r2 <= 0) goto L_0x005f
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ all -> 0x0074 }
            r4.A06 = r1     // Catch:{ all -> 0x0074 }
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0051
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = (java.util.concurrent.ScheduledThreadPoolExecutor) r1     // Catch:{ all -> 0x0074 }
            r1.setRemoveOnCancelPolicy(r3)     // Catch:{ all -> 0x0074 }
        L_0x0051:
            java.util.concurrent.ScheduledExecutorService r5 = r4.A06     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r6 = r4.A0G     // Catch:{ all -> 0x0074 }
            long r7 = (long) r2     // Catch:{ all -> 0x0074 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0074 }
            r9 = r7
            java.util.concurrent.ScheduledFuture r0 = r5.scheduleWithFixedDelay(r6, r7, r9, r11)     // Catch:{ all -> 0x0074 }
            r4.A07 = r0     // Catch:{ all -> 0x0074 }
        L_0x005f:
            X.0QI r2 = r4.A0F     // Catch:{ all -> 0x0074 }
            X.0Xt r0 = r4.A0C     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = r2.A03     // Catch:{ all -> 0x0074 }
            monitor-enter(r1)     // Catch:{ all -> 0x0074 }
            r2.A01 = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            X.0Xu r1 = r4.A0D     // Catch:{ all -> 0x0074 }
            java.util.List r0 = X.AnonymousClass0Vr.A04     // Catch:{ all -> 0x0074 }
            r0.add(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x0077
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0077:
            monitor-exit(r4)
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0091
            com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacksApi29 r2 = new com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacksApi29
            r2.<init>(r12)
        L_0x0083:
            X.0b6 r1 = new X.0b6
            r1.<init>(r12)
            android.app.Application r0 = r12.A07
            r0.registerActivityLifecycleCallbacks(r2)
            java.lang.Object r0 = X.C019609d.A02
            monitor-enter(r0)
            goto L_0x0097
        L_0x0091:
            com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks r2 = new com.facebook.errorreporting.lacrima.detector.lifecycle.ApplicationLifecycleDetector$ActivityCallbacks
            r2.<init>(r12)
            goto L_0x0083
        L_0x0097:
            X.C019609d.A00 = r1     // Catch:{ all -> 0x0116 }
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            X.0ME r2 = r12.A09
            if (r2 == 0) goto L_0x00f6
            X.0Xk r0 = r12.A00
            if (r0 == 0) goto L_0x00f6
            int r1 = com.facebook.perf.background.BackgroundStartupDetector.A0C
            if (r1 == 0) goto L_0x00d8
            if (r1 == r3) goto L_0x00d5
            r0 = 2
            if (r1 == r0) goto L_0x00d2
            r0 = 3
            if (r1 == r0) goto L_0x00cf
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
        L_0x00b0:
            r12.A02 = r0
            X.0Xk r1 = r12.A00
            char r0 = X.AnonymousClass0M2.A00(r0)
            r1.A04(r0)
            java.lang.Integer r1 = r12.A02
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x00c9
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            if (r1 == r0) goto L_0x00c9
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x00f6
        L_0x00c9:
            X.0b3 r1 = r12.A0G
            monitor-enter(r2)
            if (r1 == 0) goto L_0x00db
            goto L_0x00e6
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            goto L_0x00b0
        L_0x00d2:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x00b0
        L_0x00d5:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            goto L_0x00b0
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x00b0
        L_0x00db:
            X.0b3 r0 = r2.A00     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00e4
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.perf.background.BackgroundStartupDetector.A0A     // Catch:{ all -> 0x00f2 }
            r0.remove(r2)     // Catch:{ all -> 0x00f2 }
        L_0x00e4:
            r1 = 0
            goto L_0x00ef
        L_0x00e6:
            X.0b3 r0 = r2.A00     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00ef
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.perf.background.BackgroundStartupDetector.A0A     // Catch:{ all -> 0x00f2 }
            r0.add(r2)     // Catch:{ all -> 0x00f2 }
        L_0x00ef:
            r2.A00 = r1     // Catch:{ all -> 0x00f2 }
            goto L_0x00f5
        L_0x00f2:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x00f5:
            monitor-exit(r2)
        L_0x00f6:
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x0108
            X.09a r2 = r12.A08
            X.0b5 r1 = r12.A0I
            java.lang.Object r0 = r2.A06
            monitor-enter(r0)
            r2.A02 = r1     // Catch:{ all -> 0x0105 }
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            goto L_0x0108
        L_0x0105:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            throw r1
        L_0x0108:
            X.09a r2 = r12.A08
            X.0b4 r1 = r12.A0H
            java.lang.Object r0 = r2.A06
            monitor-enter(r0)
            r2.A01 = r1     // Catch:{ all -> 0x0113 }
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            return
        L_0x0113:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            throw r1
        L_0x0116:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            throw r1
        L_0x0119:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07220b8.start():void");
    }

    public static void A00() {
        synchronized (A0R) {
        }
    }

    public static void A01(C04050Mb r1, C04100Mg r2, AnonymousClass0ND r3) {
        AnonymousClass0PC r0 = (AnonymousClass0PC) r2.A03(C07220b8.class);
        if (r0 == null) {
            AnonymousClass0LU.A0C("lacrima", "Cannot find registered detector");
        } else {
            r2.A05(r1, r3, r0);
        }
    }

    public static void A02(C07220b8 r7) {
        C06040Xk r4;
        if (r7.A06) {
            C019609d.A00(A0S);
            r7.A06 = false;
        }
        if (!r7.A03 && (r4 = r7.A00) != null) {
            r7.A03 = true;
            long uptimeMillis = SystemClock.uptimeMillis() - r7.A0J.A01;
            synchronized (r4.A01) {
                r4.A0D(Long.toString(uptimeMillis), 167, 10);
                r4.A00.A00.put(178, (byte) 48);
                r4.A06(System.currentTimeMillis());
            }
            AnonymousClass0Y6 r1 = r7.A0E;
            if (r1 != null) {
                r1.A01(2);
            }
        }
    }

    public static void A03(C07220b8 r14, Integer num, boolean z) {
        char c;
        char c2;
        int i;
        C019809f r0;
        if (r14.A00 == null) {
            AnonymousClass0LU.A0C("lacrima", "ApplicationLifecycleDetector.start() wasn't called?");
            return;
        }
        C04100Mg r4 = r14.A0A;
        AnonymousClass0ND r3 = AnonymousClass0ND.CRITICAL_REPORT;
        if (!r4.A09) {
            AnonymousClass0ND r2 = AnonymousClass0ND.LARGE_REPORT;
            if (r4.A0A) {
                return;
            }
            if (r14.A0F == null || !AppStateLoggerNative.sAppStateLoggerNativeInited || !AppStateLoggerNative.isShuttingDownNative()) {
                AnonymousClass09Z A042 = r14.A04();
                String str = A042.A02;
                if (str == null || (r0 = r14.A0O) == null) {
                    c = ' ';
                } else {
                    c = r0.A00(str);
                }
                r14.A05 = new WeakReference(A042.A01);
                C06040Xk r6 = r14.A00;
                Integer num2 = A042.A00;
                switch (num.intValue()) {
                    case 0:
                        c2 = '0';
                        break;
                    case 1:
                        c2 = '1';
                        break;
                    case 2:
                        c2 = '2';
                        break;
                    default:
                        c2 = '3';
                        break;
                }
                C019409a r5 = r14.A08;
                synchronized (r5) {
                    i = r5.A00;
                }
                C06040Xk.A02(r6, num2, Integer.valueOf(i), Integer.valueOf(r5.A02()), c, c2, z, false);
                if (Build.VERSION.SDK_INT < 29 || num.equals(AnonymousClass006.A01) || num.equals(AnonymousClass006.A00)) {
                    boolean A012 = AnonymousClass0NO.A01(C019909g.A00(A042.A00));
                    C06150Xw r02 = r14.A0D;
                    if (r02 != null) {
                        r02.Bzu(A012);
                    }
                    C04410Nm r03 = r14.A01;
                    if (r03 != null) {
                        r03.Bzu(A012);
                    }
                }
                C04170Mn r04 = new C04170Mn((Throwable) null);
                r4.A07(r04, r3, r14);
                r4.A07(r04, r2, r14);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r4 == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = X.AnonymousClass006.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        r1 = X.AnonymousClass006.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        X.C06150Xw.A02(r2, r1, new byte[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        r1.A0B(java.lang.Boolean.valueOf(!r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r2 = r3.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        if (r2 == null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.A0M
            monitor-enter(r1)
            boolean r0 = r3.A04     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            return
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            X.0Xw r2 = r3.A0D
            if (r2 == 0) goto L_0x0021
            monitor-enter(r2)
            if (r4 == 0) goto L_0x0014
            java.lang.Integer r1 = X.AnonymousClass006.A0Y     // Catch:{ all -> 0x001d }
            goto L_0x0016
        L_0x0014:
            java.lang.Integer r1 = X.AnonymousClass006.A0j     // Catch:{ all -> 0x001d }
        L_0x0016:
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x001d }
            X.C06150Xw.A02(r2, r1, r0)     // Catch:{ all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0020:
            monitor-exit(r2)
        L_0x0021:
            X.0Xk r1 = r3.A00
            if (r1 == 0) goto L_0x002e
            r0 = r4 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0B(r0)
        L_0x002e:
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07220b8.A05(boolean):void");
    }

    public final void CCh(int i) {
        if (this.A0Q) {
            if (i == 2) {
                AnonymousClass09Z A042 = A04();
                synchronized (this.A0M) {
                    if (!(A042.A01 instanceof Activity) || A042.A00.compareTo(AnonymousClass006.A0Y) >= 0) {
                        Object obj = A0S;
                        synchronized (C019609d.A02) {
                            try {
                                C07210b6 r0 = C019609d.A00;
                                if (r0 == null) {
                                    AnonymousClass0LU.A0C("lacrima", "GlobalAppState.setAppStateCallback wasn't called?");
                                } else {
                                    C07220b8 r6 = r0.A00;
                                    C04100Mg r1 = r6.A0A;
                                    if (!r1.A09 && !r1.A0A && (r6.A0F == null || !AppStateLoggerNative.sAppStateLoggerNativeInited || !AppStateLoggerNative.isShuttingDownNative())) {
                                        synchronized (r6.A0M) {
                                            try {
                                                Object obj2 = C019609d.A01;
                                                if (obj != obj2 || !r6.A03) {
                                                    C019409a r02 = r6.A08;
                                                    Integer num = AnonymousClass006.A01;
                                                    r02.A03(obj, num);
                                                    C06150Xw r03 = r6.A0D;
                                                    if (r03 != null) {
                                                        r03.A04(obj, num);
                                                    }
                                                    A03(r6, AnonymousClass006.A00, false);
                                                    AnonymousClass0Y6 r12 = r6.A0E;
                                                    if (!(r12 == null || obj == obj2)) {
                                                        int i2 = 3;
                                                        if (obj == obj2) {
                                                            i2 = 1;
                                                        }
                                                        r12.A01(i2);
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                while (true) {
                                                    th = th;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                    break;
                                }
                            }
                        }
                        this.A06 = true;
                    }
                }
            } else {
                synchronized (this.A0M) {
                    if (this.A06) {
                        C019609d.A00(A0S);
                        this.A06 = false;
                    }
                }
            }
        }
        C06150Xw r4 = this.A0D;
        if (r4 != null) {
            synchronized (r4) {
                if (i > 126) {
                    i = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                C06150Xw.A02(r4, AnonymousClass006.A0B, (byte) i);
            }
            return;
        }
        return;
        throw th;
    }

    public final C06820aQ As3() {
        return this.A0P;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.APP_LIFECYCLE;
    }

    public C07220b8(Application application, C019409a r10, C019809f r11, AnonymousClass0ME r12, C04100Mg r13, C04410Nm r14, C04420Nn r15, AnonymousClass0Y6 r16, C06560Zx r17, C06820aQ r18, AnonymousClass0Q4 r19, AnonymousClass0QI r20, int i, boolean z) {
        this.A07 = application;
        AnonymousClass0Q4 r2 = r19;
        this.A0J = r2;
        this.A0A = r13;
        this.A08 = r10;
        this.A0O = r11;
        this.A01 = r14;
        this.A09 = r12;
        AnonymousClass0QI r5 = r20;
        this.A0K = r5;
        this.A0F = r17;
        this.A0N = true;
        this.A0E = r16;
        this.A0P = r18;
        this.A0Q = z;
        File file = r2.A04;
        C002801h.A02(file, "Did you call SessionManager.init()?");
        this.A0D = new C06150Xw(r11, r15, r5, file, i);
    }
}
