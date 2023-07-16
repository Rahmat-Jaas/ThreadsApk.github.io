package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import kotlin.Unit;

public class KtSLambdaShape1S1301000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S1301000_I2(Object obj, Object obj2, Object obj3, String str, C146958n9 r6, int i) {
        super(1, r6);
        this.A05 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final C146958n9 create(C146958n9 r8) {
        String str;
        Object obj;
        Object obj2;
        int i;
        int i2 = this.A05;
        Object obj3 = this.A03;
        C146958n9 r5 = r8;
        if (i2 != 0) {
            obj = this.A02;
            str = this.A04;
            obj2 = this.A01;
            i = 1;
        } else {
            str = this.A04;
            obj = this.A02;
            obj2 = this.A01;
            i = 0;
        }
        return new KtSLambdaShape1S1301000_I2(obj3, obj, obj2, str, r5, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r5 = r20
            int r1 = r0.A05
            if (r1 == 0) goto L_0x00b6
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 != r3) goto L_0x018e
            X.AnonymousClass0OU.A00(r5)
        L_0x0014:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0017:
            X.AnonymousClass0OU.A00(r5)
            java.lang.Object r9 = r0.A03
            X.Arv r9 = (X.C19177Arv) r9
            com.instagram.service.session.UserSession r2 = r9.A03
            java.lang.Object r10 = r0.A02
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r10 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r10
            java.lang.String r5 = r0.A04
            r6 = 0
            X.AnonymousClass0wJ.A1M(r10, r3, r5)
            r12 = 0
            X.H1T r7 = X.AnonymousClass0wJ.A0P(r2)
            r2 = 329(0x149, float:4.61E-43)
            java.lang.String r8 = X.AnonymousClass000.A00(r2)
            r2 = 1230(0x4ce, float:1.724E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r2)
            r2 = 47
            java.lang.String r2 = X.AnonymousClass00U.A0M(r8, r4, r2)
            r7.A0J(r2)
            java.lang.Class<X.5uG> r4 = X.AnonymousClass5uG.class
            java.lang.Class<X.3P8> r2 = X.AnonymousClass3P8.class
            r7.A0B(r4, r2)
            java.lang.String r4 = r10.A04
            java.lang.String r2 = "channel_id"
            r7.A0O(r2, r4)
            java.lang.String r4 = r10.A05
            r2 = 891(0x37b, float:1.249E-42)
            java.lang.String r2 = X.C18170wI.A00(r2)
            r7.A0O(r2, r4)
            java.lang.String r4 = r10.A06
            java.lang.String r2 = "content_type"
            r7.A0O(r2, r4)
            java.lang.String r2 = "pagination_token"
            X.H8c r4 = X.C18200wM.A0T(r7, r2, r5)
            r2 = 243399379(0xe81fad3, float:3.204249E-30)
            X.4tk r6 = X.C86164wN.A13(r4, r2, r6)
            r4 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5
            r2.<init>(r4, r12)
            X.4tk r4 = X.AnonymousClass2L9.A00(r2, r6)
            r2 = 37
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r2 = X.C86124wJ.A0V(r4, r2)
            java.lang.Object r11 = r0.A01
            com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint r11 = (com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint) r11
            r13 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1
            r8.<init>(r9, r10, r11, r12, r13)
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r2 = X.C86144wL.A0O(r8, r2)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1400000_I2 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1400000_I2
            r14 = r10
            r15 = r11
            r16 = r9
            r18 = r12
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            X.4tk r2 = X.C63623hv.A08(r13, r2)
            r13 = 17
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1
            r8.<init>(r9, r10, r11, r12, r13)
            X.4tk r2 = X.C63623hv.A07(r8, r2)
            r0.A00 = r3
            java.lang.Object r0 = X.C25817DsW.A01(r0, r2)
            if (r0 != r1) goto L_0x0014
            return r1
        L_0x00b6:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r3 = 2
            r7 = 1
            if (r2 == 0) goto L_0x00e4
            if (r2 == r7) goto L_0x011c
            X.AnonymousClass0OU.A00(r5)
        L_0x00c3:
            java.lang.Object r0 = r0.A03
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r0 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r0
            X.4wE r2 = r0.A08
        L_0x00c9:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r3
            r4 = 0
            java.lang.Integer r5 = X.AnonymousClass006.A00
            r9 = 0
            r8 = 29
            r6 = r4
            r7 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00c9
            goto L_0x0014
        L_0x00e4:
            X.AnonymousClass0OU.A00(r5)
            java.lang.Object r6 = r0.A03
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r6 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r6
            X.4wE r5 = r6.A08
        L_0x00ed:
            java.lang.Object r4 = r5.getValue()
            r8 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r8
            r9 = 0
            java.lang.Integer r10 = X.AnonymousClass006.A0C
            r14 = 0
            X.8bW r12 = X.AnonymousClass8bW.A01
            r13 = 13
            r11 = r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r2 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r5.ADi(r4, r2)
            if (r2 == 0) goto L_0x00ed
            java.lang.String r5 = r0.A04
            java.lang.Object r4 = r0.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2
            java.lang.String r2 = r2.A02
            r0.A00 = r7
            java.lang.Object r5 = com.instagram.barcelona.feed.data.BarcelonaFeedRepository.A01(r6, r4, r5, r2, r0)
            if (r5 != r1) goto L_0x011f
            return r1
        L_0x011c:
            X.AnonymousClass0OU.A00(r5)
        L_0x011f:
            X.3b6 r5 = (X.C62903b6) r5
            java.lang.Object r8 = r0.A03
            com.instagram.barcelona.feed.data.BarcelonaFeedRepository r8 = (com.instagram.barcelona.feed.data.BarcelonaFeedRepository) r8
            X.7tu r9 = r8.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = r9.A00()
            java.lang.String r4 = r2.A01
            java.lang.String r2 = r0.A04
            boolean r2 = X.C04220Ms.A0I(r4, r2)
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5 instanceof X.AnonymousClass1jB
            if (r2 == 0) goto L_0x0156
            X.4wE r2 = r8.A08
        L_0x013b:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r3
            r4 = 0
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            r9 = 0
            r8 = 29
            r6 = r4
            r7 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x013b
            goto L_0x0014
        L_0x0156:
            boolean r2 = r5 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x0014
            X.1jA r5 = (X.AnonymousClass1jA) r5
            java.lang.Object r7 = r5.A00
            r6 = r7
            X.IlY r6 = (X.C35029IlY) r6
            java.lang.Boolean r5 = r6.A09
            if (r5 == 0) goto L_0x0172
            com.instagram.service.session.UserSession r2 = r8.A05
            X.6pH r4 = X.AnonymousClass2OP.A00(r2)
            boolean r2 = r5.booleanValue()
            r4.A00(r2)
        L_0x0172:
            java.util.List r13 = r6.A01()
            java.lang.Integer r10 = X.AnonymousClass006.A01
            X.9Me r7 = (X.C156169Me) r7
            boolean r2 = r7.A06
            if (r2 == 0) goto L_0x018c
            java.lang.String r11 = r7.A02
        L_0x0180:
            java.lang.String r12 = r6.A0D
            r0.A00 = r3
            r14 = r0
            java.lang.Object r2 = r9.A01(r10, r11, r12, r13, r14)
            if (r2 != r1) goto L_0x00c3
            return r1
        L_0x018c:
            r11 = 0
            goto L_0x0180
        L_0x018e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S1301000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape1S1301000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
