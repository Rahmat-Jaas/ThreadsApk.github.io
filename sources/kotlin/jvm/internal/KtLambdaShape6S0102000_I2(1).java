package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape6S0102000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape6S0102000_I2(Object obj, int i, int i2, int i3) {
        super(3);
        this.A03 = i3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a1, code lost:
        X.AnonymousClass7J4.A02("Slot table is out of sync");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r3 = r23
            r4 = r22
            int r0 = r1.A03
            switch(r0) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.7Ks r3 = X.C86164wN.A0G(r4)
            java.lang.Object r2 = r1.A02
            int r0 = r1.A00
            int r1 = r1.A01
            java.lang.Object r0 = r3.A0H(r0, r1)
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            r3.A0I(r1, r0)
        L_0x0024:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0027:
            X.7Ks r4 = (X.C122137Ks) r4
            X.8fg r3 = (X.C142838fg) r3
            X.AnonymousClass0wJ.A1O(r4, r3)
            java.lang.Object r2 = r1.A02
            int r0 = r1.A00
            int r1 = r1.A01
            java.lang.Object r0 = r4.A0H(r0, r1)
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x01a1
            X.8kz r2 = (X.C145728kz) r2
            r3.ANW(r2)
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            r4.A0I(r1, r0)
            goto L_0x0024
        L_0x0049:
            X.8nY r12 = X.C86104wH.A0H(r4, r3)
            r11 = 0
            r0 = r21
            X.C04220Ms.A0B(r0, r11)
            r0 = 408240218(0x1855405a, float:2.7562094E-24)
            r12.Cvb(r0)
            int r10 = r1.A01
            int r9 = r1.A00
            X.AnonymousClass6E4.A00(r10, r9)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = 1
            if (r10 != r8) goto L_0x0071
            if (r9 != r0) goto L_0x0071
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            r5 = r12
            X.7W3 r5 = (X.AnonymousClass7W3) r5
        L_0x006d:
            X.AnonymousClass7W3.A0w(r5, r11)
            return r0
        L_0x0071:
            X.8nV r7 = X.C147188nY.A0j(r12)
            X.534 r0 = X.AnonymousClass7DE.A04
            java.lang.Object r6 = r12.AEA(r0)
            X.8g4 r6 = (X.C143078g4) r6
            java.lang.Object r14 = X.C147188nY.A0n(r12)
            X.69J r14 = (X.AnonymousClass69J) r14
            java.lang.Object r13 = r1.A02
            X.7If r13 = (X.C121807If) r13
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C147188nY.A10(r12, r13, r14, r1)
            r5 = r12
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r4 = r5.A13()
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r4 != r0) goto L_0x00a2
        L_0x009b:
            X.7If r4 = X.AnonymousClass6FN.A00(r13, r14)
            r5.A14(r4)
        L_0x00a2:
            X.AnonymousClass7W3.A0w(r5, r11)
            X.7If r4 = (X.C121807If) r4
            boolean r0 = X.C147188nY.A10(r12, r6, r4, r1)
            java.lang.Object r3 = r5.A13()
            if (r0 != 0) goto L_0x00b5
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r3 != r0) goto L_0x00d2
        L_0x00b5:
            X.7F0 r15 = r4.A02
            X.72l r3 = r15.A06
            X.7yQ r2 = r15.A09
            if (r2 != 0) goto L_0x00bf
            X.7yQ r2 = X.C134817yQ.A04
        L_0x00bf:
            X.6su r0 = r15.A07
            if (r0 == 0) goto L_0x019e
            int r1 = r0.A00
        L_0x00c5:
            X.6sv r0 = r15.A08
            if (r0 == 0) goto L_0x019b
            int r0 = r0.A00
        L_0x00cb:
            X.4oM r3 = r6.Cen(r3, r2, r1, r0)
            r5.A14(r3)
        L_0x00d2:
            X.AnonymousClass7W3.A0w(r5, r11)
            X.4oM r3 = (X.C81784oM) r3
            r19 = 5
            r2 = 0
            r18 = 2
            java.lang.Object r0 = r3.getValue()
            java.lang.Object[] r17 = new java.lang.Object[]{r7, r6, r13, r14, r0}
            r16 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0 = r16
            r12.Cvb(r0)
            r15 = 0
            r1 = 0
        L_0x00ee:
            r0 = r17[r15]
            boolean r1 = X.C147188nY.A12(r12, r0, r1)
            int r15 = r15 + 1
            r0 = r19
            if (r15 < r0) goto L_0x00ee
            java.lang.Object r15 = r5.A13()
            if (r1 != 0) goto L_0x0104
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r15 != r0) goto L_0x0115
        L_0x0104:
            java.lang.String r0 = X.AnonymousClass72Q.A00
            long r0 = X.AnonymousClass72Q.A00(r4, r6, r7, r0, r8)
            int r0 = X.C86104wH.A08(r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r5.A14(r15)
        L_0x0115:
            X.AnonymousClass7W3.A0w(r5, r11)
            int r15 = X.AnonymousClass0wJ.A04(r15)
            java.lang.Object r0 = r3.getValue()
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r6, r13, r14, r0}
            r0 = r16
            r12.Cvb(r0)
            r3 = 0
        L_0x012a:
            r0 = r1[r2]
            boolean r3 = X.C147188nY.A12(r12, r0, r3)
            int r2 = r2 + 1
            r0 = r19
            if (r2 < r0) goto L_0x012a
            java.lang.Object r1 = r5.A13()
            if (r3 != 0) goto L_0x0140
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r1 != r0) goto L_0x0159
        L_0x0140:
            java.lang.String r1 = X.AnonymousClass72Q.A00
            r0 = 10
            java.lang.String r1 = X.AnonymousClass00U.A0N(r1, r1, r0)
            r0 = r18
            long r0 = X.AnonymousClass72Q.A00(r4, r6, r7, r1, r0)
            int r0 = X.C86104wH.A08(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.A14(r1)
        L_0x0159:
            X.AnonymousClass7W3.A0w(r5, r11)
            int r2 = X.AnonymousClass0wJ.A04(r1)
            int r2 = r2 - r15
            r3 = 0
            if (r10 != r8) goto L_0x0193
            r1 = r3
        L_0x0165:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L_0x0171
            int r9 = r9 - r8
            int r2 = r2 * r9
            int r15 = r15 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
        L_0x0171:
            X.7Wm r2 = androidx.compose.ui.Modifier.A00
            if (r1 == 0) goto L_0x0190
            int r0 = r1.intValue()
            float r1 = r7.CxE(r0)
        L_0x017d:
            if (r3 == 0) goto L_0x018d
            int r0 = r3.intValue()
            float r0 = r7.CxE(r0)
        L_0x0187:
            androidx.compose.ui.Modifier r0 = X.AnonymousClass7Kq.A0C(r2, r1, r0)
            goto L_0x006d
        L_0x018d:
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0187
        L_0x0190:
            r1 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x017d
        L_0x0193:
            int r10 = r10 - r8
            int r10 = r10 * r2
            int r10 = r10 + r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0165
        L_0x019b:
            r0 = 1
            goto L_0x00cb
        L_0x019e:
            r1 = 0
            goto L_0x00c5
        L_0x01a1:
            java.lang.String r0 = "Slot table is out of sync"
            X.AnonymousClass7J4.A02(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape6S0102000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
