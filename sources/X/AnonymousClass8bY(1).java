package X;

/* renamed from: X.8bY  reason: invalid class name */
public final class AnonymousClass8bY extends C27219EgD {
    public final C112626pv A00 = new C112626pv();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1.A01 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C27952Ew2 r3) {
        /*
            r2 = this;
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.8bg r0 = X.C1370685y.A01()
            boolean r1 = r0.A04(r3)
            r0 = 1
            if (r1 != 0) goto L_0x001d
            X.6pv r1 = r2.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x001a
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r0 = r0 ^ 1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8bY.A04(X.Ew2):boolean");
    }

    public final void A05(Runnable runnable, C27952Ew2 ew2) {
        AnonymousClass0wJ.A1N(ew2, runnable);
        C112626pv r2 = this.A00;
        C141478bg A01 = C1370685y.A01();
        if (A01.A04(ew2) || r2.A00 || !r2.A01) {
            A01.A05(new AnonymousClass80O(r2, runnable), ew2);
        } else if (r2.A03.offer(runnable)) {
            r2.A00();
        } else {
            throw C18180wK.A0a("cannot enqueue any more runnables");
        }
    }
}
