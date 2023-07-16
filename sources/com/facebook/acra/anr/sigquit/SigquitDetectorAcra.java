package com.facebook.acra.anr.sigquit;

import X.AnonymousClass0LU;
import X.C017908l;
import X.C018008m;
import X.C018108n;
import android.os.Handler;

public class SigquitDetectorAcra implements C017908l {
    public static boolean sIsArt;
    public Handler mMainThreadHandler;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, boolean z7, boolean z8, boolean z9);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    private void onSigquit() {
    }

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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorAcra.<clinit>():void");
    }

    private void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2) {
        AnonymousClass0LU.A0O("SigquitDetectorAcra", "sigquitDetected inFgV1: %b inFgV2: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        throw new NullPointerException("onSigquitTracesAvailable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r1.endsWith(":browser") != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(X.AnonymousClass0NG r20, boolean r21) {
        /*
            r19 = this;
            r2 = r20
            android.os.Handler r0 = r2.A02
            r3 = r19
            r3.mMainThreadHandler = r0
            java.lang.String r1 = "SigquitDetectorAcra"
            java.lang.String r0 = "nativeInit"
            X.AnonymousClass0LU.A0C(r1, r0)
            boolean r4 = sIsArt
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = ""
            java.lang.String r8 = r2.A05
            java.lang.String r9 = ".stacktrace"
            java.lang.String r1 = r2.A04
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r10 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r10 = 1
        L_0x002d:
            r12 = 0
            r13 = 1
            java.lang.String r15 = r2.A00()
            r11 = r21
            r7 = r6
            r14 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            nativeInit(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorAcra.init(X.0NG, boolean):void");
    }

    public void installSignalHandler(Handler handler, boolean z) {
        this.mMainThreadHandler.post(new C018108n(handler, this, new C018008m(this)));
    }

    public void cleanupAppStateFile() {
        nativeCleanupAppStateFile();
    }

    public void stopDetector() {
        nativeStopDetector();
    }
}
