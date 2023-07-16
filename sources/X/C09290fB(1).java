package X;

/* renamed from: X.0fB  reason: invalid class name and case insensitive filesystem */
public final class C09290fB extends AnonymousClass0gG {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r1 != null) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.0OK r1 = X.C08470dV.A01
            X.0Q4 r0 = r1.A01
            if (r0 == 0) goto L_0x00d9
            X.0Mg r0 = r1.A02()
            r6 = 0
            X.C04220Ms.A0B(r0, r6)
            X.0lf r1 = X.C12300lf.A00()
            X.0Q4 r8 = r0.A02
            java.io.File r7 = r8.A04
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r7, r0)
            java.util.concurrent.locks.Lock r5 = r1.A05
            r5.lock()
            r1.A00 = r7     // Catch:{ all -> 0x00d4 }
            r4 = 0
            java.util.Map r0 = r1.A04     // Catch:{ all -> 0x00d4 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00d4 }
            X.0ld r2 = (X.C12280ld) r2     // Catch:{ all -> 0x00d4 }
            int r1 = r4 + 1
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00d4 }
            r2.BQL(r7, r0)     // Catch:{ all -> 0x00d4 }
            r4 = r1
            goto L_0x002d
        L_0x0044:
            r5.unlock()
            java.lang.String r0 = r8.A06
            java.io.File[] r7 = r8.A04(r0)
            int r5 = r7.length
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r3 = 0
        L_0x0054:
            if (r3 >= r5) goto L_0x00bd
            r2 = r7[r3]
            X.0Ni r1 = X.C04370Ni.A01
            if (r1 == 0) goto L_0x00b5
            r0 = 0
            java.lang.String r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "null"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "java"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "anr"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "oom"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "native"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "fg_unexplained"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x00ae
        L_0x0093:
            java.lang.Integer r9 = X.AnonymousClass006.A01
        L_0x0095:
            java.lang.String r0 = "null"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "fg_"
            boolean r8 = r1.contains(r0)
        L_0x00a3:
            X.0wG r0 = new X.0wG
            r0.<init>(r2, r9, r1, r8)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x00ae:
            java.lang.Integer r9 = X.AnonymousClass006.A00
            if (r1 == 0) goto L_0x00b3
            goto L_0x0095
        L_0x00b3:
            r8 = 0
            goto L_0x00a3
        L_0x00b5:
            java.lang.String r1 = "Did you call PreviousSessionHelper.init?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            X.0lf r2 = X.C12300lf.A00()     // Catch:{ all -> 0x00d9 }
            X.0wG[] r0 = new X.C18150wG[r6]     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r1 = r4.toArray(r0)     // Catch:{ all -> 0x00d9 }
            X.0wG[] r1 = (X.C18150wG[]) r1     // Catch:{ all -> 0x00d9 }
            int r0 = r1.length     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x00d9 }
            X.0wG[] r0 = (X.C18150wG[]) r0     // Catch:{ all -> 0x00d9 }
            r2.A02(r0)     // Catch:{ all -> 0x00d9 }
            return
        L_0x00d4:
            r0 = move-exception
            r5.unlock()
            throw r0
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09290fB.run():void");
    }

    public C09290fB() {
        super(976870670, 5, true, false);
    }
}
