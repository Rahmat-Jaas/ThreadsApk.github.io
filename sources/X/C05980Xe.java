package X;

import java.io.File;

/* renamed from: X.0Xe  reason: invalid class name and case insensitive filesystem */
public final class C05980Xe implements C04050Mb {
    public final int A00;
    public final AnonymousClass0ON A01;
    public final File A02;

    public C05980Xe(File file) {
        this.A01 = AnonymousClass0MU.A6E;
        this.A02 = file;
        this.A00 = 200;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r2 == null) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r8, X.AnonymousClass0ND r9) {
        /*
            r7 = this;
            java.lang.String r6 = "LogcatCollector"
            r4 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0088 }
            r2.<init>()     // Catch:{ IOException -> 0x0088 }
            java.lang.String r0 = "logcat"
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
            java.lang.String r0 = "-d"
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
            java.io.File r1 = r7.A02     // Catch:{ IOException -> 0x0088 }
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "-f"
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
            java.lang.String r0 = r1.getPath()     // Catch:{ IOException -> 0x0088 }
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
        L_0x0022:
            int r1 = r7.A00     // Catch:{ IOException -> 0x0088 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String r0 = "-t"
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0088 }
            r2.add(r0)     // Catch:{ IOException -> 0x0088 }
        L_0x0032:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0088 }
            int r0 = r2.size()     // Catch:{ IOException -> 0x0088 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IOException -> 0x0088 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ IOException -> 0x0088 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ IOException -> 0x0088 }
            java.lang.Process r0 = r1.exec(r0)     // Catch:{ IOException -> 0x0088 }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0088 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0088 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0088 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0088 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0088 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0088 }
            r5.<init>()     // Catch:{ IOException -> 0x0088 }
            r3 = 0
            r1 = 0
        L_0x005b:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0088 }
            if (r0 == 0) goto L_0x006c
            r5.add(r0)     // Catch:{ IOException -> 0x0088 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0088 }
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L_0x005b
        L_0x006c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0088 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0088 }
        L_0x0071:
            int r0 = r5.size()     // Catch:{ IOException -> 0x008b }
            if (r3 >= r0) goto L_0x00a4
            java.lang.Object r0 = r5.get(r3)     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x008b }
            r2.append(r0)     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ IOException -> 0x008b }
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0088:
            r1 = move-exception
            r2 = r4
            goto L_0x008c
        L_0x008b:
            r1 = move-exception
        L_0x008c:
            X.C04790Pd.A00()
            java.lang.String r0 = "LogCatCollector.collectLogcat could not retrieve data."
            android.util.Log.e(r6, r0, r1)
            if (r2 != 0) goto L_0x00a4
        L_0x0096:
            java.io.File r1 = r7.A02
            if (r1 != 0) goto L_0x00a9
            X.0ON r0 = r7.A01
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = "unknown"
        L_0x00a0:
            r8.A03(r0, r4)
            return
        L_0x00a4:
            java.lang.String r4 = r2.toString()
            goto L_0x0096
        L_0x00a9:
            X.0MY r0 = X.AnonymousClass0MY.A0A
            r8.A04(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05980Xe.CWp(X.0Mn, X.0ND):void");
    }

    public final Integer Awy() {
        return AnonymousClass006.A0I;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }

    public C05980Xe(int i) {
        this.A01 = AnonymousClass0MU.A6E;
        this.A02 = null;
        this.A00 = i;
    }

    public C05980Xe() {
        this.A01 = AnonymousClass0MU.A6E;
        this.A02 = null;
        this.A00 = -1;
    }
}
