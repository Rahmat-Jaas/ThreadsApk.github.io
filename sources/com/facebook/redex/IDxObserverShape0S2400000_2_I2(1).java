package com.facebook.redex;

import X.C143158gC;

public class IDxObserverShape0S2400000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public IDxObserverShape0S2400000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A06 = i;
        this.A00 = obj2;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = obj4;
        this.A02 = obj3;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (X.AnonymousClass7Kx.A0R(X.C86104wH.A0R((X.M5J) r9.A00)) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013c, code lost:
        if (X.AnonymousClass7Kx.A0R(X.C86104wH.A0R((X.M5J) r9.A00)) == false) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A06
            X.7Kx r10 = (X.AnonymousClass7Kx) r10
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0112;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r0 = X.AnonymousClass7Kx.A0O(r10)
            if (r0 == 0) goto L_0x0027
            java.lang.Object r2 = r9.A01
            X.7kq r2 = (X.C129017kq) r2
            java.lang.String r1 = "PTT encode failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.7EC r0 = X.AnonymousClass7EC.A01(r0)
            r2.A01(r0)
            java.lang.Object r0 = r9.A02
            X.6oU r0 = (X.C111826oU) r0
            r0.A00()
        L_0x0026:
            return
        L_0x0027:
            boolean r0 = X.AnonymousClass7Kx.A0R(r10)
            if (r0 == 0) goto L_0x0026
            java.lang.Object r7 = X.AnonymousClass7Kx.A0D(r10)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r9.A03
            X.7Gw r3 = (X.C121577Gw) r3
            java.lang.String r4 = r9.A04
            java.lang.Object r0 = r9.A01
            X.7kq r0 = (X.C129017kq) r0
            java.lang.Object r1 = r9.A02
            X.6oU r1 = (X.C111826oU) r1
            java.lang.Object r2 = r9.A00
            X.5kU r2 = (X.C93015kU) r2
            java.lang.String r6 = r9.A05
            java.lang.String r5 = "$e2ee"
            X.C121577Gw.A01(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004d:
            boolean r0 = X.AnonymousClass7Kx.A0R(r10)
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r10)
            X.6tC r0 = (X.C114376tC) r0
            X.8XL r8 = X.AnonymousClass8XL.A00
            com.facebook.graphql.impls.EmailResponseImpl r2 = r0.A00
            r6 = 0
            if (r2 == 0) goto L_0x006a
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl$Error> r0 = com.facebook.graphql.impls.EmailResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r2, r0)
            com.facebook.graphql.impls.EmailResponseImpl$Error r0 = (com.facebook.graphql.impls.EmailResponseImpl.Error) r0
            if (r0 != 0) goto L_0x0079
        L_0x006a:
            java.lang.Object r0 = r9.A00
            X.M5J r0 = (X.M5J) r0
            X.7Kx r0 = X.C86104wH.A0R(r0)
            boolean r1 = X.AnonymousClass7Kx.A0R(r0)
            r0 = 1
            if (r1 != 0) goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            java.lang.String r3 = r9.A04
            java.lang.String r1 = "DELETE"
            X.C04220Ms.A0I(r3, r1)
            if (r0 == 0) goto L_0x016f
            java.lang.Object r5 = r9.A00
            X.56q r5 = (X.C880756q) r5
            X.7Kx r0 = X.C86104wH.A0R(r5)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            X.6uC r0 = (X.C114956uC) r0
            X.6ua r0 = r0.A00
            java.util.List r7 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r3, r1)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r9.A05
            X.8XM r0 = X.AnonymousClass8XM.A00
            java.util.List r3 = X.AnonymousClass7BD.A01(r1, r7, r0)
            X.7Kx r2 = X.C86104wH.A0R(r5)
            r1 = 2
            com.facebook.redex.IDxFunctionShape17S1200000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape17S1200000_2_I2
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r6, (java.lang.String) r6, (int) r1)
            X.AnonymousClass7Kx.A0E(r0, r5, r2)
            goto L_0x016f
        L_0x00b2:
            java.lang.String r0 = "CREATE"
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r2 = r9.A03
            X.7j5 r2 = (X.AnonymousClass7j5) r2
            java.lang.Object r1 = r9.A02
            X.79R r1 = (X.AnonymousClass79R) r1
            X.7SW r0 = X.AnonymousClass7SW.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A02(r0, r10)
            r2.A07(r1, r0)
            goto L_0x016f
        L_0x00cd:
            if (r2 == 0) goto L_0x0110
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl$Email> r1 = com.facebook.graphql.impls.EmailResponseImpl.Email.class
            java.lang.String r0 = "email"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
        L_0x00d7:
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x01e4
            java.lang.Class<com.facebook.graphql.impls.FBPayEmailImpl> r0 = com.facebook.graphql.impls.FBPayEmailImpl.class
            com.facebook.pando.TreeJNI r0 = r2.reinterpret(r0)
            com.facebook.graphql.impls.FBPayEmailImpl r0 = (com.facebook.graphql.impls.FBPayEmailImpl) r0
            X.C04220Ms.A06(r0)
            X.6uv r3 = X.C116846xe.A00(r0)
            java.lang.String r2 = r9.A05
            if (r2 == 0) goto L_0x01df
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x01da
            X.6tk r4 = new X.6tk
            r4.<init>(r2, r0)
            r1 = 8
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r0.<init>(r2, r1)
            java.util.List r3 = X.AnonymousClass7BD.A00(r3, r7, r0, r8)
            X.7Kx r2 = X.C86104wH.A0R(r5)
            r1 = 2
            com.facebook.redex.IDxFunctionShape17S1200000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape17S1200000_2_I2
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r6, (int) r1)
            X.AnonymousClass7Kx.A0E(r0, r5, r2)
            goto L_0x016f
        L_0x0110:
            r2 = r6
            goto L_0x00d7
        L_0x0112:
            boolean r0 = X.AnonymousClass7Kx.A0R(r10)
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r10)
            X.6tD r0 = (X.C114386tD) r0
            X.8XN r8 = X.AnonymousClass8XN.A00
            com.facebook.graphql.impls.PhoneResponseImpl r2 = r0.A00
            r6 = 0
            if (r2 == 0) goto L_0x012f
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl$Error> r0 = com.facebook.graphql.impls.PhoneResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r2, r0)
            com.facebook.graphql.impls.PhoneResponseImpl$Error r0 = (com.facebook.graphql.impls.PhoneResponseImpl.Error) r0
            if (r0 != 0) goto L_0x013e
        L_0x012f:
            java.lang.Object r0 = r9.A00
            X.M5J r0 = (X.M5J) r0
            X.7Kx r0 = X.C86104wH.A0R(r0)
            boolean r1 = X.AnonymousClass7Kx.A0R(r0)
            r0 = 1
            if (r1 != 0) goto L_0x013f
        L_0x013e:
            r0 = 0
        L_0x013f:
            java.lang.String r3 = r9.A04
            java.lang.String r1 = "DELETE"
            X.C04220Ms.A0I(r3, r1)
            if (r0 == 0) goto L_0x016f
            java.lang.Object r5 = r9.A00
            X.56q r5 = (X.C880756q) r5
            X.7Kx r0 = X.C86104wH.A0R(r5)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            X.6uC r0 = (X.C114956uC) r0
            X.6ub r0 = r0.A02
            java.util.List r7 = r0.A03
            boolean r0 = X.C04220Ms.A0I(r3, r1)
            if (r0 == 0) goto L_0x0181
            java.lang.String r1 = r9.A05
            X.8XO r0 = X.AnonymousClass8XO.A00
            java.util.List r1 = X.AnonymousClass7BD.A01(r1, r7, r0)
            java.lang.Object r0 = r9.A03
            X.7j5 r0 = (X.AnonymousClass7j5) r0
            X.AnonymousClass7j5.A04(r5, r6, r0, r6, r1)
        L_0x016f:
            boolean r0 = X.AnonymousClass7Kx.A0P(r10)
            if (r0 != 0) goto L_0x0026
            java.lang.Object r1 = r9.A00
            X.56q r1 = (X.C880756q) r1
            java.lang.Object r0 = r9.A01
            X.M5J r0 = (X.M5J) r0
            r1.A0J(r0)
            return
        L_0x0181:
            if (r2 == 0) goto L_0x01b8
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl$Phone> r1 = com.facebook.graphql.impls.PhoneResponseImpl.Phone.class
            java.lang.String r0 = "phone"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
        L_0x018b:
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x01f3
            java.lang.Class<com.facebook.graphql.impls.FBPayPhoneNumberImpl> r0 = com.facebook.graphql.impls.FBPayPhoneNumberImpl.class
            com.facebook.pando.TreeJNI r0 = r2.reinterpret(r0)
            com.facebook.graphql.impls.FBPayPhoneNumberImpl r0 = (com.facebook.graphql.impls.FBPayPhoneNumberImpl) r0
            X.C04220Ms.A06(r0)
            X.6uq r4 = X.C116846xe.A01(r0)
            java.lang.String r0 = "CREATE"
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r2 = r9.A03
            X.7j5 r2 = (X.AnonymousClass7j5) r2
            java.lang.Object r1 = r9.A02
            X.79R r1 = (X.AnonymousClass79R) r1
            X.7SZ r0 = X.AnonymousClass7SZ.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A02(r0, r10)
            r2.A09(r1, r0)
            goto L_0x016f
        L_0x01b8:
            r2 = r6
            goto L_0x018b
        L_0x01ba:
            java.lang.String r3 = r9.A05
            if (r3 == 0) goto L_0x01ee
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x01e9
            X.6tk r2 = new X.6tk
            r2.<init>(r3, r0)
            r1 = 9
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r0.<init>(r3, r1)
            java.util.List r1 = X.AnonymousClass7BD.A00(r4, r7, r0, r8)
            java.lang.Object r0 = r9.A03
            X.7j5 r0 = (X.AnonymousClass7j5) r0
            X.AnonymousClass7j5.A04(r5, r2, r0, r6, r1)
            goto L_0x016f
        L_0x01da:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01df:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01e4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01ee:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01f3:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape0S2400000_2_I2.onChanged(java.lang.Object):void");
    }
}
