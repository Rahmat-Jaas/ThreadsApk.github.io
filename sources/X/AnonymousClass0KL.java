package X;

import android.content.Context;

/* renamed from: X.0KL  reason: invalid class name */
public final class AnonymousClass0KL implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0EZ A01;

    public AnonymousClass0KL(Context context, AnonymousClass0EZ r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e1 A[Catch:{ IOException -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7 A[Catch:{ IOException -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.0EZ r5 = r9.A01
            android.content.Context r1 = r9.A00
            monitor-enter(r5)
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x00f7 }
            r5.A00 = r0     // Catch:{ all -> 0x00f7 }
            X.0KK r0 = new X.0KK     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            r5.A02 = r0     // Catch:{ all -> 0x00f7 }
            r0 = 1210469102(0x48264aee, float:170283.72)
            java.io.File r2 = X.C14630pr.A00(r1, r0)     // Catch:{ all -> 0x00f7 }
            r2.mkdirs()     // Catch:{ all -> 0x00f7 }
            r5.A03 = r2     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "Initializing FileBasedMultiProcessTracking using "
            r1.append(r0)     // Catch:{ all -> 0x00f7 }
            r1.append(r2)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f7 }
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ all -> 0x00f7 }
            java.io.File r0 = r5.A03     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x0049
            java.io.File r0 = r5.A03     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.mkdir()     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "Failed to create tracking directory"
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x00f5
        L_0x0049:
            int r3 = r5.A00     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "Failed to create process to track "
            java.lang.String r0 = "Creating file to track "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r3)     // Catch:{ all -> 0x00f7 }
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ all -> 0x00f7 }
            java.io.File r0 = r5.A03     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = X.AnonymousClass00U.A0R(r1, r0, r3)     // Catch:{ all -> 0x00f7 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00f7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.createNewFile()     // Catch:{ IOException -> 0x0075 }
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = X.AnonymousClass00U.A0J(r2, r3)     // Catch:{ IOException -> 0x0075 }
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ IOException -> 0x0075 }
            goto L_0x0083
        L_0x0075:
            r0 = move-exception
            java.lang.String r1 = " "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = X.AnonymousClass00U.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00f7 }
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ all -> 0x00f7 }
        L_0x0083:
            java.io.File r0 = r5.A03     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x00f7 }
            X.0KM r0 = new X.0KM     // Catch:{ all -> 0x00f7 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x00f7 }
            r5.A01 = r0     // Catch:{ all -> 0x00f7 }
            r0.startWatching()     // Catch:{ all -> 0x00f7 }
            int r0 = r5.A00     // Catch:{ all -> 0x00f7 }
            java.lang.String r8 = X.AnonymousClass0KP.A00(r0)     // Catch:{ Exception -> 0x00aa }
            if (r8 == 0) goto L_0x00aa
            r0 = 58
            int r1 = r8.indexOf(r0)     // Catch:{ Exception -> 0x00aa }
            r0 = 1
            if (r1 < r0) goto L_0x00ac
            r0 = 0
            java.lang.String r8 = r8.substring(r0, r1)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r8 = ""
        L_0x00ac:
            java.io.File r0 = r5.A03     // Catch:{ all -> 0x00f7 }
            java.io.File[] r7 = r0.listFiles()     // Catch:{ all -> 0x00f7 }
            if (r7 == 0) goto L_0x00ed
            int r6 = r7.length     // Catch:{ all -> 0x00f7 }
            r4 = 0
        L_0x00b6:
            if (r4 >= r6) goto L_0x00ed
            r0 = r7[r4]     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00c3 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
            r3 = -1
        L_0x00c4:
            java.lang.String r2 = X.AnonymousClass0KP.A00(r3)     // Catch:{ Exception -> 0x00d9 }
            if (r2 == 0) goto L_0x00d9
            r0 = 58
            int r1 = r2.indexOf(r0)     // Catch:{ Exception -> 0x00d9 }
            r0 = 1
            if (r1 < r0) goto L_0x00db
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00db
        L_0x00d9:
            java.lang.String r2 = ""
        L_0x00db:
            boolean r0 = r8.equals(r2)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00e7
            X.0KK r0 = r5.A02     // Catch:{ all -> 0x00f7 }
            r0.A00(r3)     // Catch:{ all -> 0x00f7 }
            goto L_0x00ea
        L_0x00e7:
            r5.A01(r3)     // Catch:{ all -> 0x00f7 }
        L_0x00ea:
            int r4 = r4 + 1
            goto L_0x00b6
        L_0x00ed:
            java.lang.String r0 = "FileBasedMultiProcessTracker ready!"
            X.AnonymousClass0EZ.A00(r0)     // Catch:{ all -> 0x00f7 }
            r0 = 1
            r5.A04 = r0     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r5)
            return
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KL.run():void");
    }
}
