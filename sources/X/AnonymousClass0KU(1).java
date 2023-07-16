package X;

/* renamed from: X.0KU  reason: invalid class name */
public final class AnonymousClass0KU implements Runnable {
    public final /* synthetic */ C000200d A00;

    public AnonymousClass0KU(C000200d r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3 != X.AnonymousClass006.A0C) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            X.00d r2 = r5.A00
            X.03q r0 = r2.A0M
            boolean r0 = r0.CsA()
            java.lang.String r4 = "keep_alive"
            if (r0 == 0) goto L_0x0070
            X.0vH r0 = r2.A0s
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r3 = r0.A0Y
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 1
            if (r3 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            X.0eQ r1 = r2.A08
            if (r0 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "send ping"
            r1.Bb7(r4, r0)
        L_0x0023:
            r0 = 0
            r2.A0F(r0)
        L_0x0027:
            return
        L_0x0028:
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "not connected"
            r1.Bb7(r4, r0)
        L_0x002f:
            X.0vH r0 = r2.A0s
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x003a
            return
        L_0x003a:
            r2.A0C()
            X.0uB r1 = r2.A0T
            monitor-enter(r1)
            java.util.concurrent.Future r0 = r1.A09     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x004c
            r0 = 0
            goto L_0x0061
        L_0x004c:
            X.0u8 r0 = r1.A06     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x005d
            int r0 = r1.A00     // Catch:{ all -> 0x006b }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x006b }
            X.C17030uB.A00(r1)     // Catch:{ all -> 0x006b }
            r1.A01()     // Catch:{ all -> 0x006b }
            goto L_0x0060
        L_0x005d:
            r1.A01()     // Catch:{ all -> 0x006d }
        L_0x0060:
            r0 = 1
        L_0x0061:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0027
            X.0Lp r1 = r2.A0D
            java.lang.Integer r0 = X.AnonymousClass006.A1C
            r1.A0F = r0
            return
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0070:
            X.0eQ r1 = r2.A08
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "should_not_be_connected"
            r1.Bb7(r4, r0)
        L_0x0079:
            X.0uz r0 = X.C17490uz.KEEPALIVE_SHOULD_NOT_CONNECT
            r2.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KU.run():void");
    }
}
