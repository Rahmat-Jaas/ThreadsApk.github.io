package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape2S1400000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1400000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(0);
        this.A05 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A04 = str;
        this.A00 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ee, code lost:
        if (r3 != null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0207, code lost:
        r3.CMw(X.AnonymousClass7IA.A00(r5, r1, r0), (com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState) null, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022d, code lost:
        r4.Bor(r1, (com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState) null, r5, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r31 = this;
            r7 = r31
            int r0 = r7.A05
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x0042;
                case 2: goto L_0x013b;
                case 3: goto L_0x0193;
                case 4: goto L_0x01d8;
                case 5: goto L_0x0007;
                case 6: goto L_0x01d8;
                case 7: goto L_0x0007;
                case 8: goto L_0x01d8;
                case 9: goto L_0x0007;
                case 10: goto L_0x01d8;
                case 11: goto L_0x0007;
                case 12: goto L_0x01d8;
                case 13: goto L_0x0007;
                case 14: goto L_0x01f1;
                case 15: goto L_0x0211;
                case 16: goto L_0x01f1;
                case 17: goto L_0x01bb;
                case 18: goto L_0x0211;
                case 19: goto L_0x01d8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r7.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r5 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r5
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r0 = r5.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationChevron r0 = r0.A01
            if (r0 == 0) goto L_0x0029
            X.As6 r4 = r0.A00
            if (r4 == 0) goto L_0x0029
            java.lang.Object r3 = r7.A00
            X.8lr r3 = (X.C146228lr) r3
            java.lang.String r2 = r7.A04
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A02
            if (r3 == 0) goto L_0x0029
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r1 = X.AnonymousClass7IA.A00(r5, r1, r0)
            r0 = 0
            r3.Bor(r1, r0, r4, r2)
        L_0x0029:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x002c:
            java.lang.Object r4 = r7.A02
            X.54n r4 = (X.C877854n) r4
            java.lang.Object r3 = r7.A01
            X.0ZU r3 = (X.AnonymousClass0ZU) r3
            java.lang.Object r2 = r7.A03
            X.78v r2 = (X.C1201478v) r2
            java.lang.String r1 = r7.A04
            java.lang.Object r0 = r7.A00
            X.69J r0 = (X.AnonymousClass69J) r0
            r4.A0A(r0, r2, r1, r3)
            goto L_0x0029
        L_0x0042:
            java.lang.Object r2 = r7.A03
            X.582 r2 = (X.AnonymousClass582) r2
            java.lang.Object r1 = r7.A02
            X.5IJ r1 = (X.AnonymousClass5IJ) r1
            java.lang.String r0 = r1.A02
            r30 = r0
            boolean r13 = r1.A06
            r26 = r13 ^ 1
            r15 = 0
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository r12 = r2.A01
            X.4wG r14 = r12.A04
            java.lang.Object r0 = r14.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r0 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x006d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r10 = r16.next()
            X.5IJ r10 = (X.AnonymousClass5IJ) r10
            java.lang.String r9 = r10.A02
            r0 = r30
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x00c7
            if (r26 == 0) goto L_0x00cb
            java.util.List r8 = r12.A02
            java.lang.String r6 = r10.A03
            java.lang.String r5 = r10.A01
            r22 = 1
            boolean r4 = r10.A07
            com.instagram.common.typedurl.ImageUrl r3 = r10.A00
            boolean r2 = r10.A04
            boolean r1 = r10.A05
            X.5IJ r0 = new X.5IJ
            r23 = r4
            r24 = r2
            r25 = r1
            r20 = r6
            r21 = r5
            r18 = r3
            r19 = r9
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r8.add(r0)
            java.util.List r0 = r12.A03
            r0.remove(r10)
        L_0x00b2:
            X.5IJ r10 = new X.5IJ
            r21 = r10
            r22 = r3
            r23 = r9
            r24 = r6
            r25 = r5
            r27 = r4
            r28 = r2
            r29 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x00c7:
            r11.add(r10)
            goto L_0x006d
        L_0x00cb:
            java.util.List r0 = r12.A02
            r0.remove(r10)
            java.util.List r0 = r12.A03
            java.lang.String r6 = r10.A03
            java.lang.String r5 = r10.A01
            boolean r4 = r10.A07
            com.instagram.common.typedurl.ImageUrl r3 = r10.A00
            boolean r2 = r10.A04
            boolean r1 = r10.A05
            X.5IJ r8 = new X.5IJ
            r17 = r8
            r18 = r3
            r19 = r9
            r20 = r6
            r21 = r5
            r22 = r15
            r23 = r4
            r24 = r2
            r25 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.add(r8)
            goto L_0x00b2
        L_0x00f9:
            X.8s2 r2 = X.AnonymousClass7C0.A00(r11)
            X.67v r0 = X.C86114wI.A0T(r14)
            int r1 = r0.ordinal()
            if (r1 == r15) goto L_0x0118
            r0 = 1
            if (r1 == r0) goto L_0x0118
            r0 = 2
            if (r1 == r0) goto L_0x0115
            r0 = 3
            if (r1 == r0) goto L_0x0115
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0115:
            X.67v r1 = X.C970767v.SelectSome
            goto L_0x011a
        L_0x0118:
            X.67v r1 = X.C970767v.UnselectSome
        L_0x011a:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = X.C86134wK.A0M(r2, r14)
            com.instagram.barcelona.onboarding.data.OnboardingSuggestedFollowingRepository.A00(r0, r12, r1)
            if (r13 != 0) goto L_0x0029
            java.lang.String r5 = r7.A04
            if (r5 == 0) goto L_0x0029
            java.lang.Object r4 = r7.A00
            X.4qz r4 = (X.C83224qz) r4
            r3 = 0
            java.lang.Object r2 = r7.A01
            r0 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1.<init>(r2, r5, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
            goto L_0x0029
        L_0x013b:
            java.lang.Object r6 = r7.A03
            X.9nU r6 = (X.C166339nU) r6
            X.C2W r4 = r6.A03
            X.Awe r5 = X.C86154wM.A0T(r4)
            X.AxS r0 = r4.BDY()
            X.Awc r0 = r0.A06
            X.Arq r3 = new X.Arq
            r3.<init>(r0)
            java.lang.Object r0 = r7.A02
            X.AgF r0 = (X.C18483AgF) r0
            java.lang.String r2 = r0.A01()
            X.9vd r1 = X.C170829vd.FAILED
            java.util.Map r0 = r3.A04
            r0.put(r2, r1)
            X.Awc r0 = new X.Awc
            r0.<init>(r3)
            r5.A06 = r0
            X.C86154wM.A1O(r4, r5)
            X.Ah2 r8 = r6.A02
            java.lang.Object r9 = r7.A01
            X.BKU r9 = (X.BKU) r9
            java.lang.Object r0 = r7.A00
            X.9CM r0 = (X.AnonymousClass9CM) r0
            X.9CN r0 = r0.A01
            if (r0 == 0) goto L_0x0191
            java.lang.Long r0 = r0.A02
        L_0x0179:
            java.lang.String r11 = java.lang.String.valueOf(r0)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.CANCELED
            java.lang.String r12 = X.C86124wJ.A0x(r4)
            java.lang.String r13 = X.C86104wH.A0t(r4, r12)
            X.C04220Ms.A0A(r13)
            java.lang.String r14 = r7.A04
            r8.A01(r9, r10, r11, r12, r13, r14)
            goto L_0x0029
        L_0x0191:
            r0 = 0
            goto L_0x0179
        L_0x0193:
            java.lang.Object r4 = r7.A03
            X.AxL r4 = (X.C19498AxL) r4
            X.C19498AxL.A03(r4)
            java.lang.Object r3 = r7.A00
            X.BKU r3 = (X.BKU) r3
            java.lang.String r2 = X.C86154wM.A0m(r3)
            java.lang.Object r0 = r7.A01
            com.instagram.model.shopping.Product r0 = (com.instagram.model.shopping.Product) r0
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            java.lang.String r1 = r0.A0j
            X.C04220Ms.A06(r1)
            java.lang.String r0 = r7.A04
            X.C19498AxL.A01(r3, r4, r2, r1, r0)
            java.lang.Object r0 = r7.A02
            X.Afv r0 = (X.C18464Afv) r0
            r0.A00()
            goto L_0x0029
        L_0x01bb:
            java.lang.Object r2 = r7.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r2 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r2
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r0 = r2.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationButton r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            X.As6 r5 = r0.A00
            if (r5 == 0) goto L_0x0029
            java.lang.Object r4 = r7.A00
            X.8lr r4 = (X.C146228lr) r4
            java.lang.String r3 = r7.A04
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r1 = X.AnonymousClass7IA.A00(r2, r1, r0)
            goto L_0x022d
        L_0x01d8:
            java.lang.Object r5 = r7.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r5 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r5
            com.instagram.shopping.model.destination.home.Subtitle r0 = r5.A01
            if (r0 == 0) goto L_0x0029
            X.As6 r4 = r0.A00
            if (r4 == 0) goto L_0x0029
            java.lang.Object r3 = r7.A00
            X.8lr r3 = (X.C146228lr) r3
            java.lang.String r2 = r7.A04
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A02
            if (r3 == 0) goto L_0x0029
            goto L_0x0207
        L_0x01f1:
            java.lang.Object r5 = r7.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r5 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r5
            com.instagram.shopping.model.destination.home.Subtitle r0 = r5.A01
            if (r0 == 0) goto L_0x0029
            X.As6 r4 = r0.A00
            if (r4 == 0) goto L_0x0029
            java.lang.Object r3 = r7.A00
            X.8lr r3 = (X.C146228lr) r3
            java.lang.String r2 = r7.A04
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A02
        L_0x0207:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r1 = X.AnonymousClass7IA.A00(r5, r1, r0)
            r0 = 0
            r3.CMw(r1, r0, r4, r2)
            goto L_0x0029
        L_0x0211:
            java.lang.Object r2 = r7.A03
            com.instagram.shopping.model.destination.home.ProductFeedHeader r2 = (com.instagram.shopping.model.destination.home.ProductFeedHeader) r2
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r0 = r2.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationChevron r0 = r0.A01
            if (r0 == 0) goto L_0x0029
            X.As6 r5 = r0.A00
            if (r5 == 0) goto L_0x0029
            java.lang.Object r4 = r7.A00
            X.8lr r4 = (X.C146228lr) r4
            java.lang.String r3 = r7.A04
            java.lang.Object r1 = r7.A01
            java.lang.Object r0 = r7.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r1 = X.AnonymousClass7IA.A00(r2, r1, r0)
        L_0x022d:
            r0 = 0
            r4.Bor(r1, r0, r5, r3)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S1400000_I2.invoke():java.lang.Object");
    }
}
