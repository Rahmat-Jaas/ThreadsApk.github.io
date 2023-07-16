package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.shopping.model.destination.home.ProductFeedHeader;
import com.instagram.shopping.model.destination.home.Subtitle;

/* renamed from: X.7IA  reason: invalid class name */
public final class AnonymousClass7IA {
    public static final AnonymousClass7IA A00 = new AnonymousClass7IA();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r3.A00 == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.C19872BDy A01(com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo r25, com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo r26, X.C146228lr r27, com.instagram.shopping.model.destination.home.ProductFeedHeader r28, java.lang.Integer r29, java.lang.String r30, X.AnonymousClass0ZU r31, int r32) {
        /*
            r23 = r26
            r24 = r25
            r26 = r27
            r14 = r31
            r7 = r29
            r0 = r32 & 2
            r4 = 0
            if (r0 == 0) goto L_0x0010
            r7 = r4
        L_0x0010:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x0015
            r14 = r4
        L_0x0015:
            r0 = r32 & 8
            if (r0 == 0) goto L_0x001b
            r26 = r4
        L_0x001b:
            r0 = r32 & 16
            if (r0 == 0) goto L_0x0021
            r24 = r4
        L_0x0021:
            r0 = r32 & 32
            if (r0 == 0) goto L_0x0027
            r23 = r4
        L_0x0027:
            r27 = r30
            boolean r18 = X.C18210wN.A1V(r27)
            r1 = r28
            java.lang.String r9 = r1.A03
            com.instagram.shopping.model.destination.home.Subtitle r3 = r1.A01
            if (r3 == 0) goto L_0x007c
            java.lang.String r10 = r3.A01
        L_0x0037:
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget r2 = r1.A00
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationButton r0 = r2.A00
            if (r0 == 0) goto L_0x007a
            java.lang.String r11 = r0.A01
        L_0x003f:
            com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget$RichDestinationChevron r0 = r2.A01
            boolean r20 = X.AnonymousClass0wJ.A1W(r0)
            if (r3 == 0) goto L_0x004d
            X.As6 r0 = r3.A00
            r21 = 1
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            r21 = 0
        L_0x004f:
            r28 = 13
            kotlin.jvm.internal.KtLambdaShape3S1400000_I2 r16 = new kotlin.jvm.internal.KtLambdaShape3S1400000_I2
            r22 = r16
            r25 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r28 = 19
            kotlin.jvm.internal.KtLambdaShape2S1400000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape2S1400000_I2
            r22 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r28 = 20
            kotlin.jvm.internal.KtLambdaShape2S1400000_I2 r15 = new kotlin.jvm.internal.KtLambdaShape2S1400000_I2
            r22 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r17 = 4789(0x12b5, float:6.711E-42)
            X.BDy r3 = new X.BDy
            r5 = r4
            r6 = r4
            r8 = r4
            r12 = r4
            r19 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r3
        L_0x007a:
            r11 = r4
            goto L_0x003f
        L_0x007c:
            r10 = r4
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IA.A01(com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo, com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo, X.8lr, com.instagram.shopping.model.destination.home.ProductFeedHeader, java.lang.Integer, java.lang.String, X.0ZU, int):X.BDy");
    }

    public static final Long A02(ProductFeedHeader productFeedHeader) {
        C19187As6 as6;
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2;
        IgFundedIncentive igFundedIncentive;
        Subtitle subtitle = productFeedHeader.A01;
        if (subtitle == null || (as6 = subtitle.A00) == null || (ktCSuperShape0S3100000_I2 = as6.A03) == null || (igFundedIncentive = (IgFundedIncentive) ktCSuperShape0S3100000_I2.A00) == null) {
            return null;
        }
        return AnonymousClass0wJ.A0d(igFundedIncentive.A07);
    }

    public static KtCSuperShape0S0300000_I2 A00(ProductFeedHeader productFeedHeader, Object obj, Object obj2) {
        return new KtCSuperShape0S0300000_I2(27, (Object) A02(productFeedHeader), obj, obj2);
    }
}
