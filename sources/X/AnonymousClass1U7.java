package X;

/* renamed from: X.1U7  reason: invalid class name */
public final class AnonymousClass1U7 extends AnonymousClass1j3 {
    public static final AnonymousClass49z A01 = new AnonymousClass49z();
    public final GJX A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r4 = this;
            java.lang.String r3 = ""
            X.GJX r0 = r4.A00     // Catch:{ IOException | NullPointerException -> 0x0034 }
            X.8rm r0 = r0.A00()     // Catch:{ IOException | NullPointerException -> 0x0034 }
            java.io.InputStream r2 = r0.AUn()     // Catch:{ IOException | NullPointerException -> 0x0034 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException | NullPointerException -> 0x0034 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException | NullPointerException -> 0x0034 }
            r0.<init>(r2, r1)     // Catch:{ IOException | NullPointerException -> 0x0034 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException | NullPointerException -> 0x0034 }
            r2.<init>(r0)     // Catch:{ IOException | NullPointerException -> 0x0034 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
        L_0x001d:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0027
            r1.append(r0)     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x0027:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ IOException | NullPointerException -> 0x0034 }
            return r0
        L_0x002f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ IOException | NullPointerException -> 0x0034 }
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U7.A00():java.lang.String");
    }

    public final boolean isOk() {
        GJX gjx = this.A00;
        if (gjx == null || gjx.A02 != 200) {
            return false;
        }
        return true;
    }

    public AnonymousClass1U7(GJX gjx) {
        this.A00 = gjx;
    }
}
