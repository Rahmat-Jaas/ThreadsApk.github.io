package X;

/* renamed from: X.0Sd  reason: invalid class name and case insensitive filesystem */
public final class C05240Sd extends C14910qO {
    public final AnonymousClass0T2[] A00;
    public final /* synthetic */ C007903k A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        r5.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00be */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C05240Sd(X.C007903k r18, X.AnonymousClass0EA r19) {
        /*
            r17 = this;
            r16 = r17
            r1 = r18
            r0 = r16
            r0.A01 = r1
            r16.<init>()
            android.content.Context r0 = r1.A03
            java.lang.String r2 = "/data/local/tmp/exopackage/"
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "/native-libs/"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.io.File r13 = new java.io.File
            r13.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.lang.String[] r12 = X.C15000qX.A00()
            int r10 = r12.length
            r9 = 0
            r7 = 0
        L_0x002f:
            if (r7 >= r10) goto L_0x00c4
            r1 = r12[r7]
            java.io.File r6 = new java.io.File
            r6.<init>(r13, r1)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00a9
            r11.add(r1)
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x00a9
            java.io.FileReader r5 = new java.io.FileReader
            r5.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00bf }
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
        L_0x0058:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00a3
            int r0 = r2.length()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0058
            r0 = 32
            int r15 = r2.indexOf(r0)     // Catch:{ all -> 0x00ba }
            r0 = -1
            if (r15 == r0) goto L_0x00ac
            java.lang.String r1 = r2.substring(r9, r15)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = ".so"
            java.lang.String r3 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00ba }
            int r14 = r8.size()     // Catch:{ all -> 0x00ba }
            r1 = 0
        L_0x007c:
            if (r1 >= r14) goto L_0x008f
            java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x00ba }
            X.0T2 r0 = (X.AnonymousClass0T2) r0     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x0058
            int r1 = r1 + 1
            goto L_0x007c
        L_0x008f:
            int r0 = r15 + 1
            java.lang.String r2 = r2.substring(r0)     // Catch:{ all -> 0x00ba }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ba }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x00ba }
            X.0T2 r0 = new X.0T2     // Catch:{ all -> 0x00ba }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00ba }
            r8.add(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0058
        L_0x00a3:
            r4.close()     // Catch:{ all -> 0x00bf }
            r5.close()
        L_0x00a9:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x00ac:
            java.lang.String r1 = "illegal line in exopackage metadata: ["
            java.lang.String r0 = "]"
            java.lang.String r1 = X.AnonymousClass00U.A0V(r1, r2, r0)     // Catch:{ all -> 0x00ba }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ba }
            r0.<init>(r1)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            throw r0
        L_0x00c4:
            int r0 = r11.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r11.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r19
            r1.A01 = r0
            int r0 = r8.size()
            X.0T2[] r0 = new X.AnonymousClass0T2[r0]
            java.lang.Object[] r1 = r8.toArray(r0)
            X.0T2[] r1 = (X.AnonymousClass0T2[]) r1
            r0 = r16
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05240Sd.<init>(X.03k, X.0EA):void");
    }

    public final C14950qS A00() {
        return new C14950qS(this.A00);
    }

    public final C14920qP A01() {
        return new AnonymousClass0Ro(this);
    }
}
