package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape303S0100000_2_I2 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape303S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r1 = (java.util.Map) r6.A00;
        r3 = (java.lang.Integer) r1.get(((X.AnonymousClass7VH) r0).A03);
        r0 = ((X.AnonymousClass7VH) r7).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r2 = (X.C120987Dn) r6.A00;
        r3 = (java.lang.Integer) r2.A01.get(((X.C113186qt) r0).A04);
        r1 = r2.A01;
        r0 = ((X.C113186qt) r7).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r1 = (java.util.Map) r6.A00;
        r3 = (java.lang.Integer) r1.get(((X.AnonymousClass7VN) r0).A0A);
        r0 = ((X.AnonymousClass7VN) r7).A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r2 = (X.C120997Do) r6.A00;
        r3 = (java.lang.Integer) r2.A01.get(((X.C113156qq) r0).A04);
        r1 = r2.A01;
        r0 = ((X.C113156qq) r7).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        r0 = (java.lang.Integer) r1.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        return r3 - X.AnonymousClass0wJ.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return X.AnonymousClass722.A00(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0027;
                case 2: goto L_0x002a;
                case 3: goto L_0x003e;
                case 4: goto L_0x0056;
                case 5: goto L_0x0059;
                case 6: goto L_0x005c;
                case 7: goto L_0x0070;
                case 8: goto L_0x008f;
                case 9: goto L_0x0119;
                case 10: goto L_0x00a0;
                case 11: goto L_0x00c0;
                case 12: goto L_0x00e6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r6.A00
            X.0YY[] r5 = (X.AnonymousClass0YY[]) r5
            int r4 = r5.length
            r2 = 0
        L_0x000b:
            if (r2 >= r4) goto L_0x0117
            r0 = r5[r2]
            java.lang.Object r1 = r0.invoke(r7)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r3 = X.AnonymousClass722.A00(r1, r0)
            if (r3 != 0) goto L_0x0137
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0024:
            r0 = r7
            r7 = r8
            goto L_0x002b
        L_0x0027:
            r0 = r7
            r7 = r8
            goto L_0x003f
        L_0x002a:
            r0 = r8
        L_0x002b:
            X.7VH r0 = (X.AnonymousClass7VH) r0
            java.lang.Object r1 = r6.A00
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.A03
            java.lang.Object r3 = r1.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.7VH r7 = (X.AnonymousClass7VH) r7
            java.lang.Object r0 = r7.A03
            goto L_0x0087
        L_0x003e:
            r0 = r8
        L_0x003f:
            X.6qt r0 = (X.C113186qt) r0
            java.lang.Object r2 = r6.A00
            X.7Dn r2 = (X.C120987Dn) r2
            java.util.Map r1 = r2.A01
            java.lang.Object r0 = r0.A04
            java.lang.Object r3 = r1.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.6qt r7 = (X.C113186qt) r7
            java.util.Map r1 = r2.A01
            java.lang.Object r0 = r7.A04
            goto L_0x0087
        L_0x0056:
            r0 = r7
            r7 = r8
            goto L_0x005d
        L_0x0059:
            r0 = r7
            r7 = r8
            goto L_0x0071
        L_0x005c:
            r0 = r8
        L_0x005d:
            X.7VN r0 = (X.AnonymousClass7VN) r0
            java.lang.Object r1 = r6.A00
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.A0A
            java.lang.Object r3 = r1.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.7VN r7 = (X.AnonymousClass7VN) r7
            java.lang.Object r0 = r7.A0A
            goto L_0x0087
        L_0x0070:
            r0 = r8
        L_0x0071:
            X.6qq r0 = (X.C113156qq) r0
            java.lang.Object r2 = r6.A00
            X.7Do r2 = (X.C120997Do) r2
            java.util.Map r1 = r2.A01
            java.lang.Object r0 = r0.A04
            java.lang.Object r3 = r1.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.6qq r7 = (X.C113156qq) r7
            java.util.Map r1 = r2.A01
            java.lang.Object r0 = r7.A04
        L_0x0087:
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0133
        L_0x008f:
            java.lang.Object r1 = r6.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.Object r0 = r1.invoke(r7, r8)
            int r3 = X.AnonymousClass0wJ.A04(r0)
            return r3
        L_0x00a0:
            java.lang.Object r2 = r6.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r8)
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x00bb
            int r3 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = r2.get(r7)
            if (r1 != 0) goto L_0x00db
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00c0:
            java.lang.Object r2 = r6.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r8)
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x00e1
            int r3 = X.AnonymousClass0wJ.A04(r1)
            java.lang.Object r1 = r2.get(r7)
            if (r1 != 0) goto L_0x00db
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00db:
            int r0 = X.AnonymousClass0wJ.A04(r1)
            int r3 = r3 - r0
            return r3
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00e6:
            java.lang.Object r2 = r6.A00
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r0 = "Null result of orderingPositions.get(o1) cannot be cast to a long"
            X.AnonymousClass7Ko.A07(r1, r0)
            java.lang.Object r0 = r2.get(r7)
            long r3 = X.C18190wL.A08(r0)
            java.lang.Object r1 = r2.get(r8)
            java.lang.String r0 = "Null result of orderingPositions.get(o2) cannot be cast to a long"
            X.AnonymousClass7Ko.A07(r1, r0)
            java.lang.Object r0 = r2.get(r8)
            long r1 = X.C18190wL.A08(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0112
            r3 = -1
            return r3
        L_0x0112:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1
            if (r0 != 0) goto L_0x0137
        L_0x0117:
            r3 = 0
            return r3
        L_0x0119:
            java.lang.Object r0 = r6.A00
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r3 = r0.compare(r7, r8)
            if (r3 != 0) goto L_0x0137
            X.7HT r7 = (X.AnonymousClass7HT) r7
            int r0 = r7.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.7HT r8 = (X.AnonymousClass7HT) r8
            int r0 = r8.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0133:
            int r3 = X.AnonymousClass722.A00(r3, r0)
        L_0x0137:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape303S0100000_2_I2.compare(java.lang.Object, java.lang.Object):int");
    }
}
