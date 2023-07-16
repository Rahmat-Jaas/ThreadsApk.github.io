package com.instagram.debug.devoptions.debughead.data.provider;

import java.lang.Thread;

public class DebugHeadExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final Class TAG = DebugHeadExceptionHandler.class;
    public static DebugHeadExceptionHandler sHandler;
    public Thread.UncaughtExceptionHandler mPreviousHandler = Thread.getDefaultUncaughtExceptionHandler();

    public void init() {
        if (sHandler == null) {
            DebugHeadExceptionHandler debugHeadExceptionHandler = new DebugHeadExceptionHandler();
            sHandler = debugHeadExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(debugHeadExceptionHandler);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.io.StringWriter r3 = X.C18230wP.A0d()
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ RuntimeException -> 0x0015 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0015 }
            r6.printStackTrace(r1)     // Catch:{ all -> 0x0010 }
            r1.close()     // Catch:{ RuntimeException -> 0x0015 }
            goto L_0x001d
        L_0x0010:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            throw r0     // Catch:{ RuntimeException -> 0x0015 }
        L_0x0015:
            r2 = move-exception
            java.lang.Class r1 = TAG
            java.lang.String r0 = "error with DebugExceptionHandler PrintWriter"
            X.AnonymousClass0LU.A03(r1, r0, r2)
        L_0x001d:
            java.lang.String r1 = r3.toString()
            X.0et r0 = X.C09120et.A02()
            X.0dK r0 = r0.A0I
            X.0YY r0 = r0.A01
            r0.invoke(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.mPreviousHandler
            if (r0 == 0) goto L_0x0033
            r0.uncaughtException(r5, r6)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.debughead.data.provider.DebugHeadExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
