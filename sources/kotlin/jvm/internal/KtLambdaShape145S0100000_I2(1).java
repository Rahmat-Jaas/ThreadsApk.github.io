package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape145S0100000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape145S0100000_I2(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00dc, code lost:
        if (r0 >= r8) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ec, code lost:
        if (r1 > r21) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, X.C86164wN.A0o(r4, (X.C146958n9) null, 4), r7.A08, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01eb, code lost:
        r2.invoke(r3, r0);
        r3.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0231, code lost:
        r2.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0316, code lost:
        ((X.C123457Wz) r1).A00 = X.C18240wQ.A00(r0.getValue());
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r23
            r3 = r24
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x05e5;
                case 1: goto L_0x05c6;
                case 2: goto L_0x02f2;
                case 3: goto L_0x054b;
                case 4: goto L_0x053c;
                case 5: goto L_0x030e;
                case 6: goto L_0x02e9;
                case 7: goto L_0x0514;
                case 8: goto L_0x04ec;
                case 9: goto L_0x04d2;
                case 10: goto L_0x04b8;
                case 11: goto L_0x04d2;
                case 12: goto L_0x04b8;
                case 13: goto L_0x02b2;
                case 14: goto L_0x0009;
                case 15: goto L_0x0485;
                case 16: goto L_0x0471;
                case 17: goto L_0x0468;
                case 18: goto L_0x045f;
                case 19: goto L_0x0258;
                case 20: goto L_0x0156;
                case 21: goto L_0x0236;
                case 22: goto L_0x0229;
                case 23: goto L_0x0210;
                case 24: goto L_0x0455;
                case 25: goto L_0x01fd;
                case 26: goto L_0x03fd;
                case 27: goto L_0x01f3;
                case 28: goto L_0x01d9;
                case 29: goto L_0x01d9;
                case 30: goto L_0x01c2;
                case 31: goto L_0x03ec;
                case 32: goto L_0x0009;
                case 33: goto L_0x0156;
                case 34: goto L_0x0156;
                case 35: goto L_0x0009;
                case 36: goto L_0x01b9;
                case 37: goto L_0x0183;
                case 38: goto L_0x0179;
                case 39: goto L_0x016a;
                case 40: goto L_0x0160;
                case 41: goto L_0x0156;
                case 42: goto L_0x0156;
                case 43: goto L_0x0009;
                case 44: goto L_0x0009;
                case 45: goto L_0x03e6;
                case 46: goto L_0x03e6;
                case 47: goto L_0x0324;
                case 48: goto L_0x0017;
                case 49: goto L_0x0024;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            java.lang.Object r0 = r4.A00
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r1, r1)
        L_0x0014:
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0016:
            return r2
        L_0x0017:
            r2 = 0
            X.C04220Ms.A0B(r3, r2)
            java.lang.Object r1 = r4.A00
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r2, r2)
            goto L_0x0014
        L_0x0024:
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r0 = r4.A00
            r20 = r0
            r0 = r20
            java.util.List r0 = (java.util.List) r0
            r20 = r0
            int r19 = r20.size()
            r12 = 0
        L_0x0037:
            r0 = r19
            if (r12 >= r0) goto L_0x0014
            r0 = r20
            java.lang.Object r11 = r0.get(r12)
            X.7VN r11 = (X.AnonymousClass7VN) r11
            java.util.List r0 = r11.A0B
            r22 = r0
            int r18 = r22.size()
            r10 = 0
        L_0x004c:
            r0 = r18
            if (r10 >= r0) goto L_0x0152
            r0 = r22
            java.lang.Object r9 = r0.get(r10)
            X.7Xy r9 = (X.C123657Xy) r9
            int r8 = r11.A04
            boolean r14 = r11.A0D
            if (r14 == 0) goto L_0x014e
            int r0 = r9.A00
        L_0x0060:
            int r8 = r8 - r0
            int r0 = r11.A03
            r21 = r0
            java.util.List r0 = r11.A0B
            java.lang.Object r0 = r0.get(r10)
            X.7Xy r0 = (X.C123657Xy) r0
            java.lang.Object r1 = r0.B01()
            boolean r0 = r1 instanceof X.C147218oz
            if (r0 == 0) goto L_0x014b
            if (r1 == 0) goto L_0x014b
            X.7Do r7 = r11.A09
            java.lang.Object r1 = r11.A0A
            long r5 = r11.A06
            java.util.Map r0 = r7.A07
            java.lang.Object r1 = r0.get(r1)
            X.6kH r1 = (X.C109606kH) r1
            if (r1 == 0) goto L_0x00fa
            java.util.List r0 = r1.A03
            java.lang.Object r4 = r0.get(r10)
            X.6kI r4 = (X.C109616kI) r4
            X.7JH r0 = r4.A02
            java.lang.Object r0 = X.AnonymousClass7JH.A01(r0)
            X.7Eg r0 = (X.C121127Eg) r0
            long r5 = r0.A00
            long r2 = r1.A02
            r17 = 32
            long r0 = r5 >> r17
            int r13 = (int) r0
            long r0 = r2 >> r17
            int r15 = (int) r0
            int r13 = r13 + r15
            int r0 = X.C86104wH.A08(r5)
            int r16 = X.C86104wH.A08(r2)
            int r0 = r0 + r16
            long r5 = X.AnonymousClass7Hh.A00(r13, r0)
            long r2 = r4.A01
            long r0 = r2 >> r17
            int r13 = (int) r0
            int r13 = r13 + r15
            int r0 = X.C86104wH.A08(r2)
            int r0 = r0 + r16
            long r1 = X.AnonymousClass7Hh.A00(r13, r0)
            X.8pE r0 = r4.A03
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0146
            int r1 = X.C86104wH.A08(r1)
        L_0x00d2:
            if (r1 > r8) goto L_0x00de
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0141
            int r0 = X.C86104wH.A08(r5)
        L_0x00dc:
            if (r0 < r8) goto L_0x00ee
        L_0x00de:
            r0 = r21
            if (r1 < r0) goto L_0x00fa
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x013c
            int r1 = X.C86104wH.A08(r5)
        L_0x00ea:
            r0 = r21
            if (r1 <= r0) goto L_0x00fa
        L_0x00ee:
            X.4qz r3 = r7.A08
            r2 = 0
            r0 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
        L_0x00fa:
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0112
            int r2 = X.C86104wH.A07(r5)
            if (r14 == 0) goto L_0x0130
            int r0 = X.C86104wH.A08(r5)
            int r1 = r11.A02
            int r1 = r1 - r0
            int r0 = r9.A00
            int r1 = r1 - r0
        L_0x010e:
            long r5 = X.AnonymousClass7Hh.A00(r2, r1)
        L_0x0112:
            long r0 = r11.A08
            long r2 = X.AnonymousClass7Hh.A01(r5, r0)
            if (r14 == 0) goto L_0x012c
            X.0YY r5 = X.AnonymousClass6ZQ.A01
            r4 = 0
            long r0 = X.C123657Xy.A08(r9)
            long r0 = X.AnonymousClass7Hh.A01(r2, r0)
            r9.A0E(r5, r4, r0)
        L_0x0128:
            int r10 = r10 + 1
            goto L_0x004c
        L_0x012c:
            X.C122067Jz.A03(r9, r2)
            goto L_0x0128
        L_0x0130:
            int r1 = r11.A02
            int r1 = r1 - r2
            int r0 = r9.A01
            int r2 = r1 - r0
            int r1 = X.C86104wH.A08(r5)
            goto L_0x010e
        L_0x013c:
            int r1 = X.C86104wH.A07(r5)
            goto L_0x00ea
        L_0x0141:
            int r0 = X.C86104wH.A07(r5)
            goto L_0x00dc
        L_0x0146:
            int r1 = X.C86104wH.A07(r1)
            goto L_0x00d2
        L_0x014b:
            long r5 = r11.A06
            goto L_0x00fa
        L_0x014e:
            int r0 = r9.A01
            goto L_0x0060
        L_0x0152:
            int r12 = r12 + 1
            goto L_0x0037
        L_0x0156:
            X.75O r1 = X.C86144wL.A0K(r3)
            java.lang.Object r0 = r4.A00
            r1.A00 = r0
            goto L_0x0014
        L_0x0160:
            X.86i r2 = X.AnonymousClass75O.A00(r3)
            java.lang.Object r1 = r4.A00
            java.lang.String r0 = "paddingValues"
            goto L_0x0231
        L_0x016a:
            X.75O r0 = X.C86144wL.A0K(r3)
            java.lang.String r2 = "offset"
            X.86i r1 = r0.A01
            java.lang.Object r0 = r4.A00
            r1.A01(r2, r0)
            goto L_0x0014
        L_0x0179:
            X.86i r2 = X.AnonymousClass75O.A00(r3)
            java.lang.Object r1 = r4.A00
            java.lang.String r0 = "offset"
            goto L_0x0231
        L_0x0183:
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r6 = r4.A00
            X.7Xy r6 = (X.C123657Xy) r6
            long r2 = X.C121127Eg.A01
            r5 = 0
            r4 = 0
            X.C04220Ms.A0B(r6, r0)
            X.69J r1 = X.C122067Jz.A03
            X.69J r0 = X.AnonymousClass69J.Ltr
            if (r1 == r0) goto L_0x01ac
            int r1 = X.C122067Jz.A00
            if (r1 == 0) goto L_0x01ac
            int r0 = r6.A01
            int r1 = r1 - r0
            int r0 = X.C86104wH.A07(r2)
            int r1 = r1 - r0
            int r0 = X.C86104wH.A08(r2)
            long r2 = X.AnonymousClass7Hh.A00(r1, r0)
        L_0x01ac:
            long r0 = X.C123657Xy.A08(r6)
            long r0 = X.AnonymousClass7Hh.A01(r2, r0)
            r6.A0E(r5, r4, r0)
            goto L_0x0014
        L_0x01b9:
            X.86i r2 = X.AnonymousClass75O.A00(r3)
            java.lang.Object r1 = r4.A00
            java.lang.String r0 = "insets"
            goto L_0x0231
        L_0x01c2:
            X.7Es r3 = (X.C121197Es) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r2 = r4.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            long r0 = X.C121667Hg.A00(r3)
            float r0 = X.AnonymousClass7KC.A02(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x01eb
        L_0x01d9:
            X.7Es r3 = (X.C121197Es) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r2 = r4.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            long r0 = X.C121667Hg.A00(r3)
            X.7KC r0 = X.C86124wJ.A0O(r0)
        L_0x01eb:
            r2.invoke(r3, r0)
            r3.A01()
            goto L_0x0014
        L_0x01f3:
            X.8mM r3 = (X.C146508mM) r3
            java.lang.Object r0 = r4.A00
            X.7Y0 r0 = (X.AnonymousClass7Y0) r0
            r0.A01 = r3
            goto L_0x0014
        L_0x01fd:
            X.8mv r3 = X.C86124wJ.A0Q(r3)
            X.77Z r2 = X.AnonymousClass6WO.A00
            java.lang.Object r1 = r4.A00
            r0 = 8
            kotlin.jvm.internal.KtLambdaShape20S0100000_I2 r0 = X.C86154wM.A12(r1, r0)
            r3.ChN(r2, r0)
            goto L_0x0014
        L_0x0210:
            X.8mM r3 = (X.C146508mM) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r2 = r4.A00
            X.8pE r2 = (X.C147368pE) r2
            long r0 = X.AnonymousClass7KC.A03
            long r0 = r3.Bb0(r0)
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r2.CrC(r0)
            goto L_0x0014
        L_0x0229:
            X.86i r2 = X.AnonymousClass75O.A00(r3)
            java.lang.Object r1 = r4.A00
            java.lang.String r0 = "onPositioned"
        L_0x0231:
            r2.A01(r0, r1)
            goto L_0x0014
        L_0x0236:
            X.8n8 r3 = (X.C146948n8) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r0 = r4.A00
            X.8cw r0 = (X.C141778cw) r0
            X.7XE r0 = (X.AnonymousClass7XE) r0
            X.8pE r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.6sp r0 = (X.C114186sp) r0
            int r1 = r0.A00
            r0 = 1
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            r0 = r0 ^ 1
            r3.Cio(r0)
            goto L_0x0014
        L_0x0258:
            X.6t4 r3 = (X.C114336t4) r3
            long r5 = r3.A00
            long r7 = X.AnonymousClass7FV.A02(r5)
            java.lang.Object r3 = r4.A00
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            long r1 = r3.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r2 = r0 ^ 1
            long r0 = X.AnonymousClass7FV.A02(r5)
            r3.A00 = r0
            if (r2 == 0) goto L_0x0014
            android.widget.EdgeEffect r0 = r3.A0A
            int r2 = X.C86104wH.A07(r5)
            int r1 = X.C86104wH.A08(r5)
            r0.setSize(r2, r1)
            android.widget.EdgeEffect r0 = r3.A04
            r0.setSize(r2, r1)
            android.widget.EdgeEffect r0 = r3.A06
            r0.setSize(r1, r2)
            android.widget.EdgeEffect r0 = r3.A08
            r0.setSize(r1, r2)
            android.widget.EdgeEffect r0 = r3.A0B
            r0.setSize(r2, r1)
            android.widget.EdgeEffect r0 = r3.A05
            r0.setSize(r2, r1)
            android.widget.EdgeEffect r0 = r3.A07
            r0.setSize(r1, r2)
            android.widget.EdgeEffect r0 = r3.A09
            r0.setSize(r1, r2)
            X.8pE r1 = r3.A0D
            kotlin.Unit r0 = kotlin.Unit.A00
            r1.CrC(r0)
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A04(r3)
            goto L_0x0014
        L_0x02b2:
            X.8ku r3 = (X.C145678ku) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.677 r0 = X.AnonymousClass677.PreEnter
            X.677 r1 = X.AnonymousClass677.Visible
            boolean r0 = r3.BZF(r0, r1)
            if (r0 == 0) goto L_0x02d7
            java.lang.Object r0 = r4.A00
            X.52Z r0 = (X.AnonymousClass52Z) r0
            X.4oM r0 = r0.A02
        L_0x02c8:
            java.lang.Object r0 = r0.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x02d4
            X.8oz r2 = r0.A00
        L_0x02d2:
            if (r2 != 0) goto L_0x0016
        L_0x02d4:
            X.7Tu r2 = X.AnonymousClass7KU.A02
            return r2
        L_0x02d7:
            X.677 r0 = X.AnonymousClass677.PostExit
            boolean r0 = r3.BZF(r1, r0)
            if (r0 == 0) goto L_0x02e6
            java.lang.Object r0 = r4.A00
            X.52Z r0 = (X.AnonymousClass52Z) r0
            X.4oM r0 = r0.A03
            goto L_0x02c8
        L_0x02e6:
            X.7Tu r2 = X.AnonymousClass7KU.A02
            goto L_0x02d2
        L_0x02e9:
            X.8pw r1 = X.C86144wL.A0J(r3)
            java.lang.Object r0 = r4.A00
            X.4oM r0 = (X.C81784oM) r0
            goto L_0x0316
        L_0x02f2:
            r5 = 0
            X.C04220Ms.A0B(r3, r5)
            java.lang.Object r4 = r4.A00
            java.util.List r4 = (java.util.List) r4
            int r3 = r4.size()
            r2 = 0
        L_0x02ff:
            if (r2 >= r3) goto L_0x0014
            java.lang.Object r1 = r4.get(r2)
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r5, r5)
            int r2 = r2 + 1
            goto L_0x02ff
        L_0x030e:
            X.8pw r1 = X.C86144wL.A0J(r3)
            java.lang.Object r0 = r4.A00
            X.4oM r0 = (X.C81784oM) r0
        L_0x0316:
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            X.7Wz r1 = (X.C123457Wz) r1
            r1.A00 = r0
            goto L_0x0014
        L_0x0324:
            float r0 = X.C18240wQ.A00(r3)
            java.lang.Object r6 = r4.A00
            androidx.compose.foundation.lazy.LazyListState r6 = (androidx.compose.foundation.lazy.LazyListState) r6
            float r5 = -r0
            r4 = 0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x033a
            X.8pE r0 = r6.A0D
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x0346
        L_0x033a:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x034d
            X.8pE r0 = r6.A0C
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 != 0) goto L_0x034d
        L_0x0346:
            r5 = 0
        L_0x0347:
            float r0 = -r5
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x034d:
            float r2 = r6.A00
            float r0 = java.lang.Math.abs(r2)
            r8 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x03db
            float r2 = r2 + r5
            r6.A00 = r2
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bf
            X.8pE r0 = r6.A0I
            X.C86134wK.A1B(r0)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x03bf
            float r0 = r6.A00
            float r2 = r2 - r0
            X.8nU r7 = r6.A02()
            java.util.List r3 = r7.BLp()
            boolean r0 = r3.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03bf
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ce
            r2 = 1
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r3)
            X.8cc r0 = (X.AnonymousClass8cc) r0
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r0 = r0.A00
            int r0 = r0 + 1
        L_0x0392:
            int r1 = r6.A01
            if (r0 == r1) goto L_0x03bf
            if (r0 < 0) goto L_0x03bf
            int r1 = r7.BHd()
            if (r0 >= r1) goto L_0x03bf
            boolean r1 = r6.A05
            if (r1 == r2) goto L_0x03a9
            X.8fZ r1 = r6.A03
            if (r1 == 0) goto L_0x03a9
            r1.cancel()
        L_0x03a9:
            r6.A05 = r2
            r6.A01 = r0
            X.6o6 r3 = r6.A0B
            X.8pE r1 = r6.A0H
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.unit.Constraints r1 = (androidx.compose.ui.unit.Constraints) r1
            long r1 = r1.A00
            X.8fZ r0 = r3.A00(r0, r1)
            r6.A03 = r0
        L_0x03bf:
            float r1 = r6.A00
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0347
            float r5 = r5 - r1
            r6.A00 = r4
            goto L_0x0347
        L_0x03ce:
            r2 = 0
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r3)
            X.8cc r0 = (X.AnonymousClass8cc) r0
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r0 = r0.A00
            int r0 = r0 - r1
            goto L_0x0392
        L_0x03db:
            java.lang.String r0 = "entered drag with non-zero pending scroll: "
            java.lang.String r0 = X.AnonymousClass00U.A0I(r0, r2)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x03e6:
            X.C86144wL.A1M(r3)
            java.lang.Object r2 = r4.A00
            return r2
        L_0x03ec:
            float r1 = X.C18240wQ.A00(r3)
            java.lang.Object r0 = r4.A00
            java.lang.Object r0 = X.C86104wH.A0f(r0)
            X.0YY r0 = (X.AnonymousClass0YY) r0
            java.lang.Object r2 = X.C86164wN.A0d(r0, r1)
            return r2
        L_0x03fd:
            float r6 = X.C18240wQ.A00(r3)
            java.lang.Object r5 = r4.A00
            X.7Ub r5 = (X.C122847Ub) r5
            X.8pE r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            float r2 = (float) r0
            float r2 = r2 + r6
            float r0 = r5.A00
            float r2 = r2 + r0
            X.8pE r0 = r5.A01
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            float r1 = (float) r0
            r0 = 0
            float r4 = X.AnonymousClass8bI.A01(r2, r0, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r3 = r0 ^ 1
            X.8pE r2 = r5.A03
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            float r0 = (float) r0
            float r4 = r4 - r0
            int r1 = X.AnonymousClass8bA.A02(r4)
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r0 + r1
            X.C147368pE.A03(r2, r0)
            float r0 = (float) r1
            float r0 = r4 - r0
            r5.A00 = r0
            if (r3 == 0) goto L_0x0450
            r6 = r4
        L_0x0450:
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            return r2
        L_0x0455:
            java.lang.Object r0 = r4.A00
            X.4wF r0 = (X.C86084wF) r0
            kotlin.Unit r2 = kotlin.Unit.A00
            r0.D7t(r2)
            return r2
        L_0x045f:
            java.lang.Object r1 = r4.A00
            r0 = 2
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r2 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r2.<init>(r1, r0)
            return r2
        L_0x0468:
            java.lang.Object r1 = r4.A00
            r0 = 1
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r2 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r2.<init>(r1, r0)
            return r2
        L_0x0471:
            long r5 = X.C18190wL.A08(r3)
            java.lang.Object r2 = r4.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r0 = 1
            long r5 = r5 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r2.invoke(r0)
            return r2
        L_0x0485:
            X.8ku r3 = (X.C145678ku) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.677 r0 = X.AnonymousClass677.PreEnter
            X.677 r1 = X.AnonymousClass677.Visible
            boolean r0 = r3.BZF(r0, r1)
            if (r0 == 0) goto L_0x04a6
            java.lang.Object r0 = r4.A00
            X.52Y r0 = (X.AnonymousClass52Y) r0
            X.4oM r0 = r0.A01
        L_0x049b:
            java.lang.Object r0 = r0.getValue()
            X.6tJ r0 = (X.C114446tJ) r0
            if (r0 == 0) goto L_0x04b5
            X.8oz r2 = r0.A00
            return r2
        L_0x04a6:
            X.677 r0 = X.AnonymousClass677.PostExit
            boolean r0 = r3.BZF(r1, r0)
            if (r0 == 0) goto L_0x04b5
            java.lang.Object r0 = r4.A00
            X.52Y r0 = (X.AnonymousClass52Y) r0
            X.4oM r0 = r0.A02
            goto L_0x049b
        L_0x04b5:
            X.7Tu r2 = X.AnonymousClass7KU.A01
            return r2
        L_0x04b8:
            X.6t4 r3 = (X.C114336t4) r3
            long r2 = r3.A00
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = X.C86104wH.A08(r2)
            java.lang.Object r0 = X.C86154wM.A0f(r1, r0)
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = 0
            X.7Eg r2 = X.AnonymousClass7Hh.A04(r0, r1)
            return r2
        L_0x04d2:
            X.6t4 r3 = (X.C114336t4) r3
            long r2 = r3.A00
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = X.C86104wH.A07(r2)
            java.lang.Object r0 = X.C86154wM.A0f(r1, r0)
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = 0
            X.7Eg r2 = X.AnonymousClass7Hh.A04(r1, r0)
            return r2
        L_0x04ec:
            X.6t4 r3 = (X.C114336t4) r3
            long r5 = r3.A00
            int r2 = X.C86104wH.A07(r5)
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = X.C86104wH.A08(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.4h7 r1 = (X.C77624h7) r1
            java.lang.Object r0 = r1.invoke(r0)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            long r0 = X.AnonymousClass7FV.A00(r2, r0)
            X.6t4 r2 = new X.6t4
            r2.<init>(r0)
            return r2
        L_0x0514:
            X.6t4 r3 = (X.C114336t4) r3
            long r5 = r3.A00
            int r2 = X.C86104wH.A07(r5)
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            int r0 = X.C86104wH.A08(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.4h6 r1 = (X.C77614h6) r1
            java.lang.Object r0 = r1.invoke(r0)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            long r0 = X.AnonymousClass7FV.A00(r2, r0)
            X.6t4 r2 = new X.6t4
            r2.<init>(r0)
            return r2
        L_0x053c:
            java.lang.Object r0 = r4.A00
            X.6vT r0 = (X.C115556vT) r0
            X.8pE r0 = r0.A06
            boolean r0 = X.C86124wJ.A1Y(r0, r3)
            java.lang.Boolean r2 = X.C18240wQ.A0X(r0)
            return r2
        L_0x054b:
            X.52c r3 = (X.AnonymousClass52c) r3
            r8 = 0
            X.C04220Ms.A0B(r3, r8)
            float r0 = r3.A01
            double r0 = (double) r0
            r2 = 1077936128(0x40400000, float:3.0)
            double r6 = (double) r2
            double r0 = java.lang.Math.pow(r0, r6)
            float r9 = (float) r0
            float r0 = r3.A02
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r6)
            float r5 = (float) r0
            float r0 = r3.A03
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r6)
            float r2 = (float) r0
            float[] r6 = X.AnonymousClass6a4.A01
            r0 = r6[r8]
            float r1 = r9 * r0
            r0 = 3
            float r1 = X.C86164wN.A03(r6, r5, r1, r0)
            r0 = 6
            float r8 = X.C86164wN.A03(r6, r2, r1, r0)
            r0 = 1
            r0 = r6[r0]
            float r1 = r9 * r0
            r0 = 4
            float r1 = X.C86164wN.A03(r6, r5, r1, r0)
            r0 = 7
            float r7 = X.C86164wN.A03(r6, r2, r1, r0)
            r0 = 2
            r0 = r6[r0]
            float r9 = r9 * r0
            r0 = 5
            float r1 = X.C86164wN.A03(r6, r5, r9, r0)
            r0 = 8
            float r6 = X.C86164wN.A03(r6, r2, r1, r0)
            float r2 = r3.A00
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = X.AnonymousClass8bI.A01(r2, r1, r0)
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = X.AnonymousClass8bI.A01(r8, r1, r0)
            float r2 = X.AnonymousClass8bI.A01(r7, r1, r0)
            float r1 = X.AnonymousClass8bI.A01(r6, r1, r0)
            X.6vY r0 = X.GQI.A01
            long r1 = X.C121657He.A04(r0, r3, r2, r1, r5)
            java.lang.Object r0 = r4.A00
            X.6vY r0 = (X.C115606vY) r0
            long r0 = X.AnonymousClass7KE.A05(r0, r1)
            X.7KE r2 = X.C86134wK.A0I(r0)
            return r2
        L_0x05c6:
            java.lang.Object r0 = r4.A00
            X.7Tz r0 = (X.C122827Tz) r0
            java.util.Map r0 = r0.A05
            java.lang.Object r0 = r0.get(r3)
            X.4oM r0 = (X.C81784oM) r0
            if (r0 == 0) goto L_0x05e2
            java.lang.Object r0 = r0.getValue()
            X.6t4 r0 = (X.C114336t4) r0
            long r0 = r0.A00
        L_0x05dc:
            X.6t4 r2 = new X.6t4
            r2.<init>(r0)
            return r2
        L_0x05e2:
            r0 = 0
            goto L_0x05dc
        L_0x05e5:
            java.lang.Object r0 = r4.A00
            java.lang.Boolean r2 = X.C86124wJ.A0f(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape145S0100000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
