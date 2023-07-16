package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.C02220Ah;

public class KtLambdaShape0S0802000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final int A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0802000_I2(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(2);
        this.A0A = i3;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A08 = obj4;
        this.A07 = obj5;
        this.A09 = obj6;
        this.A02 = obj7;
        this.A06 = obj8;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        if (r8 == X.C970267q.REPOST_PREVIEW) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
        /*
            r33 = this;
            r0 = r33
            r14 = r34
            int r1 = r0.A0A
            r2 = r35
            switch(r1) {
                case 0: goto L_0x003d;
                case 1: goto L_0x006d;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.8nY r3 = X.C86104wH.A0H(r14, r2)
            java.lang.Object r6 = r0.A07
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.A08
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r5 = r0.A09
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r8 = r0.A05
            X.0YY r8 = (X.AnonymousClass0YY) r8
            java.lang.Object r9 = r0.A06
            X.0YY r9 = (X.AnonymousClass0YY) r9
            java.lang.Object r4 = r0.A04
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            java.lang.Object r2 = r0.A03
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            java.lang.Object r10 = r0.A02
            X.4qz r10 = (X.C83224qz) r10
            int r1 = r0.A00
            int r11 = X.C115796vv.A00(r1)
            int r12 = r0.A01
            X.AnonymousClass7Hw.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x003a:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x003d:
            X.8nY r4 = X.C86104wH.A0H(r14, r2)
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.A05
            androidx.compose.foundation.lazy.LazyListState r3 = (androidx.compose.foundation.lazy.LazyListState) r3
            java.lang.Object r6 = r0.A04
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r6
            java.lang.Object r9 = r0.A08
            X.0YY r9 = (X.AnonymousClass0YY) r9
            java.lang.Object r10 = r0.A07
            X.0YY r10 = (X.AnonymousClass0YY) r10
            java.lang.Object r8 = r0.A09
            X.56Y r8 = (X.AnonymousClass56Y) r8
            java.lang.Object r7 = r0.A02
            X.68l r7 = (X.C972268l) r7
            java.lang.Object r5 = r0.A06
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            int r1 = r0.A00
            int r11 = X.C115796vv.A00(r1)
            int r12 = r0.A01
            X.C117626yz.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x003a
        L_0x006d:
            X.8nY r14 = (X.C147188nY) r14
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r2 = r1 & 11
            r1 = 2
            if (r2 != r1) goto L_0x0082
            boolean r1 = r14.BCM()
            if (r1 == 0) goto L_0x0082
            r14.CuJ()
            goto L_0x003a
        L_0x0082:
            java.lang.Object r4 = r0.A03
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            X.687 r2 = X.AnonymousClass687.Start
            java.lang.Object r1 = r0.A07
            com.instagram.api.schemas.LineType r1 = (com.instagram.api.schemas.LineType) r1
            X.687 r3 = X.AnonymousClass6MK.A00(r1, r2)
            java.lang.Object r8 = r0.A08
            X.67q r1 = X.C970267q.POST
            r5 = 0
            if (r8 == r1) goto L_0x009c
            X.67q r1 = X.C970267q.REPOST_PREVIEW
            r2 = 0
            if (r8 != r1) goto L_0x009d
        L_0x009c:
            r2 = 1
        L_0x009d:
            int r9 = r0.A00
            r1 = 4
            androidx.compose.ui.Modifier r7 = X.AnonymousClass73T.A00(r14, r4, r3, r1, r2)
            X.6hH r1 = X.C103106Xv.A00
            float r6 = r1.A00
            X.67q r4 = X.C970267q.TARGET_POST
            r3 = r6
            if (r8 != r4) goto L_0x00b0
            r1 = 28
            float r3 = (float) r1
        L_0x00b0:
            float r2 = (float) r5
            if (r8 != r4) goto L_0x00b5
            r1 = 5
            float r2 = (float) r1
        L_0x00b5:
            r1 = 8
            float r1 = (float) r1
            androidx.compose.ui.Modifier r4 = X.AnonymousClass7K4.A05(r7, r6, r2, r3, r1)
            r6 = 0
            X.7Tu r3 = X.C122777Tu.A00(r6)
            X.C04220Ms.A0B(r4, r5)
            r22 = 1
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled
            if (r1 == 0) goto L_0x01bb
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r1 = X.C86164wN.A10(r3, r6, r1)
        L_0x00d0:
            kotlin.jvm.internal.KtLambdaShape50S0200000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape50S0200000_I2
            r2.<init>(r5, r6, r3)
            androidx.compose.ui.Modifier r11 = X.C120417Am.A02(r4, r1, r2)
            java.lang.Object r4 = r0.A09
            r7 = 1157296644(0x44faf204, float:2007.563)
            boolean r1 = X.C147188nY.A0z(r14, r4, r7)
            r3 = r14
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r10 = r3.A13()
            if (r1 != 0) goto L_0x00ef
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r10 != r1) goto L_0x00f5
        L_0x00ef:
            r1 = 32
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r10 = X.AnonymousClass7W3.A0C(r3, r4, r1)
        L_0x00f5:
            X.AnonymousClass7W3.A0w(r3, r5)
            java.lang.Object r13 = r0.A04
            java.lang.Object r12 = r0.A06
            java.lang.Object r2 = r0.A05
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r1 = X.C147188nY.A10(r14, r13, r12, r1)
            boolean r1 = X.C147188nY.A12(r14, r2, r1)
            java.lang.Object r8 = r3.A13()
            if (r1 != 0) goto L_0x0113
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r8 != r1) goto L_0x011c
        L_0x0113:
            r1 = 40
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r8 = X.C86154wM.A0y(r13, r12, r2, r1)
            r3.A14(r8)
        L_0x011c:
            X.AnonymousClass7W3.A0w(r3, r5)
            r1 = 343641393(0x147b8d31, float:1.2700107E-26)
            r14.Cvb(r1)
            r2 = 0
            boolean r1 = r14.ACa(r10)
            r12 = 1
            if (r1 != 0) goto L_0x012e
            r12 = 0
        L_0x012e:
            boolean r1 = r14.ACa(r8)
            if (r1 == 0) goto L_0x0135
            r2 = 1
        L_0x0135:
            r12 = r12 | r2
            java.lang.Object r2 = r3.A13()
            if (r12 != 0) goto L_0x0140
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x014a
        L_0x0140:
            r1 = 42
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r2.<init>((java.lang.Object) r10, (java.lang.Object) r8, (X.C146958n9) r6, (int) r1)
            r3.A14(r2)
        L_0x014a:
            X.0YP r2 = (X.AnonymousClass0YP) r2
            androidx.compose.ui.Modifier r15 = X.AnonymousClass7CA.A01(r11, r10, r2)
            X.AnonymousClass7W3.A0w(r3, r5)
            X.7If r8 = X.AnonymousClass7J9.A02(r14)
            X.534 r1 = X.AnonymousClass6YS.A00
            long r1 = X.C147188nY.A0R(r14, r1)
            X.534 r10 = X.AnonymousClass6YR.A00
            java.lang.Object r10 = r14.AEA(r10)
            float r10 = X.C18240wQ.A00(r10)
            long r27 = X.C121657He.A04(X.C86154wM.A0G(r1), X.AnonymousClass7KE.A03(r1), X.AnonymousClass7KE.A02(r1), X.AnonymousClass7KE.A01(r1), r10)
            r29 = 0
            r26 = 262142(0x3fffe, float:3.67339E-40)
            X.7If r1 = new X.7If
            r23 = r1
            r24 = r6
            r25 = r6
            r31 = r29
            r23.<init>(r24, r25, r26, r27, r29, r31)
            X.7If r17 = r8.A01(r1)
            r20 = 2
            java.lang.Object r1 = r0.A02
            X.7yH r1 = (X.C134747yH) r1
            boolean r2 = X.C147188nY.A0z(r14, r4, r7)
            java.lang.Object r7 = r3.A13()
            if (r2 != 0) goto L_0x0195
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r7 != r2) goto L_0x019b
        L_0x0195:
            r2 = 33
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r7 = X.AnonymousClass7W3.A0C(r3, r4, r2)
        L_0x019b:
            X.0YY r19 = X.AnonymousClass7W3.A0A(r3, r7, r5)
            int r3 = r0.A01
            r2 = 12804096(0xc36000, float:1.794236E-38)
            r0 = 3670016(0x380000, float:5.142788E-39)
            int r23 = r9 >> 3
            r23 = r23 & r0
            r23 = r23 | r2
            r24 = 256(0x100, float:3.59E-43)
            r18 = r6
            r21 = r3
            r25 = r22
            r16 = r1
            X.C115746vq.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x003a
        L_0x01bb:
            X.0YY r1 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape0S0802000_I2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
