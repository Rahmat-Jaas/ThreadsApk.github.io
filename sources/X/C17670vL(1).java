package X;

/* renamed from: X.0vL  reason: invalid class name and case insensitive filesystem */
public final class C17670vL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0P6 A01;
    public final /* synthetic */ C17630vH A02;
    public final /* synthetic */ C17550v8 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C17670vL(AnonymousClass0P6 r1, C17630vH r2, C17550v8 r3, Integer num, String str, byte[] bArr, int i) {
        this.A02 = r2;
        this.A05 = str;
        this.A06 = bArr;
        this.A04 = num;
        this.A00 = i;
        this.A03 = r3;
        this.A01 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            X.0vH r4 = r1.A02
            java.lang.String r9 = r1.A05
            byte[] r8 = r1.A06
            java.lang.Integer r0 = r1.A04
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0019;
                case 2: goto L_0x001b;
                default: goto L_0x0011;
            }
        L_0x0011:
            r7 = 0
        L_0x0012:
            int r6 = r1.A00
            X.0v8 r3 = r1.A03
            r16 = 0
            goto L_0x001d
        L_0x0019:
            r7 = 1
            goto L_0x0012
        L_0x001b:
            r7 = 2
            goto L_0x0012
        L_0x001d:
            X.C17630vH.A02(r4)     // Catch:{ all -> 0x012f }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x012f }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x012f }
            if (r1 != r0) goto L_0x0127
            java.lang.String r10 = ""
            r5 = r10
            r2 = r10
            java.lang.String r12 = "|"
            boolean r0 = r9.contains(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = "#"
            if (r0 == 0) goto L_0x0039
            int r1 = r9.indexOf(r12)     // Catch:{ all -> 0x012f }
            goto L_0x003d
        L_0x0039:
            int r1 = r9.indexOf(r11)     // Catch:{ all -> 0x012f }
        L_0x003d:
            if (r1 < 0) goto L_0x00f5
            if (r1 == 0) goto L_0x0045
            r0 = 0
            r9.substring(r0, r1)     // Catch:{ all -> 0x012f }
        L_0x0045:
            java.lang.String r14 = r9.substring(r1)     // Catch:{ all -> 0x012f }
            boolean r0 = r14.startsWith(r12)     // Catch:{ all -> 0x012f }
            r15 = 23
            r12 = 1
            if (r0 == 0) goto L_0x0085
            int r0 = r14.length()     // Catch:{ all -> 0x012f }
            r13 = 12
            if (r0 != r13) goto L_0x006f
            java.lang.String r12 = r14.substring(r12)     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00f5
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 11
            if (r1 != r0) goto L_0x00f5
            r10 = r12
            goto L_0x00f5
        L_0x006f:
            if (r0 != r15) goto L_0x0085
            java.lang.String r12 = r14.substring(r12, r13)     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00e2
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 11
            if (r1 != r0) goto L_0x00e2
            r10 = r12
            goto L_0x00e2
        L_0x0085:
            boolean r0 = r14.startsWith(r11)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x00f5
            int r1 = r14.length()     // Catch:{ all -> 0x012f }
            if (r1 != r15) goto L_0x00ab
            java.lang.String r12 = r14.substring(r12)     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r12.startsWith(r11)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00f5
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 22
            if (r1 != r0) goto L_0x00f5
            r5 = r12
            goto L_0x00f5
        L_0x00ab:
            r13 = 34
            r0 = 45
            if (r1 != r0) goto L_0x00f5
            java.lang.String r12 = r14.substring(r12, r15)     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r12.startsWith(r11)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00ca
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 22
            if (r1 != r0) goto L_0x00ca
            r5 = r12
        L_0x00ca:
            java.lang.String r12 = r14.substring(r15, r13)     // Catch:{ all -> 0x012f }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00dd
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 11
            if (r1 != r0) goto L_0x00dd
            r10 = r12
        L_0x00dd:
            java.lang.String r12 = r14.substring(r13)     // Catch:{ all -> 0x012f }
            goto L_0x00e6
        L_0x00e2:
            java.lang.String r12 = r14.substring(r13)     // Catch:{ all -> 0x012f }
        L_0x00e6:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x00f5
            int r1 = r12.length()     // Catch:{ all -> 0x012f }
            r0 = 11
            if (r1 != r0) goto L_0x00f5
            r2 = r12
        L_0x00f5:
            r12 = r10
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x0100
            java.lang.String r12 = X.AnonymousClass00U.A0L(r11, r5)     // Catch:{ all -> 0x012f }
        L_0x0100:
            android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0133 }
            X.0MO r0 = r4.A09     // Catch:{ all -> 0x0133 }
            r0.A05(r10, r5, r2)     // Catch:{ all -> 0x0133 }
            X.0pX r0 = r4.A0E     // Catch:{ all -> 0x0133 }
            r0.A03(r8, r7, r6, r9)     // Catch:{ all -> 0x0133 }
            X.0my r2 = r4.A0X     // Catch:{ all -> 0x0133 }
            if (r2 == 0) goto L_0x011d
            X.00d r0 = r2.A01     // Catch:{ all -> 0x0133 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0133 }
            X.0AA r0 = new X.0AA     // Catch:{ all -> 0x0133 }
            r0.<init>(r2)     // Catch:{ all -> 0x0133 }
            r1.post(r0)     // Catch:{ all -> 0x0133 }
        L_0x011d:
            if (r3 == 0) goto L_0x0150
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0133 }
            r3.CMz(r0)     // Catch:{ all -> 0x0133 }
            return
        L_0x0127:
            if (r3 == 0) goto L_0x0150
            java.lang.Integer r0 = X.AnonymousClass006.A15     // Catch:{ all -> 0x012f }
            r3.ByG(r0)     // Catch:{ all -> 0x012f }
            return
        L_0x012f:
            r2 = move-exception
            r12 = r16
            goto L_0x0134
        L_0x0133:
            r2 = move-exception
        L_0x0134:
            X.0uz r1 = X.C17490uz.A00(r2)
            X.0v7 r0 = X.C17540v7.PUBLISH
            X.C17630vH.A03(r4, r0, r1, r2)
            if (r3 == 0) goto L_0x014d
            java.lang.String r0 = r1.name()
            java.lang.Integer r0 = X.C17470ux.A00(r0)
            android.text.TextUtils.isEmpty(r12)
            r3.ByG(r0)
        L_0x014d:
            r2.getMessage()
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17670vL.run():void");
    }
}
