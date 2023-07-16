package X;

/* renamed from: X.5iU  reason: invalid class name */
public final class AnonymousClass5iU extends C128377jT {
    public final AnonymousClass5iN A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r6.A00.A00.size() != ((X.AnonymousClass5iU) r7).A00.A00.size()) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C128377jT r7) {
        /*
            r6 = this;
            boolean r1 = r7 instanceof X.AnonymousClass5iU
            r0 = 0
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            boolean r0 = super.A03(r7)
            if (r0 == 0) goto L_0x0022
            X.5iN r0 = r6.A00
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            r0 = r7
            X.5iU r0 = (X.AnonymousClass5iU) r0
            X.5iN r0 = r0.A00
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            r5 = 1
            if (r1 == r0) goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            X.5iN r0 = r6.A00
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x002c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x003f
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x003f:
            X.7jT r2 = (X.C128377jT) r2
            if (r5 == 0) goto L_0x0057
            r0 = r7
            X.5iU r0 = (X.AnonymousClass5iU) r0
            X.5iN r0 = r0.A00
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r3)
            X.7jT r0 = (X.C128377jT) r0
            boolean r0 = r2.A03(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            r3 = r1
            goto L_0x002c
        L_0x005a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5iU.A03(X.7jT):boolean");
    }

    public AnonymousClass5iU(AnonymousClass5iN r1) {
        super(r1);
        this.A00 = r1;
    }
}
