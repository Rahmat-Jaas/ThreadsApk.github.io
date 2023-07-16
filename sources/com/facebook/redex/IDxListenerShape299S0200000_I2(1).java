package com.facebook.redex;

import X.C04090Mf;

public class IDxListenerShape299S0200000_I2 implements C04090Mf {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxListenerShape299S0200000_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C9M(X.AnonymousClass0ND r13, X.AnonymousClass0PC r14) {
        /*
            r12 = this;
            int r0 = r12.A02
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r12.A00
            X.0OB r1 = (X.AnonymousClass0OB) r1
            java.lang.Object r0 = r12.A01
            X.0OK r0 = (X.AnonymousClass0OK) r0
            java.lang.Object r2 = r1.AFC(r0)
            X.0Mb r2 = (X.C04050Mb) r2
            if (r2 == 0) goto L_0x001d
            X.0Mg r1 = r0.A02()
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT
            X.C07220b8.A01(r2, r1, r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r4 = r12.A01
            X.0OK r4 = (X.AnonymousClass0OK) r4
            X.0Q4 r1 = r4.A03()
            X.0Q4 r0 = r4.A03()
            java.lang.String r0 = r0.A06
            java.io.File r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = r0.getName()
            r0 = 45
            int r0 = r1.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r8 = r1.substring(r0)
            X.0Ni r5 = X.C04370Ni.A01
            if (r5 == 0) goto L_0x00e0
            X.0Q4 r1 = r5.A00
            r6 = 0
            if (r1 == 0) goto L_0x00de
            java.lang.String r0 = ""
            java.io.File r3 = r1.A02(r0)
            if (r3 == 0) goto L_0x00de
            java.lang.String r0 = "state.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            X.0NN r0 = new X.0NN
            r0.<init>(r1)
            char r7 = r0.A02()
            char r2 = r0.A03()
            r0 = 99
            if (r7 == r0) goto L_0x007f
            r0 = 115(0x73, float:1.61E-43)
            if (r7 == r0) goto L_0x007f
            r0 = 114(0x72, float:1.6E-43)
            if (r7 == r0) goto L_0x007f
            r0 = 102(0x66, float:1.43E-43)
            r1 = 105(0x69, float:1.47E-43)
            if (r7 == r0) goto L_0x007d
            r0 = 112(0x70, float:1.57E-43)
            if (r7 != r0) goto L_0x00a8
        L_0x007d:
            if (r2 == r1) goto L_0x00a8
        L_0x007f:
            r11 = 1
        L_0x0080:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x00a6
            int r1 = r5.A01()
            if (r1 <= 0) goto L_0x00a6
            android.app.Application r0 = r4.A0L
            X.0Lx r0 = X.C04010Lx.A00(r0, r1)
            if (r0 == 0) goto L_0x00a6
            int r10 = r0.A03()
        L_0x0098:
            X.0Wk r6 = X.C05840Wk.A01
            android.app.Application r7 = r4.A0L
            java.lang.Object r0 = r12.A00
            X.0YO r0 = (X.AnonymousClass0YO) r0
            java.lang.String r9 = r0.A00
            r6.A00(r7, r8, r9, r10, r11)
            return
        L_0x00a6:
            r10 = -1
            goto L_0x0098
        L_0x00a8:
            X.0PD r2 = X.AnonymousClass0PD.ANR
            X.0ND r1 = X.AnonymousClass0ND.CRITICAL_REPORT
            java.lang.String r0 = "_prop.txt"
            java.lang.String r0 = X.C04100Mg.A00(r1, r2, r0, r6)
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00de
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00db }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00db }
            r3.load(r0)     // Catch:{ IOException -> 0x00db }
            java.lang.String r2 = "true"
            java.lang.String r1 = "anr_started_in_foreground_v2"
            java.lang.String r0 = "false"
            java.lang.String r0 = r3.getProperty(r1, r0)     // Catch:{ IOException -> 0x00db }
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x00db }
            if (r0 == 0) goto L_0x00de
            goto L_0x007f
        L_0x00db:
            X.C04790Pd.A00()
        L_0x00de:
            r11 = 0
            goto L_0x0080
        L_0x00e0:
            java.lang.String r1 = "Did you call PreviousSessionHelper.init?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxListenerShape299S0200000_I2.C9M(X.0ND, X.0PC):void");
    }
}
