package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape3S0600000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public IDxCListenerShape3S0600000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A05 = obj3;
        this.A04 = obj2;
        this.A01 = obj6;
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [java.util.AbstractCollection, java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0160;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01f2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r9 = r0.A00
            com.instagram.service.session.UserSession r9 = (com.instagram.service.session.UserSession) r9
            java.lang.Object r8 = r0.A01
            X.2AC r8 = (X.AnonymousClass2AC) r8
            java.lang.Object r7 = r0.A02
            X.2AD r7 = (X.AnonymousClass2AD) r7
            java.lang.Object r6 = r0.A03
            X.4qX r6 = (X.C82944qX) r6
            java.lang.Object r5 = r0.A04
            X.BKH r5 = (X.BKH) r5
            java.lang.Object r4 = r0.A05
            X.4rv r4 = (X.C83744rv) r4
            java.lang.String r3 = X.C18230wP.A0h()
            java.lang.String r2 = r8.A00
            X.Dsp r0 = X.C25567Do3.A02(r9)
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "primary_click"
            X.AnonymousClass2SK.A00(r9, r0, r2, r1, r3)
            X.29W r1 = X.AnonymousClass29W.ACCEPT
            r0 = 0
            X.C49322rC.A00(r8, r1, r7, r0, r9)
            r6.CKL(r5, r3)
            if (r4 == 0) goto L_0x003e
            r4.BrW()
        L_0x003e:
            return
        L_0x003f:
            r1 = -742093421(0xffffffffd3c48d93, float:-1.68837762E12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r11 = r0.A00
            X.1YH r11 = (X.AnonymousClass1YH) r11
            android.content.Context r16 = r11.requireContext()
            r10 = 0
            r9 = -1
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            r5 = 1
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r5)
            java.lang.Object r2 = r0.A01
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r3 = X.AnonymousClass0wJ.A0n(r2)
            java.lang.String r2 = "some_cip_string"
            r8.put(r2, r3)
            java.lang.Object r2 = r0.A05
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r3 = X.AnonymousClass0wJ.A0n(r2)
            java.lang.String r2 = "some_required_string"
            r8.put(r2, r3)
            r3 = 0
            r4.set(r3)
            java.lang.Object r2 = r0.A04
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r12 = X.AnonymousClass0wJ.A0n(r2)
            java.lang.String r2 = "some_prop_string"
            r7.put(r2, r12)
            java.lang.Object r2 = r0.A03
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r2 = X.AnonymousClass0wJ.A0n(r2)
            java.lang.Long r12 = X.AnonymousClass0wJ.A0d(r2)
            java.lang.String r2 = "some_prop_long"
            r7.put(r2, r12)
            java.lang.Object r0 = r0.A02
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            int r2 = java.lang.Integer.parseInt(r0)
            r0 = 2
            java.lang.String r13 = "employer"
            java.lang.String r14 = "name"
            if (r2 == r0) goto L_0x011f
            r0 = 3
            if (r2 == r0) goto L_0x00eb
            r0 = 4
            if (r2 == r0) goto L_0x013d
            java.lang.String r2 = "PRIMITIVE"
            java.lang.String r0 = "content_type"
            r8.put(r0, r2)
        L_0x00be:
            com.instagram.service.session.UserSession r0 = r11.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r11 = X.C18190wL.A0N(r0)
            int r0 = r4.nextClearBit(r3)
            if (r0 < r5) goto L_0x0159
            java.util.HashMap r3 = X.C37067Jjv.A02(r8)
            java.lang.String r0 = "com.bloks.www.bloks.demos.nativescreen"
            X.3iE r2 = new X.3iE
            r2.<init>(r3, r7, r0)
            X.C63743iE.A0A(r2, r9)
            r2.A03 = r10
            r2.A02 = r10
            r2.A04 = r10
            r2.A0G(r6)
            r0 = r16
            r2.A0C(r0, r11)
            r0 = -133250081(0xfffffffff80ec3df, float:-1.1582483E34)
            goto L_0x023a
        L_0x00eb:
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "Lebron James"
            r15.put(r14, r0)
            java.lang.String r12 = "Los Angeles Lakers"
            r15.put(r13, r12)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "Kobe Bryant"
            r2.put(r14, r0)
            r2.put(r13, r12)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            r12.add(r15)
            r12.add(r2)
            java.lang.String r2 = "NESTED_COMPLEX"
            java.lang.String r0 = "content_type"
            r8.put(r0, r2)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "nested_prop_vec"
            goto L_0x0154
        L_0x011f:
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "Mark Zuckerberg"
            r12.put(r14, r0)
            java.lang.String r0 = "Facebook, Inc"
            r12.put(r13, r0)
            java.lang.String r2 = "SIMPLE_COMPLEX"
            java.lang.String r0 = "content_type"
            r8.put(r0, r2)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "simple_prop_dict"
            goto L_0x0154
        L_0x013d:
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "Elon Musk"
            r12.put(r14, r0)
            java.lang.String r0 = "Tesla, Inc"
            r12.put(r13, r0)
            java.lang.String r2 = "MIXED"
            java.lang.String r0 = "content_type"
            r8.put(r0, r2)
            java.lang.String r0 = "mixed_prop_shape"
        L_0x0154:
            r7.put(r0, r12)
            goto L_0x00be
        L_0x0159:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0160:
            r1 = 2046943359(0x7a01e07f, float:1.685899E35)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            android.content.Context r6 = (android.content.Context) r6
            X.Dsm r4 = X.C18190wL.A0W(r6)
            r2 = 2131828118(0x7f111d96, float:1.9289168E38)
            r4.A0L(r2)
            r3 = 2131828117(0x7f111d95, float:1.9289166E38)
            java.lang.Object r11 = r0.A01
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.String r2 = r11.BK7()
            java.lang.Object r9 = r0.A03
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            boolean r12 = X.C18200wM.A1W(r6, r4, r9, r2, r3)
            r2 = 2131828116(0x7f111d94, float:1.9289164E38)
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A04
            java.lang.Object r10 = r0.A02
            com.facebook.redex.IDxCListenerShape7S0600000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape7S0600000_1_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass25l.A00(r5, r4, r2)
            r2 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.3jv r0 = X.C64243jv.A00
            X.C18240wQ.A0s(r0, r4, r2, r12)
            X.AnonymousClass0wJ.A1K(r4)
            r0 = 93458143(0x5920edf, float:1.3735237E-35)
            goto L_0x023a
        L_0x01a9:
            r1 = -1912683399(0xffffffff8dfec479, float:-1.5701258E-30)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            android.content.Context r6 = (android.content.Context) r6
            X.Dsm r4 = X.C18190wL.A0W(r6)
            r2 = 2131828057(0x7f111d59, float:1.9289044E38)
            r4.A0L(r2)
            r3 = 2131828056(0x7f111d58, float:1.9289042E38)
            r12 = 2
            java.lang.Object r10 = r0.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r2 = r10.BK7()
            java.lang.Object r9 = r0.A03
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            boolean r3 = X.C18200wM.A1W(r6, r4, r9, r2, r3)
            r2 = 2131828055(0x7f111d57, float:1.928904E38)
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A04
            java.lang.Object r11 = r0.A01
            com.facebook.redex.IDxCListenerShape7S0600000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape7S0600000_1_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass25l.A00(r5, r4, r2)
            r2 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.3jw r0 = X.C64253jw.A00
            X.C18240wQ.A0s(r0, r4, r2, r3)
            X.AnonymousClass0wJ.A1K(r4)
            r0 = -1344408646(0xffffffffafddf3ba, float:-4.0372844E-10)
            goto L_0x023a
        L_0x01f2:
            r1 = 1198576830(0x4770d4be, float:61652.742)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            android.content.Context r6 = (android.content.Context) r6
            X.Dsm r4 = X.C18190wL.A0W(r6)
            r2 = 2131828111(0x7f111d8f, float:1.9289154E38)
            r4.A0L(r2)
            r3 = 2131828110(0x7f111d8e, float:1.9289152E38)
            java.lang.Object r10 = r0.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r2 = r10.BK7()
            java.lang.Object r9 = r0.A03
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            boolean r3 = X.C18200wM.A1W(r6, r4, r9, r2, r3)
            r2 = 2131834607(0x7f1136ef, float:1.930233E38)
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A04
            java.lang.Object r11 = r0.A01
            r12 = 3
            com.facebook.redex.IDxCListenerShape7S0600000_1_I2 r5 = new com.facebook.redex.IDxCListenerShape7S0600000_1_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass25l.A00(r5, r4, r2)
            r2 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.3jx r0 = X.C64263jx.A00
            X.C18240wQ.A0s(r0, r4, r2, r3)
            X.AnonymousClass0wJ.A1K(r4)
            r0 = -606088650(0xffffffffdbdfd236, float:-1.26000098E17)
        L_0x023a:
            X.C14030oh.A0C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape3S0600000_1_I2.onClick(android.view.View):void");
    }
}
