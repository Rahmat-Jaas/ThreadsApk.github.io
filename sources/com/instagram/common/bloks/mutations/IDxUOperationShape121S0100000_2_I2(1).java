package com.instagram.common.bloks.mutations;

import X.C111556ns;

public class IDxUOperationShape121S0100000_2_I2 extends C111556ns {
    public Object A00;
    public final int A01;

    public IDxUOperationShape121S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r7.A04.put(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r7.A04.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A00(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            X.7h3 r7 = (X.C127397h3) r7
            switch(r0) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00f4;
                case 2: goto L_0x0010;
                case 3: goto L_0x0077;
                case 4: goto L_0x0094;
                case 5: goto L_0x00b9;
                default: goto L_0x0007;
            }
        L_0x0007:
            r2 = 0
            r1 = 31
            android.util.SparseArray r0 = r7.A04
            r0.put(r1, r2)
        L_0x000f:
            return
        L_0x0010:
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.util.HashSet r5 = X.C18200wM.A0u()
            java.util.List r1 = r7.A0P()
            r0 = 413(0x19d, float:5.79E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0046
            X.7h3 r0 = X.C86144wL.A0V(r2)
            X.7h3 r0 = X.C127397h3.A06(r0)
            if (r0 == 0) goto L_0x0042
            r1 = 35
            android.util.SparseArray r0 = r0.A04
            java.lang.String r4 = X.C86114wI.A0m(r0, r1)
        L_0x0042:
            r5.add(r4)
            goto L_0x0029
        L_0x0046:
            java.lang.Object r0 = r6.A00
            java.util.Iterator r3 = X.C86144wL.A0y(r0)
        L_0x004c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000f
            X.7h3 r2 = X.C86144wL.A0V(r3)
            X.7h3 r0 = X.C127397h3.A06(r2)
            if (r0 == 0) goto L_0x0075
            r1 = 35
            android.util.SparseArray r0 = r0.A04
            java.lang.String r1 = X.C86114wI.A0m(r0, r1)
        L_0x0064:
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x004c
            java.util.List r0 = r7.A0P()
            r0.add(r2)
            r5.add(r1)
            goto L_0x004c
        L_0x0075:
            r1 = r4
            goto L_0x0064
        L_0x0077:
            X.AnonymousClass794.A00()
            java.lang.Integer r0 = X.AnonymousClass3LX.A00(r7)
            if (r0 == 0) goto L_0x000f
            int r3 = r0.intValue()
            r0 = -1
            if (r3 == r0) goto L_0x000f
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.C121727Ht.A03(r0)
            java.util.ArrayList r2 = X.C18200wM.A0s(r0)
            goto L_0x00dc
        L_0x0094:
            X.AnonymousClass794.A00()
            java.lang.Integer r0 = X.AnonymousClass3LX.A00(r7)
            if (r0 == 0) goto L_0x000f
            int r3 = r0.intValue()
            r0 = -1
            if (r3 == r0) goto L_0x000f
            java.util.List r0 = r7.A0Q(r3)
            java.util.ArrayList r2 = X.C18200wM.A0s(r0)
            r1 = 0
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.C121727Ht.A03(r0)
            r2.addAll(r1, r0)
            goto L_0x00dc
        L_0x00b9:
            X.AnonymousClass794.A00()
            java.lang.Integer r0 = X.AnonymousClass3LX.A00(r7)
            if (r0 == 0) goto L_0x000f
            int r3 = r0.intValue()
            r0 = -1
            if (r3 == r0) goto L_0x000f
            java.util.List r0 = r7.A0Q(r3)
            java.util.ArrayList r2 = X.C18200wM.A0s(r0)
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.C121727Ht.A03(r0)
            r2.addAll(r0)
        L_0x00dc:
            android.util.SparseArray r0 = r7.A04
            r0.put(r3, r2)
            return
        L_0x00e2:
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 1
            goto L_0x00fc
        L_0x00f4:
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            java.lang.Object r2 = r6.A00
            r1 = 38
        L_0x00fc:
            android.util.SparseArray r0 = r7.A04
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2.A00(java.lang.Object):void");
    }
}
