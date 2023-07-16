package X;

/* renamed from: X.7qf  reason: invalid class name and case insensitive filesystem */
public final class C130727qf implements C145528ke {
    public C127397h3 A00;
    public final C61043Rr A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r7.A0M().equals(r4) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C127397h3 A8m(X.C127397h3 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r6.A02
            java.lang.String r0 = r7.A0M()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r7.A0M()
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r5 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.7h3 r0 = r6.A00
            if (r0 != 0) goto L_0x005a
            r6.A00 = r7
        L_0x001e:
            java.util.LinkedList r0 = r7.A06
            if (r0 == 0) goto L_0x0059
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r3.next()
            X.6kz r1 = (X.C110016kz) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0042
            X.7h3 r0 = r6.A00
            if (r0 != 0) goto L_0x0054
            r6.A00 = r7
        L_0x0042:
            X.7h3 r0 = r6.A00
            if (r0 == 0) goto L_0x0026
            X.6jp r2 = r1.A01
            if (r2 == 0) goto L_0x0026
            X.3Rr r0 = r6.A01
            X.3iY r1 = X.C63893iY.A01
            X.601 r0 = r0.A00
            X.C61043Rr.A00(r0, r1, r2)
            goto L_0x0026
        L_0x0054:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x0059:
            return r7
        L_0x005a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130727qf.A8m(X.7h3):X.7h3");
    }

    public final void CRq(C127397h3 r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }

    public C130727qf(C61043Rr r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
