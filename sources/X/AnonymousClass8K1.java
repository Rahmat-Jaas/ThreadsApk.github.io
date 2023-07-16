package X;

/* renamed from: X.8K1  reason: invalid class name */
public final class AnonymousClass8K1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C147608pc A05;
    public final /* synthetic */ AnonymousClass0YP A06;
    public final /* synthetic */ AnonymousClass0YP A07;
    public final /* synthetic */ AnonymousClass0YP A08;
    public final /* synthetic */ AnonymousClass0YP A09;
    public final /* synthetic */ AnonymousClass0YM A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8K1(C147608pc r2, AnonymousClass0YP r3, AnonymousClass0YP r4, AnonymousClass0YP r5, AnonymousClass0YP r6, AnonymousClass0YM r7, int i, int i2, int i3, int i4, long j, boolean z) {
        super(1);
        this.A05 = r2;
        this.A09 = r3;
        this.A08 = r4;
        this.A07 = r5;
        this.A01 = i;
        this.A03 = i2;
        this.A0B = z;
        this.A02 = i3;
        this.A04 = j;
        this.A06 = r6;
        this.A00 = i4;
        this.A0A = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e7 A[LOOP:8: B:102:0x01e3->B:104:0x01e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0250 A[LOOP:10: B:120:0x024e->B:121:0x0250, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268 A[LOOP:11: B:123:0x0266->B:124:0x0268, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x027e A[LOOP:12: B:126:0x027c->B:127:0x027e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0294 A[LOOP:13: B:129:0x0292->B:130:0x0294, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0126 A[LOOP:5: B:62:0x0124->B:63:0x0126, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30) {
        /*
            r29 = this;
            r12 = 0
            r0 = r30
            X.C04220Ms.A0B(r0, r12)
            r14 = r29
            X.8pc r13 = r14.A05
            X.681 r1 = X.AnonymousClass681.TopBar
            X.0YP r0 = r14.A09
            java.util.List r5 = r13.CwO(r1, r0)
            long r2 = r14.A04
            java.util.ArrayList r22 = X.C18200wM.A0t(r5)
            int r4 = r5.size()
            r1 = 0
        L_0x001d:
            if (r1 >= r4) goto L_0x0026
            r0 = r22
            int r1 = X.C147578pZ.A00(r0, r5, r1, r2)
            goto L_0x001d
        L_0x0026:
            boolean r0 = r22.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0051
            r7 = 0
        L_0x002e:
            X.7Xy r7 = (X.C123657Xy) r7
            if (r7 == 0) goto L_0x004e
            int r0 = r7.A00
            r21 = r0
        L_0x0036:
            X.681 r1 = X.AnonymousClass681.Snackbar
            X.0YP r0 = r14.A08
            java.util.List r4 = r13.CwO(r1, r0)
            java.util.ArrayList r10 = X.C18200wM.A0t(r4)
            int r1 = r4.size()
            r0 = 0
        L_0x0047:
            if (r0 >= r1) goto L_0x0077
            int r0 = X.C147578pZ.A00(r10, r4, r0, r2)
            goto L_0x0047
        L_0x004e:
            r21 = 0
            goto L_0x0036
        L_0x0051:
            r0 = r22
            java.lang.Object r7 = r0.get(r12)
            r0 = r7
            X.7Xy r0 = (X.C123657Xy) r0
            int r6 = r0.A00
            int r5 = X.C86104wH.A0B(r22)
            if (r11 > r5) goto L_0x002e
            r4 = 1
        L_0x0063:
            r0 = r22
            java.lang.Object r1 = r0.get(r4)
            r0 = r1
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A00
            if (r6 >= r0) goto L_0x0072
            r7 = r1
            r6 = r0
        L_0x0072:
            if (r4 == r5) goto L_0x002e
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0077:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x009e
            r7 = 0
        L_0x007e:
            X.7Xy r7 = (X.C123657Xy) r7
            if (r7 == 0) goto L_0x009c
            int r9 = r7.A00
        L_0x0084:
            X.681 r1 = X.AnonymousClass681.Fab
            X.0YP r0 = r14.A07
            java.util.List r4 = r13.CwO(r1, r0)
            java.util.ArrayList r8 = X.C18200wM.A0t(r4)
            int r1 = r4.size()
            r0 = 0
        L_0x0095:
            if (r0 >= r1) goto L_0x00c0
            int r0 = X.C147578pZ.A00(r8, r4, r0, r2)
            goto L_0x0095
        L_0x009c:
            r9 = 0
            goto L_0x0084
        L_0x009e:
            java.lang.Object r7 = r10.get(r12)
            r0 = r7
            X.7Xy r0 = (X.C123657Xy) r0
            int r6 = r0.A00
            int r5 = X.C86104wH.A0B(r10)
            if (r11 > r5) goto L_0x007e
            r4 = 1
        L_0x00ae:
            java.lang.Object r1 = r10.get(r4)
            r0 = r1
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A00
            if (r6 >= r0) goto L_0x00bb
            r7 = r1
            r6 = r0
        L_0x00bb:
            if (r4 == r5) goto L_0x007e
            int r4 = r4 + 1
            goto L_0x00ae
        L_0x00c0:
            boolean r0 = X.C18250wR.A1K(r8)
            if (r0 == 0) goto L_0x018c
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x016a
            r7 = 0
        L_0x00cd:
            X.7Xy r7 = (X.C123657Xy) r7
            if (r7 == 0) goto L_0x0167
            int r7 = r7.A01
        L_0x00d3:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0145
            r6 = 0
        L_0x00da:
            X.7Xy r6 = (X.C123657Xy) r6
            if (r6 == 0) goto L_0x0143
            int r1 = r6.A00
        L_0x00e0:
            if (r7 == 0) goto L_0x018c
            if (r1 == 0) goto L_0x018c
            int r0 = r14.A01
            if (r0 != r11) goto L_0x013d
            X.69J r4 = r13.getLayoutDirection()
            X.69J r0 = X.AnonymousClass69J.Ltr
            if (r4 != r0) goto L_0x0136
            int r4 = r14.A03
            float r0 = X.AnonymousClass6ZM.A00
            int r0 = r13.CfL(r0)
            int r4 = r4 - r0
            int r4 = r4 - r7
        L_0x00fa:
            X.6fZ r7 = new X.6fZ
            r7.<init>(r4, r1)
        L_0x00ff:
            X.681 r1 = X.AnonymousClass681.BottomBar
            X.0YP r6 = r14.A06
            int r0 = r14.A00
            r17 = r0
            r5 = 17
            kotlin.jvm.internal.KtLambdaShape27S0201000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape27S0201000_I2
            r4.<init>(r0, r5, r7, r6)
            r0 = 1529070963(0x5b23c573, float:4.6097519E16)
            r28 = 2
            X.7WY r0 = X.AnonymousClass7WY.A01(r4, r0, r11)
            java.util.List r5 = r13.CwO(r1, r0)
            java.util.ArrayList r6 = X.C18200wM.A0t(r5)
            int r4 = r5.size()
            r1 = 0
        L_0x0124:
            if (r1 >= r4) goto L_0x018f
            java.lang.Object r0 = r5.get(r1)
            X.8pZ r0 = (X.C147578pZ) r0
            X.7Xy r0 = r0.Bg4(r2)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0124
        L_0x0136:
            float r0 = X.AnonymousClass6ZM.A00
            int r4 = r13.CfL(r0)
            goto L_0x00fa
        L_0x013d:
            int r0 = r14.A03
            int r0 = r0 - r7
            int r4 = r0 >> 1
            goto L_0x00fa
        L_0x0143:
            r1 = 0
            goto L_0x00e0
        L_0x0145:
            java.lang.Object r6 = r8.get(r12)
            r0 = r6
            X.7Xy r0 = (X.C123657Xy) r0
            int r5 = r0.A00
            int r4 = X.C86104wH.A0B(r8)
            if (r11 > r4) goto L_0x00da
            r1 = 1
        L_0x0155:
            java.lang.Object r15 = r8.get(r1)
            r0 = r15
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A00
            if (r5 >= r0) goto L_0x0162
            r6 = r15
            r5 = r0
        L_0x0162:
            if (r1 == r4) goto L_0x00da
            int r1 = r1 + 1
            goto L_0x0155
        L_0x0167:
            r7 = 0
            goto L_0x00d3
        L_0x016a:
            java.lang.Object r7 = r8.get(r12)
            r0 = r7
            X.7Xy r0 = (X.C123657Xy) r0
            int r6 = r0.A01
            int r5 = X.C86104wH.A0B(r8)
            if (r11 > r5) goto L_0x00cd
            r4 = 1
        L_0x017a:
            java.lang.Object r1 = r8.get(r4)
            r0 = r1
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A01
            if (r6 >= r0) goto L_0x0187
            r7 = r1
            r6 = r0
        L_0x0187:
            if (r4 == r5) goto L_0x00cd
            int r4 = r4 + 1
            goto L_0x017a
        L_0x018c:
            r7 = 0
            goto L_0x00ff
        L_0x018f:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0224
            r5 = 0
        L_0x0196:
            X.7Xy r5 = (X.C123657Xy) r5
            if (r5 == 0) goto L_0x0221
            int r5 = r5.A00
        L_0x019c:
            if (r7 == 0) goto L_0x021e
            boolean r0 = r14.A0B
            if (r5 != 0) goto L_0x0211
            int r1 = r7.A00
        L_0x01a4:
            float r0 = X.AnonymousClass6ZM.A00
            int r0 = r13.CfL(r0)
            int r1 = r1 + r0
        L_0x01ab:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)
        L_0x01af:
            if (r9 == 0) goto L_0x020f
            if (r20 == 0) goto L_0x020d
            int r0 = r20.intValue()
        L_0x01b7:
            int r9 = r9 + r0
        L_0x01b8:
            int r4 = r14.A02
            int r19 = r4 - r21
            X.681 r1 = X.AnonymousClass681.MainContent
            X.0YM r0 = r14.A0A
            kotlin.jvm.internal.KtLambdaShape2S0202000_I2 r14 = new kotlin.jvm.internal.KtLambdaShape2S0202000_I2
            r23 = r14
            r24 = r0
            r25 = r17
            r26 = r13
            r27 = r5
            r23.<init>(r24, r25, r26, r27, r28)
            r0 = -1132241596(0xffffffffbc835d44, float:-0.016035683)
            X.7WY r0 = X.AnonymousClass7WY.A01(r14, r0, r11)
            java.util.List r18 = r13.CwO(r1, r0)
            java.util.ArrayList r17 = X.C18200wM.A0t(r18)
            int r16 = r18.size()
            r11 = 0
        L_0x01e3:
            r0 = r16
            if (r11 >= r0) goto L_0x0249
            r0 = r18
            java.lang.Object r13 = r0.get(r11)
            X.8pZ r13 = (X.C147578pZ) r13
            int r14 = androidx.compose.ui.unit.Constraints.A04(r2)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r2)
            int r0 = androidx.compose.ui.unit.Constraints.A03(r2)
            r15 = r19
            long r14 = androidx.compose.ui.unit.Constraints.A05(r14, r1, r0, r15)
            X.7Xy r1 = r13.Bg4(r14)
            r0 = r17
            r0.add(r1)
            int r11 = r11 + 1
            goto L_0x01e3
        L_0x020d:
            r0 = r5
            goto L_0x01b7
        L_0x020f:
            r9 = 0
            goto L_0x01b8
        L_0x0211:
            if (r0 == 0) goto L_0x021a
            int r0 = r7.A00
            int r0 = r0 >> 1
            int r1 = r5 + r0
            goto L_0x01ab
        L_0x021a:
            int r1 = r7.A00
            int r1 = r1 + r5
            goto L_0x01a4
        L_0x021e:
            r20 = 0
            goto L_0x01af
        L_0x0221:
            r5 = 0
            goto L_0x019c
        L_0x0224:
            java.lang.Object r5 = r6.get(r12)
            r0 = r5
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A00
            r1 = r0
            int r15 = X.C86104wH.A0B(r6)
            r4 = 1
            if (r11 > r15) goto L_0x0196
        L_0x0235:
            java.lang.Object r16 = r6.get(r4)
            r0 = r16
            X.7Xy r0 = (X.C123657Xy) r0
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x0244
            r5 = r16
            r1 = r0
        L_0x0244:
            if (r4 == r15) goto L_0x0196
            int r4 = r4 + 1
            goto L_0x0235
        L_0x0249:
            int r11 = r17.size()
            r3 = 0
        L_0x024e:
            if (r3 >= r11) goto L_0x0261
            r0 = r17
            java.lang.Object r2 = r0.get(r3)
            X.7Xy r2 = (X.C123657Xy) r2
            r1 = 0
            r0 = r21
            X.C122067Jz.A00(r2, r1, r12, r0)
            int r3 = r3 + 1
            goto L_0x024e
        L_0x0261:
            int r3 = r22.size()
            r2 = 0
        L_0x0266:
            if (r2 >= r3) goto L_0x0277
            r0 = r22
            java.lang.Object r1 = r0.get(r2)
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r12, r12)
            int r2 = r2 + 1
            goto L_0x0266
        L_0x0277:
            int r11 = r10.size()
            r3 = 0
        L_0x027c:
            if (r3 >= r11) goto L_0x028d
            java.lang.Object r2 = r10.get(r3)
            X.7Xy r2 = (X.C123657Xy) r2
            int r1 = r4 - r9
            r0 = 0
            X.C122067Jz.A00(r2, r0, r12, r1)
            int r3 = r3 + 1
            goto L_0x027c
        L_0x028d:
            int r9 = r6.size()
            r3 = 0
        L_0x0292:
            if (r3 >= r9) goto L_0x02a3
            java.lang.Object r2 = r6.get(r3)
            X.7Xy r2 = (X.C123657Xy) r2
            int r1 = r4 - r5
            r0 = 0
            X.C122067Jz.A00(r2, r0, r12, r1)
            int r3 = r3 + 1
            goto L_0x0292
        L_0x02a3:
            int r6 = r8.size()
            r5 = 0
        L_0x02a8:
            if (r5 >= r6) goto L_0x02c3
            java.lang.Object r3 = r8.get(r5)
            X.7Xy r3 = (X.C123657Xy) r3
            if (r7 == 0) goto L_0x02c1
            int r2 = r7.A01
        L_0x02b4:
            int r0 = X.C18210wN.A03(r20)
            int r1 = r4 - r0
            r0 = 0
            X.C122067Jz.A00(r3, r0, r2, r1)
            int r5 = r5 + 1
            goto L_0x02a8
        L_0x02c1:
            r2 = 0
            goto L_0x02b4
        L_0x02c3:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8K1.invoke(java.lang.Object):java.lang.Object");
    }
}
