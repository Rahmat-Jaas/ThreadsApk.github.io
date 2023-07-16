package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape20S0301000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape20S0301000_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(3);
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r14v11, types: [X.8mH] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0242, code lost:
        X.C121857Im.A01(r12, X.C97936Dn.A00(r13, androidx.compose.ui.Modifier.A00), r14, r15, r3, r17, r4, r19, r2, ((r0.A00 << 3) & 7168) | 229760);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            r27 = this;
            r0 = r27
            r14 = r30
            r12 = r29
            r13 = r28
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x032d;
                case 1: goto L_0x02d1;
                case 2: goto L_0x0262;
                case 3: goto L_0x01ca;
                case 4: goto L_0x014f;
                case 5: goto L_0x00da;
                case 6: goto L_0x0055;
                case 7: goto L_0x042c;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.8nY r6 = X.C86104wH.A0H(r12, r14)
            java.lang.Object r8 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2) r8
            java.lang.Object r9 = r0.A03
            X.0ZU r9 = (X.AnonymousClass0ZU) r9
            X.7Wm r5 = androidx.compose.ui.Modifier.A00
            java.lang.Object r4 = r0.A01
            boolean r1 = X.C147188nY.A0y(r6, r4)
            r3 = r6
            X.7W3 r3 = (X.AnonymousClass7W3) r3
            java.lang.Object r2 = r3.A13()
            if (r1 != 0) goto L_0x002e
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x0038
        L_0x002e:
            r1 = 11
            kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21 r2 = new kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21
            r2.<init>(r4, r1)
            r3.A14(r2)
        L_0x0038:
            r11 = 0
            X.0YY r1 = X.AnonymousClass7W3.A0B(r3, r2, r11)
            androidx.compose.ui.Modifier r2 = X.C98246Et.A00(r5, r1)
            r1 = 11
            androidx.compose.ui.Modifier r7 = X.AnonymousClass7K4.A08(r2, r1)
            int r0 = r0.A00
            int r0 = r0 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r10 = r0 | 8
            X.AnonymousClass7KL.A03(r6, r7, r8, r9, r10, r11)
        L_0x0052:
            kotlin.Unit r10 = kotlin.Unit.A00
            return r10
        L_0x0055:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r14)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x0067
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x0067:
            java.lang.Object r4 = r0.A03
            X.5Lw r4 = (X.C90405Lw) r4
            X.8ek r2 = r4.A01
            boolean r1 = r2 instanceof X.C90415Lx
            if (r1 == 0) goto L_0x0096
            r1 = -1148397078(0xffffffffbb8cd9ea, float:-0.0042984383)
            r12.Cvb(r1)
            X.5Lx r2 = (X.C90415Lx) r2
            X.D0g r3 = r2.A00
            boolean r2 = r4.A06
            r1 = 0
            X.68K r15 = X.AnonymousClass6MN.A00(r3, r2, r1)
            java.lang.Object r1 = r0.A01
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4 r16 = X.C86164wN.A0y(r1, r4, r0)
            r13 = 0
            r17 = 0
        L_0x008c:
            r18 = 12
            r14 = r13
            X.AnonymousClass6M7.A00(r12, r13, r14, r15, r16, r17, r18)
        L_0x0092:
            X.AnonymousClass7W3.A0y(r12)
            goto L_0x0052
        L_0x0096:
            X.7pC r1 = X.AnonymousClass7pC.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x00a5
            r2 = -1148396669(0xffffffffbb8cdb83, float:-0.004298629)
        L_0x00a1:
            r12.Cvb(r2)
            goto L_0x0092
        L_0x00a5:
            X.7pD r1 = X.AnonymousClass7pD.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            r2 = -1148396444(0xffffffffbb8cdc64, float:-0.0042987335)
            if (r1 == 0) goto L_0x00a1
            r1 = -1148396620(0xffffffffbb8cdbb4, float:-0.0042986516)
            r12.Cvb(r1)
            X.68K r15 = X.AnonymousClass68K.REMOVE
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C147188nY.A0y(r12, r3)
            r2 = r12
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x00cb
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x00d1
        L_0x00cb:
            r0 = 9
            kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16 r1 = X.AnonymousClass7W3.A0K(r2, r3, r0)
        L_0x00d1:
            r0 = 0
            X.0ZU r16 = X.AnonymousClass7W3.A08(r2, r1, r0)
            r13 = 0
            r17 = 6
            goto L_0x008c
        L_0x00da:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r14)
            r3 = 0
            X.C04220Ms.A0B(r13, r3)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x00f0
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x00f0:
            java.lang.Object r1 = r0.A02
            java.lang.Object r1 = X.C86104wH.A0f(r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r1
            java.lang.String r15 = r1.A02
            X.698 r14 = X.AnonymousClass698.Up
            X.4aq r17 = X.C74684aq.A00
            java.lang.Object r5 = r0.A03
            boolean r1 = X.C147188nY.A0y(r12, r5)
            r4 = r12
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r2 = r4.A13()
            if (r1 != 0) goto L_0x0111
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x0117
        L_0x0111:
            r1 = 33
            kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7 r2 = X.AnonymousClass7W3.A0D(r4, r5, r1)
        L_0x0117:
            X.0YY r18 = X.AnonymousClass7W3.A0A(r4, r2, r3)
            r1 = 2131822195(0x7f110673, float:1.9277155E38)
            java.lang.String r16 = X.AnonymousClass7JS.A01(r12, r1)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r11 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r1)
            r1 = 14
            float r4 = (float) r1
            r1 = 8
            float r2 = (float) r1
            float r1 = (float) r3
            androidx.compose.ui.Modifier r2 = X.AnonymousClass7K4.A05(r5, r1, r4, r1, r2)
            java.lang.Object r1 = r0.A01
            X.77X r1 = (X.AnonymousClass77X) r1
            X.AnonymousClass0wJ.A1N(r2, r1)
            androidx.compose.ui.focus.FocusRequesterElement r0 = new androidx.compose.ui.focus.FocusRequesterElement
            r0.<init>(r1)
            androidx.compose.ui.Modifier r13 = r2.Cx6(r0)
            r19 = 432(0x1b0, float:6.05E-43)
            r20 = 192(0xc0, float:2.69E-43)
            r21 = r3
            X.C117636z0.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0052
        L_0x014f:
            X.8cb r13 = (X.C141678cb) r13
            X.8nY r12 = (X.C147188nY) r12
            int r2 = X.AnonymousClass0wJ.A04(r14)
            r6 = 0
            X.C04220Ms.A0B(r13, r6)
            r1 = r2 & 14
            if (r1 != 0) goto L_0x01c8
            int r1 = X.C147188nY.A0F(r12, r13)
            r1 = r1 | r2
        L_0x0164:
            r2 = r1 & 91
            r1 = 18
            if (r2 != r1) goto L_0x0170
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x0170:
            java.lang.Object r3 = r0.A03
            X.57z r3 = (X.C884257z) r3
            r4 = 1157296644(0x44faf204, float:2007.563)
            boolean r1 = X.C147188nY.A0z(r12, r3, r4)
            r5 = r12
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r2 = r5.A13()
            if (r1 != 0) goto L_0x0188
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x0192
        L_0x0188:
            r1 = 15
            kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1 r2 = new kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1
            r2.<init>(r3, r1)
            r5.A14(r2)
        L_0x0192:
            X.AnonymousClass7W3.A0w(r5, r6)
            X.0YP r2 = (X.AnonymousClass0YP) r2
            boolean r1 = X.C147188nY.A0z(r12, r3, r4)
            java.lang.Object r4 = r5.A13()
            if (r1 != 0) goto L_0x01a5
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r4 != r1) goto L_0x01ab
        L_0x01a5:
            r1 = 42
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r4 = X.AnonymousClass7W3.A0I(r5, r3, r1)
        L_0x01ab:
            X.0ZU r19 = X.AnonymousClass7W3.A08(r5, r4, r6)
            X.66x r17 = X.C968466x.Pending
            java.lang.Object r1 = r0.A02
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r14 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r14 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r14
            java.lang.Object r15 = r0.A01
            X.75b r15 = (X.AnonymousClass75b) r15
            java.lang.Object r1 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r1
            java.lang.String r4 = r1.A03
            goto L_0x0242
        L_0x01c8:
            r1 = r2
            goto L_0x0164
        L_0x01ca:
            X.8cb r13 = (X.C141678cb) r13
            X.8nY r12 = (X.C147188nY) r12
            int r2 = X.AnonymousClass0wJ.A04(r14)
            r6 = 0
            X.C04220Ms.A0B(r13, r6)
            r1 = r2 & 14
            if (r1 != 0) goto L_0x025f
            int r1 = X.C147188nY.A0F(r12, r13)
            r1 = r1 | r2
        L_0x01df:
            r2 = r1 & 91
            r1 = 18
            if (r2 != r1) goto L_0x01eb
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x01eb:
            java.lang.Object r3 = r0.A03
            X.57z r3 = (X.C884257z) r3
            r4 = 1157296644(0x44faf204, float:2007.563)
            boolean r1 = X.C147188nY.A0z(r12, r3, r4)
            r5 = r12
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r2 = r5.A13()
            if (r1 != 0) goto L_0x0203
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r2 != r1) goto L_0x020d
        L_0x0203:
            r1 = 14
            kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1 r2 = new kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1
            r2.<init>(r3, r1)
            r5.A14(r2)
        L_0x020d:
            X.AnonymousClass7W3.A0w(r5, r6)
            X.0YP r2 = (X.AnonymousClass0YP) r2
            boolean r1 = X.C147188nY.A0z(r12, r3, r4)
            java.lang.Object r4 = r5.A13()
            if (r1 != 0) goto L_0x0220
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r4 != r1) goto L_0x0226
        L_0x0220:
            r1 = 41
            kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14 r4 = X.AnonymousClass7W3.A0I(r5, r3, r1)
        L_0x0226:
            X.0ZU r19 = X.AnonymousClass7W3.A08(r5, r4, r6)
            X.66x r17 = X.C968466x.Following
            java.lang.Object r1 = r0.A02
            X.4oM r1 = (X.C81784oM) r1
            java.lang.Object r14 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r14 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r14
            java.lang.Object r15 = r0.A01
            X.75b r15 = (X.AnonymousClass75b) r15
            java.lang.Object r1 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r1
            java.lang.String r4 = r1.A02
        L_0x0242:
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r13 = X.C97936Dn.A00(r13, r1)
            r1 = 229760(0x38180, float:3.21962E-40)
            int r0 = r0.A00
            int r0 = r0 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r18 = r4
            r20 = r2
            r21 = r0
            r16 = r3
            X.C121857Im.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0052
        L_0x025f:
            r1 = r2
            goto L_0x01df
        L_0x0262:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r14)
            r2 = 0
            X.C04220Ms.A0B(r13, r2)
            r3 = r1 & 81
            r1 = 16
            if (r3 != r1) goto L_0x0278
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x0278:
            X.67q r15 = X.C970267q.QUOTE_POST
            com.instagram.api.schemas.LineType r14 = com.instagram.api.schemas.LineType.NONE
            java.lang.Object r7 = r0.A01
            java.lang.Object r5 = r0.A03
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r12, r7, r5, r6)
            r4 = r12
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            java.lang.Object r3 = r4.A13()
            if (r1 != 0) goto L_0x0294
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r3 != r1) goto L_0x029a
        L_0x0294:
            r1 = 19
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r3 = X.AnonymousClass7W3.A0E(r4, r7, r5, r1)
        L_0x029a:
            X.0ZU r16 = X.AnonymousClass7W3.A08(r4, r3, r2)
            java.lang.Object r3 = r0.A02
            boolean r0 = X.C147188nY.A10(r12, r3, r5, r6)
            java.lang.Object r1 = r4.A13()
            if (r0 != 0) goto L_0x02ae
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x02b4
        L_0x02ae:
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r1 = X.AnonymousClass7W3.A0E(r4, r3, r5, r0)
        L_0x02b4:
            X.0ZU r17 = X.AnonymousClass7W3.A08(r4, r1, r2)
            r21 = 1
            r13 = 0
            r18 = 115043712(0x6db6d80, float:8.253954E-35)
            r19 = 6
            r20 = 512(0x200, float:7.175E-43)
            r22 = r21
            r23 = r21
            r24 = r2
            r25 = r2
            r26 = r21
            X.C100296Mt.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0052
        L_0x02d1:
            X.8nY r12 = (X.C147188nY) r12
            int r1 = X.AnonymousClass0wJ.A04(r14)
            r2 = r1 & 81
            r1 = 16
            if (r2 != r1) goto L_0x02e3
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x02e3:
            java.lang.Object r2 = r0.A03
            X.8mY r2 = (X.C146628mY) r2
            r1 = r2
            X.5Lh r1 = (X.C90295Lh) r1
            int r6 = r1.A00
            X.8s2 r5 = r1.A07
            X.67q r15 = r2.BIh()
            boolean r4 = r1.A0B
            com.instagram.api.schemas.LineType r14 = r1.A01
            boolean r3 = r1.A08
            java.lang.Object r8 = r0.A01
            java.lang.Object r7 = r0.A02
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r12, r8, r7, r0)
            r2 = r12
            X.7W3 r2 = (X.AnonymousClass7W3) r2
            java.lang.Object r1 = r2.A13()
            if (r0 != 0) goto L_0x0310
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0316
        L_0x0310:
            r0 = 11
            kotlin.jvm.internal.KtLambdaShape19S0200000_I2_3 r1 = X.AnonymousClass7W3.A0E(r2, r8, r7, r0)
        L_0x0316:
            r0 = 0
            X.0ZU r16 = X.AnonymousClass7W3.A08(r2, r1, r0)
            r13 = 0
            r20 = 64
            r17 = r5
            r18 = r6
            r19 = r0
            r21 = r3
            r22 = r4
            X.AnonymousClass7BZ.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0052
        L_0x032d:
            X.8lm r13 = (X.C146178lm) r13
            X.8nY r12 = (X.C147188nY) r12
            int r2 = X.AnonymousClass0wJ.A04(r14)
            r6 = 0
            X.C04220Ms.A0B(r13, r6)
            r1 = r2 & 14
            if (r1 != 0) goto L_0x0342
            int r1 = X.C147188nY.A0F(r12, r13)
            r2 = r2 | r1
        L_0x0342:
            r2 = r2 & 91
            r1 = 18
            if (r2 != r1) goto L_0x034e
            boolean r1 = r12.BCM()
            if (r1 != 0) goto L_0x0427
        L_0x034e:
            java.lang.Object r9 = r0.A01
            X.8pE r9 = (X.C147368pE) r9
            java.lang.Object r10 = r0.A02
            java.lang.Object r7 = r0.A03
            X.7Wm r5 = androidx.compose.ui.Modifier.A01(r12)
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A0E
            X.8ly r11 = X.C120767Cj.A00(r12, r0, r6)
            java.lang.Object r8 = X.C147188nY.A0p(r12)
            java.lang.Object r3 = X.C147188nY.A0n(r12)
            java.lang.Object r2 = X.C147188nY.A0m(r12)
            X.0ZU r1 = X.AnonymousClass74X.A00
            X.0YM r0 = X.C98236Es.A00(r5)
            r4 = r12
            X.7W3 r4 = (X.AnonymousClass7W3) r4
            X.C147188nY.A0w(r12, r4, r1)
            X.AnonymousClass7W3.A0a(r12, r4, r11, r8)
            X.AnonymousClass7KP.A07(r12, r3, r2, r0)
            X.7V3 r3 = X.AnonymousClass7V3.A00
            r0 = -802875243(0xffffffffd0251895, float:-1.10794066E10)
            r12.Cvb(r0)
            boolean r0 = r13 instanceof X.C90245Lb
            if (r0 == 0) goto L_0x03c6
            r0 = 897490372(0x357e9dc4, float:9.485195E-7)
            int r2 = X.C120577Bm.A00(r3, r12, r5, r13, r0)
        L_0x0391:
            X.AnonymousClass7W3.A0w(r4, r6)
            boolean r0 = X.C147188nY.A10(r12, r7, r13, r2)
            java.lang.Object r1 = r4.A13()
            if (r0 != 0) goto L_0x03a2
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x03ac
        L_0x03a2:
            r0 = 46
            kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2 r1 = new kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2
            r1.<init>(r0, r13, r7)
            r4.A14(r1)
        L_0x03ac:
            X.0ZU r7 = X.AnonymousClass7W3.A09(r4, r1, r6)
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A0D
            androidx.compose.ui.Modifier r2 = r3.A86(r0, r5)
            r0 = 12
            float r1 = (float) r0
            float r0 = (float) r6
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7K4.A05(r2, r0, r1, r1, r0)
            X.AnonymousClass6M9.A00(r12, r0, r7, r6, r6)
            X.AnonymousClass7W3.A0f(r4)
            goto L_0x0052
        L_0x03c6:
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = r13 instanceof X.C90255Lc
            if (r0 == 0) goto L_0x0408
            r0 = 897490645(0x357e9ed5, float:9.4853505E-7)
            r12.Cvb(r0)
            r1 = r13
            X.5Lc r1 = (X.C90255Lc) r1
            java.lang.String r8 = r1.A04
            java.lang.Object r0 = r9.getValue()
            boolean r20 = X.C04220Ms.A0I(r0, r8)
            boolean r1 = r1.A05
            boolean r0 = X.C147188nY.A10(r12, r10, r13, r2)
            java.lang.Object r9 = r4.A13()
            if (r0 != 0) goto L_0x03f0
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r9 != r0) goto L_0x03f6
        L_0x03f0:
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r9 = X.AnonymousClass7W3.A0L(r4, r10, r13, r0)
        L_0x03f6:
            X.0YY r17 = X.AnonymousClass7W3.A0B(r4, r9, r6)
            r15 = 0
            r19 = 16
            r14 = r12
            r16 = r8
            r18 = r6
            r21 = r1
            X.C100116Ma.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0391
        L_0x0408:
            boolean r0 = r13 instanceof X.C90235La
            if (r0 == 0) goto L_0x041f
            r0 = 897490978(0x357ea022, float:9.48554E-7)
            r12.Cvb(r0)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass7KV.A01(r3, r5)
            X.5HL r0 = X.C101296Qq.A00(r12)
            X.AnonymousClass6MF.A00(r12, r1, r0, r6, r6)
            goto L_0x0391
        L_0x041f:
            r0 = 897491126(0x357ea0b6, float:9.485624E-7)
            r12.Cvb(r0)
            goto L_0x0391
        L_0x0427:
            r12.CuJ()
            goto L_0x0052
        L_0x042c:
            X.BMH r13 = (X.BMH) r13
            boolean r18 = X.AnonymousClass0wJ.A1X(r12)
            X.Ev9 r14 = (X.C27898Ev9) r14
            r1 = 0
            X.C04220Ms.A0B(r13, r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r13.A0D
            android.content.Context r11 = X.C18190wL.A0A(r1)
            java.lang.Object r1 = r0.A03
            X.Aef r1 = (X.C18391Aef) r1
            X.C3w r1 = r1.A00
            X.C3D r12 = r1.AWn()
            int r1 = r0.A00
            java.lang.Object r15 = r0.A01
            X.BKU r15 = (X.BKU) r15
            java.lang.Object r0 = r0.A02
            X.BMj r0 = (X.C20066BMj) r0
            X.BLa r10 = new X.BLa
            r17 = r1
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape20S0301000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
