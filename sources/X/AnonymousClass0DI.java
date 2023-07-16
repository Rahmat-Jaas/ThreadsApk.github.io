package X;

/* renamed from: X.0DI  reason: invalid class name */
public final class AnonymousClass0DI implements Runnable {
    public boolean A00 = true;
    public final AnonymousClass0DJ A01;
    public final /* synthetic */ AnonymousClass0DJ A02;
    public final /* synthetic */ AnonymousClass0DK A03;

    public AnonymousClass0DI(AnonymousClass0DJ r2, AnonymousClass0DK r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r13 = r32
            X.0DK r12 = r13.A03
            boolean r0 = r13.A00
            X.0DJ r11 = r13.A01
            java.lang.String r18 = "CpuSpinScheduler"
            if (r0 == 0) goto L_0x001f
            X.0BW r6 = r12.A01
            long r0 = r11.A01
            double r4 = (double) r0
            long r0 = r11.A02
            double r2 = (double) r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r0
            r6.A00 = r4
            double r2 = r2 / r0
            r6.A01 = r2
            r0 = 0
            r6.A04 = r0
        L_0x001f:
            X.0BW r8 = r12.A01     // Catch:{ 0DL -> 0x014b }
            boolean r9 = r8.A04     // Catch:{ 0DL -> 0x014b }
            r14 = 0
            r8.A04 = r14     // Catch:{ 0DL -> 0x014b }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 0DL -> 0x014b }
            long r0 = r8.A03     // Catch:{ 0DL -> 0x014b }
            long r6 = r2 - r0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x013b
            r8.A03 = r2     // Catch:{ 0DL -> 0x014b }
            X.0DV r0 = r8.A05     // Catch:{ 0DL -> 0x014b }
            X.0DW r0 = r0.A01()     // Catch:{ 0DL -> 0x014b }
            X.09R r0 = (X.AnonymousClass09R) r0     // Catch:{ 0DL -> 0x014b }
            if (r0 == 0) goto L_0x0143
            double r4 = r0.A03     // Catch:{ 0DL -> 0x014b }
            double r0 = r0.A02     // Catch:{ 0DL -> 0x014b }
            double r4 = r4 + r0
            X.0DV r0 = r8.A06     // Catch:{ 0DL -> 0x014b }
            X.0DW r10 = r0.A01()     // Catch:{ 0DL -> 0x014b }
            X.07Z r10 = (X.AnonymousClass07Z) r10     // Catch:{ 0DL -> 0x014b }
            if (r10 == 0) goto L_0x0133
            java.util.HashMap r0 = r10.A00     // Catch:{ 0DL -> 0x014b }
            boolean r0 = r0.isEmpty()     // Catch:{ 0DL -> 0x014b }
            if (r0 != 0) goto L_0x0133
            r17 = 1
            if (r9 == 0) goto L_0x012b
            java.util.HashMap r0 = r10.A00     // Catch:{ 0DL -> 0x014b }
            java.util.Collection r1 = r0.values()     // Catch:{ 0DL -> 0x014b }
            boolean r0 = r1.isEmpty()     // Catch:{ 0DL -> 0x014b }
            if (r0 != 0) goto L_0x0096
            java.util.Comparator r0 = X.AnonymousClass0BW.A07     // Catch:{ 0DL -> 0x014b }
            java.lang.Object r0 = java.util.Collections.max(r1, r0)     // Catch:{ 0DL -> 0x014b }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ 0DL -> 0x014b }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r15 = r0.first     // Catch:{ 0DL -> 0x014b }
            java.lang.Object r0 = r0.second     // Catch:{ 0DL -> 0x014b }
            X.09R r0 = (X.AnonymousClass09R) r0     // Catch:{ 0DL -> 0x014b }
            double r2 = r0.A03     // Catch:{ 0DL -> 0x014b }
            double r0 = r0.A02     // Catch:{ 0DL -> 0x014b }
            double r2 = r2 + r0
        L_0x007c:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ 0DL -> 0x014b }
            android.util.Pair r9 = new android.util.Pair     // Catch:{ 0DL -> 0x014b }
            r9.<init>(r15, r0)     // Catch:{ 0DL -> 0x014b }
            double r2 = (double) r6     // Catch:{ 0DL -> 0x014b }
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            double r0 = r8.A00     // Catch:{ 0DL -> 0x014b }
            double r0 = r0 * r2
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r31 = 0
            if (r6 <= 0) goto L_0x009c
            goto L_0x009a
        L_0x0096:
            r15 = 0
            r2 = 0
            goto L_0x007c
        L_0x009a:
            r31 = 1
        L_0x009c:
            java.lang.Object r0 = r9.second     // Catch:{ 0DL -> 0x014b }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 0DL -> 0x014b }
            double r15 = r0.doubleValue()     // Catch:{ 0DL -> 0x014b }
            double r0 = r8.A01     // Catch:{ 0DL -> 0x014b }
            double r0 = r0 * r2
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            r0 = 0
            if (r6 <= 0) goto L_0x00ad
            r0 = 1
        L_0x00ad:
            if (r31 != 0) goto L_0x00b1
            if (r0 == 0) goto L_0x012b
        L_0x00b1:
            int r0 = r8.A02     // Catch:{ 0DL -> 0x014b }
            int r0 = r0 + 1
            r8.A02 = r0     // Catch:{ 0DL -> 0x014b }
            java.util.HashMap r0 = r10.A00     // Catch:{ 0DL -> 0x014b }
            java.util.Collection r0 = r0.values()     // Catch:{ 0DL -> 0x014b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 0DL -> 0x014b }
            r6.<init>(r0)     // Catch:{ 0DL -> 0x014b }
            int r0 = r6.size()     // Catch:{ 0DL -> 0x014b }
            r1 = 2
            if (r0 < r1) goto L_0x0127
            java.util.Comparator r0 = X.AnonymousClass0BW.A07     // Catch:{ 0DL -> 0x014b }
            java.util.Collections.sort(r6, r0)     // Catch:{ 0DL -> 0x014b }
            int r0 = r6.size()     // Catch:{ 0DL -> 0x014b }
            int r0 = r0 - r1
            java.lang.Object r0 = r6.get(r0)     // Catch:{ 0DL -> 0x014b }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ 0DL -> 0x014b }
            if (r0 == 0) goto L_0x0127
            java.lang.Object r10 = r0.first     // Catch:{ 0DL -> 0x014b }
            java.lang.Object r0 = r0.second     // Catch:{ 0DL -> 0x014b }
            X.09R r0 = (X.AnonymousClass09R) r0     // Catch:{ 0DL -> 0x014b }
            double r6 = r0.A03     // Catch:{ 0DL -> 0x014b }
            double r0 = r0.A02     // Catch:{ 0DL -> 0x014b }
            double r6 = r6 + r0
        L_0x00e6:
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch:{ 0DL -> 0x014b }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ 0DL -> 0x014b }
            r1.<init>(r10, r0)     // Catch:{ 0DL -> 0x014b }
            int r7 = r8.A02     // Catch:{ 0DL -> 0x014b }
            double r4 = r4 / r2
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r14
            java.lang.Object r0 = r9.first     // Catch:{ 0DL -> 0x014b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 0DL -> 0x014b }
            java.lang.Object r6 = r9.second     // Catch:{ 0DL -> 0x014b }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ 0DL -> 0x014b }
            double r26 = r6.doubleValue()     // Catch:{ 0DL -> 0x014b }
            double r26 = r26 / r2
            double r26 = r26 * r14
            java.lang.Object r6 = r1.first     // Catch:{ 0DL -> 0x014b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 0DL -> 0x014b }
            java.lang.Object r1 = r1.second     // Catch:{ 0DL -> 0x014b }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 0DL -> 0x014b }
            double r28 = r1.doubleValue()     // Catch:{ 0DL -> 0x014b }
            double r28 = r28 / r2
            double r28 = r28 * r14
            X.0DM r1 = new X.0DM     // Catch:{ 0DL -> 0x014b }
            r21 = r6
            r22 = r2
            r24 = r4
            r30 = r7
            r19 = r1
            r20 = r0
            r19.<init>(r20, r21, r22, r24, r26, r28, r30, r31)     // Catch:{ 0DL -> 0x014b }
            goto L_0x012e
        L_0x0127:
            r10 = 0
            r6 = 0
            goto L_0x00e6
        L_0x012b:
            r1 = 0
            r8.A02 = r14     // Catch:{ 0DL -> 0x014b }
        L_0x012e:
            r0 = r17
            r8.A04 = r0     // Catch:{ 0DL -> 0x014b }
            goto L_0x0154
        L_0x0133:
            java.lang.String r0 = "Invalid thread CPU data"
            X.0DL r1 = new X.0DL     // Catch:{ 0DL -> 0x014b }
            r1.<init>(r0)     // Catch:{ 0DL -> 0x014b }
            goto L_0x014a
        L_0x013b:
            java.lang.String r0 = "timeElapsed <= 0"
            X.0DL r1 = new X.0DL     // Catch:{ 0DL -> 0x014b }
            r1.<init>(r0)     // Catch:{ 0DL -> 0x014b }
            goto L_0x014a
        L_0x0143:
            java.lang.String r0 = "Invalid process CPU data"
            X.0DL r1 = new X.0DL     // Catch:{ 0DL -> 0x014b }
            r1.<init>(r0)     // Catch:{ 0DL -> 0x014b }
        L_0x014a:
            throw r1     // Catch:{ 0DL -> 0x014b }
        L_0x014b:
            r2 = move-exception
            java.lang.String r1 = "CPU spin detection failed"
            r0 = r18
            android.util.Log.e(r0, r1, r2)
            goto L_0x015b
        L_0x0154:
            if (r1 == 0) goto L_0x015b
            X.0DH r0 = r12.A02
            r0.Cd0(r11, r1)
        L_0x015b:
            r0 = 0
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DI.run():void");
    }
}
