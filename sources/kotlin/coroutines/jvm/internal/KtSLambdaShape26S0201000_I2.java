package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.C109946ks;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import kotlin.Unit;

public class KtSLambdaShape26S0201000_I2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape26S0201000_I2(C109946ks r2, C146958n9 r3) {
        super(1, r3);
        this.A03 = 1;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2(r2, r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        return new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2(r1, r2, r5, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146958n9 create(X.C146958n9 r5) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0028;
                case 2: goto L_0x0022;
                case 3: goto L_0x0010;
                case 4: goto L_0x001c;
                case 5: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 6
        L_0x000a:
            kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2
            r3.<init>(r1, r2, r5, r0)
            return r3
        L_0x0010:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 3
            goto L_0x000a
        L_0x0016:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 5
            goto L_0x0037
        L_0x001c:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 4
            goto L_0x0037
        L_0x0022:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 2
            goto L_0x0037
        L_0x0028:
            java.lang.Object r0 = r4.A02
            X.6ks r0 = (X.C109946ks) r0
            kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2
            r3.<init>(r0, r5)
            return r3
        L_0x0032:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 0
        L_0x0037:
            kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2
            r3.<init>(r2, r1, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2.create(X.8n9):X.8n9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02c6, code lost:
        r0 = X.C25817DsW.A01(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0354, code lost:
        if (r0 != r3) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0356, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0357, code lost:
        X.AnonymousClass0OU.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x035c, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r4 = r19
            r7 = r20
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0329;
                case 1: goto L_0x006d;
                case 2: goto L_0x02cc;
                case 3: goto L_0x003a;
                case 4: goto L_0x023e;
                case 5: goto L_0x0166;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 != r5) goto L_0x0068
            X.AnonymousClass0OU.A00(r7)
        L_0x0016:
            java.lang.Object r0 = r4.A02
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            r0.A00 = r6
            kotlin.Unit r7 = kotlin.Unit.A00
        L_0x001e:
            return r7
        L_0x001f:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r2 = r4.A01
            X.4r0 r2 = (X.C83234r0) r2
            X.Lr0 r1 = X.DIV.A01
            java.lang.Object r0 = r4.A02
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            if (r0 != r1) goto L_0x0031
            r0 = r6
        L_0x0031:
            r4.A00 = r5
            java.lang.Object r0 = r2.emit(r0, r4)
            if (r0 != r3) goto L_0x0016
            return r3
        L_0x003a:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r5) goto L_0x035d
            X.AnonymousClass0OU.A00(r7)
            return r7
        L_0x0047:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r2 = r4.A01
            X.8kk r2 = (X.C145588kk) r2
            boolean r0 = r2 instanceof X.C148718rj
            if (r0 == 0) goto L_0x0362
            r1 = r2
            X.8rj r1 = (X.C148718rj) r1
            boolean r0 = r1.BFH()
            if (r0 == 0) goto L_0x0362
            java.lang.Object r0 = r4.A02
            X.GbS r0 = (X.C30936GbS) r0
            r4.A00 = r5
            java.lang.Object r7 = r1.D7x(r0, r4)
            if (r7 != r3) goto L_0x001e
            return r3
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x006d:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r8 = 2
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0098
            if (r0 == r1) goto L_0x00e2
            java.lang.Object r6 = r4.A01
            X.6kp r6 = (X.C109916kp) r6
            X.AnonymousClass0OU.A00(r7)
        L_0x007f:
            java.lang.Object r0 = r4.A02
            X.6ks r0 = (X.C109946ks) r0
            X.4wE r3 = r0.A02
        L_0x0085:
            java.lang.Object r2 = r3.getValue()
            X.67Y r1 = X.AnonymousClass67Y.Success
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C109916kp) r6, (X.AnonymousClass67Y) r1)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0085
            goto L_0x035a
        L_0x0098:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r9 = r4.A02
            X.6ks r9 = (X.C109946ks) r9
            X.4wE r7 = r9.A02
        L_0x00a1:
            java.lang.Object r6 = r7.getValue()
            r0 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            X.67Y r5 = X.AnonymousClass67Y.Loading
            java.lang.Object r2 = r0.A01
            X.6kp r2 = (X.C109916kp) r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C109916kp) r2, (X.AnonymousClass67Y) r5)
            boolean r0 = r7.ADi(r6, r0)
            if (r0 == 0) goto L_0x00a1
            com.instagram.service.session.UserSession r0 = r9.A01
            r6 = 0
            X.H1T r5 = X.C18180wK.A0P(r0)
            java.lang.String r2 = "text_feed/"
            java.lang.String r0 = "onboarding_initial_user_info/"
            X.AnonymousClass0wJ.A1J(r5, r2, r0)
            java.lang.Class<X.5t9> r2 = X.AnonymousClass5t9.class
            java.lang.Class<X.6yj> r0 = X.C117466yj.class
            X.H8c r5 = X.AnonymousClass0wJ.A0T(r5, r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.TextPostAppOnboardingInitialUserInfo>>"
            X.C04220Ms.A0C(r5, r0)
            r2 = 762262848(0x2d6f3540, float:1.3597401E-11)
            r0 = 14
            r4.A00 = r1
            java.lang.Object r7 = X.C63623hv.A01(r5, r4, r2, r6, r0)
            if (r7 != r3) goto L_0x00e5
            return r3
        L_0x00e2:
            X.AnonymousClass0OU.A00(r7)
        L_0x00e5:
            X.3b6 r7 = (X.C62903b6) r7
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0142
            java.lang.Object r6 = X.C62903b6.A05(r7)
            X.C04220Ms.A06(r6)
            X.6kp r6 = (X.C109916kp) r6
            java.lang.Object r0 = r4.A02
            X.6ks r0 = (X.C109946ks) r0
            com.instagram.service.session.UserSession r0 = r0.A01
            com.instagram.barcelona.onboarding.data.OnboardingRespository r7 = X.AnonymousClass6NJ.A00(r0)
            boolean r0 = r6.A02
            r7.A03 = r0
            if (r0 == 0) goto L_0x0132
            com.instagram.user.model.User r0 = r7.A07
            r0.B4M()
            com.instagram.common.typedurl.ImageUrl r0 = r0.B4M()
            X.5wN r12 = new X.5wN
            r12.<init>(r0, r1)
            X.4wE r5 = r7.A08
        L_0x0114:
            java.lang.Object r2 = r5.getValue()
            r1 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r1
            java.lang.Object r11 = r1.A00
            X.5Im r11 = (X.AnonymousClass5Im) r11
            r18 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            X.5Im r0 = X.AnonymousClass5Im.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.C86124wJ.A1Z(r1, r0, r2, r5)
            if (r0 == 0) goto L_0x0114
        L_0x0132:
            boolean r0 = r6.A03
            r7.A09(r0)
            r4.A01 = r6
            r4.A00 = r8
            java.lang.Object r0 = r7.A06(r4)
            if (r0 != r3) goto L_0x007f
            return r3
        L_0x0142:
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x035a
            java.lang.Object r0 = r4.A02
            X.6ks r0 = (X.C109946ks) r0
            X.4wE r4 = r0.A02
        L_0x014c:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            X.67Y r2 = X.AnonymousClass67Y.Fail
            java.lang.Object r1 = r0.A01
            X.6kp r1 = (X.C109916kp) r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((X.C109916kp) r1, (X.AnonymousClass67Y) r2)
            boolean r0 = r4.ADi(r3, r0)
            if (r0 == 0) goto L_0x014c
            goto L_0x035a
        L_0x0166:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0174
            if (r0 == r6) goto L_0x0357
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0174:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r8 = r4.A02
            X.7EI r8 = (X.AnonymousClass7EI) r8
            X.6fD r0 = r8.A02
            java.lang.Object r5 = r4.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2620000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2620000_I2) r5
            r9 = 0
            X.C04220Ms.A0B(r5, r9)
            com.instagram.service.session.UserSession r0 = r0.A00
            r7 = 0
            X.H1T r10 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "fbsearch/ig_shop_product_serp/"
            r10.A0J(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r10.A0F(r0)
            java.lang.Class<X.9MX> r1 = X.AnonymousClass9MX.class
            java.lang.Class<X.Ani> r0 = X.C18922Ani.class
            r10.A0B(r1, r0)
            java.lang.Object r2 = r5.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint$SearchFeedEndpoint r2 = (com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint.SearchFeedEndpoint) r2
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "query"
            r10.A0O(r0, r1)
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "pagination_token"
            r10.A0P(r0, r1)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "request_session_id"
            r10.A0P(r0, r1)
            java.lang.String r1 = r2.A03
            r0 = 306(0x132, float:4.29E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r10.A0P(r0, r1)
            java.lang.String r1 = r2.A01
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A0P(r0, r1)
            boolean r0 = r5.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_ptr"
            r10.A0M(r0, r1)
            java.lang.Object r0 = r5.A01
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x01df:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.String r0 = X.C18230wP.A0u(r0)
            r10.A0O(r1, r0)
            goto L_0x01df
        L_0x01f5:
            X.H8c r1 = r10.A02()
            r0 = 756(0x2f4, float:1.06E-42)
            X.4tk r1 = X.C86164wN.A13(r1, r0, r9)
            r0 = 35
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r2 = X.C86124wJ.A0V(r1, r0)
            r1 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5
            r0.<init>(r5, r7, r1)
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r1 = X.C86144wL.A0O(r0, r2)
            kotlin.jvm.internal.KtLambdaShape36S0200000_I2_20 r0 = new kotlin.jvm.internal.KtLambdaShape36S0200000_I2_20
            r0.<init>(r9, r5, r8)
            X.4tk r2 = X.C63623hv.A04(r0, r1)
            r1 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1
            r0.<init>(r5, r8, r7, r1)
            X.4tk r2 = X.C63623hv.A08(r0, r2)
            r1 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8
            r0.<init>(r5, r8, r7, r1)
            X.4tk r2 = X.C63623hv.A07(r0, r2)
            r1 = 25
            kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110 r0 = new kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110
            r0.<init>(r5, r1)
            X.4tk r0 = X.C63623hv.A05(r0, r2)
            r4.A00 = r6
            goto L_0x02c6
        L_0x023e:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r8 = 1
            if (r0 == 0) goto L_0x024c
            if (r0 == r8) goto L_0x0357
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x024c:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r9 = r4.A02
            X.7EH r9 = (X.AnonymousClass7EH) r9
            X.6fC r0 = r9.A02
            java.lang.Object r7 = r4.A01
            X.92Z r7 = (X.AnonymousClass92Z) r7
            r2 = 0
            X.C04220Ms.A0B(r7, r2)
            com.instagram.service.session.UserSession r0 = r0.A00
            r6 = 0
            X.H1T r5 = X.AnonymousClass0wJ.A0P(r0)
            com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint$MediaFeedEndpoint r0 = r7.A00
            java.lang.String r11 = r0.A00
            java.lang.String r10 = "[_@]"
            java.lang.String[] r0 = r11.split(r10)
            r1 = r0[r2]
            java.lang.String r0 = "commerce/destination/fuchsia/media_post_tap/%s/"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object) r1)
            X.C04220Ms.A06(r0)
            r5.A0J(r0)
            java.lang.String[] r0 = r11.split(r10)
            r1 = r0[r8]
            java.lang.String r0 = "author_id"
            r5.A0O(r0, r1)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "pagination_token"
            r5.A0P(r0, r1)
            java.lang.Class<X.9MX> r1 = X.AnonymousClass9MX.class
            java.lang.Class<X.Ani> r0 = X.C18922Ani.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r5, r1, r0)
            r0 = 952027067(0x38bec7bb, float:9.097109E-5)
            r5 = 14
            X.4tk r1 = X.C63623hv.A03(r1, r0, r2, r5)
            r0 = 33
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r2 = X.C86124wJ.A0V(r1, r0)
            r1 = 49
            kotlin.jvm.internal.KtLambdaShape35S0200000_I2_19 r0 = new kotlin.jvm.internal.KtLambdaShape35S0200000_I2_19
            r0.<init>(r1, r7, r9)
            X.4tk r2 = X.C63623hv.A04(r0, r2)
            r1 = 18
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0300000_I2_1
            r0.<init>(r7, r9, r6, r1)
            X.4tk r1 = X.C63623hv.A08(r0, r2)
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8
            r0.<init>(r7, r9, r6, r5)
            X.4tk r0 = X.C63623hv.A07(r0, r1)
            r4.A00 = r8
        L_0x02c6:
            java.lang.Object r0 = X.C25817DsW.A01(r4, r0)
            goto L_0x0354
        L_0x02cc:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0305
            if (r0 != r9) goto L_0x0357
            X.AnonymousClass0OU.A00(r7)
        L_0x02d9:
            X.7pk r0 = X.C130317pk.A00
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 != 0) goto L_0x035a
            X.7pj r0 = X.C130307pj.A00
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 != 0) goto L_0x035a
            boolean r0 = r7 instanceof X.AnonymousClass5MD
            if (r0 == 0) goto L_0x035a
            java.lang.Object r5 = r4.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            java.lang.Object r2 = r4.A01
            r4.A00 = r6
            r1 = 37
            kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4
            r0.<init>(r1, r2, r7)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(r5, r4, r0)
            if (r0 == r3) goto L_0x0354
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x0354
        L_0x0305:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r8 = r4.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r8
            X.4qz r7 = r8.A01
            r5 = 0
            java.lang.Object r2 = r4.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2) r2
            r0 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3
            r1.<init>(r8, r2, r5, r0)
            r0 = 3
            X.C25237DiI.A00(r5, r5, r1, r7, r0)
            com.instagram.service.session.UserSession r0 = r8.A04
            r4.A00 = r9
            java.lang.Object r7 = com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt.A00(r2, r0, r4)
            if (r7 != r3) goto L_0x02d9
            return r3
        L_0x0329:
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r8 = 1
            if (r0 == 0) goto L_0x0337
            if (r0 == r8) goto L_0x0357
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0337:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r6 = r4.A02
            androidx.paging.PagingDataDiffer r6 = (androidx.paging.PagingDataDiffer) r6
            java.lang.Object r5 = r4.A01
            X.6ii r5 = (X.C108646ii) r5
            X.8dY r0 = r5.A01
            r6.A02 = r0
            X.4tk r2 = r5.A02
            r1 = 7
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r0 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r5)
            r4.A00 = r8
            java.lang.Object r0 = r2.collect(r0, r4)
        L_0x0354:
            if (r0 != r3) goto L_0x035a
            return r3
        L_0x0357:
            X.AnonymousClass0OU.A00(r7)
        L_0x035a:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x035d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0362:
            java.lang.Object r0 = r4.A02
            X.GbS r0 = (X.C30936GbS) r0
            X.Fe2 r7 = r2.D7y(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape26S0201000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape26S0201000_I2(Object obj, Object obj2, C146958n9 r4, int i) {
        super(1, r4);
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
