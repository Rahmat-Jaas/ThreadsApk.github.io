package com.facebook.common.threadutils;

import X.C15020qa;
import X.C98556Ga;

public final class ThreadUtils {
    public static final C98556Ga Companion = new C98556Ga();
    public static final ThreadUtils instance = new ThreadUtils();
    public final int maxAffinityMask;

    public static final native void nativeSetThreadAffinityMask(int i, int i2);

    static {
        C15020qa.A0A("threadutils-jni");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ThreadUtils() {
        /*
            r4 = this;
            r4.<init>()
            X.75n r3 = X.C1194875n.A02
            monitor-enter(r3)
            int r2 = r3.A00     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x003d
            r2 = -1
            r0 = 538(0x21a, float:7.54E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            int r0 = X.AnonymousClass732.A00(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            if (r0 != r2) goto L_0x001d
            java.lang.String r0 = "/sys/devices/system/cpu/present"
            int r0 = X.AnonymousClass732.A00(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
        L_0x001d:
            if (r0 != r2) goto L_0x002f
            java.lang.String r0 = "/sys/devices/system/cpu/"
            java.io.File r1 = X.C86144wL.A0Z(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            java.io.FileFilter r0 = X.AnonymousClass732.A00     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            java.io.File[] r0 = r1.listFiles(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            r0.getClass()     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
            int r0 = r0.length     // Catch:{ NullPointerException | SecurityException -> 0x0030 }
        L_0x002f:
            r2 = r0
        L_0x0030:
            r3.A00 = r2     // Catch:{ Exception -> 0x0033 }
            goto L_0x003b
        L_0x0033:
            r2 = move-exception
            java.lang.String r1 = "ProcessorInfoUtil"
            java.lang.String r0 = "Unable to get reliable CPU Core count"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x005b }
        L_0x003b:
            int r2 = r3.A00     // Catch:{ all -> 0x005b }
        L_0x003d:
            monitor-exit(r3)
            r0 = -1
            if (r2 != r0) goto L_0x0054
            int r2 = r3.A01
            if (r2 != 0) goto L_0x0054
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r1 = r0.availableProcessors()
            r0 = 1
            int r2 = java.lang.Math.max(r1, r0)
            r3.A01 = r2
        L_0x0054:
            r1 = 1
            int r0 = r1 << r2
            int r0 = r0 - r1
            r4.maxAffinityMask = r0
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.threadutils.ThreadUtils.<init>():void");
    }
}
