package X;

/* renamed from: X.0fK  reason: invalid class name and case insensitive filesystem */
public final class C09380fK implements AnonymousClass0OE {
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BPo(X.AnonymousClass0OK r9) {
        /*
            r8 = this;
            android.app.Application r5 = r9.A0L
            r0 = 2342154135907860890(0x208100c70000019a, double:4.058062069592356E-152)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            boolean r0 = X.C07960cV.A05(r0)
            if (r0 == 0) goto L_0x0088
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x0021
            r1 = 231375063(0xdca80d7, float:1.2480228E-30)
            java.lang.String r0 = "integrateWithCrashLog"
            X.C13930oX.A01(r0, r1)
        L_0x0021:
            r0 = 36592601671008787(0x8200c700020213, double:3.204646871101471E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)     // Catch:{ all -> 0x006e }
            long r0 = X.C07960cV.A00(r0)     // Catch:{ all -> 0x006e }
            int r4 = (int) r0     // Catch:{ all -> 0x006e }
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r0.dataDir     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "crash_log"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x006e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x006e }
            r1.createNewFile()     // Catch:{ IOException -> 0x0046 }
            r0 = 1
            r1.setReadable(r0)     // Catch:{ IOException -> 0x0046 }
            r1.setWritable(r0)     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            java.lang.String r3 = r1.getPath()     // Catch:{ all -> 0x006e }
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r0.dataDir     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "insta_crash_log"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x006e }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x006e }
            r1.createNewFile()     // Catch:{ IOException -> 0x0061 }
            r0 = 1
            r1.setReadable(r0)     // Catch:{ IOException -> 0x0061 }
            r1.setWritable(r0)     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x006e }
            com.facebook.common.dextricks.DalvikInternals$CrashLogParameters r0 = new com.facebook.common.dextricks.DalvikInternals$CrashLogParameters     // Catch:{ all -> 0x006e }
            r0.<init>(r4)     // Catch:{ all -> 0x006e }
            com.facebook.common.dextricks.DalvikInternals.integrateWithCrashLog(r3, r1, r0)     // Catch:{ all -> 0x006e }
            goto L_0x007c
        L_0x006e:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x007b
            r0 = -1048802922(0xffffffffc17c8996, float:-15.78359)
            X.C13930oX.A00(r0)
        L_0x007b:
            throw r1
        L_0x007c:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r6)
            if (r0 == 0) goto L_0x0088
            r0 = 707551311(0x2a2c604f, float:1.5310083E-13)
            X.C13930oX.A00(r0)
        L_0x0088:
            com.instagram.debug.logdelegate.IgLogImpl r2 = com.instagram.debug.logdelegate.IgLogImpl.sInstance
            java.lang.Class<X.0LU> r1 = X.AnonymousClass0LU.class
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0091
            X.0Od r2 = X.C04550Od.A00     // Catch:{ all -> 0x00a2 }
        L_0x0091:
            X.0JW r0 = X.AnonymousClass0LU.A01     // Catch:{ all -> 0x00a2 }
            int r0 = r0.getMinimumLoggingLevel()     // Catch:{ all -> 0x00a2 }
            r2.setMinimumLoggingLevel(r0)     // Catch:{ all -> 0x00a2 }
            X.AnonymousClass0LU.A01 = r2     // Catch:{ all -> 0x00a2 }
            X.0JW r0 = X.AnonymousClass0LU.A01     // Catch:{ all -> 0x00a2 }
            X.AnonymousClass0JV.A00 = r0     // Catch:{ all -> 0x00a2 }
            monitor-exit(r1)
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09380fK.BPo(X.0OK):void");
    }

    public final Integer BM7() {
        return AnonymousClass006.A0C;
    }
}
