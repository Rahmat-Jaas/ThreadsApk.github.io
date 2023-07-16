package com.facebook.redex;

import android.view.ViewTreeObserver;

public class IDxLListenerShape126S0200000_1_I2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape126S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (X.AnonymousClass3UT.A00(r2.A01()).A01 != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x010d;
                case 1: goto L_0x00cd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.1bw r2 = (X.C23111bw) r2
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r2 instanceof X.C27371sP
            if (r0 == 0) goto L_0x007c
            r0 = 2131303998(0x7f091e3e, float:1.8226126E38)
            android.view.View r0 = X.C18180wK.A0E(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            boolean r5 = r2.A06(r0)
            X.3UT r7 = r2.A01()
            r0 = 2131305747(0x7f092513, float:1.8229674E38)
            android.view.View r4 = X.C18180wK.A0E(r1, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r4 = (com.instagram.ui.widget.progressbutton.ProgressButton) r4
            r0 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r6 = X.C18180wK.A0E(r1, r0)
            X.3UT r0 = r2.A01()
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0050
            if (r5 != 0) goto L_0x0050
            X.3UT r0 = r2.A01()
            X.3AR r0 = X.AnonymousClass3UT.A00(r0)
            boolean r3 = r0.A01
            r0 = 575(0x23f, float:8.06E-43)
            if (r3 == 0) goto L_0x0052
        L_0x0050:
            r0 = 574(0x23e, float:8.04E-43)
        L_0x0052:
            X.AnonymousClass0wJ.A16(r4, r0, r2)
        L_0x0055:
            if (r5 != 0) goto L_0x0070
            X.3AR r0 = X.AnonymousClass3UT.A00(r7)
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0070
            r0 = 577(0x241, float:8.09E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r2, r0)
        L_0x0065:
            r6.setOnClickListener(r0)
        L_0x0068:
            X.3IZ r1 = r2.A03
            boolean r0 = r2.A0B
            r1.A02(r5, r0)
        L_0x006f:
            return
        L_0x0070:
            X.3UT r4 = r2.A01()
            r3 = 49
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((int) r3, (java.lang.Object) r2, (java.lang.Object) r4, (java.lang.Object) r1)
            goto L_0x0065
        L_0x007c:
            boolean r0 = r2 instanceof X.C27351sN
            if (r0 == 0) goto L_0x00a8
            r0 = 2131303998(0x7f091e3e, float:1.8226126E38)
            android.view.View r0 = X.C18180wK.A0E(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            boolean r5 = r2.A06(r0)
            if (r5 != 0) goto L_0x009b
            X.3UT r0 = r2.A01()
            X.3AR r0 = X.AnonymousClass3UT.A00(r0)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0068
        L_0x009b:
            r0 = 2131301447(0x7f091447, float:1.8220952E38)
            android.view.View r1 = X.C18180wK.A0E(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0068
        L_0x00a8:
            boolean r0 = r2 instanceof X.C27411sT
            if (r0 == 0) goto L_0x00bf
            X.1sT r2 = (X.C27411sT) r2
            boolean r0 = r2 instanceof X.C27401sS
            if (r0 == 0) goto L_0x0100
            r0 = 2131304248(0x7f091f38, float:1.8226633E38)
            android.view.View r0 = X.C18180wK.A0E(r1, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r2.A07(r1, r0)
            return
        L_0x00bf:
            r0 = 2131303998(0x7f091e3e, float:1.8226126E38)
            android.view.View r0 = X.C18180wK.A0E(r1, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            boolean r5 = r2.A06(r0)
            goto L_0x0068
        L_0x00cd:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r8)
            java.lang.Object r0 = r8.A01
            X.1bZ r0 = (X.AnonymousClass1bZ) r0
            X.10Y r1 = r0.A02
            if (r1 != 0) goto L_0x00e7
            java.lang.String r0 = "viewModel"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x00e7:
            boolean r0 = r1 instanceof X.AnonymousClass1f8
            if (r0 == 0) goto L_0x006f
            X.1f8 r1 = (X.AnonymousClass1f8) r1
            X.1Qc r0 = r1.A00
            if (r0 == 0) goto L_0x00f6
            X.Dq7 r0 = r0.A00
            r0.A06()
        L_0x00f6:
            X.4wE r1 = r1.A05
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.CrC(r0)
            return
        L_0x0100:
            r0 = 2131305747(0x7f092513, float:1.8229674E38)
            android.view.View r0 = X.C18180wK.A0E(r1, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r2.A07(r1, r0)
            return
        L_0x010d:
            java.lang.Object r3 = r8.A01
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0128
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getHeight()
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            r0 = 0
            r3.setPadding(r0, r0, r0, r1)
        L_0x0128:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLListenerShape126S0200000_1_I2.onGlobalLayout():void");
    }
}
