package X;

/* renamed from: X.0Ni  reason: invalid class name and case insensitive filesystem */
public final class C04370Ni {
    public static C04370Ni A01;
    public AnonymousClass0Q4 A00;

    static {
        new Object();
        new Object();
        new Object();
    }

    public static synchronized void A00(AnonymousClass0Q4 r2) {
        synchronized (C04370Ni.class) {
            if (A01 == null) {
                A01 = new C04370Ni(r2);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0034=Splitter:B:11:0x0034, B:17:0x003c=Splitter:B:17:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r5 = this;
            X.0Q4 r1 = r5.A00
            r4 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = r1.A06
            java.io.File r2 = r1.A02(r0)
            java.lang.String r3 = "lacrima"
            if (r2 == 0) goto L_0x0046
            java.lang.String r0 = "critical_suppl_startup_prop.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | NumberFormatException -> 0x003d }
            r0.<init>(r1)     // Catch:{ IOException | NumberFormatException -> 0x003d }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException | NumberFormatException -> 0x003d }
            r1.<init>(r0)     // Catch:{ IOException | NumberFormatException -> 0x003d }
            r2.load(r1)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "pid"
            java.lang.String r0 = r2.getProperty(r0)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0034
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r1.close()     // Catch:{ IOException | NumberFormatException -> 0x003d }
            return r4
        L_0x0038:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ IOException | NumberFormatException -> 0x003d }
        L_0x003d:
            r1 = move-exception
            X.C04790Pd.A00()
            java.lang.String r0 = "Error getting previous process id"
            X.AnonymousClass0LU.A0G(r3, r0, r1)
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04370Ni.A01():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(java.lang.Long r14) {
        /*
            r13 = this;
            X.0Q4 r1 = r13.A00
            if (r1 != 0) goto L_0x0007
            java.lang.String r0 = "sm_null"
        L_0x0006:
            return r0
        L_0x0007:
            java.lang.String r0 = r1.A06
            java.io.File r8 = r1.A02(r0)
            java.lang.String r0 = "psd_null"
            if (r8 == 0) goto L_0x0006
            java.lang.String r1 = "state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r1)
            X.0NN r1 = new X.0NN
            r1.<init>(r0)
            char r0 = r1.A02()
            boolean r12 = X.AnonymousClass0NO.A01(r0)
            char r5 = r1.A03()
            java.lang.String r1 = "native_state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r1)
            char r4 = X.AnonymousClass0NJ.A00(r0)
            java.lang.String r1 = "anr_state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r1)
            char r2 = X.AnonymousClass0NJ.A00(r0)
            java.lang.String r3 = "fg_"
            java.lang.String r11 = "bg_"
            if (r14 == 0) goto L_0x006a
            long r9 = r14.longValue()
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
            r6 = 1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 != 0) goto L_0x005d
            r3 = r11
        L_0x005d:
            r1.append(r3)
            java.lang.String r0 = "battery_death"
        L_0x0062:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x006a:
            char r1 = X.AnonymousClass0NO.A00(r5, r4, r2)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            boolean r0 = X.AnonymousClass0NO.A04(r0, r1)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "critical_suppl_java_detect_prop.txt"
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x00ba
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b7 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00b7 }
            r1.load(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "java_cause"
            java.lang.String r1 = r1.getProperty(r0)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "OutOfMemoryError"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ae
            r1 = r11
            if (r12 == 0) goto L_0x00a4
            r1 = r3
        L_0x00a4:
            java.lang.String r0 = "oom"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00b2 }
            r2.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x0120
        L_0x00ae:
            r2.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00ba
        L_0x00b2:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            throw r0     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            X.C04790Pd.A00()
        L_0x00ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 != 0) goto L_0x00c2
            r3 = r11
        L_0x00c2:
            r1.append(r3)
            java.lang.String r0 = "java"
            goto L_0x0062
        L_0x00c8:
            boolean r0 = X.AnonymousClass0NO.A02(r5, r4, r2)
            if (r0 == 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 != 0) goto L_0x00d6
            r3 = r11
        L_0x00d6:
            r1.append(r3)
            java.lang.String r0 = "anr"
            goto L_0x0062
        L_0x00dc:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            boolean r0 = X.AnonymousClass0NO.A04(r0, r1)
            if (r0 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 != 0) goto L_0x00ec
            r3 = r11
        L_0x00ec:
            r1.append(r3)
            java.lang.String r0 = "native"
            goto L_0x0062
        L_0x00f3:
            boolean r0 = X.AnonymousClass0NO.A03(r5, r4, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r0 == 0) goto L_0x0108
            r1.<init>()
            if (r12 != 0) goto L_0x0101
            r3 = r11
        L_0x0101:
            r1.append(r3)
            java.lang.String r0 = "unexplained"
            goto L_0x0062
        L_0x0108:
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "_null"
            goto L_0x0062
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04370Ni.A02(java.lang.Long):java.lang.String");
    }

    public C04370Ni(AnonymousClass0Q4 r1) {
        this.A00 = r1;
    }
}
