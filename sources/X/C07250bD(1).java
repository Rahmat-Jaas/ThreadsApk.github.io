package X;

import android.app.Application;

/* renamed from: X.0bD  reason: invalid class name and case insensitive filesystem */
public final class C07250bD implements AnonymousClass0PC {
    public final Application A00;
    public final C04100Mg A01;
    public final AnonymousClass0Q4 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (r5 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        if (X.AnonymousClass0NO.A04(X.AnonymousClass006.A0C, X.AnonymousClass0NO.A00(r7, r6, r3)) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (r6 != '9') goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (X.AnonymousClass0NO.A01(r14) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r6 == '0') goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r3 = new X.C04170Mn((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.A03(X.AnonymousClass0MU.A4b, "native_crash");
        r3.A02(X.AnonymousClass0MU.A1K, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        r2 = X.AnonymousClass0MU.A2y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r5 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        r0 = r5.lastModified();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        r3.A02(r2, java.lang.Long.valueOf(r0 / 1000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        r0 = r8.lastModified();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        if (r5 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        r3.A02(X.AnonymousClass0MU.A25, java.lang.Long.valueOf(r5.lastModified()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fe, code lost:
        X.C04790Pd.A00();
        r3.A03(X.AnonymousClass0MU.A5Z, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        if (r5 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        r3.A00(X.AnonymousClass0MU.A0A, r1);
        r2 = r15.A01;
        r0 = X.AnonymousClass0ND.CRITICAL_REPORT;
        r2.A0C(r0, r15);
        r2.A06(r3, r0, r15);
        r2.A0B(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011f, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0121, code lost:
        r0 = X.AnonymousClass0MY.A0B;
        r1 = X.AnonymousClass0ND.LARGE_REPORT;
        r3.A04(r0, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0128, code lost:
        if (r4 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        r3.A04(X.AnonymousClass0MY.A0A, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        r2.A0C(r1, r15);
        r2.A06(r3, r1, r15);
        r2.A0B(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0138, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0139, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r15 = this;
            X.0Q4 r1 = r15.A02
            java.lang.String r0 = r1.A06
            java.io.File r4 = r1.A02(r0)
            if (r4 == 0) goto L_0x013b
            java.lang.String r0 = "state.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            X.0NN r0 = new X.0NN
            r0.<init>(r1)
            char r14 = r0.A02()
            char r7 = r0.A03()
            java.lang.String r0 = "native_state.txt"
            java.io.File r8 = new java.io.File
            r8.<init>(r4, r0)
            X.0NJ r2 = new X.0NJ
            r2.<init>(r8)
            java.lang.String r0 = "anr_state.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            X.0NJ r0 = new X.0NJ
            r0.<init>(r1)
            char r6 = r2.A01()
            char r3 = r0.A01()
            android.app.Application r1 = r15.A00
            java.lang.String r0 = r4.getName()
            java.io.File r5 = X.AnonymousClass0O5.A00(r1, r0)
            java.lang.String r9 = "lacrima"
            r2 = 0
            if (r5 == 0) goto L_0x008b
            long r12 = r5.length()
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0091 }
            r10.<init>(r5, r0)     // Catch:{ all -> 0x0091 }
            X.09U r1 = new X.09U     // Catch:{ all -> 0x0086 }
            r1.<init>(r10)     // Catch:{ all -> 0x0086 }
            X.0ON r0 = X.AnonymousClass0MU.A6I     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.A01(r0)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0082
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0086 }
            r4.<init>(r1)     // Catch:{ all -> 0x0086 }
            boolean r0 = r4.isFile()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0082
            r10.close()     // Catch:{ all -> 0x0091 }
            goto L_0x00b4
        L_0x0082:
            r10.close()     // Catch:{ all -> 0x0091 }
            goto L_0x009a
        L_0x0086:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            java.lang.String r0 = "The minidump file is empty!"
            X.AnonymousClass0LU.A0C(r9, r0)
            goto L_0x009a
        L_0x0091:
            r1 = move-exception
            X.C04790Pd.A00()
            java.lang.String r0 = "Could not extract LogcatInterceptor File"
            X.AnonymousClass0LU.A0G(r9, r0, r1)
        L_0x009a:
            r4 = r2
            if (r5 != 0) goto L_0x00b4
        L_0x009d:
            char r1 = X.AnonymousClass0NO.A00(r7, r6, r3)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            boolean r0 = X.AnonymousClass0NO.A04(r0, r1)
            if (r0 == 0) goto L_0x013b
            r0 = 57
            if (r6 != r0) goto L_0x00bb
            boolean r0 = X.AnonymousClass0NO.A01(r14)
            if (r0 != 0) goto L_0x00bb
            return
        L_0x00b4:
            r5.getPath()
            r0 = 48
            if (r6 != r0) goto L_0x009d
        L_0x00bb:
            X.0Mn r3 = new X.0Mn
            r3.<init>(r2)
            X.0ON r1 = X.AnonymousClass0MU.A4b     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "native_crash"
            r3.A03(r1, r0)     // Catch:{ all -> 0x00fd }
            X.0OO r2 = X.AnonymousClass0MU.A1K     // Catch:{ all -> 0x00fd }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00fd }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fd }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00fd }
            X.0OO r2 = X.AnonymousClass0MU.A2y     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x00e8
            long r0 = r5.lastModified()     // Catch:{ all -> 0x00fd }
        L_0x00df:
            long r0 = r0 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fd }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00ed
        L_0x00e8:
            long r0 = r8.lastModified()     // Catch:{ all -> 0x00fd }
            goto L_0x00df
        L_0x00ed:
            if (r5 == 0) goto L_0x0139
            X.0OO r2 = X.AnonymousClass0MU.A25     // Catch:{ all -> 0x00fd }
            long r0 = r5.lastModified()     // Catch:{ all -> 0x00fd }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fd }
            r3.A02(r2, r0)     // Catch:{ all -> 0x00fd }
            goto L_0x010c
        L_0x00fd:
            r0 = move-exception
            X.C04790Pd.A00()
            X.0ON r1 = X.AnonymousClass0MU.A5Z
            java.lang.String r0 = r0.getMessage()
            r3.A03(r1, r0)
            if (r5 == 0) goto L_0x0139
        L_0x010c:
            r1 = 1
        L_0x010d:
            X.0OZ r0 = X.AnonymousClass0MU.A0A
            r3.A00(r0, r1)
            X.0Mg r2 = r15.A01
            X.0ND r0 = X.AnonymousClass0ND.CRITICAL_REPORT
            r2.A0C(r0, r15)
            r2.A06(r3, r0, r15)
            r2.A0B(r0, r15)
            if (r1 == 0) goto L_0x013b
            X.0MY r0 = X.AnonymousClass0MY.A0B
            X.0ND r1 = X.AnonymousClass0ND.LARGE_REPORT
            r3.A04(r0, r1, r5)
            if (r4 == 0) goto L_0x012f
            X.0MY r0 = X.AnonymousClass0MY.A0A
            r3.A04(r0, r1, r4)
        L_0x012f:
            r2.A0C(r1, r15)
            r2.A06(r3, r1, r15)
            r2.A0B(r1, r15)
            return
        L_0x0139:
            r1 = 0
            goto L_0x010d
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07250bD.start():void");
    }

    public C07250bD(Application application, C04100Mg r2, AnonymousClass0Q4 r3) {
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.NATIVE;
    }
}
