package X;

/* renamed from: X.7zY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135477zY implements Runnable {
    public final AnonymousClass7M4 A00;

    public C135477zY(AnonymousClass7M4 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        X.C86114wI.A1N("MessengerIpcClient", r7);
        r6 = r8.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A00;
        r5.arg1 = r9;
        r5.replyTo = r1;
        r4 = X.C18180wK.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if ((r7 instanceof X.C93885rw) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r4.putBoolean("oneWay", r0);
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = r2.A00;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r0 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        throw X.C18180wK.A0a("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r2.A01(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.7M4 r2 = r10.A00
        L_0x0002:
            monitor-enter(r2)
            int r0 = r2.A01     // Catch:{ all -> 0x008e }
            r3 = 2
            if (r0 != r3) goto L_0x0013
            java.util.Queue r1 = r2.A03     // Catch:{ all -> 0x008e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0015
            r2.A00()     // Catch:{ all -> 0x008e }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x008d
        L_0x0015:
            java.lang.Object r7 = r1.poll()     // Catch:{ all -> 0x008e }
            X.6sE r7 = (X.C113836sE) r7     // Catch:{ all -> 0x008e }
            android.util.SparseArray r0 = r2.A04     // Catch:{ all -> 0x008e }
            int r9 = r7.A01     // Catch:{ all -> 0x008e }
            r0.put(r9, r7)     // Catch:{ all -> 0x008e }
            X.7Da r8 = r2.A05     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r8.A03     // Catch:{ all -> 0x008e }
            X.81L r5 = new X.81L     // Catch:{ all -> 0x008e }
            r5.<init>(r2, r7)     // Catch:{ all -> 0x008e }
            r0 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r5, r0, r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "MessengerIpcClient"
            X.C86114wI.A1N(r0, r7)
            android.content.Context r6 = r8.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A00
            r5.what = r0
            r5.arg1 = r9
            r5.replyTo = r1
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7 instanceof X.C93885rw
            if (r0 == 0) goto L_0x006a
            r0 = 0
        L_0x0053:
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            goto L_0x006c
        L_0x006a:
            r0 = 1
            goto L_0x0053
        L_0x006c:
            X.6gs r1 = r2.A00     // Catch:{ RemoteException -> 0x0083 }
            android.os.Messenger r0 = r1.A00     // Catch:{ RemoteException -> 0x0083 }
            if (r0 != 0) goto L_0x0078
            com.google.firebase.iid.zzm r0 = r1.A01     // Catch:{ RemoteException -> 0x0083 }
            if (r0 == 0) goto L_0x007c
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x0083 }
        L_0x0078:
            r0.send(r5)     // Catch:{ RemoteException -> 0x0083 }
            goto L_0x0002
        L_0x007c:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ RemoteException -> 0x0083 }
            throw r0     // Catch:{ RemoteException -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L_0x0002
        L_0x008d:
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135477zY.run():void");
    }
}
