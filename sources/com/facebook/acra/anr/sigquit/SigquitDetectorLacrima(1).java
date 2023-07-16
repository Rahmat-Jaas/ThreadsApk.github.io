package com.facebook.acra.anr.sigquit;

import X.AnonymousClass0N5;
import X.C017908l;
import X.C018208o;
import X.C018308p;
import X.C018408q;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

public class SigquitDetectorLacrima implements C017908l {
    public static C017908l sInstance;
    public static boolean sIsArt;
    public MultiSignalANRDetector mListener;
    public Handler mMainThreadHandler;
    public boolean mNotifyJavaOnSigquit;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, boolean z7, boolean z8, boolean z9);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0019;
     */
    static {
        /*
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "0."
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            sIsArt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.<clinit>():void");
    }

    private void onSigquit() {
        MultiSignalANRDetector multiSignalANRDetector = this.mListener;
        if (!multiSignalANRDetector.A0c) {
            multiSignalANRDetector.A0Z.getAndSet((Object) null);
            multiSignalANRDetector.A07 = SystemClock.uptimeMillis();
            multiSignalANRDetector.A06 = System.currentTimeMillis();
            AnonymousClass0N5 r0 = multiSignalANRDetector.A0U;
            if (r0 != null) {
                r0.CKh();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r2.A0a.getAndSet((java.lang.Object) null);
        r0 = r2.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r0.CKi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r3 = r13;
        r2.A0Q.post(new X.AnonymousClass08R(r2, r3, r12, android.os.SystemClock.uptimeMillis(), java.lang.System.currentTimeMillis(), r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onSigquitTracesAvailable(java.lang.String r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r2 = "SigquitDetectorLacrima"
            r9 = r14
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            r10 = r15
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "sigquitDetected inFgV1: %b inFgV2: %b"
            X.AnonymousClass0LU.A0O(r2, r0, r1)
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector r2 = r11.mListener
            boolean r0 = r2.A0c
            if (r0 != 0) goto L_0x0051
            java.lang.String r1 = r2.A0C
            java.lang.String r0 = "On onSigquitTracesAvailable call"
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.Object r1 = r2.A0W
            monitor-enter(r1)
            boolean r0 = r2.A0K     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x002b
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            return
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            java.util.concurrent.atomic.AtomicReference r1 = r2.A0a
            r0 = 0
            r1.getAndSet(r0)
            X.0N5 r0 = r2.A0U
            if (r0 == 0) goto L_0x0039
            r0.CKi()
        L_0x0039:
            long r5 = android.os.SystemClock.uptimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            android.os.Handler r0 = r2.A0Q
            X.08R r1 = new X.08R
            r4 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            r0.post(r1)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.onSigquitTracesAvailable(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r1.endsWith(":browser") != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(X.AnonymousClass0NG r21, boolean r22) {
        /*
            r20 = this;
            java.lang.String r1 = "SigquitDetectorLacrima"
            java.lang.String r0 = "nativeInit"
            X.AnonymousClass0LU.A0C(r1, r0)
            r3 = r21
            android.os.Handler r0 = r3.A02
            r4 = r20
            r4.mMainThreadHandler = r0
            boolean r2 = r3.A06
            r4.mNotifyJavaOnSigquit = r2
            boolean r5 = sIsArt
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = ""
            java.lang.String r9 = r3.A05
            java.lang.String r10 = ".stacktrace"
            java.lang.String r1 = r3.A04
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r11 = 1
        L_0x0031:
            r13 = 0
            r14 = 1
            java.lang.String r16 = r3.A00()
            r12 = r22
            r8 = r7
            r15 = r13
            r17 = r13
            r18 = r2
            r19 = r13
            nativeInit(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.init(X.0NG, boolean):void");
    }

    public void installSignalHandler(Handler handler, boolean z) {
        C018208o r2 = new C018208o(this);
        if (this.mNotifyJavaOnSigquit) {
            new C018308p(this).start();
        }
        this.mMainThreadHandler.post(new C018408q(handler, this, r2));
    }

    public SigquitDetectorLacrima(MultiSignalANRDetector multiSignalANRDetector) {
        this.mListener = multiSignalANRDetector;
    }

    public void cleanupAppStateFile() {
        nativeCleanupAppStateFile();
    }

    public void stopDetector() {
        nativeStopDetector();
    }
}
