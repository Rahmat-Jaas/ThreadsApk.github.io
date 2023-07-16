package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape2S1300000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCListenerShape2S1300000_1_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A02 = obj3;
        this.A03 = str;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00df, code lost:
        X.C63723iC.A09(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010a, code lost:
        X.C63723iC.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x010d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A04
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00b1;
                case 3: goto L_0x0117;
                case 4: goto L_0x012e;
                case 5: goto L_0x0147;
                case 6: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.3UZ r0 = X.AnonymousClass3UZ.A02
            if (r0 == 0) goto L_0x0039
            java.lang.Object r4 = r12.A02
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.String r0 = r12.A03
            java.lang.Integer r6 = X.AnonymousClass3Zz.A01(r0)
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Integer r5 = X.AnonymousClass006.A0P
            r7 = 0
            java.lang.String r10 = "take_break"
            r11 = 1
            r8 = r7
            r9 = r7
            X.C63583hq.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r1 = r12.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "time_spent_dashboard"
            X.3iT r1 = X.C63863iT.A04(r1, r2, r4, r3, r0)
            java.lang.Object r0 = r12.A00
            android.content.Context r0 = (android.content.Context) r0
            r1.A0I(r0)
        L_0x0039:
            return
        L_0x003a:
            X.3UZ r1 = X.AnonymousClass3UZ.A02
            if (r1 == 0) goto L_0x0039
            java.lang.Object r2 = r12.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.String r0 = r12.A03
            java.lang.Integer r4 = X.AnonymousClass3Zz.A01(r0)
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Integer r3 = X.AnonymousClass006.A0P
            r5 = 0
            java.lang.String r8 = "take_break"
            r9 = 1
            r6 = r5
            r7 = r5
            X.C63583hq.A04(r2, r3, r4, r5, r6, r7, r8, r9)
            X.3IP r1 = r1.A00()
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            androidx.fragment.app.Fragment r2 = r1.A02(r2, r0)
            java.lang.Object r1 = r12.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r12.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.AnonymousClass0wJ.A19(r2, r1, r0)
            return
        L_0x006d:
            java.lang.Object r8 = r12.A00
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r10 = r12.A02
            X.0i6 r10 = (X.C10300i6) r10
            java.lang.Object r1 = r12.A01
            java.lang.String r9 = r12.A03
            r0 = 2
            com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2 r7 = new com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2
            r7.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r10, (java.lang.Object) r8)
            r6 = 0
            r5 = 1
            r4 = 0
            X.3zb r3 = X.C67463zb.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r2 = new com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000
            r2.<init>()
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "client_mutation_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r2, r1, r0)
            java.lang.String r0 = "unpublished_content_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r2, r9, r0)
            X.C67463zb.A01(r2, r3)
            X.AnonymousClass7Ko.A0B(r5)
            java.lang.Class<X.15A> r1 = X.AnonymousClass15A.class
            java.lang.String r0 = "ContentSchedulingDeleteMutation"
            X.H8c r1 = X.C67473zc.A01(r3, r7, r10, r1, r0)
            r0 = 2131824937(0x7f111129, float:1.9282716E38)
            X.C63813iO.A03(r8, r4, r0, r6)
            X.C31155GhB.A03(r1)
            return
        L_0x00b1:
            java.lang.Object r2 = r12.A00
            X.3iC r2 = (X.C63723iC) r2
            com.instagram.service.session.UserSession r3 = r2.A08
            X.0kW r1 = r2.A03
            java.lang.String r0 = "logout_d3_cancel_tapped"
            X.0rn r0 = X.C15730rn.A00(r1, r0)
            X.C18180wK.A1K(r0, r3)
            java.lang.Object r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 == r0) goto L_0x010a
            java.lang.Object r4 = r12.A02
            X.3hk r4 = (X.C63533hk) r4
            java.lang.String r3 = r12.A03
            r0 = 1
            X.3ac r1 = X.C63533hk.A03(r4, r3)
            r1.A09 = r0
            java.util.Map r0 = r4.A00
            r0.put(r3, r1)
            r0 = 0
            r8 = 0
            r4.A0C(r0, r0, r0, r8)
        L_0x00df:
            X.C63723iC.A09(r2, r8)
            return
        L_0x00e3:
            java.lang.Object r2 = r12.A00
            X.3iC r2 = (X.C63723iC) r2
            com.instagram.service.session.UserSession r5 = r2.A08
            X.0kW r4 = r2.A03
            java.lang.String r0 = "logout_d3_remember_tapped"
            X.0rn r0 = X.C15730rn.A00(r4, r0)
            X.C18180wK.A1K(r0, r5)
            java.lang.Object r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            java.lang.Object r3 = r12.A02
            X.3hk r3 = (X.C63533hk) r3
            if (r1 != r0) goto L_0x010e
            X.0BO r0 = r5.multipleAccountHelper
            java.util.Set r7 = X.C18210wN.A0i(r0)
            r8 = 1
            java.lang.Integer r6 = X.AnonymousClass006.A0j
            r3.A09(r4, r5, r6, r7, r8)
        L_0x010a:
            X.C63723iC.A02(r2)
            return
        L_0x010e:
            java.lang.String r7 = r12.A03
            r8 = 1
            java.lang.Integer r6 = X.AnonymousClass006.A0j
            r3.A0B(r4, r5, r6, r7, r8)
            goto L_0x00df
        L_0x0117:
            java.lang.Object r2 = r12.A01
            X.0i6 r2 = (X.C10300i6) r2
            X.3hk r0 = X.C63533hk.A02(r2)
            java.lang.String r4 = r12.A03
            java.lang.Object r1 = r12.A00
            X.0kW r1 = (X.C11630kW) r1
            java.lang.Object r3 = r12.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            r5 = 1
            r0.A0B(r1, r2, r3, r4, r5)
            return
        L_0x012e:
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r2 = r12.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r0 = r12.A00
            X.0kW r0 = (X.C11630kW) r0
            java.lang.String r4 = r0.getModuleName()
            java.lang.String r6 = r12.A03
            r3 = 0
            java.lang.String r5 = "checkout_awareness_dialog_learn_more"
            X.C61863Wc.A01(r1, r2, r3, r4, r5, r6)
            return
        L_0x0147:
            java.lang.String r2 = "fb://shops_product_details/?productID="
            java.lang.String r1 = r12.A03
            java.lang.String r0 = "&refID=0&refType=0"
            java.lang.String r5 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.Object r0 = r12.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r12.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r12.A01
            X.0kW r1 = (X.C11630kW) r1
            java.lang.String r3 = "ig_product_wishlist"
            r4 = 0
            r8 = 0
            r6 = r4
            r7 = r4
            X.C60903Qz.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape2S1300000_1_I2.onClick(android.content.DialogInterface, int):void");
    }
}
