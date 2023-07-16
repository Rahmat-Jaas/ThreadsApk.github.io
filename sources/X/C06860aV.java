package X;

/* renamed from: X.0aV  reason: invalid class name and case insensitive filesystem */
public final class C06860aV implements AnonymousClass0PC {
    public final C04100Mg A00;
    public final AnonymousClass0Q4 A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012f, code lost:
        if ("true".equals(r4.getProperty(X.AnonymousClass0MU.A7p.A00)) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r13 = this;
            r3 = 1
            java.lang.Class r0 = r13.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r11 = "lacrima"
            java.lang.String r0 = "Start AnrAppDeathDetector... %s"
            X.AnonymousClass0LU.A0O(r11, r0, r1)
            X.0Q4 r1 = r13.A01
            java.lang.String r0 = r1.A06
            java.io.File r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x0139
            java.lang.String r1 = "state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            X.0NN r5 = new X.0NN
            r5.<init>(r0)
            java.lang.String r10 = ""
            r1 = 3
            com.facebook.redex.IDxFFilterShape519S0100000_I2 r0 = new com.facebook.redex.IDxFFilterShape519S0100000_I2
            r0.<init>(r13, r1)
            java.io.File[] r9 = r2.listFiles(r0)
            r8 = 0
            if (r9 == 0) goto L_0x006d
            r7 = -1
            int r6 = r9.length
            r4 = 0
        L_0x003c:
            if (r4 >= r6) goto L_0x006d
            r12 = r9[r4]
            java.lang.String r1 = r12.getName()     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r0 = "anr_report_"
            java.lang.String r1 = r1.replace(r0, r10)     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r0 = ".dmp"
            java.lang.String r0 = r1.replace(r0, r10)     // Catch:{ NumberFormatException -> 0x0059 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0059 }
            if (r0 <= r7) goto L_0x006a
            r8 = r12
            r7 = r0
            goto L_0x006a
        L_0x0059:
            r1 = move-exception
            java.lang.String r0 = r12.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Invalid anr report name %s"
            X.AnonymousClass0LU.A0O(r11, r0, r1)
            X.C04790Pd.A00()
        L_0x006a:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x006d:
            r4 = 0
            char r0 = r5.A02()
            boolean r9 = X.AnonymousClass0NO.A01(r0)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0091
            if (r9 != 0) goto L_0x0091
            java.util.Properties r4 = A00(r8)
            X.0OZ r0 = X.AnonymousClass0MU.A01
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r4.getProperty(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0091
            return
        L_0x0091:
            java.lang.String r0 = "anr_state.txt"
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r0)
            java.lang.String r1 = "native_state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            char r2 = X.AnonymousClass0NJ.A00(r0)
            char r1 = X.AnonymousClass0NJ.A00(r6)
            char r0 = r5.A03()
            X.AnonymousClass0NO.A02(r0, r2, r1)
            boolean r0 = X.AnonymousClass0NO.A02(r0, r2, r1)
            if (r0 == 0) goto L_0x0139
            r0 = 0
            X.0Mn r2 = new X.0Mn
            r2.<init>(r0)
            X.0OO r5 = X.AnonymousClass0MU.A2y
            if (r8 == 0) goto L_0x0134
            long r0 = r8.lastModified()
        L_0x00c2:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02(r5, r0)
            X.0OO r5 = X.AnonymousClass0MU.A1K
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02(r5, r0)
            if (r8 == 0) goto L_0x0132
            X.0MY r1 = X.AnonymousClass0MY.A02
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT
            r2.A04(r1, r0, r8)
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT
            r2.A04(r1, r0, r8)
            if (r4 != 0) goto L_0x00ee
            java.util.Properties r4 = A00(r8)
        L_0x00ee:
            if (r9 == 0) goto L_0x0113
            X.0ON r0 = X.AnonymousClass0MU.A7p
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r4.getProperty(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r3 = r3 ^ r0
        L_0x00ff:
            X.0OZ r0 = X.AnonymousClass0MU.A0A
            r2.A00(r0, r3)
            X.0Mg r1 = r13.A00
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT
            r1.A07(r2, r0, r13)
            if (r3 == 0) goto L_0x0139
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT
            r1.A07(r2, r0, r13)
            return
        L_0x0113:
            X.0OZ r0 = X.AnonymousClass0MU.A01
            java.lang.String r0 = r0.A00
            java.lang.String r0 = r4.getProperty(r0)
            java.lang.String r1 = "true"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0132
            X.0ON r0 = X.AnonymousClass0MU.A7p
            java.lang.String r0 = r0.A00
            java.lang.String r0 = r4.getProperty(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0132
            goto L_0x00ff
        L_0x0132:
            r3 = 0
            goto L_0x00ff
        L_0x0134:
            long r0 = r6.lastModified()
            goto L_0x00c2
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06860aV.start():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties A00(java.io.File r4) {
        /*
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            if (r4 == 0) goto L_0x0023
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0018 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0018 }
            r3.load(r1)     // Catch:{ all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0018 }
            return r3
        L_0x0013:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0017 }
        L_0x0017:
            throw r0     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Error while reading Anr report"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            X.C04790Pd.A00()
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06860aV.A00(java.io.File):java.util.Properties");
    }

    public C06860aV(C04100Mg r1, AnonymousClass0Q4 r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.ANR_APP_DEATH;
    }
}
