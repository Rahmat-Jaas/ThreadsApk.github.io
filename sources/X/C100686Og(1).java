package X;

/* renamed from: X.6Og  reason: invalid class name and case insensitive filesystem */
public final class C100686Og {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C04220Ms.A0B(r6, 1);
        r0 = X.C18240wQ.A0f(r6, X.C121107Ed.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r0 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r2 = (X.C115436v4) X.C121107Ed.A02.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r1 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (r1 == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r1 == 1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r1 == 2) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r2.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r5 = X.C121107Ed.A04;
        r4 = X.AnonymousClass0wJ.A0v();
        r3 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if (r3.hasNext() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r2 = r3.next();
        r1 = (java.lang.String) r2;
        r0 = X.AnonymousClass00U.A0A(r6, '$');
        X.AnonymousClass0wJ.A1Y(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r1.startsWith(r0) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r4.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r2 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        throw X.C18180wK.A0a(X.AnonymousClass00U.A0L("Unknown experience outcome ", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r2.hasNext() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        r1 = X.C18180wK.A0k(r2);
        r0 = X.AnonymousClass77M.A00.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r5.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C63893iY r7) {
        /*
            r4 = 0
            X.C04220Ms.A0B(r7, r4)
            java.lang.Object r2 = X.C63893iY.A0B(r7, r4)
            r2.getClass()
            java.lang.String r0 = X.C86164wN.A0h(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            java.lang.Object r6 = X.C63893iY.A0C(r7, r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            X.7Ed r7 = X.C121107Ed.A00
            X.C04220Ms.A0B(r2, r4)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.C18220wO.A0u(r0, r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1348905847: goto L_0x0056;
                case 1951623110: goto L_0x004b;
                case 1967871671: goto L_0x0040;
                case 2012901275: goto L_0x0035;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.String r0 = "Unknown experience outcome "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0035:
            java.lang.String r0 = "DENIED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r1 = X.AnonymousClass006.A01
            goto L_0x0060
        L_0x0040:
            java.lang.String r0 = "APPROVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r1 = X.AnonymousClass006.A00
            goto L_0x0060
        L_0x004b:
            java.lang.String r0 = "BACKED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            goto L_0x0060
        L_0x0056:
            java.lang.String r0 = "DISMISSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r1 = X.AnonymousClass006.A0C
        L_0x0060:
            monitor-enter(r7)
            X.C04220Ms.A0B(r6, r3)     // Catch:{ all -> 0x00dc }
            java.util.HashMap r0 = X.C121107Ed.A01     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = X.C18240wQ.A0f(r6, r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x006d
            r6 = r0
        L_0x006d:
            java.util.HashMap r0 = X.C121107Ed.A02     // Catch:{ all -> 0x00dc }
            java.lang.Object r2 = r0.remove(r6)     // Catch:{ all -> 0x00dc }
            X.6v4 r2 = (X.C115436v4) r2     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x0092
            int r1 = r1.intValue()     // Catch:{ all -> 0x00dc }
            if (r1 == r4) goto L_0x008b
            if (r1 == r3) goto L_0x0087
            r0 = 2
            if (r1 == r0) goto L_0x0083
            goto L_0x008f
        L_0x0083:
            r2.A03()     // Catch:{ all -> 0x00dc }
            goto L_0x0092
        L_0x0087:
            r2.A02()     // Catch:{ all -> 0x00dc }
            goto L_0x0092
        L_0x008b:
            r2.A00()     // Catch:{ all -> 0x00dc }
            goto L_0x0092
        L_0x008f:
            r2.A01()     // Catch:{ all -> 0x00dc }
        L_0x0092:
            X.8AL r5 = X.C121107Ed.A04     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00dc }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x00dc }
        L_0x009c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00dc }
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00dc }
            r0 = 36
            java.lang.String r0 = X.AnonymousClass00U.A0A(r6, r0)     // Catch:{ all -> 0x00dc }
            X.AnonymousClass0wJ.A1Y(r1, r0)     // Catch:{ all -> 0x00dc }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x009c
            r4.add(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x009c
        L_0x00bc:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x00dc }
        L_0x00c0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r1 = X.C18180wK.A0k(r2)     // Catch:{ all -> 0x00dc }
            X.77M r0 = X.AnonymousClass77M.A00     // Catch:{ all -> 0x00dc }
            android.app.Activity r0 = r0.A00(r1)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d5
            r0.finish()     // Catch:{ all -> 0x00dc }
        L_0x00d5:
            r5.remove(r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00c0
        L_0x00d9:
            monitor-exit(r7)
            r0 = 0
            return r0
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100686Og.A00(X.3iY):java.lang.Object");
    }
}
