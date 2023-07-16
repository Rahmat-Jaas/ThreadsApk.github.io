package X;

/* renamed from: X.53C  reason: invalid class name */
public final class AnonymousClass53C extends AnonymousClass53I {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass53C(X.C134947yd r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r5 = X.C122127Kl.A04
            monitor-enter(r5)
            java.util.List r1 = X.C122127Kl.A06     // Catch:{ all -> 0x0033 }
            boolean r0 = X.C18190wL.A1a(r1)     // Catch:{ all -> 0x0033 }
            r4 = 0
            if (r0 == 0) goto L_0x002d
            java.util.ArrayList r3 = X.C18200wM.A0s(r1)     // Catch:{ all -> 0x0033 }
            r2 = 0
            int r1 = r3.size()     // Catch:{ all -> 0x0033 }
            r0 = 1
            if (r1 != r0) goto L_0x002b
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x0033 }
        L_0x0020:
            X.0YY r0 = (X.AnonymousClass0YY) r0     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r0 = X.C86154wM.A10(r3, r0)     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x002b:
            r0 = 0
            goto L_0x0020
        L_0x002d:
            r0 = r4
        L_0x002e:
            monitor-exit(r5)
            r6.<init>(r7, r4, r0, r8)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53C.<init>(X.7yd, int):void");
    }

    public final void A0A() {
        synchronized (C122127Kl.A04) {
            int i = this.A00;
            if (i >= 0) {
                C122127Kl.A0A(i);
                this.A00 = -1;
            }
        }
    }
}
