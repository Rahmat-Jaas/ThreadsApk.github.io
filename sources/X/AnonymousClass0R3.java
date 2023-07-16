package X;

import java.io.File;

/* renamed from: X.0R3  reason: invalid class name */
public final class AnonymousClass0R3 implements C04050Mb {
    public final File A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r5, X.AnonymousClass0ND r6) {
        /*
            r4 = this;
            X.0Z2 r0 = X.AnonymousClass0MI.A04
            if (r0 == 0) goto L_0x0043
            X.0ON r3 = X.AnonymousClass0MU.A5O
            java.io.File r2 = r4.A00
            if (r2 == 0) goto L_0x0028
            java.lang.String r0 = "navmodules.txt"
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0034 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0034 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0034 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0034 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0034 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0034 }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0040
        L_0x0023:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ IOException -> 0x0034 }
        L_0x0028:
            java.lang.StringBuilder r1 = r0.A06
            monitor-enter(r1)
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0031 }
            monitor-exit(r1)     // Catch:{ all -> 0x0031 }
            goto L_0x0040
        L_0x0031:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Reading granular exposures failed"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            X.C04790Pd.A00()
            r0 = 0
        L_0x0040:
            r5.A03(r3, r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0R3.CWp(X.0Mn, X.0ND):void");
    }

    public AnonymousClass0R3(File file) {
        this.A00 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0E;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }

    public AnonymousClass0R3() {
        this.A00 = null;
    }
}
