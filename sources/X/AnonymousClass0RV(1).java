package X;

/* renamed from: X.0RV  reason: invalid class name */
public final class AnonymousClass0RV {
    public static final String A02 = AnonymousClass0RV.class.getName();
    public AnonymousClass0RW A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r3, X.AnonymousClass0RV r4) {
        /*
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            java.lang.String r2 = r0.dataDir
            java.lang.String r0 = "ig_crash_log_session"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x005e
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0056 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0056 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            r2.<init>(r3)     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
        L_0x0022:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002c
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0022
        L_0x002c:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0048 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0048 }
            int r0 = r1.length()     // Catch:{ all -> 0x0048 }
            if (r0 <= 0) goto L_0x0040
            X.0RW r0 = new X.0RW     // Catch:{ all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            r4.A00 = r0     // Catch:{ all -> 0x0048 }
        L_0x0040:
            r0 = 0
            X.C102596Vu.A00(r2, r0)     // Catch:{ all -> 0x004f }
            X.C102596Vu.A00(r3, r0)     // Catch:{ IOException -> 0x0056 }
            return
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.C102596Vu.A00(r3, r1)     // Catch:{ IOException -> 0x0056 }
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = A02
            java.lang.String r0 = "Unable to read session"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RV.A00(android.content.Context, X.0RV):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r2, X.AnonymousClass0RV r3, java.lang.String r4) {
        /*
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()     // Catch:{ IOException -> 0x0028 }
            java.lang.String r2 = r0.dataDir     // Catch:{ IOException -> 0x0028 }
            java.lang.String r1 = "ig_crash_log_session"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0028 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0028 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0028 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0028 }
            r1 = 0
            r2.write(r4)     // Catch:{ all -> 0x0021 }
            X.0RW r0 = new X.0RW     // Catch:{ all -> 0x0021 }
            r0.<init>(r4)     // Catch:{ all -> 0x0021 }
            r3.A00 = r0     // Catch:{ all -> 0x0021 }
            X.C102596Vu.A00(r2, r1)     // Catch:{ IOException -> 0x0028 }
            return
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ IOException -> 0x0028 }
            throw r0     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            java.lang.String r1 = A02
            java.lang.String r0 = "error writing"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RV.A01(android.content.Context, X.0RV, java.lang.String):void");
    }
}
