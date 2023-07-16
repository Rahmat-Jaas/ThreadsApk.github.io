package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.0iL  reason: invalid class name and case insensitive filesystem */
public final class C10440iL {
    public final C10320i9 A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r5 = this;
            X.0i9 r0 = r5.A00
            java.util.Set r1 = r0.A04()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "[]"
            return r0
        L_0x000f:
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            X.MIS r0 = X.C18987Aon.A00     // Catch:{ IOException -> 0x0058 }
            X.MMp r3 = r0.A04(r4)     // Catch:{ IOException -> 0x0058 }
            r3.A0I()     // Catch:{ all -> 0x0053 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0021:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0053 }
            X.0eT r1 = (X.C08890eT) r1     // Catch:{ all -> 0x0053 }
            boolean r0 = r5.A02     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0041
            X.0eR r0 = new X.0eR     // Catch:{ all -> 0x0053 }
            r0.<init>(r1)     // Catch:{ all -> 0x0053 }
            X.C08850eP.A00(r3, r0)     // Catch:{ all -> 0x0053 }
        L_0x0039:
            boolean r0 = r5.A01     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0021
            r0 = 0
            r1.A04 = r0     // Catch:{ all -> 0x0053 }
            goto L_0x0021
        L_0x0041:
            X.C08880eS.A04(r3, r1)     // Catch:{ all -> 0x0053 }
            goto L_0x0039
        L_0x0045:
            r3.A0F()     // Catch:{ all -> 0x0053 }
            r3.flush()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0053 }
            r3.close()     // Catch:{ IOException -> 0x0058 }
            return r0
        L_0x0053:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r0 = "invalid"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10440iL.A00():java.lang.String");
    }

    public final void A01() {
        C10320i9 r3 = this.A00;
        for (C08890eT r4 : r3.A04()) {
            if (!r4.A04) {
                C08800eK r5 = r4.A02;
                if (r5.A05.A01 == -1 && r5.A06.A01 == -1 && r5.A07.A01 == -1 && r5.A08.A01 == -1) {
                    synchronized (r3) {
                        C10320i9.A02(r3);
                        if (r3.A04.remove(r4.A03) != null) {
                            r3.A03.Ce3();
                        }
                    }
                }
            }
        }
    }

    public final void A02() {
        if (this.A01) {
            for (C08890eT r1 : this.A00.A04()) {
                r1.A04 = false;
            }
        }
    }

    public C10440iL(UserSession userSession, boolean z, boolean z2) {
        this.A00 = C10320i9.A00(userSession);
        this.A02 = z;
        this.A01 = z2;
    }
}
