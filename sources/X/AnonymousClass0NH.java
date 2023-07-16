package X;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0NH  reason: invalid class name */
public final class AnonymousClass0NH extends C14910qO {
    public final ZipEntry A00;
    public final ZipFile A01;
    public final AnonymousClass08E[] A02;
    public final /* synthetic */ C007303e A03;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f3, code lost:
        r19.A01 = (java.lang.String[]) r9.toArray(new java.lang.String[r9.size()]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        if (r2 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        r2 = r8.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0114, code lost:
        if (r2.hasNext() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        ((X.AnonymousClass08E) r2.next()).A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        r4.A02 = (X.AnonymousClass08E[]) r6.toArray(new X.AnonymousClass08E[r6.size()]);
        r4.A00 = r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0137 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df A[ADDED_TO_REGION, EDGE_INSN: B:77:0x00df->B:48:0x00df ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0NH(X.AnonymousClass0EA r19, X.C007303e r20) {
        /*
            r18 = this;
            r4 = r18
            r2 = r20
            r4.A03 = r2
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String[] r11 = X.C15000qX.A00()
            java.io.File r0 = r2.A02
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            r3.<init>(r0)
            java.lang.String r0 = "assets/lib/metadata.txt"
            java.util.zip.ZipEntry r1 = r3.getEntry(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0140 }
            java.util.zip.ZipEntry r5 = r3.getEntry(r0)     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x0138
            if (r5 == 0) goto L_0x0138
            java.io.InputStream r2 = r3.getInputStream(r1)     // Catch:{ all -> 0x0140 }
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0131 }
            r9.<init>()     // Catch:{ all -> 0x0131 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0131 }
            r1.<init>(r2)     // Catch:{ all -> 0x0131 }
            java.io.BufferedReader r17 = new java.io.BufferedReader     // Catch:{ all -> 0x0131 }
            r0 = r17
            r0.<init>(r1)     // Catch:{ all -> 0x0131 }
            r0 = 32
            android.text.TextUtils$SimpleStringSplitter r12 = new android.text.TextUtils$SimpleStringSplitter     // Catch:{ all -> 0x0131 }
            r12.<init>(r0)     // Catch:{ all -> 0x0131 }
        L_0x004a:
            java.lang.String r15 = r17.readLine()     // Catch:{ all -> 0x0131 }
            if (r15 == 0) goto L_0x00f3
            int r0 = r15.length()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x004a
            r12.setString(r15)     // Catch:{ all -> 0x0131 }
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0078
            java.lang.String r7 = r12.next()     // Catch:{ all -> 0x0131 }
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = r12.next()     // Catch:{ all -> 0x0131 }
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r14 = r12.next()     // Catch:{ all -> 0x0131 }
            goto L_0x007b
        L_0x0078:
            r7 = 0
        L_0x0079:
            r1 = 0
        L_0x007a:
            r14 = 0
        L_0x007b:
            java.lang.String r13 = "]"
            java.lang.String r10 = "illegal line in compressed metadata: ["
            if (r7 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            if (r14 == 0) goto L_0x00df
            java.lang.String r0 = "assets/lib/"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)     // Catch:{ all -> 0x0131 }
            java.util.zip.ZipEntry r0 = r3.getEntry(r0)     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x004a
            int r16 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0131 }
            r0 = 47
            int r1 = r7.indexOf(r0)     // Catch:{ all -> 0x0131 }
            r0 = -1
            if (r1 == r0) goto L_0x00e9
            r0 = 0
            java.lang.String r13 = r7.substring(r0, r1)     // Catch:{ all -> 0x0131 }
            int r0 = r1 + 1
            java.lang.String r10 = r7.substring(r0)     // Catch:{ all -> 0x0131 }
            r7 = 0
        L_0x00aa:
            int r0 = r11.length     // Catch:{ all -> 0x0131 }
            if (r7 >= r0) goto L_0x00c7
            r0 = r11[r7]     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x00c4
            r0 = r11[r7]     // Catch:{ all -> 0x0131 }
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x00c4
        L_0x00b9:
            X.08E r1 = new X.08E     // Catch:{ all -> 0x0131 }
            r0 = r16
            r1.<init>(r10, r14, r0, r7)     // Catch:{ all -> 0x0131 }
            r6.add(r1)     // Catch:{ all -> 0x0131 }
            goto L_0x00c9
        L_0x00c4:
            int r7 = r7 + 1
            goto L_0x00aa
        L_0x00c7:
            r7 = -1
            goto L_0x00b9
        L_0x00c9:
            if (r7 < 0) goto L_0x004a
            r9.add(r13)     // Catch:{ all -> 0x0131 }
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x0131 }
            X.08E r0 = (X.AnonymousClass08E) r0     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x00da
            int r0 = r0.A01     // Catch:{ all -> 0x0131 }
            if (r7 >= r0) goto L_0x004a
        L_0x00da:
            r8.put(r10, r1)     // Catch:{ all -> 0x0131 }
            goto L_0x004a
        L_0x00df:
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r15, r13)     // Catch:{ all -> 0x0131 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0131 }
            r1.<init>(r0)     // Catch:{ all -> 0x0131 }
            goto L_0x00f2
        L_0x00e9:
            java.lang.String r0 = X.AnonymousClass00U.A0V(r10, r15, r13)     // Catch:{ all -> 0x0131 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0131 }
            r1.<init>(r0)     // Catch:{ all -> 0x0131 }
        L_0x00f2:
            throw r1     // Catch:{ all -> 0x0131 }
        L_0x00f3:
            int r0 = r9.size()     // Catch:{ all -> 0x0131 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0131 }
            java.lang.Object[] r0 = r9.toArray(r0)     // Catch:{ all -> 0x0131 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0131 }
            r1 = r19
            r1.A01 = r0     // Catch:{ all -> 0x0131 }
            if (r2 == 0) goto L_0x0108
            r2.close()     // Catch:{ all -> 0x0140 }
        L_0x0108:
            java.util.Collection r0 = r8.values()     // Catch:{ all -> 0x0140 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0110:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0140 }
            X.08E r1 = (X.AnonymousClass08E) r1     // Catch:{ all -> 0x0140 }
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x0140 }
            goto L_0x0110
        L_0x0120:
            int r0 = r6.size()     // Catch:{ all -> 0x0140 }
            X.08E[] r0 = new X.AnonymousClass08E[r0]     // Catch:{ all -> 0x0140 }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x0140 }
            X.08E[] r0 = (X.AnonymousClass08E[]) r0     // Catch:{ all -> 0x0140 }
            r4.A02 = r0     // Catch:{ all -> 0x0140 }
            r4.A00 = r5     // Catch:{ all -> 0x0140 }
            goto L_0x013d
        L_0x0131:
            r0 = move-exception
            if (r2 == 0) goto L_0x0137
            r2.close()     // Catch:{ all -> 0x0137 }
        L_0x0137:
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0138:
            r0 = 0
            X.08E[] r0 = new X.AnonymousClass08E[r0]     // Catch:{ all -> 0x0140 }
            r4.A02 = r0     // Catch:{ all -> 0x0140 }
        L_0x013d:
            r4.A01 = r3     // Catch:{ all -> 0x0140 }
            return
        L_0x0140:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NH.<init>(X.0EA, X.03e):void");
    }

    public final C14950qS A00() {
        return new C14950qS(this.A02);
    }

    public final C14920qP A01() {
        if (this.A00 == null) {
            return new C18100w9();
        }
        return new C11020jL(this);
    }

    public final void close() {
        this.A01.close();
    }
}
