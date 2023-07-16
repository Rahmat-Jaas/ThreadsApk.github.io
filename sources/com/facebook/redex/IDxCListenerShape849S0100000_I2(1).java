package com.facebook.redex;

import X.C04410Nm;

public class IDxCListenerShape849S0100000_I2 implements C04410Nm {
    public Object A00;
    public final int A01;

    public IDxCListenerShape849S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        r5 = r8.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r9 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r15 == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4 = r8.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r4 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r4.A00.A07(new X.C04170Mn((java.lang.Throwable) null), X.AnonymousClass0ND.CRITICAL_REPORT, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bzu(boolean r17) {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A01
            r4 = r17
            if (r0 == 0) goto L_0x00b5
            java.lang.Class<X.0MI> r3 = X.AnonymousClass0MI.class
            monitor-enter(r3)
            boolean r0 = X.AnonymousClass0MI.A06     // Catch:{ all -> 0x00b2 }
            if (r4 == r0) goto L_0x0022
            X.AnonymousClass0MI.A06 = r17     // Catch:{ all -> 0x00b2 }
            java.util.Set r0 = X.AnonymousClass0MI.A02     // Catch:{ all -> 0x00b2 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00b2 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b2 }
            java.util.concurrent.ExecutorService r1 = X.AnonymousClass0MI.A03     // Catch:{ all -> 0x00b2 }
            X.0MA r0 = new X.0MA     // Catch:{ all -> 0x00b2 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x00b2 }
            r1.execute(r0)     // Catch:{ all -> 0x00b2 }
        L_0x0022:
            monitor-exit(r3)
            java.lang.Object r0 = r5.A00
            X.0Z2 r0 = (X.AnonymousClass0Z2) r0
            r0.A05 = r4
            X.0M4 r8 = r0.A01
            r10 = r17 ^ 1
            monitor-enter(r8)
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00af }
            boolean r0 = r8.A09     // Catch:{ all -> 0x00af }
            r4 = 1
            r9 = 0
            if (r0 == 0) goto L_0x004e
            r8.A08 = r10     // Catch:{ all -> 0x00af }
            if (r10 == 0) goto L_0x0044
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00af }
            r8.A00 = r0     // Catch:{ all -> 0x00af }
            goto L_0x004a
        L_0x0044:
            r8.A01 = r6     // Catch:{ all -> 0x00af }
            r8.A04 = r6     // Catch:{ all -> 0x00af }
            r8.A02 = r4     // Catch:{ all -> 0x00af }
        L_0x004a:
            r8.A09 = r9     // Catch:{ all -> 0x00af }
            monitor-exit(r8)     // Catch:{ all -> 0x00af }
            return
        L_0x004e:
            boolean r0 = r8.A08     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x007b
            if (r10 != 0) goto L_0x007b
            r15 = 1
            long r2 = r8.A02     // Catch:{ all -> 0x00af }
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00af }
            long r0 = r8.A00     // Catch:{ all -> 0x00af }
            long r11 = r11 - r0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x006d
            long r0 = r8.A03     // Catch:{ all -> 0x00af }
            long r0 = r0 + r4
            r8.A03 = r0     // Catch:{ all -> 0x00af }
        L_0x006d:
            long r0 = r8.A06     // Catch:{ all -> 0x00af }
            long r0 = r0 + r11
            r8.A06 = r0     // Catch:{ all -> 0x00af }
        L_0x0072:
            r8.A01 = r6     // Catch:{ all -> 0x00af }
            long r2 = r2 + r4
            r8.A02 = r2     // Catch:{ all -> 0x00af }
            goto L_0x008f
        L_0x0078:
            r8.A04 = r6     // Catch:{ all -> 0x00af }
            goto L_0x0072
        L_0x007b:
            r15 = 0
            if (r0 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            r9 = 1
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00af }
            r8.A00 = r0     // Catch:{ all -> 0x00af }
            long r2 = r8.A05     // Catch:{ all -> 0x00af }
            long r0 = r8.A01     // Catch:{ all -> 0x00af }
            long r6 = r6 - r0
            long r2 = r2 + r6
            r8.A05 = r2     // Catch:{ all -> 0x00af }
        L_0x008f:
            r8.A08 = r10     // Catch:{ all -> 0x00af }
            monitor-exit(r8)     // Catch:{ all -> 0x00af }
            java.lang.Object r5 = r8.A0A
            monitor-enter(r5)
            if (r9 != 0) goto L_0x0099
            if (r15 == 0) goto L_0x00aa
        L_0x0099:
            X.0aq r4 = r8.A07     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00aa
            X.0Mg r3 = r4.A00     // Catch:{ all -> 0x00ac }
            X.0ND r2 = X.AnonymousClass0ND.CRITICAL_REPORT     // Catch:{ all -> 0x00ac }
            r1 = 0
            X.0Mn r0 = new X.0Mn     // Catch:{ all -> 0x00ac }
            r0.<init>(r1)     // Catch:{ all -> 0x00ac }
            r3.A07(r0, r2, r4)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            return
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r0
        L_0x00af:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00af }
            throw r0
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00b5:
            java.util.List r0 = X.AnonymousClass0P0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            X.0Nm r0 = (X.C04410Nm) r0
            r0.Bzu(r4)
            goto L_0x00bb
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape849S0100000_I2.Bzu(boolean):void");
    }
}
