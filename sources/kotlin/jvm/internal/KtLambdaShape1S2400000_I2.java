package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape1S2400000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S2400000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(1);
        this.A06 = i;
        this.A00 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r0.A06() != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            int r0 = r1.A06
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0072;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.ARA r2 = (X.ARA) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Object r5 = r1.A03
            X.AxL r5 = (X.C19498AxL) r5
            X.C19498AxL.A02(r2, r5)
            java.lang.Object r4 = r1.A02
            X.BKU r4 = (X.BKU) r4
            java.lang.String r3 = r1.A04
            java.lang.Object r0 = r1.A00
            com.instagram.model.shopping.Product r0 = (com.instagram.model.shopping.Product) r0
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            java.lang.String r2 = r0.A0j
            X.C04220Ms.A06(r2)
            java.lang.String r0 = r1.A05
            X.C19498AxL.A01(r4, r5, r3, r2, r0)
            java.lang.Object r0 = r1.A01
            X.Afv r0 = (X.C18464Afv) r0
            r0.A00()
        L_0x0033:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0036:
            boolean r5 = X.AnonymousClass0wJ.A1X(r2)
            java.lang.String r4 = "shareToFBController"
            r3 = 1
            if (r5 == 0) goto L_0x004c
            java.lang.Object r0 = r1.A03
            X.FOg r0 = (X.C28493FOg) r0
            X.3zC r2 = r0.A03
            if (r2 == 0) goto L_0x00f7
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r2.A05(r0, r3)
        L_0x004c:
            java.lang.Object r3 = r1.A03
            X.FOg r3 = (X.C28493FOg) r3
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r6 = r1.A05
            java.lang.String r7 = r1.A04
            if (r5 != 0) goto L_0x0065
            X.3zC r0 = r3.A03
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.A06()
            r8 = 0
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            java.lang.Object r4 = r1.A01
            X.CKd r4 = (X.C22169CKd) r4
            java.lang.Object r5 = r1.A02
            com.instagram.pendingmedia.model.UserStoryTarget r5 = (com.instagram.pendingmedia.model.UserStoryTarget) r5
            X.C28493FOg.A02(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0033
        L_0x0072:
            X.7E9 r2 = (X.AnonymousClass7E9) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r6 = r2.A01()
            java.lang.Object r14 = r1.A00
            X.7E9 r14 = (X.AnonymousClass7E9) r14
            java.security.KeyPair r0 = r2.A01
            java.security.PublicKey r0 = r0.getPublic()
            byte[] r0 = r0.getEncoded()
            java.lang.String r4 = X.AnonymousClass7E9.A00(r14, r0)
            java.util.LinkedHashMap r5 = X.C18220wO.A0y()
            java.lang.String r3 = r1.A04
            java.lang.String r0 = "cred_id"
            r5.put(r0, r3)
            java.lang.String r2 = r14.A01()
            java.lang.String r0 = "device_key"
            r5.put(r0, r2)
            java.lang.String r0 = "result_key"
            r5.put(r0, r6)
            java.lang.String r0 = "signature"
            r5.put(r0, r4)
            java.lang.String r0 = r1.A05
            java.lang.String r2 = "csc"
            r5.put(r2, r0)
            java.util.HashSet r0 = X.C18200wM.A0u()
            r0.add(r2)
            X.7HL r2 = X.AnonymousClass76O.A00()
            X.6gh r6 = new X.6gh
            r6.<init>(r5, r0)
            java.util.Map r12 = X.AnonymousClass4WJ.A0A()
            java.lang.String r7 = "SEND_E2EE_DATA"
            r8 = 0
            r0 = 1
            com.facebook.redex.IDxSCallbackShape852S0100000_2_I2 r5 = new com.facebook.redex.IDxSCallbackShape852S0100000_2_I2
            r5.<init>(r2, r0)
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            X.7Dl r0 = X.C120977Dl.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.M5J r2 = X.C92975kL.A00(r0)
            X.C04220Ms.A06(r2)
            java.lang.Object r13 = r1.A01
            java.lang.Object r15 = r1.A02
            java.lang.Object r0 = r1.A03
            r19 = 2
            com.facebook.redex.IDxObserverShape0S2400000_2_I2 r12 = new com.facebook.redex.IDxObserverShape0S2400000_2_I2
            r18 = r4
            r17 = r3
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.AnonymousClass7Kx.A0H(r2, r12)
            goto L_0x0033
        L_0x00f7:
            X.C04220Ms.A0E(r4)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape1S2400000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
