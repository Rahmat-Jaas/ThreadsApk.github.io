package X;

/* renamed from: X.7qg  reason: invalid class name and case insensitive filesystem */
public final class C130737qg implements C145528ke {
    public C127397h3 A00;
    public final C61043Rr A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.A0M().equals(r3) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C127397h3 A8m(X.C127397h3 r5) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A02
            java.lang.String r0 = r5.A0M()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r5.A0M()
            boolean r1 = r0.equals(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r2 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.7h3 r0 = r4.A00
            if (r0 != 0) goto L_0x0063
            r4.A00 = r5
        L_0x001e:
            java.util.LinkedList r0 = r5.A06
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            X.6kz r0 = (X.C110016kz) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0026
            X.7h3 r0 = r4.A00
            if (r0 != 0) goto L_0x005e
            r4.A00 = r5
        L_0x0042:
            X.7h3 r0 = r4.A00
            if (r0 == 0) goto L_0x005d
            r0 = 134(0x86, float:1.88E-43)
            X.6jp r2 = r5.A0L(r0)
            if (r2 == 0) goto L_0x005d
            X.3VO r0 = X.C86124wJ.A0d(r5)
            X.3iY r1 = r0.A01()
            X.3Rr r0 = r4.A01
            X.601 r0 = r0.A00
            X.C61043Rr.A00(r0, r1, r2)
        L_0x005d:
            return r5
        L_0x005e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0063:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130737qg.A8m(X.7h3):X.7h3");
    }

    public final void CRq(C127397h3 r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }

    public C130737qg(C61043Rr r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
