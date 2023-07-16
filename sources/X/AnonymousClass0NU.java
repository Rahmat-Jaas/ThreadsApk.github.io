package X;

import java.util.Map;

/* renamed from: X.0NU  reason: invalid class name */
public final class AnonymousClass0NU implements Runnable {
    public final /* synthetic */ AnonymousClass0NV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r4 = 0
            X.0NV r5 = r7.A00     // Catch:{ Exception -> 0x011b }
            X.0bV r1 = r5.A00     // Catch:{ Exception -> 0x011b }
            if (r1 != 0) goto L_0x001b
            java.lang.String r0 = r5.A01     // Catch:{ Exception -> 0x011b }
            android.net.Uri r3 = X.C15430rJ.A01(r0)     // Catch:{ Exception -> 0x011b }
            r1 = 0
            X.0bX r0 = new X.0bX     // Catch:{ Exception -> 0x011b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011b }
            X.0bV r1 = new X.0bV     // Catch:{ Exception -> 0x011b }
            r1.<init>(r3, r0, r4)     // Catch:{ Exception -> 0x011b }
            r5.A00 = r1     // Catch:{ Exception -> 0x011b }
        L_0x001b:
            android.app.Application r0 = X.AnonymousClass0NV.A07     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r1.A00(r0)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r1 = r7.A01     // Catch:{ Exception -> 0x011b }
            java.util.Map r0 = r7.A02     // Catch:{ Exception -> 0x011b }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ Exception -> 0x011b }
            r4.<init>()     // Catch:{ Exception -> 0x011b }
            r4.putAll(r0)     // Catch:{ Exception -> 0x011b }
            X.0ON r0 = X.AnonymousClass0MU.A6J     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x011b }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x011b }
            java.lang.String r2 = "ig.ig_server_rev_hash"
            java.lang.String r1 = X.C02640Cf.A01(r2)     // Catch:{ Exception -> 0x011b }
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x004f
        L_0x0049:
            java.lang.String r1 = java.lang.System.getProperty(r2)     // Catch:{ Exception -> 0x011b }
            if (r1 == 0) goto L_0x005e
        L_0x004f:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x005e
            X.0ON r0 = X.AnonymousClass0MU.A5U     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x011b }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x011b }
        L_0x005e:
            java.lang.String r2 = "fb.report_source"
            java.lang.String r1 = X.C02640Cf.A01(r2)     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = ""
            boolean r0 = r1.equals(r3)     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = java.lang.System.getProperty(r2)     // Catch:{ Exception -> 0x011b }
            if (r1 == 0) goto L_0x00f1
        L_0x0072:
            boolean r0 = r1.equals(r3)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x00f1
            X.0ON r0 = X.AnonymousClass0MU.A8D     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x011b }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x011b }
            X.AnonymousClass0NV.A01()     // Catch:{ Exception -> 0x011b }
            java.io.File r0 = X.AnonymousClass0NV.A08     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r6 = X.AnonymousClass0NV.A0D     // Catch:{ Exception -> 0x011b }
            monitor-enter(r6)     // Catch:{ Exception -> 0x011b }
            java.io.File r1 = X.AnonymousClass0NV.A08     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "report_source"
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "report_source_ref.txt"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x011b }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x011b }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x00e0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            r6.<init>()     // Catch:{ Exception -> 0x011b }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00d5 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00d5 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00d5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00d5 }
        L_0x00af:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00be
            r6.append(r0)     // Catch:{ all -> 0x00cd }
            r0 = 10
            r6.append(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00af
        L_0x00be:
            X.0ON r0 = X.AnonymousClass0MU.A8F     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00cd }
            r4.put(r1, r0)     // Catch:{ all -> 0x00cd }
            r2.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e0
        L_0x00cd:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            throw r0     // Catch:{ IOException -> 0x00d5 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ Exception -> 0x011b }
        L_0x00d5:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Failed to read report source ref"
            X.AnonymousClass0LU.A0H(r1, r0, r2)     // Catch:{ Exception -> 0x011b }
        L_0x00e0:
            java.lang.String r0 = "fb.testing.build_target"
            java.lang.String r1 = X.C02640Cf.A01(r0)     // Catch:{ Exception -> 0x011b }
            boolean r0 = r1.equals(r3)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "mobile_build_target"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x011b }
        L_0x00f1:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x011b }
            r3.<init>()     // Catch:{ Exception -> 0x011b }
            X.0bV r2 = r5.A00     // Catch:{ Exception -> 0x011b }
            X.0Y4 r1 = new X.0Y4     // Catch:{ Exception -> 0x011b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x011b }
            r0 = 1
            r2.A01(r1, r3, r0)     // Catch:{ Exception -> 0x011b }
            java.util.Collection r0 = r3.values()     // Catch:{ Exception -> 0x011b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x011b }
        L_0x0109:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x011b }
            if (r0 == 0) goto L_0x0126
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x011b }
            X.09E r0 = (X.AnonymousClass09E) r0     // Catch:{ Exception -> 0x011b }
            java.io.InputStream r0 = r0.A01     // Catch:{ Exception -> 0x011b }
            r0.close()     // Catch:{ Exception -> 0x011b }
            goto L_0x0109
        L_0x011b:
            r2 = move-exception
            X.C04790Pd.A00()
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Failed to send direct report"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NU.run():void");
    }

    public AnonymousClass0NU(AnonymousClass0NV r1, String str, Map map) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = map;
    }
}
