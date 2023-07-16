package X;

/* renamed from: X.0gS  reason: invalid class name */
public final class AnonymousClass0gS {
    public static volatile AnonymousClass0gS A02;
    public boolean A00 = false;
    public final Object A01 = new Object();

    public static AnonymousClass0gS A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0gS.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0gS();
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A01
            monitor-enter(r1)
            boolean r0 = r2.A00     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x0009:
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000c }
        L_0x000c:
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0gS.A01(long):void");
    }
}
