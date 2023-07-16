package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape16S0400000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape16S0400000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0126, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        X.C14030oh.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A04
            switch(r0) {
                case 0: goto L_0x008c;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00e0;
                case 3: goto L_0x0109;
                case 4: goto L_0x0034;
                case 5: goto L_0x0033;
                case 6: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 934890261(0x37b94b15, float:2.2088681E-5)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A03
            X.6iO r1 = (X.C108456iO) r1
            androidx.fragment.app.Fragment r1 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            java.lang.Object r7 = r12.A02
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.Object r2 = r12.A00
            X.0kW r2 = (X.C11630kW) r2
            java.lang.Object r8 = r12.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r3 = 0
            java.lang.String r9 = "post_live_moderation"
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r3
            r11 = r3
            X.C102446Vf.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 1274407552(0x4bf5ea80, float:3.2232704E7)
        L_0x0030:
            X.C14030oh.A0C(r1, r0)
        L_0x0033:
            return
        L_0x0034:
            r0 = -998016658(0xffffffffc483796e, float:-1051.7947)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r12.A03
            X.9dN r5 = (X.C161229dN) r5
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r2 = r1.requireContext()
            java.lang.Object r6 = r12.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            X.06E r3 = X.AnonymousClass06E.A00(r1)
            java.lang.String r7 = r5.A04()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r4 = r12.A00
            X.BKU r4 = (X.BKU) r4
            X.C101776So.A00(r2, r3, r4, r5, r6, r7)
            r1 = -1424615477(0xffffffffab1617cb, float:-5.3323725E-13)
            goto L_0x0030
        L_0x0060:
            r0 = -593401643(0xffffffffdca168d5, float:-3.63461882E17)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A03
            X.6iO r1 = (X.C108456iO) r1
            androidx.fragment.app.Fragment r1 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            java.lang.Object r7 = r12.A02
            com.instagram.service.session.UserSession r7 = (com.instagram.service.session.UserSession) r7
            java.lang.Object r2 = r12.A00
            X.0kW r2 = (X.C11630kW) r2
            java.lang.Object r8 = r12.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            r3 = 0
            java.lang.String r9 = "post_live_moderation"
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r3
            r11 = r3
            X.C102446Vf.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 1286489103(0x4cae440f, float:9.1365496E7)
            goto L_0x0030
        L_0x008c:
            r0 = -1130256822(0xffffffffbca1a64a, float:-0.019732613)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem) r0
            java.lang.Integer r1 = r0.BA9()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x00a8
            java.lang.Object r0 = r12.A02
            X.5Bi r0 = (X.C88955Bi) r0
            X.51D r0 = r0.A02
            r0.A00()
        L_0x00a8:
            java.lang.Object r0 = r12.A03
            X.5gB r0 = (X.C91405gB) r0
            X.0YY r1 = r0.A00
            java.lang.Object r0 = r12.A01
            r1.invoke(r0)
            r0 = -1946918042(0xffffffff8bf46366, float:-9.413494E-32)
            goto L_0x0126
        L_0x00b7:
            r0 = -2001526600(0xffffffff88b320b8, float:-1.0780863E-33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x00d1
            java.lang.Object r0 = r12.A02
            X.5Br r0 = (X.C89045Br) r0
            X.51D r0 = r0.A03
            r0.A00()
        L_0x00d1:
            java.lang.Object r0 = r12.A03
            X.5gD r0 = (X.C91425gD) r0
            X.0YY r1 = r0.A00
            java.lang.Object r0 = r12.A01
            r1.invoke(r0)
            r0 = 1958365787(0x74ba4a5b, float:1.180756E32)
            goto L_0x0126
        L_0x00e0:
            r0 = -129427015(0xfffffffff84919b9, float:-1.6315209E34)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x00fa
            java.lang.Object r0 = r12.A02
            X.5Bk r0 = (X.C88975Bk) r0
            X.51D r0 = r0.A02
            r0.A00()
        L_0x00fa:
            java.lang.Object r0 = r12.A03
            X.5gN r0 = (X.C91525gN) r0
            X.0YY r1 = r0.A00
            java.lang.Object r0 = r12.A01
            r1.invoke(r0)
            r0 = 1211144129(0x483097c1, float:180831.02)
            goto L_0x0126
        L_0x0109:
            r0 = -510633709(0xffffffffe1905913, float:-3.328437E20)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r12.A03
            X.B48 r4 = (X.B48) r4
            java.lang.Object r3 = r12.A01
            X.9CZ r3 = (X.AnonymousClass9CZ) r3
            java.lang.Object r1 = r12.A02
            X.94O r1 = (X.AnonymousClass94O) r1
            java.lang.Object r0 = r12.A00
            X.5Ms r0 = (X.C90615Ms) r0
            r4.A0Y(r3, r1, r0)
            r0 = -777245899(0xffffffffd1ac2b35, float:-9.2432409E10)
        L_0x0126:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x012a:
            java.lang.IllegalStateException r2 = X.AnonymousClass0wJ.A0b()
            r1 = -182347275(0xfffffffff52199f5, float:-2.048541E32)
            X.C14030oh.A0C(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape16S0400000_2_I2.onClick(android.view.View):void");
    }
}
