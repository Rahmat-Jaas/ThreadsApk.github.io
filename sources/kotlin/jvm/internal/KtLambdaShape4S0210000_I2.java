package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape4S0210000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0210000_I2(int i, Object obj, Object obj2, boolean z) {
        super(0);
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        X.C18240wQ.A1G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a3, code lost:
        r0.CrC(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b9, code lost:
        X.C879956a.A02(r5, X.C18170wI.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0219, code lost:
        return new com.facebook.redex.IDxCFuncShape11S0210000_2_I2(r3, r4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027c, code lost:
        r0 = java.lang.String.format("Feed loading state: %s | Incomplete Pagination State: %b", java.util.Arrays.copyOf(new java.lang.Object[]{((X.C1533793z) r7.getValue()).A03.name(), java.lang.Boolean.valueOf(((X.C1533793z) r7.getValue()).A04 instanceof X.AnonymousClass65F)}, r6));
        X.C04220Ms.A06(r0);
        r4.A07(r5, r0, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ad, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0097;
                case 2: goto L_0x00c0;
                case 3: goto L_0x0041;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00ef;
                case 6: goto L_0x0121;
                case 7: goto L_0x00fd;
                case 8: goto L_0x0108;
                case 9: goto L_0x0140;
                case 10: goto L_0x017f;
                case 11: goto L_0x01c7;
                case 12: goto L_0x01d7;
                case 13: goto L_0x01e7;
                case 14: goto L_0x01f7;
                case 15: goto L_0x0206;
                case 16: goto L_0x021a;
                case 17: goto L_0x001e;
                case 18: goto L_0x0245;
                case 19: goto L_0x0261;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r15.A00
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            java.lang.Object r4 = r15.A01
            X.DXs r4 = (X.C24736DXs) r4
            X.IcN r3 = r4.A01
            boolean r2 = r15.A02
            r0 = 29
            kotlin.jvm.internal.IDxRImplShape184S0000000_4_I2 r1 = new kotlin.jvm.internal.IDxRImplShape184S0000000_4_I2
            r1.<init>(r4, r0)
            X.E01 r0 = new X.E01
            r0.<init>(r3, r5, r1, r2)
        L_0x001d:
            return r0
        L_0x001e:
            java.lang.Object r0 = r15.A00
            if (r0 != 0) goto L_0x001d
            X.Dbw r1 = new X.Dbw
            r1.<init>()
            java.lang.Object r0 = r15.A01
            X.HJ7 r0 = (X.HJ7) r0
            r1.A02 = r0
            X.Hvr r0 = r0.A0A
            r1.A04 = r0
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0037:
            r1.A05 = r0
            X.FPx r0 = r1.A00()
            return r0
        L_0x003e:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x0037
        L_0x0041:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            java.lang.Object r7 = r15.A01
            X.791 r7 = (X.AnonymousClass791) r7
            X.74n r1 = r7.A00()
            java.util.HashMap r1 = r1.A00
            java.util.Iterator r5 = X.C86154wM.A0r(r1)
        L_0x0053:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.String r9 = X.C18180wK.A0k(r5)
            X.C04220Ms.A04(r9)
            boolean r11 = r15.A02
            java.lang.Object r8 = r15.A00
            r10 = 0
            X.68S r4 = X.AnonymousClass68S.SIGNAL_STORE_COLLECT
            X.0ZV r3 = X.AnonymousClass0ZV.A00
            X.7Gq r2 = r7.A02
            kotlin.jvm.internal.KtLambdaShape4S1210000_I2 r6 = new kotlin.jvm.internal.KtLambdaShape4S1210000_I2
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r1 = "no_use_case"
            java.lang.Object r2 = X.C98666Gl.A00(r4, r2, r3, r1, r6)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r1 = X.C18190wL.A1a(r2)
            if (r1 == 0) goto L_0x0053
            r0.put(r9, r2)
            goto L_0x0053
        L_0x0082:
            java.lang.Object r3 = r15.A01
            X.6qu r3 = (X.C113196qu) r3
            java.lang.Object r2 = r15.A00
            X.77X r2 = (X.AnonymousClass77X) r2
            boolean r0 = r15.A02
            r1 = 1
            r0 = r0 ^ 1
            X.AnonymousClass7JQ.A02(r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x0097:
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x02ab
            java.lang.Object r4 = r15.A00
            X.6b7 r4 = (X.C104026b7) r4
            androidx.compose.material.SwipeableV2State r0 = r4.A00
            X.0YY r1 = r0.A0D
            X.66m r0 = X.C967366m.Closed
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x02ab
            java.lang.Object r3 = r15.A01
            X.4qz r3 = (X.C83224qz) r3
            r2 = 0
            r0 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x02ab
        L_0x00c0:
            java.lang.Object r1 = r15.A01
            X.7F7 r1 = (X.AnonymousClass7F7) r1
            java.lang.Object r0 = r15.A00
            X.7Zx r0 = (X.C123917Zx) r0
            r1.A02(r0)
            goto L_0x02ab
        L_0x00cd:
            java.lang.Object r0 = r15.A01
            X.5ge r0 = (X.C91695ge) r0
            X.0YC r4 = r0.A05
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x00ec
            java.lang.String r3 = "remove_paypal_cancel"
        L_0x00d9:
            java.lang.Object r1 = r15.A00
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r1
            java.lang.String r0 = r1.A0E
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
            X.LcE r1 = r1.A08
            java.lang.String r0 = "user_remove_credential_cancel"
            r4.invoke(r0, r3, r2, r1)
            goto L_0x02ab
        L_0x00ec:
            java.lang.String r3 = "remove_card_cancel"
            goto L_0x00d9
        L_0x00ef:
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r15.A01
            X.8pE r1 = (X.C147368pE) r1
            r0 = 1
            X.C147368pE.A04(r1, r0)
            goto L_0x02ab
        L_0x00fd:
            boolean r0 = r15.A02
            if (r0 != 0) goto L_0x011b
            java.lang.Object r0 = r15.A01
        L_0x0103:
            X.C18240wQ.A1G(r0)
            goto L_0x02ab
        L_0x0108:
            boolean r1 = r15.A02
            java.lang.Object r0 = r15.A01
            X.582 r0 = (X.AnonymousClass582) r0
            if (r1 == 0) goto L_0x011e
            java.lang.String r3 = "persistent_suggested_followers_continue"
        L_0x0112:
            X.7ET r2 = X.AnonymousClass7ET.A01
            com.instagram.service.session.UserSession r1 = r0.A03
            X.0kW r0 = r0.A02
            r2.A01(r0, r1, r3)
        L_0x011b:
            java.lang.Object r0 = r15.A00
            goto L_0x0103
        L_0x011e:
            java.lang.String r3 = "suggested_follow_continue"
            goto L_0x0112
        L_0x0121:
            java.lang.Object r1 = r15.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            boolean r0 = r15.A02
            r2 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.invoke(r0)
            java.lang.Object r0 = r15.A01
            X.6dX r0 = (X.C105506dX) r0
            X.FRy r1 = r0.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x013b
            r0 = 0
        L_0x013b:
            r1.setVolume(r0)
            goto L_0x02ab
        L_0x0140:
            java.lang.Object r5 = r15.A01
            X.56a r5 = (X.C879956a) r5
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            boolean r8 = r15.A02
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.BKU r4 = r5.A00
            if (r4 == 0) goto L_0x017a
            boolean r0 = X.C09650fs.A05(r3)
            if (r0 != 0) goto L_0x0167
            X.6df r0 = r5.A03
            r13 = 1
            r10 = 0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1220000_I2 r9 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1220000_I2
            r11 = r10
            r12 = r10
            r14 = r8
            r9.<init>((android.net.Uri) r10, (android.net.Uri) r11, (java.lang.String) r12, (boolean) r13, (boolean) r14)
            X.8pE r0 = r0.A00
            goto L_0x01a3
        L_0x0167:
            X.4qz r1 = X.AnonymousClass3J5.A00(r5)
            r6 = 0
            r7 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r2, r1, r0)
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x01b9
        L_0x017a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x017f:
            java.lang.Object r5 = r15.A01
            X.56a r5 = (X.C879956a) r5
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            boolean r8 = r15.A02
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.BKU r4 = r5.A00
            if (r4 == 0) goto L_0x01c2
            boolean r0 = X.C09650fs.A05(r3)
            if (r0 != 0) goto L_0x01a8
            X.6de r3 = r5.A02
            r2 = 1
            r1 = 0
            r0 = 3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r9 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2
            r9.<init>((java.lang.Object) r1, (java.lang.String) r1, (int) r0, (boolean) r2)
            X.8pE r0 = r3.A00
        L_0x01a3:
            r0.CrC(r9)
            goto L_0x02ab
        L_0x01a8:
            X.4qz r1 = X.AnonymousClass3J5.A00(r5)
            r6 = 0
            r7 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r2, r1, r0)
            r0 = 499(0x1f3, float:6.99E-43)
        L_0x01b9:
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C879956a.A02(r5, r0)
            goto L_0x02ab
        L_0x01c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01c7:
            boolean r3 = r15.A02
            java.lang.Object r2 = r15.A00
            X.Lu1 r2 = (X.Lu1) r2
            java.lang.Object r1 = r15.A01
            X.Lu1 r1 = (X.Lu1) r1
            X.7vG r0 = new X.7vG
            r0.<init>(r2, r1, r3)
            return r0
        L_0x01d7:
            java.lang.Object r3 = r15.A01
            X.9Ej r3 = (X.C154929Ej) r3
            boolean r2 = r15.A02
            java.lang.Object r1 = r15.A00
            X.Lu1 r1 = (X.Lu1) r1
            X.B8c r0 = new X.B8c
            r0.<init>(r1, r3, r2)
            return r0
        L_0x01e7:
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r15.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            boolean r1 = r15.A02
            X.Dck r0 = new X.Dck
            r0.<init>(r2, r3, r1)
            return r0
        L_0x01f7:
            java.lang.Object r4 = r15.A01
            X.BMj r4 = (X.C20066BMj) r4
            java.lang.Object r3 = r15.A00
            X.BsW r3 = (X.C21325BsW) r3
            boolean r2 = r15.A02
            r4.A0O(r3, r2)
            r1 = 0
            goto L_0x0214
        L_0x0206:
            java.lang.Object r4 = r15.A01
            X.BMj r4 = (X.C20066BMj) r4
            java.lang.Object r3 = r15.A00
            X.BsW r3 = (X.C21325BsW) r3
            boolean r2 = r15.A02
            r4.A0O(r3, r2)
            r1 = 1
        L_0x0214:
            com.facebook.redex.IDxCFuncShape11S0210000_2_I2 r0 = new com.facebook.redex.IDxCFuncShape11S0210000_2_I2
            r0.<init>(r3, r4, r1, r2)
            return r0
        L_0x021a:
            java.lang.Object r0 = r15.A00
            X.CsK r0 = (X.C23441CsK) r0
            X.1tl r0 = r0.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            r0 = 85
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            java.lang.Object r0 = r15.A01
            X.Dja r0 = (X.C25314Dja) r0
            boolean r2 = r15.A02
            X.CsK r0 = r0.A00
            X.JjY r1 = r0.A06
            if (r2 == 0) goto L_0x0242
            X.7x3 r0 = X.C134117x3.A00
        L_0x023c:
            X.4oC r0 = (X.C81684oC) r0
            r1.A02(r0)
            goto L_0x02ab
        L_0x0242:
            X.7x2 r0 = X.C134107x2.A00
            goto L_0x023c
        L_0x0245:
            java.lang.Object r0 = r15.A00
            X.C18240wQ.A1G(r0)
            java.lang.Object r1 = r15.A01
            X.BUT r1 = (X.BUT) r1
            X.Ah4 r0 = r1.A0A
            r0.A02()
            X.BEi r4 = r1.A0B
            com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint r0 = r1.A0C
            X.9vH r5 = X.C18889An2.A00(r0)
            boolean r3 = r15.A02
            r6 = 2
            X.4wG r7 = r1.A0I
            goto L_0x027c
        L_0x0261:
            java.lang.Object r0 = r15.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            if (r0 == 0) goto L_0x026a
            r0.invoke()
        L_0x026a:
            java.lang.Object r1 = r15.A01
            X.BUR r1 = (X.BUR) r1
            X.Ah4 r0 = r1.A05
            r0.A02()
            X.BEi r4 = r1.A06
            X.9vH r5 = X.C170609vH.VIEW_SUBDESTINATION
            boolean r3 = r15.A02
            r6 = 2
            X.4wG r7 = r1.A0C
        L_0x027c:
            java.lang.Object r0 = r7.getValue()
            X.93z r0 = (X.C1533793z) r0
            X.9tu r0 = r0.A03
            java.lang.String r1 = r0.name()
            r2 = 0
            java.lang.Object r0 = r7.getValue()
            X.93z r0 = (X.C1533793z) r0
            X.6Uy r0 = r0.A04
            boolean r0 = r0 instanceof X.AnonymousClass65F
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = "Feed loading state: %s | Incomplete Pagination State: %b"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C04220Ms.A06(r0)
            r4.A07(r5, r0, r3, r2)
        L_0x02ab:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S0210000_I2.invoke():java.lang.Object");
    }
}
