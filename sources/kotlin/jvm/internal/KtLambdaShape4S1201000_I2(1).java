package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape4S1201000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1201000_I2(Object obj, Object obj2, String str, int i, int i2) {
        super(3);
        this.A04 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.6ku} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.6ku} */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (r5 == X.AnonymousClass7GN.A00) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a7, code lost:
        r11.CuJ();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            r25 = this;
            r0 = r25
            r4 = r26
            r2 = r28
            r11 = r27
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x013a;
                case 1: goto L_0x002c;
                default: goto L_0x000d;
            }
        L_0x000d:
            int r1 = X.AnonymousClass0wJ.A04(r4)
            java.util.List r11 = (java.util.List) r11
            X.6fK r2 = (X.C106616fK) r2
            X.AnonymousClass0wJ.A1O(r11, r2)
            int r12 = r0.A00
            int r12 = r12 + r1
            boolean r13 = r2.A00
            java.lang.Object r9 = r0.A01
            X.9wE r9 = (X.C171199wE) r9
            java.lang.Object r8 = r0.A02
            X.9vL r8 = (X.C170649vL) r8
            java.lang.String r10 = r0.A03
            X.BDm r0 = X.C17653AIj.A00(r8, r9, r10, r11, r12, r13)
            return r0
        L_0x002c:
            X.8p5 r4 = (X.C147278p5) r4
            X.8nY r11 = (X.C147188nY) r11
            int r2 = X.AnonymousClass0wJ.A04(r2)
            r3 = 0
            X.C04220Ms.A0B(r4, r3)
            r1 = r2 & 14
            if (r1 != 0) goto L_0x0137
            int r1 = X.C147188nY.A0F(r11, r4)
            r1 = r1 | r2
        L_0x0041:
            r2 = r1 & 91
            r1 = 18
            if (r2 != r1) goto L_0x004d
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x01a7
        L_0x004d:
            java.lang.String r6 = r0.A03
            java.lang.Object r14 = r0.A02
            X.7If r14 = (X.C121807If) r14
            X.7V4 r4 = (X.AnonymousClass7V4) r4
            long r1 = r4.A00
            int r2 = androidx.compose.ui.unit.Constraints.A02(r1)
            r12 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            long r21 = X.AnonymousClass7JT.A02(r3, r2, r3, r1)
            X.534 r1 = X.AnonymousClass7DE.A02
            java.lang.Object r2 = r11.AEA(r1)
            X.8nV r2 = (X.C147168nV) r2
            X.534 r1 = X.AnonymousClass7DE.A04
            java.lang.Object r1 = r11.AEA(r1)
            X.8g4 r1 = (X.C143078g4) r1
            r20 = 480(0x1e0, float:6.73E-43)
            r17 = r6
            r18 = r12
            r19 = r3
            r16 = r2
            r15 = r1
            X.8g2 r1 = X.AnonymousClass6FK.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            X.7Ye r1 = (X.C123707Ye) r1
            X.6vM r5 = r1.A01
            int r2 = r5.A04
            r1 = 5
            r9 = 0
            if (r2 <= r1) goto L_0x0134
            r4 = 4
            android.text.Layout r2 = r5.A08
            int r1 = r2.getLineStart(r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            int r1 = r2.getEllipsisStart(r4)
            if (r1 != 0) goto L_0x012a
            int r1 = r2.getLineEnd(r4)
        L_0x00a1:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x00a5:
            r1 = 1235973585(0x49ab75d1, float:1404602.1)
            X.7KB r1 = X.C120537Bh.A01(r11, r1)
            long r1 = r1.A0h
            X.7If r4 = X.AnonymousClass7J9.A04(r11)
            X.7F0 r10 = r4.A02
            long r23 = X.AnonymousClass7KB.A03(r11)
            r4 = 2131822170(0x7f11065a, float:1.9277104E38)
            java.lang.String r20 = X.AnonymousClass7JS.A01(r11, r4)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r4 = X.C147188nY.A10(r11, r6, r9, r4)
            boolean r4 = X.C147188nY.A12(r11, r8, r4)
            r7 = r11
            X.7W3 r7 = (X.AnonymousClass7W3) r7
            java.lang.Object r5 = r7.A13()
            if (r4 != 0) goto L_0x00d7
            java.lang.Object r4 = X.AnonymousClass7GN.A00
            if (r5 != r4) goto L_0x00ea
        L_0x00d7:
            X.6ku r5 = new X.6ku
            r18 = r8
            r19 = r6
            r21 = r1
            r17 = r9
            r16 = r10
            r15 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r23)
            r7.A14(r5)
        L_0x00ea:
            X.AnonymousClass7W3.A0w(r7, r3)
            X.6ku r5 = (X.C109966ku) r5
            X.AnonymousClass7W3.A0w(r7, r3)
            X.8pE r1 = r5.A01
            java.lang.Object r13 = r1.getValue()
            X.7yH r13 = (X.C134747yH) r13
            java.lang.Object r2 = r0.A01
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r1 = X.C147188nY.A10(r11, r5, r2, r0)
            java.lang.Object r0 = r7.A13()
            if (r1 != 0) goto L_0x010d
            java.lang.Object r1 = X.AnonymousClass7GN.A00
            if (r0 != r1) goto L_0x0117
        L_0x010d:
            r1 = 19
            kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r2)
            r7.A14(r0)
        L_0x0117:
            X.0YY r16 = X.AnonymousClass7W3.A0A(r7, r0, r3)
            r20 = 122(0x7a, float:1.71E-43)
            r15 = r12
            r18 = r3
            r19 = r3
            r21 = r3
            r17 = r3
            X.AnonymousClass6E3.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01a4
        L_0x012a:
            java.lang.CharSequence r1 = r2.getText()
            int r1 = r1.length()
            goto L_0x00a1
        L_0x0134:
            r8 = r12
            goto L_0x00a5
        L_0x0137:
            r1 = r2
            goto L_0x0041
        L_0x013a:
            X.8nY r11 = (X.C147188nY) r11
            int r1 = X.AnonymousClass0wJ.A04(r2)
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            r1 = r1 & 81
            r4 = 16
            if (r1 != r4) goto L_0x0150
            boolean r1 = r11.BCM()
            if (r1 != 0) goto L_0x01a7
        L_0x0150:
            java.lang.String r14 = r0.A03
            X.698 r13 = X.AnonymousClass698.Up
            X.4an r16 = X.C74654an.A00
            java.lang.Object r7 = r0.A02
            java.lang.Object r6 = r0.A01
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r3 = X.C147188nY.A10(r11, r7, r6, r1)
            r5 = r11
            X.7W3 r5 = (X.AnonymousClass7W3) r5
            java.lang.Object r1 = r5.A13()
            if (r3 != 0) goto L_0x016e
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r1 != r3) goto L_0x0177
        L_0x016e:
            r3 = 2
            kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3 r1 = new kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3
            r1.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r7)
            r5.A14(r1)
        L_0x0177:
            X.0YY r17 = X.AnonymousClass7W3.A0A(r5, r1, r2)
            r1 = 2131822195(0x7f110673, float:1.9277155E38)
            java.lang.String r15 = X.AnonymousClass7JS.A01(r11, r1)
            X.7Wm r1 = androidx.compose.ui.Modifier.A00
            r10 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.Modifier.A04(r1)
            float r4 = (float) r4
            r1 = 8
            float r3 = (float) r1
            float r1 = (float) r2
            androidx.compose.ui.Modifier r12 = X.AnonymousClass7K4.A05(r5, r1, r4, r1, r3)
            r1 = 197040(0x301b0, float:2.76112E-40)
            int r0 = r0.A00
            int r0 = r0 >> 18
            r18 = r0 & 14
            r18 = r18 | r1
            r19 = 192(0xc0, float:2.69E-43)
            r20 = r2
            X.C117636z0.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x01a4:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x01a7:
            r11.CuJ()
            goto L_0x01a4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S1201000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
