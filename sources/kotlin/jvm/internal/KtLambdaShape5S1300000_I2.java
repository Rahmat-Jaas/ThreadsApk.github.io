package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.C02220Ah;

public class KtLambdaShape5S1300000_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1300000_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        super(3);
        this.A04 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A03 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.7W3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.52Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: X.52Z} */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024d, code lost:
        if (r1 != r3) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024f, code lost:
        r17 = new X.AnonymousClass52Z(r18, r19, r5, r4, r22);
        r6.A14(r17);
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025d, code lost:
        X.AnonymousClass7W3.A0w(r6, false);
        r1 = (X.AnonymousClass52Z) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x026a, code lost:
        if (r23.getValue() == r15.getValue()) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026e, code lost:
        if (r1.A00 != null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0270, code lost:
        r0 = (androidx.compose.ui.Alignment) r22.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0276, code lost:
        if (r0 != null) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0278, code lost:
        r0 = X.AnonymousClass7KV.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027a, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027c, code lost:
        r0 = (X.C115056uQ) r5.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0282, code lost:
        if (r0 == null) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0286, code lost:
        if (r0.A03 != false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0288, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028a, code lost:
        r0 = androidx.compose.ui.Modifier.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x028c, code lost:
        if (r16 != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x028e, code lost:
        r0 = X.C115826vy.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0292, code lost:
        r7 = androidx.compose.ui.Modifier.A07(r7, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029a, code lost:
        r0 = (X.C115056uQ) r4.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a0, code lost:
        if (r0 == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a4, code lost:
        if (r0.A03 != false) goto L_0x028a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r24 = this;
            r1 = r24
            r4 = r26
            r7 = r25
            int r0 = r1.A04
            r2 = r27
            switch(r0) {
                case 0: goto L_0x0161;
                case 1: goto L_0x00ae;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.8p5 r7 = (X.C147278p5) r7
            X.8nY r4 = (X.C147188nY) r4
            int r2 = X.AnonymousClass0wJ.A04(r2)
            r11 = 0
            X.C04220Ms.A0B(r7, r11)
            r0 = r2 & 14
            if (r0 != 0) goto L_0x00ab
            int r0 = X.C147188nY.A0F(r4, r7)
            r0 = r0 | r2
        L_0x0022:
            r2 = r0 & 91
            r0 = 18
            if (r2 != r0) goto L_0x0034
            boolean r0 = r4.BCM()
            if (r0 == 0) goto L_0x0034
            r4.CuJ()
        L_0x0031:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x0034:
            java.lang.String r10 = r1.A03
            java.lang.Object r6 = r1.A00
            X.7If r6 = (X.C121807If) r6
            X.7V4 r7 = (X.AnonymousClass7V4) r7
            long r2 = r7.A00
            int r2 = androidx.compose.ui.unit.Constraints.A02(r2)
            r7 = 0
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r19 = X.AnonymousClass7JT.A02(r11, r2, r11, r0)
            X.534 r0 = X.AnonymousClass7DE.A02
            java.lang.Object r2 = r4.AEA(r0)
            X.8nV r2 = (X.C147168nV) r2
            X.534 r0 = X.AnonymousClass7DE.A04
            java.lang.Object r0 = r4.AEA(r0)
            X.8g4 r0 = (X.C143078g4) r0
            r18 = 480(0x1e0, float:6.73E-43)
            r12 = r6
            r13 = r0
            r14 = r2
            r15 = r10
            r16 = r7
            r17 = r11
            X.8g2 r2 = X.AnonymousClass6FK.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 577502204(0x226bfbfc, float:3.1981838E-18)
            r4.Cvb(r0)
            X.7Ye r2 = (X.C123707Ye) r2
            X.6vM r0 = r2.A01
            int r0 = r0.A04
            r12 = 1
            if (r0 <= r12) goto L_0x007e
            r0 = 2131822228(0x7f110694, float:1.9277221E38)
            java.lang.String r10 = X.AnonymousClass7JS.A01(r4, r0)
        L_0x007e:
            X.AnonymousClass7W3.A0z(r4, r11)
            java.lang.Object r2 = r1.A01
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            X.8O7 r0 = X.AnonymousClass8O7.A00
            androidx.compose.ui.Modifier r3 = X.AnonymousClass6FI.A00(r2, r0, r12)
            X.799 r2 = X.AnonymousClass799.A00(r11)
            java.lang.Object r0 = r1.A02
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            androidx.compose.ui.Modifier r5 = X.C117646z1.A01(r3, r2, r0)
            long r17 = X.AnonymousClass7KB.A03(r4)
            r13 = 2
            r19 = 0
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r15 = 6
            r16 = 504(0x1f8, float:7.06E-43)
            r8 = r7
            r9 = r7
            r21 = r11
            X.AnonymousClass7I9.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            goto L_0x0031
        L_0x00ab:
            r0 = r2
            goto L_0x0022
        L_0x00ae:
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            X.8nY r11 = X.C86104wH.A0H(r4, r2)
            r10 = 0
            X.C04220Ms.A0B(r7, r10)
            r0 = 158379472(0x970add0, float:2.8970675E-33)
            r11.Cvb(r0)
            java.lang.Object r9 = r1.A02
            X.6vT r9 = (X.C115556vT) r9
            r8 = 1157296644(0x44faf204, float:2007.563)
            boolean r0 = X.C147188nY.A0z(r11, r9, r8)
            r6 = r11
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r2 = r6.A13()
            if (r0 != 0) goto L_0x00d6
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r2 != r0) goto L_0x00de
        L_0x00d6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.AnonymousClass7WR.A00(r6, r0)
        L_0x00de:
            X.AnonymousClass7W3.A0w(r6, r10)
            X.8pE r2 = (X.C147368pE) r2
            java.lang.Object r3 = androidx.compose.animation.core.MutableTransitionState.A00(r9)
            X.8pE r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            if (r3 != r0) goto L_0x014c
            X.8pE r0 = r9.A02
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 != 0) goto L_0x014c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
        L_0x00fb:
            r2.CrC(r0)
        L_0x00fe:
            boolean r0 = X.C86104wH.A1X(r2)
            if (r0 == 0) goto L_0x0296
            X.8cW r3 = X.C103866ar.A03
            java.lang.String r2 = r1.A03
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r0 = X.C147188nY.A0r(r11, r6, r0)
            java.lang.Object r5 = X.AnonymousClass7GN.A00
            if (r0 != r5) goto L_0x011c
            java.lang.String r0 = " slide"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)
            r6.A14(r0)
        L_0x011c:
            X.AnonymousClass7W3.A0w(r6, r10)
            java.lang.String r0 = (java.lang.String) r0
            X.6pr r4 = X.AnonymousClass7FH.A00(r9, r3, r11, r0, r10)
            java.lang.Object r3 = r1.A00
            X.4oM r3 = (X.C81784oM) r3
            java.lang.Object r2 = r1.A01
            X.4oM r2 = (X.C81784oM) r2
            boolean r1 = X.C147188nY.A0z(r11, r9, r8)
            java.lang.Object r0 = r6.A13()
            if (r1 != 0) goto L_0x0139
            if (r0 != r5) goto L_0x0141
        L_0x0139:
            X.52Y r0 = new X.52Y
            r0.<init>(r4, r3, r2)
            r6.A14(r0)
        L_0x0141:
            X.AnonymousClass7W3.A0w(r6, r10)
            X.7XV r0 = (X.AnonymousClass7XV) r0
            androidx.compose.ui.Modifier r7 = r7.Cx6(r0)
            goto L_0x0296
        L_0x014c:
            java.lang.Object r0 = r1.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            if (r0 != 0) goto L_0x015c
            java.lang.Object r0 = r1.A01
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            if (r0 == 0) goto L_0x00fe
        L_0x015c:
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            goto L_0x00fb
        L_0x0161:
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            X.8nY r11 = X.C86104wH.A0H(r4, r2)
            r10 = 0
            X.C04220Ms.A0B(r7, r10)
            r0 = -140634085(0xfffffffff79e181b, float:-6.413061E33)
            r11.Cvb(r0)
            java.lang.Object r9 = r1.A02
            X.6vT r9 = (X.C115556vT) r9
            r8 = 1157296644(0x44faf204, float:2007.563)
            boolean r2 = X.C147188nY.A0z(r11, r9, r8)
            r6 = r11
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r3 = r6.A13()
            r0 = 0
            r16 = 0
            if (r2 != 0) goto L_0x018c
            java.lang.Object r2 = X.AnonymousClass7GN.A00
            if (r3 != r2) goto L_0x0194
        L_0x018c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = X.AnonymousClass7WR.A00(r6, r2)
        L_0x0194:
            X.AnonymousClass7W3.A0w(r6, r10)
            X.8pE r3 = (X.C147368pE) r3
            androidx.compose.animation.core.MutableTransitionState r2 = r9.A01
            X.8pE r2 = r2.A00
            r23 = r2
            java.lang.Object r4 = r23.getValue()
            X.8pE r15 = r9.A06
            java.lang.Object r2 = r15.getValue()
            if (r4 != r2) goto L_0x02b9
            X.8pE r2 = r9.A02
            boolean r2 = X.C86104wH.A1X(r2)
            if (r2 != 0) goto L_0x02b9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
        L_0x01b7:
            r3.CrC(r2)
        L_0x01ba:
            boolean r2 = X.C86104wH.A1X(r3)
            if (r2 == 0) goto L_0x0296
            X.8pE r2 = r9.A04
            java.lang.Object r4 = r2.getValue()
            X.8ku r4 = (X.C145678ku) r4
            X.677 r3 = X.AnonymousClass677.PreEnter
            X.677 r2 = X.AnonymousClass677.Visible
            boolean r2 = r4.BZF(r3, r2)
            java.lang.Object r5 = r1.A00
            X.4oM r5 = (X.C81784oM) r5
            java.lang.Object r4 = r1.A01
            X.4oM r4 = (X.C81784oM) r4
            if (r2 == 0) goto L_0x02a7
            java.lang.Object r2 = r5.getValue()
            X.6uQ r2 = (X.C115056uQ) r2
            if (r2 != 0) goto L_0x02b5
            java.lang.Object r2 = r4.getValue()
        L_0x01e6:
            X.6uQ r2 = (X.C115056uQ) r2
            if (r2 != 0) goto L_0x02b5
            r2 = r0
        L_0x01eb:
            X.4oM r22 = X.C115806vw.A01(r11, r2)
            X.8cW r2 = X.C103866ar.A04
            java.lang.String r13 = r1.A03
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            java.lang.Object r1 = X.C147188nY.A0r(r11, r6, r12)
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r1 != r3) goto L_0x0207
            java.lang.String r1 = " shrink/expand"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r13, r1)
            r6.A14(r1)
        L_0x0207:
            X.AnonymousClass7W3.A0w(r6, r10)
            java.lang.String r1 = (java.lang.String) r1
            X.6pr r18 = X.AnonymousClass7FH.A00(r9, r2, r11, r1, r10)
            r14 = -1553213624(0xffffffffa36bd748, float:-1.2784963E-17)
            java.lang.Object r2 = r23.getValue()
            java.lang.Object r1 = r15.getValue()
            boolean r1 = X.C18180wK.A1Z(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.CvO(r14, r1)
            X.8cW r1 = X.C103866ar.A03
            java.lang.Object r2 = X.C147188nY.A0r(r11, r6, r12)
            if (r2 != r3) goto L_0x0237
            java.lang.String r2 = " InterruptionHandlingOffset"
            java.lang.String r2 = X.AnonymousClass00U.A0L(r13, r2)
            r6.A14(r2)
        L_0x0237:
            X.AnonymousClass7W3.A0w(r6, r10)
            java.lang.String r2 = (java.lang.String) r2
            X.6pr r19 = X.AnonymousClass7FH.A00(r9, r1, r11, r2, r10)
            X.AnonymousClass7W3.A0w(r6, r10)
            boolean r2 = X.C147188nY.A0z(r11, r9, r8)
            java.lang.Object r1 = r6.A13()
            if (r2 != 0) goto L_0x024f
            if (r1 != r3) goto L_0x025d
        L_0x024f:
            X.52Z r1 = new X.52Z
            r20 = r5
            r21 = r4
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A14(r1)
        L_0x025d:
            X.AnonymousClass7W3.A0w(r6, r10)
            X.52Z r1 = (X.AnonymousClass52Z) r1
            java.lang.Object r3 = r23.getValue()
            java.lang.Object r2 = r15.getValue()
            if (r3 == r2) goto L_0x027a
            androidx.compose.ui.Alignment r0 = r1.A00
            if (r0 != 0) goto L_0x027c
            java.lang.Object r0 = r22.getValue()
            androidx.compose.ui.Alignment r0 = (androidx.compose.ui.Alignment) r0
            if (r0 != 0) goto L_0x027a
            androidx.compose.ui.Alignment r0 = X.AnonymousClass7KV.A0E
        L_0x027a:
            r1.A00 = r0
        L_0x027c:
            java.lang.Object r0 = r5.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x029a
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x029a
        L_0x0288:
            r16 = 1
        L_0x028a:
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            if (r16 != 0) goto L_0x0292
            androidx.compose.ui.Modifier r0 = X.C115826vy.A00(r0)
        L_0x0292:
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.Modifier.A07(r7, r0, r1)
        L_0x0296:
            X.AnonymousClass7W3.A0w(r6, r10)
            return r7
        L_0x029a:
            java.lang.Object r0 = r4.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x028a
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x028a
            goto L_0x0288
        L_0x02a7:
            java.lang.Object r2 = r4.getValue()
            X.6uQ r2 = (X.C115056uQ) r2
            if (r2 != 0) goto L_0x02b5
            java.lang.Object r2 = r5.getValue()
            goto L_0x01e6
        L_0x02b5:
            androidx.compose.ui.Alignment r2 = r2.A01
            goto L_0x01eb
        L_0x02b9:
            java.lang.Object r2 = r1.A00
            java.lang.Object r2 = X.C86104wH.A0f(r2)
            if (r2 != 0) goto L_0x02c9
            java.lang.Object r2 = r1.A01
            java.lang.Object r2 = X.C86104wH.A0f(r2)
            if (r2 == 0) goto L_0x01ba
        L_0x02c9:
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            goto L_0x01b7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape5S1300000_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
