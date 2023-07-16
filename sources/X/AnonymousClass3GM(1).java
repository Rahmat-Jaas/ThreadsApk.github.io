package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2;
import java.util.List;
import java.util.Map;

/* renamed from: X.3GM  reason: invalid class name */
public abstract class AnonymousClass3GM {
    public KtCSuperShape0S0121000_I2 A00;
    public AnonymousClass17J A01;
    public C148838sG A02;
    public final int A03;
    public final int A04;
    public final M5J A05;
    public final M5J A06;
    public final M5J A07;
    public final M5J A08;
    public final AnonymousClass25P A09;
    public final AnonymousClass25P A0A;
    public final AnonymousClass25P A0B;
    public final AnonymousClass25P A0C;
    public final C83654rl A0D;
    public final AnonymousClass38V A0E;
    public final Map A0F;
    public final AnonymousClass0ZU A0G;
    public final C86074wE A0H;
    public final C86074wE A0I;
    public final C86074wE A0J;
    public final boolean A0K;
    public final C84714tk A0L;

    public final void A01(AnonymousClass225 r7) {
        C04220Ms.A0B(r7, 0);
        this.A0H.CrC(r7);
        AnonymousClass17J r0 = this.A01;
        if (r0 != null) {
            C83654rl r1 = r0.A03;
            AnonymousClass38V r5 = this.A0E;
            if (r5 != null) {
                r5.A00.put(r1, r7);
            }
            if (this.A0K && r7 == AnonymousClass225.VISIBLE) {
                KtCSuperShape0S0121000_I2 ktCSuperShape0S0121000_I2 = this.A00;
                int i = ktCSuperShape0S0121000_I2.A00;
                List list = (List) ktCSuperShape0S0121000_I2.A01;
                boolean z = ktCSuperShape0S0121000_I2.A02;
                C04220Ms.A0B(list, 1);
                KtCSuperShape0S0121000_I2 ktCSuperShape0S0121000_I22 = new KtCSuperShape0S0121000_I2(list, i, z, true);
                C83654rl r12 = this.A0D;
                if (!(r12 == null || r5 == null)) {
                    r5.A01.put(r12, ktCSuperShape0S0121000_I22);
                }
                this.A00 = ktCSuperShape0S0121000_I22;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00ab, code lost:
        r0 = r3.A00.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3GM(X.AnonymousClass25P r22, X.AnonymousClass25P r23, X.AnonymousClass25P r24, X.AnonymousClass25P r25, X.C83654rl r26, X.AnonymousClass38V r27, X.AnonymousClass0ZU r28, X.C83224qz r29, X.C84714tk r30, int r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            r21 = this;
            r8 = 1
            r2 = 2
            r7 = 4
            r1 = 5
            r5 = r21
            r5.<init>()
            r0 = r22
            r5.A09 = r0
            r0 = r23
            r5.A0A = r0
            r0 = r24
            r5.A0C = r0
            r0 = r25
            r5.A0B = r0
            r0 = r31
            r5.A03 = r0
            r4 = r26
            r5.A0D = r4
            r3 = r27
            r5.A0E = r3
            r0 = r32
            r5.A04 = r0
            r0 = r28
            r5.A0G = r0
            r0 = r35
            r5.A0K = r0
            X.2AP r6 = X.AnonymousClass2AP.A0D
            r0 = 2131233436(0x7f080a9c, float:1.808301E38)
            kotlin.Pair r11 = X.AnonymousClass0wJ.A10(r6, r0)
            java.lang.Boolean r10 = X.C18180wK.A0X()
            X.2AP r6 = X.AnonymousClass2AP.A0M
            r0 = 2131233438(0x7f080a9e, float:1.8083014E38)
            kotlin.Pair r12 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r6 = X.AnonymousClass2AP.A0W
            r0 = 2131233439(0x7f080a9f, float:1.8083016E38)
            kotlin.Pair r13 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r6 = X.AnonymousClass2AP.A0Z
            r0 = 2131233440(0x7f080aa0, float:1.8083018E38)
            kotlin.Pair r14 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r9 = X.AnonymousClass2AP.A0a
            r0 = 2131233441(0x7f080aa1, float:1.808302E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r15 = X.C18180wK.A0p(r9, r6)
            X.2AP r0 = X.AnonymousClass2AP.A0A
            kotlin.Pair r16 = X.C18180wK.A0p(r0, r6)
            X.2AP r6 = X.AnonymousClass2AP.A07
            r0 = 2131232221(0x7f0805dd, float:1.8080545E38)
            kotlin.Pair r17 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r6 = X.AnonymousClass2AP.A0Y
            r0 = 2131232987(0x7f0808db, float:1.8082099E38)
            kotlin.Pair r18 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r6 = X.AnonymousClass2AP.A0I
            r0 = 2131232539(0x7f08071b, float:1.808119E38)
            kotlin.Pair r19 = X.AnonymousClass0wJ.A10(r6, r0)
            X.2AP r6 = X.AnonymousClass2AP.A0U
            r0 = 2131232215(0x7f0805d7, float:1.8080533E38)
            kotlin.Pair r20 = X.AnonymousClass0wJ.A10(r6, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.Map r0 = X.AnonymousClass4WJ.A0H(r0)
            r5.A0F = r0
            X.Enn r11 = X.C18190wL.A0z(r10)
            r5.A0J = r11
            X.Enn r9 = X.C18190wL.A0z(r10)
            r5.A0I = r9
            r6 = 0
            if (r26 == 0) goto L_0x00b3
            if (r27 == 0) goto L_0x00b3
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto L_0x00b5
        L_0x00b3:
            X.225 r0 = X.AnonymousClass225.IDLE
        L_0x00b5:
            if (r0 != 0) goto L_0x00b9
            X.Lr0 r0 = X.DIV.A01
        L_0x00b9:
            X.Enn r0 = X.C18190wL.A0z(r0)
            r5.A0H = r0
            if (r26 == 0) goto L_0x01a9
            if (r27 == 0) goto L_0x01a9
            java.util.Map r0 = r3.A01
            java.lang.Object r0 = r0.get(r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2) r0
            if (r0 == 0) goto L_0x01a9
            int r10 = r0.A00
            java.lang.Object r4 = r0.A01
            java.util.List r4 = (java.util.List) r4
            boolean r3 = r0.A02
            boolean r0 = r0.A03
            X.C04220Ms.A0B(r4, r8)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2 r8 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2
            r8.<init>((java.util.List) r4, (int) r10, (boolean) r3, (boolean) r0)
        L_0x00df:
            r5.A00 = r8
            r3 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0200000_I2_6 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0200000_I2_6
            r0.<init>(r5, r6, r3)
            r10 = 34
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r14 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r3 = r30
            r14.<init>((X.AnonymousClass0YP) r0, (X.C84714tk) r3, (int) r10)
            r5.A0L = r14
            r12 = 24
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r0 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r0.<init>((int) r12, (java.lang.Object) r5, (java.lang.Object) r14)
            r8 = r29
            X.Ew2 r4 = r8.Aa1()
            X.M5J r0 = X.C29110FiC.A00(r4, r0, r2)
            r5.A05 = r0
            r13 = 25
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r3 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r3.<init>(r14, r13)
            com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2 r0 = new com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2
            r15 = r33
            r0.<init>(r6, r15)
            X.4tk r15 = X.C25807DsL.A01(r0, r3, r9)
            X.4wE r3 = r5.A0H
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0110000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape3S0110000_I2
            r0.<init>(r1, r6)
            X.4tk r0 = X.C25807DsL.A01(r0, r15, r3)
            X.M5J r0 = X.C29110FiC.A00(r4, r0, r2)
            r5.A07 = r0
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r3 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r3.<init>((int) r13, (java.lang.Object) r5, (java.lang.Object) r14)
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4
            r0.<init>(r5, r6, r13)
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r1 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r1.<init>((X.AnonymousClass0YP) r0, (X.C84714tk) r3, (int) r10)
            r3 = 22
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2
            r0.<init>(r3, r6)
            X.4tk r1 = X.C25807DsL.A01(r0, r1, r11)
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r0 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r0.<init>(r1, r12)
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r1 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r1.<init>(r0, r3)
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2
            r0.<init>(r3, r6)
            X.4tk r0 = X.C25807DsL.A01(r0, r1, r9)
            X.4Uw r1 = new X.4Uw
            r11 = r34
            r1.<init>(r0, r11)
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r0 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r0.<init>(r1, r3)
            X.4tk r3 = X.C25240DiL.A01(r0)
            r0 = 29
            kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r8, (X.C146958n9) r6, (int) r0)
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r0 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r0.<init>((X.AnonymousClass0YP) r1, (X.C84714tk) r3, (int) r10)
            r8 = 23
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r3 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r3.<init>((int) r8, (java.lang.Object) r5, (java.lang.Object) r0)
            r0 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0200000_I2_6 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0200000_I2_6
            r1.<init>(r5, r6, r0)
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r0 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r0.<init>((X.AnonymousClass0YP) r1, (X.C84714tk) r3, (int) r10)
            X.M5J r0 = X.C29110FiC.A00(r4, r0, r2)
            r5.A08 = r0
            X.4wE r0 = r5.A0H
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r3 = new com.facebook.redex.IDxFlowShape250S0100000_1_I2
            r3.<init>(r0, r8)
            r0 = 26
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r1 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r3)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0210000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0210000_I2
            r0.<init>(r5, r6, r7)
            X.4tk r0 = X.C25807DsL.A01(r0, r1, r9)
            X.M5J r0 = X.C29110FiC.A00(r4, r0, r2)
            r5.A06 = r0
            return
        L_0x01a9:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
            r3 = 0
            r0 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2 r8 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0121000_I2
            r8.<init>((java.util.List) r4, (int) r3, (int) r0, (boolean) r3)
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GM.<init>(X.25P, X.25P, X.25P, X.25P, X.4rl, X.38V, X.0ZU, X.4qz, X.4tk, int, int, boolean, boolean, boolean):void");
    }
}
