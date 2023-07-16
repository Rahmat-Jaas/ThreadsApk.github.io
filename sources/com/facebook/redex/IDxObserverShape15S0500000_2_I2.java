package com.facebook.redex;

import X.C143158gC;

public class IDxObserverShape15S0500000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxObserverShape15S0500000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A00 = obj5;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 != 1) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 == 0) goto L_0x0042
            X.7Kx r8 = (X.AnonymousClass7Kx) r8
            boolean r0 = X.AnonymousClass7Kx.A0O(r8)
            if (r0 == 0) goto L_0x0021
            java.lang.Throwable r1 = r8.A02
            boolean r0 = r1 instanceof X.C1373588g
            if (r0 == 0) goto L_0x003f
            X.88g r1 = (X.C1373588g) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            int r2 = r1.A00
            r1 = 1
            r0 = 12
            if (r2 == r0) goto L_0x003f
            if (r2 == r1) goto L_0x003f
        L_0x0021:
            r1 = 0
        L_0x0022:
            java.lang.Object r0 = r7.A01
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A04
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A03
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            return
        L_0x003f:
            r1 = 8
            goto L_0x0022
        L_0x0042:
            X.7jT r8 = (X.C128377jT) r8
            java.lang.Object r5 = r7.A02
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeAllViews()
            if (r8 == 0) goto L_0x0082
            java.lang.Object r0 = r7.A04
            X.8gy r0 = (X.C143578gy) r0
            java.lang.Object r6 = r7.A01
            X.7h3 r6 = (X.C127397h3) r6
            java.lang.Object r2 = r7.A00
            X.3HX r2 = (X.AnonymousClass3HX) r2
            X.5Bx r0 = r0.Bsh(r5)
            r8.A02(r0)
            android.view.View r0 = r0.itemView
            r5.addView(r0)
            r0 = 2
            r4 = 0
            int r1 = r6.A0H(r0, r4)
            r0 = 3
            int r0 = r6.A0H(r0, r4)
            r5.measure(r1, r0)
            X.7HV r3 = X.AnonymousClass7K7.A01(r2)
            int r0 = r6.A02
            long r1 = (long) r0
            com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2 r0 = new com.instagram.common.bloks.mutations.IDxUOperationShape121S0100000_2_I2
            r0.<init>(r5, r4)
            X.AnonymousClass7r4.A00(r3, r0, r1)
        L_0x0082:
            java.lang.Object r0 = r7.A03
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r0 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r0
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape15S0500000_2_I2.onChanged(java.lang.Object):void");
    }
}
