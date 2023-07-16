package X;

/* renamed from: X.0uC  reason: invalid class name and case insensitive filesystem */
public final class C17040uC {
    public static C17040uC A04;
    public String A00;
    public String A01;
    public Long A02;
    public Long A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
        if (r0 == null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Long A01(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0007
            java.lang.Long r0 = r2.A02     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
        L_0x0007:
            long r0 = X.AnonymousClass0Ix.A00()     // Catch:{ all -> 0x0013 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0013 }
            r2.A02 = r0     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17040uC.A01(boolean):java.lang.Long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
        if (r0 == null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Long A02(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0007
            java.lang.Long r0 = r2.A03     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
        L_0x0007:
            long r0 = X.AnonymousClass0Ix.A00()     // Catch:{ all -> 0x0013 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0013 }
            r2.A03 = r0     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17040uC.A02(boolean):java.lang.Long");
    }

    public final String A03(Boolean bool) {
        String str;
        if (bool == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        synchronized (this) {
            if (booleanValue) {
                str = this.A01;
                if (str == null) {
                    str = C03480Iw.A00().toString();
                    this.A01 = str;
                }
            } else {
                str = this.A00;
                if (str == null) {
                    str = C03480Iw.A00().toString();
                    this.A00 = str;
                }
            }
        }
        return str;
    }

    public static synchronized C17040uC A00() {
        C17040uC r0;
        synchronized (C17040uC.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new C17040uC();
                A04 = r0;
            }
        }
        return r0;
    }
}
