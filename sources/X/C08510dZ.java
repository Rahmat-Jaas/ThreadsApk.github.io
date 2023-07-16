package X;

/* renamed from: X.0dZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08510dZ implements Runnable {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ C08510dZ(Runnable runnable) {
        this.A00 = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.lang.Runnable r2 = r4.A00
            X.0OK r0 = X.C08470dV.A01
            android.app.Application r0 = r0.A0L
            X.0L1 r1 = new X.0L1
            r1.<init>(r0)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x001a
            X.0L2 r1 = X.AnonymousClass0L2.A00(r1)
            X.0Rb r0 = X.C05140Rb.IG_EARLY_NATIVE
            r1.A02(r0)
        L_0x001a:
            r2.run()
            X.0OK r3 = X.C08470dV.A01
            X.0Q4 r0 = r3.A01
            if (r0 == 0) goto L_0x009c
            r1 = -507217368(0xffffffffe1c47a28, float:-4.530455E20)
            java.lang.String r0 = "earlyNativeInit"
            X.C13810oL.A01(r0, r1)
            X.C04790Pd.A00()
            boolean r0 = com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x003f
            r1 = 1
            java.lang.String r0 = "appstatelogger2"
            X.C15020qa.A0A(r0)     // Catch:{ RuntimeException | UnsatisfiedLinkError -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            X.C04790Pd.A00()     // Catch:{ all -> 0x0083 }
            r1 = 0
        L_0x003d:
            com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded = r1     // Catch:{ all -> 0x0087 }
        L_0x003f:
            X.0Q4 r0 = r3.A03()     // Catch:{ all -> 0x0087 }
            X.0Xk r2 = r0.A03     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r2, r0)     // Catch:{ all -> 0x0087 }
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0087 }
            monitor-enter(r1)     // Catch:{ all -> 0x0087 }
            X.0Xx r0 = r2.A00     // Catch:{ all -> 0x0080 }
            r0.mlockBuffer()     // Catch:{ all -> 0x0080 }
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            java.util.List r0 = r3.A0N     // Catch:{ all -> 0x0087 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0059:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0087 }
            X.0OE r0 = (X.AnonymousClass0OE) r0     // Catch:{ all -> 0x0087 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0087 }
            r0.BPo(r3)     // Catch:{ all -> 0x0087 }
            goto L_0x0059
        L_0x006c:
            X.0Q4 r2 = r3.A03()     // Catch:{ all -> 0x0087 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0087 }
            r2.A00 = r0     // Catch:{ all -> 0x0087 }
            X.C04790Pd.A00()
            r0 = 247846743(0xec5d757, float:4.8771614E-30)
            X.C13810oL.A00(r0)
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile.sLibraryLoaded = r1     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r1 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "earlyNativeInit exception"
            X.AnonymousClass0OK.A00(r3, r0, r1)     // Catch:{ all -> 0x0091 }
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            X.C04790Pd.A00()
            r0 = -1705743841(0xffffffff9a546a1f, float:-4.3926296E-23)
            X.C13810oL.A00(r0)
            throw r1
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08510dZ.run():void");
    }
}
