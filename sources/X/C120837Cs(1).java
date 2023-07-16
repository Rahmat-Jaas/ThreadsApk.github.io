package X;

/* renamed from: X.7Cs  reason: invalid class name and case insensitive filesystem */
public final class C120837Cs {
    public static final C120837Cs A00;
    public static final String A01;

    static {
        C120837Cs r0 = new C120837Cs();
        A00 = r0;
        A01 = C18210wN.A0e(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair A00(java.io.File r9) {
        /*
            r9.getPath()
            java.lang.String r1 = r9.getName()
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "InShot"
            r3 = 1
            boolean r0 = X.AnonymousClass8bQ.A0p(r1, r0, r3)
            java.lang.String r5 = "unknown"
            java.lang.String r2 = "1"
            if (r0 == 0) goto L_0x0020
            java.lang.String r4 = "2"
        L_0x0019:
            boolean r0 = X.C04220Ms.A0I(r4, r2)
            if (r0 == 0) goto L_0x00bd
            goto L_0x0057
        L_0x0020:
            java.lang.String r1 = r9.getName()
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "YouCut"
            boolean r0 = X.AnonymousClass8bQ.A0p(r1, r0, r3)
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = "3"
            goto L_0x0019
        L_0x0032:
            java.lang.String r1 = r9.getName()
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "lv_"
            boolean r0 = X.AnonymousClass8bQ.A0p(r1, r0, r3)
            if (r0 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0019
        L_0x0043:
            java.lang.String r1 = r9.getName()
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "km_"
            boolean r0 = X.AnonymousClass8bQ.A0p(r1, r0, r3)
            if (r0 == 0) goto L_0x0055
            java.lang.String r4 = "4"
            goto L_0x0019
        L_0x0055:
            r4 = r5
            goto L_0x0019
        L_0x0057:
            r2 = 0
            long r0 = r9.length()     // Catch:{ all -> 0x00a1 }
            r8 = 8192(0x2000, float:1.14794E-41)
            long r6 = (long) r8     // Catch:{ all -> 0x00a1 }
            long r0 = r0 - r6
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x00a1 }
            byte[] r6 = new byte[r8]     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00a1 }
            r2.<init>(r9, r3)     // Catch:{ all -> 0x00a1 }
            r2.seek(r0)     // Catch:{ all -> 0x009a }
            r2.read(r6)     // Catch:{ all -> 0x009a }
            java.nio.charset.Charset r0 = X.AnonymousClass74V.A05     // Catch:{ all -> 0x009a }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x009a }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "{\"data\":"
            r0 = 0
            int r1 = X.AnonymousClass8bP.A0J(r3, r1, r0, r0)     // Catch:{ all -> 0x009a }
            r0 = 125(0x7d, float:1.75E-43)
            int r0 = X.AnonymousClass8bP.A0F(r3, r0)     // Catch:{ all -> 0x009a }
            X.8bH r0 = X.AnonymousClass8bH.A02(r1, r0)     // Catch:{ all -> 0x009a }
            int r1 = r0.A00     // Catch:{ all -> 0x009a }
            int r0 = r0.A01     // Catch:{ all -> 0x009a }
            int r0 = r0 + 1
            java.lang.String r3 = X.C18230wP.A0s(r3, r1, r0)     // Catch:{ all -> 0x009a }
            r2.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a7
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.0OW r3 = new X.0OW
            r3.<init>(r0)
        L_0x00a7:
            java.lang.Throwable r2 = X.AnonymousClass0OV.A00(r3)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r1 = A01
            java.lang.String r0 = "file_json_scan_error"
            X.AnonymousClass0LU.A0F(r1, r0, r2)
            X.C10450iM.A07(r0, r2)
        L_0x00b7:
            boolean r0 = r3 instanceof X.AnonymousClass0OW
            if (r0 == 0) goto L_0x00bc
            r3 = r5
        L_0x00bc:
            r5 = r3
        L_0x00bd:
            kotlin.Pair r0 = X.C18180wK.A0p(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120837Cs.A00(java.io.File):kotlin.Pair");
    }
}
