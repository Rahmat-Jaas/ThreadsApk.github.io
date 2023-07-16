package X;

import java.io.File;

/* renamed from: X.0V2  reason: invalid class name */
public final class AnonymousClass0V2 implements C04050Mb {
    public final File A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r6, X.AnonymousClass0ND r7) {
        /*
            r5 = this;
            java.io.File r1 = r5.A00
            java.lang.String r0 = "tls_report.txt"
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0071
            r2 = 8
            byte[] r3 = new byte[r2]
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException -> 0x006d }
            r1.<init>(r4)     // Catch:{ FileNotFoundException | IOException -> 0x006d }
            int r0 = r1.read(r3)     // Catch:{ all -> 0x0068 }
            r1.close()     // Catch:{ FileNotFoundException | IOException -> 0x006d }
            if (r0 == r2) goto L_0x0033
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "bytes_read"
            r2.put(r0, r1)
            X.C04790Pd.A00()
            return
        L_0x0033:
            r0 = 0
            byte r2 = r3[r0]
            r0 = 1
            byte r0 = r3[r0]
            int r0 = r0 << 8
            r2 = r2 | r0
            r0 = 2
            byte r0 = r3[r0]
            int r0 = r0 << 16
            r2 = r2 | r0
            r0 = 3
            byte r0 = r3[r0]
            int r1 = r0 << 24
            r1 = r1 | r2
            X.0OO r0 = X.AnonymousClass0MU.A2w
            r6.A01(r0, r1)
            r0 = 4
            byte r2 = r3[r0]
            r0 = 5
            byte r0 = r3[r0]
            int r0 = r0 << 8
            r2 = r2 | r0
            r0 = 6
            byte r0 = r3[r0]
            int r0 = r0 << 16
            r2 = r2 | r0
            r0 = 7
            byte r0 = r3[r0]
            int r1 = r0 << 24
            r1 = r1 | r2
            X.0OO r0 = X.AnonymousClass0MU.A2x
            r6.A01(r0, r1)
            return
        L_0x0068:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x006d }
        L_0x006d:
            X.C04790Pd.A00()
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0V2.CWp(X.0Mn, X.0ND):void");
    }

    public AnonymousClass0V2(File file) {
        this.A00 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A1B;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
