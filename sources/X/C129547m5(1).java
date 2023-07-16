package X;

import android.content.Context;

/* renamed from: X.7m5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129547m5 implements C39506Kuq {
    public final Context A00;

    public C129547m5(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0119, code lost:
        if (r0 == null) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DBu() {
        /*
            r8 = this;
            android.content.Context r4 = r8.A00
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r1 = android.os.Build.TAGS
            java.lang.String r0 = "eng"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "userdebug"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0019
        L_0x0016:
            X.5pc r1 = X.AnonymousClass5pc.A00
            return r1
        L_0x0019:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x002a
            goto L_0x0016
        L_0x002a:
            boolean r0 = r4.isDeviceProtectedStorage()
            if (r0 != 0) goto L_0x0034
            android.content.Context r4 = r4.createDeviceProtectedStorageContext()
        L_0x0034:
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "phenotype_hermetic"
            r0 = 0
            java.io.File r1 = r4.getDir(r1, r0)     // Catch:{ RuntimeException -> 0x0057 }
            java.lang.String r0 = "overrides.txt"
            java.io.File r2 = X.C86154wM.A0U(r1, r0)     // Catch:{ RuntimeException -> 0x0057 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0054
            X.5pb r1 = new X.5pb     // Catch:{ all -> 0x012f }
            r1.<init>(r2)     // Catch:{ all -> 0x012f }
            goto L_0x0061
        L_0x0054:
            X.5pc r1 = X.AnonymousClass5pc.A00     // Catch:{ all -> 0x012f }
            goto L_0x0061
        L_0x0057:
            r2 = move-exception
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = "no data dir"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x012f }
            X.5pc r1 = X.AnonymousClass5pc.A00     // Catch:{ all -> 0x012f }
        L_0x0061:
            android.os.StrictMode.setThreadPolicy(r3)
            boolean r0 = r1 instanceof X.AnonymousClass5pb
            if (r0 == 0) goto L_0x0016
            java.lang.Object r5 = r1.A00()
            java.io.File r5 = (java.io.File) r5
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0129 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0129 }
            java.io.BufferedReader r7 = X.C86144wL.A0Y(r0)     // Catch:{ IOException -> 0x0129 }
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x00d4 }
        L_0x007b:
            java.lang.String r6 = r7.readLine()     // Catch:{ all -> 0x00d4 }
            java.lang.String r3 = "HermeticFileOverrides"
            if (r6 == 0) goto L_0x00bf
            java.lang.String r0 = " "
            r2 = 3
            java.lang.String[] r1 = r6.split(r0, r2)     // Catch:{ all -> 0x00d4 }
            int r0 = r1.length     // Catch:{ all -> 0x00d4 }
            if (r0 == r2) goto L_0x0097
            java.lang.String r0 = "Invalid: "
            java.lang.String r0 = X.C86104wH.A0w(r6, r0)     // Catch:{ all -> 0x00d4 }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x007b
        L_0x0097:
            r0 = 0
            r3 = r1[r0]     // Catch:{ all -> 0x00d4 }
            r0 = 1
            r0 = r1[r0]     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x00d4 }
            r0 = 2
            r0 = r1[r0]     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x00d4 }
            boolean r0 = r4.containsKey(r3)     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x00b5
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x00d4 }
            r4.put(r3, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00b5:
            java.lang.Object r0 = r4.get(r3)     // Catch:{ all -> 0x00d4 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x007b
        L_0x00bf:
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d4 }
            java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d4 }
            X.6cs r0 = new X.6cs     // Catch:{ all -> 0x00d4 }
            r0.<init>(r4)     // Catch:{ all -> 0x00d4 }
            r7.close()     // Catch:{ IOException -> 0x0129 }
            X.5pb r1 = new X.5pb
            r1.<init>(r0)
            return r1
        L_0x00d4:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x0128
        L_0x00d9:
            r4 = move-exception
            X.6J1 r1 = X.C102946Xe.A00     // Catch:{ IOException -> 0x0129 }
            boolean r0 = r1 instanceof X.AnonymousClass5pe     // Catch:{ IOException -> 0x0129 }
            if (r0 != 0) goto L_0x0128
            boolean r0 = r1 instanceof X.AnonymousClass5pf     // Catch:{ IOException -> 0x0129 }
            if (r0 == 0) goto L_0x0128
            X.5pf r1 = (X.AnonymousClass5pf) r1     // Catch:{ IOException -> 0x0129 }
            if (r4 == r5) goto L_0x011d
            X.6gp r2 = r1.A00     // Catch:{ IOException -> 0x0129 }
            java.lang.ref.ReferenceQueue r3 = r2.A00     // Catch:{ IOException -> 0x0129 }
        L_0x00ec:
            java.lang.ref.Reference r1 = r3.poll()     // Catch:{ IOException -> 0x0129 }
            if (r1 == 0) goto L_0x00f8
            java.util.concurrent.ConcurrentHashMap r0 = r2.A01     // Catch:{ IOException -> 0x0129 }
            r0.remove(r1)     // Catch:{ IOException -> 0x0129 }
            goto L_0x00ec
        L_0x00f8:
            r1 = 0
            X.898 r0 = new X.898     // Catch:{ IOException -> 0x0129 }
            r0.<init>(r5, r1)     // Catch:{ IOException -> 0x0129 }
            java.util.concurrent.ConcurrentHashMap r2 = r2.A01     // Catch:{ IOException -> 0x0129 }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ IOException -> 0x0129 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ IOException -> 0x0129 }
            if (r1 != 0) goto L_0x011b
            r0 = 2
            java.util.Vector r1 = new java.util.Vector     // Catch:{ IOException -> 0x0129 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0129 }
            X.898 r0 = new X.898     // Catch:{ IOException -> 0x0129 }
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x0129 }
            java.lang.Object r0 = r2.putIfAbsent(r0, r1)     // Catch:{ IOException -> 0x0129 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x0129 }
            if (r0 != 0) goto L_0x0125
        L_0x011b:
            r0 = r1
            goto L_0x0125
        L_0x011d:
            java.lang.String r0 = "Self suppression is not allowed."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0129 }
            r5.<init>(r0, r4)     // Catch:{ IOException -> 0x0129 }
            goto L_0x0128
        L_0x0125:
            r0.add(r4)     // Catch:{ IOException -> 0x0129 }
        L_0x0128:
            throw r5     // Catch:{ IOException -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x012f:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129547m5.DBu():java.lang.Object");
    }
}
