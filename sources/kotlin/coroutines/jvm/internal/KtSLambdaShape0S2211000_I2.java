package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S2211000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S2211000_I2(Object obj, String str, String str2, C146958n9 r5, int i, boolean z) {
        super(2, r5);
        this.A06 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2(r3, r4, r5, r6, r7, r8);
        r2.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2(r2, r3, r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(java.lang.Object r10, X.C146958n9 r11) {
        /*
            r9 = this;
            int r0 = r9.A06
            r6 = r11
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0022;
                case 2: goto L_0x0018;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r9.A02
            java.lang.String r4 = r9.A04
            boolean r8 = r9.A05
            java.lang.String r5 = r9.A03
            r7 = 3
        L_0x000f:
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A01 = r10
            return r1
        L_0x0018:
            java.lang.Object r3 = r9.A02
            java.lang.String r4 = r9.A04
            java.lang.String r5 = r9.A03
            boolean r8 = r9.A05
            r7 = 2
            goto L_0x000f
        L_0x0022:
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A02
            java.lang.String r4 = r9.A04
            java.lang.String r5 = r9.A03
            boolean r8 = r9.A05
            r7 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A02
            java.lang.String r4 = r9.A04
            boolean r8 = r9.A05
            java.lang.String r5 = r9.A03
            r7 = 0
        L_0x0039:
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2.create(java.lang.Object, X.8n9):X.8n9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0267, code lost:
        if (r2 == r1) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0276, code lost:
        X.AnonymousClass0OU.A00(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0282, code lost:
        if (r0.A05 != false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0286, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0 != r1) goto L_0x0284;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0034;
                case 2: goto L_0x0065;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0276
            X.AnonymousClass0OU.A00(r28)
            java.lang.Object r5 = r0.A01
            X.4qz r5 = (X.C83224qz) r5
            java.lang.Object r7 = r0.A02
            X.Auy r7 = (X.C19355Auy) r7
            java.util.HashMap r4 = r7.A05
            java.lang.String r8 = r0.A04
            java.lang.Object r3 = r4.get(r8)
            X.8sG r3 = (X.C148838sG) r3
            if (r3 == 0) goto L_0x0287
            boolean r2 = r3.isActive()
            if (r2 != r6) goto L_0x027a
            r0.A00 = r6
            java.lang.Object r0 = r3.Ba9(r0)
        L_0x0031:
            if (r0 != r1) goto L_0x0284
            return r1
        L_0x0034:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x0276
            X.AnonymousClass0OU.A00(r28)
            java.lang.Object r2 = r0.A01
            X.C2z r2 = (X.C2z) r2
            X.BKU r3 = r2.Atv()
            java.lang.Object r6 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            com.instagram.service.session.UserSession r2 = r6.A04
            X.93B r7 = X.A5I.A00(r3, r2)
            X.3V6 r2 = r6.A02
            java.lang.String r8 = r0.A04
            java.lang.String r9 = r0.A03
            boolean r11 = r0.A05
            r10 = 0
            com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1$1 r5 = new com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1$1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A00 = r4
            java.lang.Object r0 = r2.A00(r8, r0, r5)
            goto L_0x0031
        L_0x0065:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x0276
            X.AnonymousClass0OU.A00(r28)
            java.lang.Object r5 = r0.A01
            java.lang.Object r10 = r0.A02
            X.Auy r10 = (X.C19355Auy) r10
            com.instagram.service.session.UserSession r2 = r10.A02
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r9 = r10.A04
            java.lang.String r11 = r0.A04
            java.lang.String r8 = r0.A03
            r6 = 0
            r13 = 2
            X.C04220Ms.A0B(r11, r13)
            r12 = 0
            X.H1T r7 = X.C18180wK.A0P(r2)
            java.lang.String r2 = "commerce/product_tagging/tagging_feed/"
            r7.A0J(r2)
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            r7.A0F(r2)
            java.lang.Class<X.9M3> r3 = X.AnonymousClass9M3.class
            java.lang.Class<X.71p> r2 = X.C1186171p.class
            r7.A0B(r3, r2)
            java.lang.String r2 = "query_text"
            r7.A0O(r2, r11)
            X.9wJ r2 = r9.A03
            java.lang.String r3 = r2.A00
            java.lang.String r2 = "usage"
            r7.A0O(r2, r3)
            java.lang.String r3 = r9.A0B
            java.lang.String r2 = "prior_module"
            r7.A0O(r2, r3)
            java.lang.String r3 = r9.A0G
            java.lang.String r2 = "waterfall_id"
            r7.A0O(r2, r3)
            java.lang.String r3 = r9.A0F
            java.lang.String r2 = X.C86144wL.A0o()
            r7.A0O(r2, r3)
            java.lang.Long r2 = X.C19591Ayr.A00()
            long r2 = r2.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r2 = 232(0xe8, float:3.25E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            r7.A0O(r2, r3)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r2 = r9.A04
            java.lang.String r3 = X.C17614AGw.A00(r2)
            java.lang.String r2 = "client_state"
            r7.A0O(r2, r3)
            java.util.List r3 = r9.A0H
            if (r3 == 0) goto L_0x0156
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0156
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r3)
            java.lang.String r3 = r2.toString()
        L_0x00f0:
            r2 = 1097(0x449, float:1.537E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r7.A0P(r2, r3)
            java.lang.String r3 = r9.A0D
            r2 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            r7.A0P(r2, r3)
            java.lang.String r3 = r9.A0C
            r2 = 506(0x1fa, float:7.09E-43)
            java.lang.String r2 = X.C18170wI.A00(r2)
            r7.A0P(r2, r3)
            java.lang.String r2 = "max_id"
            r7.A0P(r2, r8)
            X.H8c r3 = r7.A02()
            r2 = 302247775(0x1203ef5f, float:4.163136E-28)
            X.4tk r7 = X.C86164wN.A13(r3, r2, r6)
            r3 = 23
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5
            r2.<init>(r3, r12)
            r6 = 3
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r3 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r3.<init>((X.AnonymousClass0YP) r2, (X.C84714tk) r7, (int) r6)
            boolean r14 = r0.A05
            kotlin.jvm.internal.KtLambdaShape2S1110000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape2S1110000_I2
            r2.<init>(r10, r11, r6, r14)
            X.4tk r2 = X.C63623hv.A04(r2, r3)
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1210000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1210000_I2
            r9.<init>((java.lang.Object) r10, (java.lang.String) r11, (X.C146958n9) r12, (int) r13, (boolean) r14)
            X.4tk r2 = X.C63623hv.A08(r9, r2)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2
            r8 = r10
            r9 = r5
            r10 = r11
            r11 = r12
            r12 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.String) r10, (X.C146958n9) r11, (int) r12)
            X.4tk r2 = X.C63623hv.A07(r7, r2)
            r0.A00 = r4
            java.lang.Object r0 = X.C25817DsW.A01(r0, r2)
            goto L_0x0031
        L_0x0156:
            r3 = r12
            goto L_0x00f0
        L_0x0158:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x018d
            X.AnonymousClass0OU.A00(r28)
        L_0x0162:
            java.lang.Object r2 = r0.A02
            X.58E r2 = (X.AnonymousClass58E) r2
            X.7JF r5 = r2.A01
            boolean r1 = r0.A05
            r1 = r1 ^ 1
            java.lang.String r11 = r0.A04
            java.lang.String r12 = r0.A03
            java.lang.Long r10 = r2.A03()
            X.AnonymousClass0wJ.A1M(r11, r9, r12)
            java.lang.Integer r8 = X.AnonymousClass006.A01
            if (r1 == 0) goto L_0x018b
            java.lang.Integer r9 = X.AnonymousClass006.A00
        L_0x017d:
            r6 = 0
            r14 = 28
            r7 = r6
            r13 = r6
            X.5Cg r0 = X.AnonymousClass7JF.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7JF.A03(r0, r5)
            goto L_0x0284
        L_0x018b:
            r9 = r8
            goto L_0x017d
        L_0x018d:
            X.AnonymousClass0OU.A00(r28)
            java.lang.Object r2 = r0.A02
            X.58E r2 = (X.AnonymousClass58E) r2
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r13 = r2.A03
            java.lang.String r12 = r0.A04
            r0.A00 = r9
            X.5Hj r14 = com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A00(r13)
            if (r14 == 0) goto L_0x0273
            X.4wE r11 = r13.A07
            java.util.List r8 = r14.A02
            r26 = r8
            java.util.Iterator r3 = r8.iterator()
            r10 = 0
        L_0x01ab:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0205
            java.lang.Object r2 = r3.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r2
            java.lang.String r2 = r2.A05
            boolean r2 = X.C04220Ms.A0I(r2, r12)
            if (r2 == 0) goto L_0x026f
            if (r10 < 0) goto L_0x0205
            java.util.ArrayList r8 = X.C18200wM.A0s(r8)
            java.lang.Object r2 = r8.get(r10)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r2
            java.lang.Object r3 = r8.get(r10)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r3
            boolean r3 = r3.A07
            r24 = r3 ^ 1
            java.lang.String r3 = r2.A05
            r19 = r3
            java.lang.Object r7 = r2.A04
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            long r4 = r2.A01
            java.lang.Object r6 = r2.A02
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            int r3 = r2.A00
            r20 = r3
            java.lang.Object r3 = r2.A03
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            boolean r15 = r2.A06
            X.C18180wK.A1P(r7, r9, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2
            r25 = r15
            r16 = r6
            r17 = r3
            r18 = r7
            r21 = r9
            r22 = r4
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24, r25)
            r8.set(r10, r2)
        L_0x0205:
            java.util.List r10 = r14.A01
            boolean r7 = r14.A03
            java.lang.String r6 = r14.A00
            boolean r5 = r14.A04
            boolean r4 = r14.A07
            boolean r2 = r14.A06
            boolean r14 = r14.A05
            r24 = 0
            X.5Hj r3 = new X.5Hj
            r15 = r3
            r16 = r6
            r17 = r8
            r18 = r10
            r19 = r7
            r20 = r5
            r21 = r4
            r22 = r2
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.5z2 r2 = new X.5z2
            r2.<init>(r3)
            r11.CrC(r2)
            java.util.Iterator r4 = r26.iterator()
            r3 = 0
        L_0x0238:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0273
            java.lang.Object r2 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r2
            java.lang.String r2 = r2.A05
            boolean r2 = X.C04220Ms.A0I(r2, r12)
            if (r2 == 0) goto L_0x026c
            if (r3 < 0) goto L_0x0273
            r2 = r26
            java.lang.Object r2 = r2.get(r3)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2) r2
            boolean r2 = r2.A07
            r2 = r2 ^ 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2
            r4.<init>((int) r9, (java.lang.String) r12, (boolean) r2)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r3 = r13.A02
            java.lang.String r2 = r13.A06
            java.lang.Object r2 = r3.A00(r4, r2, r0)
            if (r2 != r1) goto L_0x0273
        L_0x0269:
            if (r2 != r1) goto L_0x0162
            return r1
        L_0x026c:
            int r3 = r3 + 1
            goto L_0x0238
        L_0x026f:
            int r10 = r10 + 1
            goto L_0x01ab
        L_0x0273:
            kotlin.Unit r2 = kotlin.Unit.A00
            goto L_0x0269
        L_0x0276:
            X.AnonymousClass0OU.A00(r28)
            goto L_0x0284
        L_0x027a:
            boolean r1 = r3.BSN()
            if (r1 != r6) goto L_0x0287
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0287
        L_0x0284:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0287:
            r10 = 0
            java.lang.String r9 = r0.A03
            boolean r12 = r0.A05
            r11 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r10, r10, r6, r5, r0)
            r4.put(r8, r0)
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S2211000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S2211000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S2211000_I2(Object obj, Object obj2, String str, String str2, C146958n9 r6, int i, boolean z) {
        super(2, r6);
        this.A06 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A05 = z;
        this.A03 = str2;
    }
}
