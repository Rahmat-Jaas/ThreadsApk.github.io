package X;

import android.content.Context;

/* renamed from: X.0Cl  reason: invalid class name and case insensitive filesystem */
public abstract class C02690Cl {
    public final Context A00;
    public final ClassLoader A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|8|9|10|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = new java.io.File(r5.A00.getCacheDir(), "temp_service_jar_dex");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r1.exists() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r1.mkdir();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1 = new dalvik.system.DexClassLoader("/system/framework/services.jar", r1.getCanonicalPath(), (java.lang.String) null, X.C02690Cl.class.getClassLoader());
        r1.loadClass("com.android.server.am.ActivityManagerService");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C02690Cl(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.A00 = r6
            java.lang.String r4 = "/system/framework/services.jar"
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r0 = r1.exists()
            r3 = 0
            if (r0 == 0) goto L_0x005f
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x005f
            dalvik.system.PathClassLoader r1 = new dalvik.system.PathClassLoader     // Catch:{ all -> 0x001f }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x001f }
            goto L_0x002c
        L_0x001f:
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x005f }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x005f }
            dalvik.system.PathClassLoader r1 = new dalvik.system.PathClassLoader     // Catch:{ all -> 0x005f }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x005f }
        L_0x002c:
            java.lang.String r0 = "com.android.server.am.ActivityManagerService"
            r1.loadClass(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x005e
        L_0x0032:
            if (r7 == 0) goto L_0x005e
            android.content.Context r0 = r5.A00     // Catch:{ all -> 0x005f }
            java.io.File r2 = r0.getCacheDir()     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "temp_service_jar_dex"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x005f }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x005f }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x004a
            r1.mkdir()     // Catch:{ all -> 0x005f }
        L_0x004a:
            java.lang.String r2 = r1.getCanonicalPath()     // Catch:{ all -> 0x005f }
            java.lang.Class<X.0Cl> r0 = X.C02690Cl.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x005f }
            dalvik.system.DexClassLoader r1 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x005f }
            r1.<init>(r4, r2, r3, r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "com.android.server.am.ActivityManagerService"
            r1.loadClass(r0)     // Catch:{ all -> 0x005f }
        L_0x005e:
            r3 = r1
        L_0x005f:
            r5.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02690Cl.<init>(android.content.Context, boolean):void");
    }
}
