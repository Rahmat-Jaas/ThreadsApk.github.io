package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape2S1301000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1301000_I2(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(3);
        this.A05 = i2;
        this.A02 = obj;
        this.A00 = i;
        this.A04 = str;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a5, code lost:
        r13.CuJ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r20
            r13 = r22
            r1 = r21
            int r2 = r0.A05
            switch(r2) {
                case 0: goto L_0x013e;
                case 1: goto L_0x00ed;
                case 2: goto L_0x0084;
                case 3: goto L_0x004b;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.instagram.model.shopping.productfeed.ProductTile r1 = (com.instagram.model.shopping.productfeed.ProductTile) r1
            android.view.View r13 = (android.view.View) r13
            int r19 = X.AnonymousClass0wJ.A04(r23)
            boolean r3 = X.AnonymousClass0wJ.A1Y(r1, r13)
            java.lang.Object r14 = r0.A02
            X.C18 r14 = (X.C18) r14
            com.instagram.model.shopping.productfeed.ProductFeedItem r2 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r2.<init>((com.instagram.model.shopping.productfeed.ProductTile) r1)
            int r1 = r0.A00
            java.lang.String r9 = r0.A04
            java.lang.Object r5 = r0.A01
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r5 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r5
            java.lang.Object r6 = r0.A03
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r6 = (com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo) r6
            r4 = 0
            java.lang.String r10 = "merchant_preview"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            X.93d r3 = new X.93d
            r11 = r4
            r12 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15 = r13
            r17 = r3
            r18 = r1
            r16 = r2
            r14.CCk(r15, r16, r17, r18, r19)
        L_0x0048:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x004b:
            com.instagram.model.shopping.productfeed.ProductTile r1 = (com.instagram.model.shopping.productfeed.ProductTile) r1
            android.view.View r13 = (android.view.View) r13
            int r17 = X.AnonymousClass0wJ.A04(r23)
            boolean r2 = X.AnonymousClass0wJ.A1Y(r1, r13)
            java.lang.Object r12 = r0.A02
            X.C18 r12 = (X.C18) r12
            com.instagram.model.shopping.productfeed.ProductFeedItem r14 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r14.<init>((com.instagram.model.shopping.productfeed.ProductTile) r1)
            int r1 = r0.A00
            java.lang.String r8 = r0.A04
            java.lang.Object r4 = r0.A01
            com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r4 = (com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo) r4
            java.lang.Object r5 = r0.A03
            com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r5 = (com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo) r5
            r3 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            X.93d r2 = new X.93d
            r9 = r3
            r10 = r3
            r11 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15 = r2
            r16 = r1
            r12.CCj(r13, r14, r15, r16, r17)
            goto L_0x0048
        L_0x0084:
            X.0YP r1 = (X.AnonymousClass0YP) r1
            X.8nY r13 = (X.C147188nY) r13
            int r7 = X.AnonymousClass0wJ.A04(r23)
            r6 = 0
            X.C04220Ms.A0B(r1, r6)
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0099
            int r2 = X.C147188nY.A09(r13, r1)
            r7 = r7 | r2
        L_0x0099:
            r3 = r7 & 91
            r2 = 18
            if (r3 != r2) goto L_0x00a5
            boolean r2 = r13.BCM()
            if (r2 != 0) goto L_0x01a5
        L_0x00a5:
            java.lang.Object r2 = r0.A01
            X.4oM r2 = (X.C81784oM) r2
            boolean r18 = X.C86104wH.A1X(r2)
            java.lang.String r14 = r0.A04
            java.lang.Object r12 = r0.A02
            X.8p3 r12 = (X.C147258p3) r12
            java.lang.Object r5 = r0.A03
            boolean r3 = X.C147188nY.A0y(r13, r5)
            r4 = r13
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r2 = r4.A13()
            if (r3 != 0) goto L_0x00c6
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r2 != r3) goto L_0x00d0
        L_0x00c6:
            r3 = 12
            kotlin.jvm.internal.KtLambdaShape51S0100000_I2_31 r2 = new kotlin.jvm.internal.KtLambdaShape51S0100000_I2_31
            r2.<init>(r5, r3)
            r4.A14(r2)
        L_0x00d0:
            X.0ZU r15 = X.AnonymousClass7W3.A08(r4, r2, r6)
            int r0 = r0.A00
            int r2 = r0 >> 6
            r0 = r2 & 112(0x70, float:1.57E-43)
            r3 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r0
            r2 = 57344(0xe000, float:8.0356E-41)
            int r0 = r7 << 12
            r0 = r0 & r2
            r3 = r3 | r0
            r17 = r3
            r16 = r1
            X.AnonymousClass70R.A01(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0048
        L_0x00ed:
            X.0YP r1 = (X.AnonymousClass0YP) r1
            X.8nY r13 = (X.C147188nY) r13
            int r4 = X.AnonymousClass0wJ.A04(r23)
            int r2 = X.C86124wJ.A0G(r1, r4)
            if (r2 != 0) goto L_0x0100
            int r2 = X.C147188nY.A09(r13, r1)
            r4 = r4 | r2
        L_0x0100:
            r3 = r4 & 91
            r2 = 18
            if (r3 != r2) goto L_0x010c
            boolean r2 = r13.BCM()
            if (r2 != 0) goto L_0x01a5
        L_0x010c:
            java.lang.Object r2 = r0.A01
            X.4oM r2 = (X.C81784oM) r2
            boolean r18 = X.C86104wH.A1X(r2)
            java.lang.String r15 = r0.A04
            java.lang.Object r14 = r0.A03
            X.8ew r14 = (X.C142488ew) r14
            java.lang.Object r12 = r0.A02
            X.8p3 r12 = (X.C147258p3) r12
            int r3 = r0.A00
            int r0 = r3 >> 3
            r2 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r3 >> 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r0
            int r0 = r3 >> 15
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r0 = r4 << 12
            r0 = r0 & r2
            r3 = r3 | r0
            r17 = r3
            r16 = r1
            X.C121737Hu.A01(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0048
        L_0x013e:
            X.0YP r1 = (X.AnonymousClass0YP) r1
            X.8nY r13 = (X.C147188nY) r13
            int r7 = X.AnonymousClass0wJ.A04(r23)
            r6 = 0
            X.C04220Ms.A0B(r1, r6)
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0153
            int r2 = X.C147188nY.A09(r13, r1)
            r7 = r7 | r2
        L_0x0153:
            r3 = r7 & 91
            r2 = 18
            if (r3 != r2) goto L_0x015f
            boolean r2 = r13.BCM()
            if (r2 != 0) goto L_0x01a5
        L_0x015f:
            java.lang.Object r2 = r0.A01
            X.4oM r2 = (X.C81784oM) r2
            boolean r18 = X.C86104wH.A1X(r2)
            java.lang.String r14 = r0.A04
            java.lang.Object r12 = r0.A02
            X.8p3 r12 = (X.C147258p3) r12
            java.lang.Object r5 = r0.A03
            boolean r2 = X.C147188nY.A0y(r13, r5)
            r4 = r13
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r2 != 0) goto L_0x0180
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r3 != r2) goto L_0x0186
        L_0x0180:
            r2 = 23
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r3 = X.AnonymousClass7W3.A0F(r4, r5, r2)
        L_0x0186:
            X.0ZU r15 = X.AnonymousClass7W3.A08(r4, r3, r6)
            int r3 = r0.A00
            int r0 = r3 >> 9
            r2 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r3 >> 15
            r3 = r0 & 896(0x380, float:1.256E-42)
            r3 = r3 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r0 = r7 << 12
            r0 = r0 & r2
            r3 = r3 | r0
            r17 = r3
            r16 = r1
            X.C117636z0.A01(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0048
        L_0x01a5:
            r13.CuJ()
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape2S1301000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
