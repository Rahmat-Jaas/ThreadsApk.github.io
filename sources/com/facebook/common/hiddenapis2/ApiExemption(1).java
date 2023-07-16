package com.facebook.common.hiddenapis2;

public class ApiExemption {
    public static final String[] EXEMPTIONS = {"Landroid/app/ActivityThread", "Landroid/app/ActivityTaskManager", "Landroid/net/ConnectivityManager", "Landroid/location/LocationManager", "Landroid/os/storage/StorageManager", "Landroid/app/usage/StorageStatsManager", "Landroid/accounts/AccountManager", "Landroid/content/ClipboardManager", "Landroid/media/AudioManager", "Landroid/os/BatteryManager", "Landroid/app/JobSchedulerImpl", "Landroid/media/session/MediaSessionManager", "Landroid/util/BoostFramework", "Lcom/mediatek/perfservice/", "Lcom/mediatek/powerhalmgr/", "Lcom/samsung/android/os/SemPerfManager", "Landroid/os/InputConstants", "Landroid/os/perfdebug/", "Landroid/os/Looper", "Landroid/os/Message", "Landroid/app/QueuedWork", "Landroid/os/Binder"};
    public static volatile boolean sCalled;
    public static volatile boolean sResult;

    public static native int nativeSetHiddenApiExemptions(int i, String[] strArr);

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|(8:8|9|10|11|(1:13)|26|27|28)(5:18|(4:20|21|22|23)|26|27|28)|25|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (nativeSetHiddenApiExemptions(r3, r1) == 1) goto L_0x0060;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean removeRestriction_DO_NOT_USE() {
        /*
            java.lang.Class<com.facebook.common.hiddenapis2.ApiExemption> r5 = com.facebook.common.hiddenapis2.ApiExemption.class
            monitor-enter(r5)
            boolean r0 = sCalled     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x000a
            boolean r0 = sResult     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x000a:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0070 }
            r0 = 29
            if (r3 > r0) goto L_0x004d
            java.lang.String[] r4 = EXEMPTIONS     // Catch:{ all -> 0x0070 }
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r2 = "getDeclaredMethod"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<dalvik.system.VMRuntime> r2 = dalvik.system.VMRuntime.class
            java.lang.String r1 = "setHiddenApiExemptions"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r3.invoke(r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0062
            dalvik.system.VMRuntime r1 = dalvik.system.VMRuntime.getRuntime()     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x0044 }
            r2.invoke(r1, r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0060
        L_0x0044:
            r2 = move-exception
            java.lang.String r1 = "ApiExemption"
            java.lang.String r0 = "Enable api exemption failed:"
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x0062
        L_0x004d:
            r0 = 33
            if (r3 > r0) goto L_0x0062
            java.lang.String[] r1 = EXEMPTIONS     // Catch:{ all -> 0x0070 }
            r2 = 0
            java.lang.String r0 = "hiddenapis2"
            X.C15020qa.A0A(r0)     // Catch:{ all -> 0x0063 }
            int r1 = nativeSetHiddenApiExemptions(r3, r1)     // Catch:{ all -> 0x0063 }
            r0 = 1
            if (r1 != r0) goto L_0x0063
        L_0x0060:
            r2 = 1
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            sResult = r2     // Catch:{ all -> 0x0070 }
            r0 = 1
            sCalled = r0     // Catch:{ all -> 0x0070 }
            boolean r0 = sResult     // Catch:{ all -> 0x0070 }
            X.C03430Ij.A00 = r0     // Catch:{ all -> 0x0070 }
            boolean r0 = sResult     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r5)
            return r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.hiddenapis2.ApiExemption.removeRestriction_DO_NOT_USE():boolean");
    }
}
