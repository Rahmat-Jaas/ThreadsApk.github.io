package com.facebook.redex;

import X.C143158gC;

public class IDxObserverShape54S0300000_1_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObserverShape54S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r0.length() > 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x00f8;
                case 2: goto L_0x01af;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r4 = r10.A01
            android.widget.EditText r4 = (android.widget.EditText) r4
            boolean r3 = r11.booleanValue()
            r2 = 1
            r0 = r3 ^ 1
            r4.setEnabled(r0)
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            if (r3 != 0) goto L_0x0039
            android.text.Editable r0 = r4.getText()
            X.C04220Ms.A06(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0039
        L_0x0028:
            r1.setEnabled(r2)
            if (r3 == 0) goto L_0x0038
            java.lang.Object r0 = r10.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0038
            r0.requestFocus()
        L_0x0038:
            return
        L_0x0039:
            r2 = 0
            goto L_0x0028
        L_0x003b:
            java.lang.Object r3 = r10.A00
            X.4Aj r3 = (X.AnonymousClass4Aj) r3
            java.lang.Object r5 = r10.A01
            X.3GB r5 = (X.AnonymousClass3GB) r5
            java.lang.Object r1 = r10.A02
            X.24Z r1 = (X.AnonymousClass24Z) r1
            X.2Fb r11 = (X.C33272Fb) r11
            boolean r0 = r11 instanceof X.C22331Uk
            if (r0 == 0) goto L_0x0055
            androidx.fragment.app.Fragment r1 = r3.A05
            X.0m7 r0 = r3.A06
            X.AnonymousClass4Aj.A03(r1, r0)
            return
        L_0x0055:
            boolean r0 = r11 instanceof X.C22341Ul
            if (r0 == 0) goto L_0x006f
            androidx.fragment.app.Fragment r4 = r3.A05
            X.0m7 r0 = r3.A06
            X.AnonymousClass4Aj.A02(r4, r0)
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x0038
            com.instagram.service.session.UserSession r2 = r3.A09
            r1 = 0
            X.4pB r0 = r3.A01
            X.AnonymousClass4Aj.A04(r4, r5, r0, r2, r1)
            return
        L_0x006f:
            boolean r0 = r11 instanceof X.C22321Uj
            if (r0 == 0) goto L_0x00a2
            androidx.fragment.app.Fragment r2 = r3.A05
            X.0m7 r0 = r3.A06
            X.AnonymousClass4Aj.A02(r2, r0)
            android.content.Context r1 = r2.getContext()
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x0038
            if (r1 == 0) goto L_0x0038
            r0 = 2131824428(0x7f110f2c, float:1.9281684E38)
            java.lang.String r2 = r1.getString(r0)
            X.Dsm r0 = X.C62973bE.A00(r1)
            r0.A0p(r2)
            X.AnonymousClass0wJ.A1K(r0)
            android.os.Handler r1 = X.AnonymousClass4Aj.A0E
            X.4Qe r0 = new X.4Qe
            r0.<init>(r3, r2)
            r1.post(r0)
            return
        L_0x00a2:
            boolean r0 = r11 instanceof X.C22301Uh
            if (r0 == 0) goto L_0x00bc
            androidx.fragment.app.Fragment r0 = r3.A05
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x0038
            r1 = 2131821733(0x7f1104a5, float:1.9276218E38)
            X.Dsm r0 = X.C62973bE.A00(r0)
            r0.A0K(r1)
            X.AnonymousClass0wJ.A1K(r0)
            return
        L_0x00bc:
            boolean r0 = r11 instanceof X.C22311Ui
            if (r0 == 0) goto L_0x00c4
            r5.A00(r1)
            return
        L_0x00c4:
            boolean r0 = r11 instanceof X.C22291Ug
            if (r0 == 0) goto L_0x0038
            X.1Ug r11 = (X.C22291Ug) r11
            X.3GB r2 = r3.A00
            if (r2 == 0) goto L_0x0038
            androidx.fragment.app.Fragment r1 = r3.A05
            if (r1 == 0) goto L_0x0038
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x0038
            android.content.Context r6 = r1.requireContext()
            com.instagram.service.session.UserSession r8 = r3.A09
            java.lang.Integer r9 = X.AnonymousClass006.A01
            X.4Ca r7 = new X.4Ca
            r7.<init>(r2, r11)
            r5 = 5
            com.facebook.redex.IDxCListenerShape20S0400000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape20S0400000_1_I2
            r4.<init>((int) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9)
            android.content.Context r1 = r1.getContext()
            X.4CZ r0 = new X.4CZ
            r0.<init>(r2, r11, r3)
            X.AnonymousClass2P0.A00(r1, r4, r0, r8, r9)
            return
        L_0x00f8:
            X.39u r11 = (X.C571139u) r11
            java.lang.Object r4 = r10.A01
            android.view.View r4 = (android.view.View) r4
            r0 = 2131302727(0x7f091947, float:1.8223548E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0K(r4, r0)
            java.util.List r1 = r11.A00
            boolean r0 = r11.A02
            r3 = 0
            if (r0 == 0) goto L_0x0110
            r2.setVisibility(r3)
            return
        L_0x0110:
            boolean r0 = r11.A01
            r7 = 8
            if (r0 == 0) goto L_0x0127
            r2.setVisibility(r7)
            java.lang.Object r0 = r10.A02
            android.content.Context r2 = X.C18240wQ.A0C(r0)
            r1 = 0
            r0 = 2131836068(0x7f113ca4, float:1.9305292E38)
            X.C63813iO.A03(r2, r1, r0, r3)
            return
        L_0x0127:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0145
            r2.setVisibility(r7)
            r0 = 2131306593(0x7f092861, float:1.823139E38)
            X.C18190wL.A18(r4, r0, r3)
            r0 = 2131306591(0x7f09285f, float:1.8231385E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0K(r4, r0)
            java.lang.Object r1 = r10.A02
            r0 = 168(0xa8, float:2.35E-43)
            X.AnonymousClass0wJ.A16(r2, r0, r1)
            return
        L_0x0145:
            r2.setVisibility(r7)
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            java.lang.Object r6 = r10.A02
            X.1Za r6 = (X.C22681Za) r6
            X.11L r4 = r6.A00
            java.lang.String r5 = "adapter"
            if (r4 == 0) goto L_0x01aa
            java.util.ArrayList r0 = X.C18200wM.A0s(r1)
            r4.A02 = r0
            int r3 = r0.size()
            java.util.ArrayList r2 = X.C18240wQ.A0k(r3)
            r1 = 0
        L_0x0168:
            if (r1 >= r3) goto L_0x0171
            r0 = 0
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0168
        L_0x0171:
            r4.A03 = r2
            r4.notifyDataSetChanged()
            X.11L r4 = r6.A00
            if (r4 == 0) goto L_0x01aa
            r4.A02()
            com.facebook.redex.IDxEListenerShape223S0100000_1_I2 r0 = X.C18220wO.A0P(r4, r7)
            r4.A00 = r0
            r0 = 9
            com.facebook.redex.IDxEListenerShape223S0100000_1_I2 r0 = X.C18220wO.A0P(r4, r0)
            r4.A01 = r0
            com.instagram.service.session.UserSession r3 = r4.A08
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            java.lang.Class<X.46G> r1 = X.AnonymousClass46G.class
            X.4pY r0 = r4.A00
            X.C04220Ms.A0A(r0)
            r2.A01(r0, r1)
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            java.lang.Class<X.46T> r1 = X.AnonymousClass46T.class
            X.4pY r0 = r4.A01
            X.C04220Ms.A0A(r0)
            r2.A01(r0, r1)
            return
        L_0x01aa:
            X.C04220Ms.A0E(r5)
            r0 = 0
            throw r0
        L_0x01af:
            X.39v r11 = (X.C571239v) r11
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131302727(0x7f091947, float:1.8223548E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0K(r1, r0)
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x01c5
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x01c5:
            boolean r1 = r11.A01
            r0 = 8
            if (r1 != 0) goto L_0x01da
            java.util.List r1 = r11.A00
            r2.setVisibility(r0)
            java.lang.Object r0 = r10.A00
            X.8vy r0 = (X.C150268vy) r0
            r0.A00 = r1
            r0.notifyDataSetChanged()
            return
        L_0x01da:
            r2.setVisibility(r0)
            java.lang.Object r0 = r10.A02
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C63813iO.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape54S0300000_1_I2.onChanged(java.lang.Object):void");
    }
}
