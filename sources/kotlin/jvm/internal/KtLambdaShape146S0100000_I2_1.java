package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape146S0100000_I2_1 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape146S0100000_I2_1(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027e, code lost:
        if (r6 == r0.A01.A01) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0290, code lost:
        if (r6 == r0.A00.A01) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03ba, code lost:
        X.AnonymousClass7F8.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c3, code lost:
        if (X.C86104wH.A1X(r3.A0E) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c5, code lost:
        r0 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c7, code lost:
        if (r0 == null) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c9, code lost:
        r1 = ((X.AnonymousClass7YX) r0).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03cf, code lost:
        if (r1 != X.AnonymousClass006.A00) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d1, code lost:
        r3.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03d6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0401, code lost:
        r2.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0674, code lost:
        if (r0 != null) goto L_0x0676;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0676, code lost:
        r11.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06db, code lost:
        return new com.facebook.redex.IDxEResultShape438S0100000_2_I2(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06f6, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06f7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022a, code lost:
        if (r1.A00 != null) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05a0 A[LOOP:5: B:225:0x059e->B:226:0x05a0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r5 = r23
            r11 = r24
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x04cb;
                case 2: goto L_0x04d1;
                case 3: goto L_0x05fe;
                case 4: goto L_0x0603;
                case 5: goto L_0x0608;
                case 6: goto L_0x0644;
                case 7: goto L_0x0652;
                case 8: goto L_0x0011;
                case 9: goto L_0x0023;
                case 10: goto L_0x0031;
                case 11: goto L_0x003d;
                case 12: goto L_0x0660;
                case 13: goto L_0x0664;
                case 14: goto L_0x004d;
                case 15: goto L_0x0628;
                case 16: goto L_0x005e;
                case 17: goto L_0x0079;
                case 18: goto L_0x0079;
                case 19: goto L_0x0085;
                case 20: goto L_0x0668;
                case 21: goto L_0x00c0;
                case 22: goto L_0x0183;
                case 23: goto L_0x01a7;
                case 24: goto L_0x067a;
                case 25: goto L_0x01bc;
                case 26: goto L_0x01c9;
                case 27: goto L_0x022e;
                case 28: goto L_0x025d;
                case 29: goto L_0x06d2;
                case 30: goto L_0x0266;
                case 31: goto L_0x0294;
                case 32: goto L_0x0335;
                case 33: goto L_0x0357;
                case 34: goto L_0x038c;
                case 35: goto L_0x03d8;
                case 36: goto L_0x06dc;
                case 37: goto L_0x0009;
                case 38: goto L_0x06f9;
                case 39: goto L_0x0406;
                case 40: goto L_0x06f9;
                case 41: goto L_0x0422;
                case 42: goto L_0x0708;
                case 43: goto L_0x0009;
                case 44: goto L_0x071c;
                case 45: goto L_0x0466;
                case 46: goto L_0x072a;
                case 47: goto L_0x0481;
                case 48: goto L_0x048f;
                case 49: goto L_0x049b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r5.A00
            X.C18240wQ.A1G(r0)
        L_0x000e:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0011:
            float r1 = X.C18240wQ.A00(r11)
            java.lang.Object r0 = r5.A00
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r0
            androidx.compose.foundation.pager.PagerState r0 = r0.A00
            X.8pE r2 = r0.A07
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L_0x0401
        L_0x0023:
            X.75O r0 = X.C86144wL.A0K(r11)
            java.lang.String r2 = "bringIntoViewRequester"
            X.86i r1 = r0.A01
            java.lang.Object r0 = r5.A00
            r1.A01(r2, r0)
            goto L_0x000e
        L_0x0031:
            X.86i r2 = X.AnonymousClass75O.A00(r11)
            java.lang.Object r1 = r5.A00
            java.lang.String r0 = "responder"
            r2.A01(r0, r1)
            goto L_0x000e
        L_0x003d:
            X.8mv r2 = X.C86124wJ.A0Q(r11)
            java.lang.Object r1 = r5.A00
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            X.77Z r0 = X.C103986b3.A0Q
            r2.ChN(r0, r1)
            goto L_0x000e
        L_0x004d:
            X.8mM r11 = (X.C146508mM) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.6qu r0 = (X.C113196qu) r0
            X.7Gf r0 = X.C147368pE.A00(r0)
            if (r0 == 0) goto L_0x000e
            r0.A00 = r11
            goto L_0x000e
        L_0x005e:
            r4 = 0
            X.C04220Ms.A0B(r11, r4)
            java.lang.Object r3 = r5.A00
            java.util.List r3 = (java.util.List) r3
            int r2 = r3.size()
            r1 = 0
        L_0x006b:
            if (r1 >= r2) goto L_0x000e
            java.lang.Object r0 = r3.get(r1)
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r4, r4)
            int r1 = r1 + 1
            goto L_0x006b
        L_0x0079:
            X.7KC r11 = (X.AnonymousClass7KC) r11
            long r1 = r11.A00
            java.lang.Object r0 = r5.A00
            X.8mA r0 = (X.C146388mA) r0
            r0.CLu(r1)
            goto L_0x000e
        L_0x0085:
            X.8mM r11 = (X.C146508mM) r11
            r10 = 0
            X.C04220Ms.A0B(r11, r10)
            java.lang.Object r9 = r5.A00
            X.7WM r9 = (X.AnonymousClass7WM) r9
            X.6ms r8 = r9.A04
            r8.A04 = r11
            X.8my r0 = r9.A01
            long r2 = r8.A07
            boolean r0 = X.AnonymousClass72S.A00(r0, r2)
            if (r0 == 0) goto L_0x000e
            long r0 = X.AnonymousClass7KC.A03
            long r4 = r11.Bb2(r0)
            long r6 = r8.A00
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            X.8my r0 = r9.A01
            if (r0 == 0) goto L_0x00bc
            X.7Vw r0 = (X.C123207Vw) r0
            r0.A08 = r10
            X.0YY r1 = r0.A03
            if (r1 == 0) goto L_0x00bc
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.invoke(r0)
        L_0x00bc:
            r8.A00 = r4
            goto L_0x000e
        L_0x00c0:
            X.8q1 r11 = (X.C147848q1) r11
            r7 = 0
            X.C04220Ms.A0B(r11, r7)
            java.lang.Object r1 = r5.A00
            X.7WM r1 = (X.AnonymousClass7WM) r1
            X.6ms r6 = r1.A04
            X.7AW r2 = r6.A05
            if (r2 == 0) goto L_0x000e
            X.8pE r0 = r6.A08
            r0.getValue()
            X.8my r0 = r1.A01
            if (r0 == 0) goto L_0x0180
            X.7Vw r0 = (X.C123207Vw) r0
            X.8pE r0 = r0.A09
            java.util.Map r3 = X.C86154wM.A0t(r0)
            if (r3 == 0) goto L_0x0180
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r5 = r3.get(r0)
            X.6u3 r5 = (X.C114886u3) r5
        L_0x00ef:
            X.8kx r1 = r6.A03
            if (r1 == 0) goto L_0x017e
            X.7Vu r1 = (X.C123197Vu) r1
            X.0ZU r0 = r1.A03
            java.lang.Object r0 = r0.invoke()
            X.7AW r0 = (X.AnonymousClass7AW) r0
            if (r0 == 0) goto L_0x017e
            int r4 = X.C123197Vu.A00(r1, r0)
        L_0x0103:
            if (r5 == 0) goto L_0x0138
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x017b
            X.6u2 r0 = r5.A01
        L_0x010b:
            int r0 = r0.A00
            int r3 = X.AnonymousClass8bI.A02(r0, r7, r4)
            if (r1 != 0) goto L_0x0178
            X.6u2 r0 = r5.A00
        L_0x0115:
            int r0 = r0.A00
            int r1 = X.AnonymousClass8bI.A02(r0, r7, r4)
            if (r3 == r1) goto L_0x0138
            X.7EK r0 = r2.A03
            X.8nF r13 = r0.A02(r3, r1)
            X.6uz r0 = r2.A04
            int r0 = r0.A01
            r7 = 3
            if (r0 != r7) goto L_0x0141
            long r0 = r6.A01
            r12 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            X.53x r14 = X.C877353x.A00
            r16 = r7
            r17 = r0
            r11.AJ7(r12, r13, r14, r15, r16, r17)
        L_0x0138:
            X.8mg r0 = X.C147848q1.A01(r11)
            X.AnonymousClass6FL.A00(r0, r2)
            goto L_0x000e
        L_0x0141:
            r15 = 0
            long r0 = r11.BCH()
            float r17 = X.AnonymousClass7JK.A02(r0)
            float r18 = X.AnonymousClass7JK.A00(r0)
            r19 = 1
            X.8mj r4 = r11.Ae6()
            r5 = r4
            X.7X9 r5 = (X.AnonymousClass7X9) r5
            X.7XA r0 = r5.A01
            X.7El r3 = r0.A02
            long r0 = X.C121167El.A00(r3)
            X.8lx r14 = r5.A00
            r16 = r15
            r14.ADO(r15, r16, r17, r18, r19)
            long r5 = r6.A01
            r12 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            X.53x r14 = X.C877353x.A00
            r16 = r7
            r17 = r5
            r11.AJ7(r12, r13, r14, r15, r16, r17)
            X.C146708mj.A00(r3, r4, r0)
            goto L_0x0138
        L_0x0178:
            X.6u2 r0 = r5.A01
            goto L_0x0115
        L_0x017b:
            X.6u2 r0 = r5.A00
            goto L_0x010b
        L_0x017e:
            r4 = 0
            goto L_0x0103
        L_0x0180:
            r5 = 0
            goto L_0x00ef
        L_0x0183:
            java.lang.Object r6 = X.C86154wM.A0c(r11, r5)
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.size()
            r4 = 0
        L_0x018e:
            if (r4 >= r5) goto L_0x000e
            java.lang.Object r0 = r6.get(r4)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r3 = r0.A00
            X.7Xy r3 = (X.C123657Xy) r3
            java.lang.Object r0 = r0.A01
            X.7Eg r0 = (X.C121127Eg) r0
            long r1 = r0.A00
            r0 = 0
            X.C122067Jz.A01(r3, r0, r1)
            int r4 = r4 + 1
            goto L_0x018e
        L_0x01a7:
            X.7KC r11 = (X.AnonymousClass7KC) r11
            long r2 = r11.A00
            java.lang.Object r0 = r5.A00
            java.lang.Object r1 = X.C86104wH.A0f(r0)
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.7KC r0 = X.C86124wJ.A0O(r2)
            r1.invoke(r0)
            goto L_0x000e
        L_0x01bc:
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            java.lang.Object r0 = r5.A00
            X.7Xy r0 = (X.C123657Xy) r0
            X.C122067Jz.A02(r0, r1, r1)
            goto L_0x000e
        L_0x01c9:
            X.6sw r11 = (X.C114256sw) r11
            int r2 = r11.A00
            java.lang.Object r0 = r5.A00
            X.6qu r0 = (X.C113196qu) r0
            X.6iU r1 = r0.A07
            r0 = 7
            if (r2 != r0) goto L_0x01f7
            X.7ER r0 = r1.A00
            if (r0 == 0) goto L_0x0736
            X.6ot r1 = r1.A02
            if (r1 == 0) goto L_0x000e
            X.6fn r0 = r1.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x000e
            X.8dF r1 = r1.A00
            X.7Z5 r1 = (X.AnonymousClass7Z5) r1
            X.67g r0 = X.C969367g.HideKeyboard
            X.AnonymousClass7Z5.A00(r0, r1)
            goto L_0x000e
        L_0x01f7:
            r0 = 2
            if (r2 == r0) goto L_0x0228
            r0 = 6
            if (r2 != r0) goto L_0x020b
            X.7ER r0 = r1.A00
            if (r0 == 0) goto L_0x0736
            X.8fl r1 = r1.A01
            if (r1 == 0) goto L_0x0733
            r0 = 1
        L_0x0206:
            r1.Bgd(r0)
            goto L_0x000e
        L_0x020b:
            r0 = 5
            if (r2 != r0) goto L_0x0218
            X.7ER r0 = r1.A00
            if (r0 == 0) goto L_0x0736
            X.8fl r1 = r1.A01
            if (r1 == 0) goto L_0x0733
            r0 = 2
            goto L_0x0206
        L_0x0218:
            r0 = 3
            if (r2 == r0) goto L_0x0228
            r0 = 4
            if (r2 == r0) goto L_0x0228
            r0 = 1
            if (r2 == r0) goto L_0x000e
            java.lang.String r0 = "invalid ImeAction"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0228:
            X.7ER r0 = r1.A00
            if (r0 == 0) goto L_0x0736
            goto L_0x000e
        L_0x022e:
            X.7HD r11 = (X.AnonymousClass7HD) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            X.7yH r0 = r11.A01
            java.lang.String r1 = r0.A00
            java.lang.Object r2 = r5.A00
            X.6qu r2 = (X.C113196qu) r2
            X.7yH r0 = r2.A02
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = r0.A00
        L_0x0242:
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x024f
            X.679 r1 = X.AnonymousClass679.None
            X.8pE r0 = r2.A08
            r0.CrC(r1)
        L_0x024f:
            X.0YY r0 = r2.A04
            r0.invoke(r11)
            X.8ff r0 = r2.A0F
            r0.invalidate()
            goto L_0x000e
        L_0x025b:
            r0 = 0
            goto L_0x0242
        L_0x025d:
            java.lang.Object r0 = r5.A00
            X.8pE r0 = (X.C147368pE) r0
            r0.CrC(r11)
            goto L_0x000e
        L_0x0266:
            long r6 = X.C18190wL.A08(r11)
            java.lang.Object r3 = r5.A00
            X.7F8 r3 = (X.AnonymousClass7F8) r3
            X.8pE r4 = r3.A08
            java.lang.Object r0 = r4.getValue()
            X.6u3 r0 = (X.C114886u3) r0
            if (r0 == 0) goto L_0x0282
            X.6u2 r0 = r0.A01
            long r1 = r0.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0282
            goto L_0x03ba
        L_0x0282:
            java.lang.Object r0 = r4.getValue()
            X.6u3 r0 = (X.C114886u3) r0
            if (r0 == 0) goto L_0x000e
            X.6u2 r0 = r0.A00
            long r1 = r0.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            goto L_0x03ba
        L_0x0294:
            long r15 = X.C18190wL.A08(r11)
            java.lang.Object r9 = r5.A00
            X.7F8 r9 = (X.AnonymousClass7F8) r9
            X.8pE r10 = r9.A08
            java.lang.Object r8 = r10.getValue()
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            X.7Vw r6 = r9.A07
            X.8mM r0 = r9.A03()
            java.util.List r5 = r6.A00(r0)
            int r4 = r5.size()
            r14 = 0
            r3 = 0
            r2 = r14
        L_0x02b7:
            if (r3 >= r4) goto L_0x0306
            java.lang.Object r11 = r5.get(r3)
            X.8kx r11 = (X.C145708kx) r11
            r0 = r11
            X.7Vu r0 = (X.C123197Vu) r0
            long r0 = r0.A02
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x0304
            r1 = r11
            X.7Vu r1 = (X.C123197Vu) r1
            X.0ZU r0 = r1.A03
            java.lang.Object r13 = r0.invoke()
            X.7AW r13 = (X.AnonymousClass7AW) r13
            if (r13 != 0) goto L_0x02ea
            r12 = 0
        L_0x02d6:
            if (r12 == 0) goto L_0x02e3
            X.7Vu r11 = (X.C123197Vu) r11
            long r0 = r11.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.put(r0, r12)
        L_0x02e3:
            X.6u3 r2 = X.AnonymousClass7FK.A01(r2, r12)
            int r3 = r3 + 1
            goto L_0x02b7
        L_0x02ea:
            r12 = 0
            X.6uz r0 = r13.A04
            X.7yH r0 = r0.A03
            int r0 = r0.length()
            long r18 = X.AnonymousClass6FM.A00(r12, r0)
            long r0 = r1.A02
            r17 = r13
            r20 = r0
            r22 = r12
            X.6u3 r12 = X.C115766vs.A01(r17, r18, r20, r22)
            goto L_0x02d6
        L_0x0304:
            r12 = r14
            goto L_0x02e3
        L_0x0306:
            boolean r0 = X.C04220Ms.A0I(r2, r8)
            if (r0 != 0) goto L_0x0315
            X.8fq r1 = r9.A02
            if (r1 == 0) goto L_0x0315
            r0 = 9
            r1.CWa(r0)
        L_0x0315:
            java.lang.Object r0 = r10.getValue()
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 != 0) goto L_0x0329
            X.8pE r0 = r6.A09
            r0.CrC(r7)
            X.0YY r0 = r9.A06
            r0.invoke(r2)
        L_0x0329:
            X.77X r1 = r9.A00
            X.8LW r0 = X.AnonymousClass8LW.A00
            r1.A00(r0)
            r9.A05()
            goto L_0x000e
        L_0x0335:
            long r0 = X.C18190wL.A08(r11)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r5.A00
            X.7F8 r1 = (X.AnonymousClass7F8) r1
            X.7Vw r0 = r1.A07
            X.8pE r0 = r0.A09
            java.util.Map r0 = X.C86154wM.A0t(r0)
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x000e
            r1.A06()
            r2 = 0
            X.8pE r3 = r1.A08
            goto L_0x04c6
        L_0x0357:
            long r6 = X.C18190wL.A08(r11)
            java.lang.Object r4 = r5.A00
            X.7F8 r4 = (X.AnonymousClass7F8) r4
            X.8pE r3 = r4.A08
            java.lang.Object r0 = r3.getValue()
            X.6u3 r0 = (X.C114886u3) r0
            if (r0 == 0) goto L_0x037b
            X.6u2 r0 = r0.A01
            long r1 = r0.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x037b
        L_0x0371:
            r2 = 0
            X.8pE r0 = r4.A0F
            r0.CrC(r2)
            X.8pE r3 = r4.A0D
            goto L_0x04c6
        L_0x037b:
            java.lang.Object r0 = r3.getValue()
            X.6u3 r0 = (X.C114886u3) r0
            if (r0 == 0) goto L_0x000e
            X.6u2 r0 = r0.A00
            long r1 = r0.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            goto L_0x0371
        L_0x038c:
            X.8mM r11 = (X.C146508mM) r11
            java.lang.Object r3 = X.C86154wM.A0c(r11, r5)
            X.7F8 r3 = (X.AnonymousClass7F8) r3
            r3.A03 = r11
            X.8pE r0 = r3.A0E
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x000e
            X.8pE r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x000e
            long r0 = X.AnonymousClass7KC.A03
            long r0 = r11.Bb2(r0)
            X.7KC r1 = X.C86124wJ.A0O(r0)
            X.7KC r0 = r3.A01
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x000e
            r3.A01 = r1
        L_0x03ba:
            X.AnonymousClass7F8.A01(r3)
            X.8pE r0 = r3.A0E
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x000e
            X.8g1 r0 = r3.A05
            if (r0 == 0) goto L_0x03d6
            X.7YX r0 = (X.AnonymousClass7YX) r0
            java.lang.Integer r1 = r0.A01
        L_0x03cd:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x000e
            r3.A07()
            goto L_0x000e
        L_0x03d6:
            r1 = 0
            goto L_0x03cd
        L_0x03d8:
            X.8fm r11 = (X.C142898fm) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            boolean r0 = r11.BUK()
            if (r0 != 0) goto L_0x03f3
            java.lang.Object r1 = r5.A00
            X.7F8 r1 = (X.AnonymousClass7F8) r1
            X.8pE r0 = r1.A0E
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x03f3
            r1.A06()
        L_0x03f3:
            java.lang.Object r1 = r5.A00
            X.7F8 r1 = (X.AnonymousClass7F8) r1
            boolean r0 = r11.BUK()
            X.8pE r2 = r1.A0E
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0401:
            r2.CrC(r0)
            goto L_0x000e
        L_0x0406:
            r6 = 0
            X.C04220Ms.A0B(r11, r6)
            java.lang.Object r4 = r5.A00
            java.util.List r4 = (java.util.List) r4
            int r3 = r4.size()
            r2 = 0
        L_0x0413:
            if (r2 >= r3) goto L_0x000e
            java.lang.Object r1 = r4.get(r2)
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r6, r6)
            int r2 = r2 + 1
            goto L_0x0413
        L_0x0422:
            X.7Es r11 = (X.C121197Es) r11
            r7 = 0
            X.C04220Ms.A0B(r11, r7)
            java.lang.Object r0 = r5.A00
            X.8co r0 = (X.C141698co) r0
            long r1 = r11.A05
            X.7Vt r0 = (X.C123187Vt) r0
            X.7Ii r13 = r0.A00
            X.8pE r8 = r13.A0H
            int r0 = X.C134747yH.A01(r8)
            if (r0 == 0) goto L_0x000e
            X.6qu r0 = r13.A02
            if (r0 == 0) goto L_0x000e
            X.7Gf r6 = X.C147368pE.A00(r0)
            if (r6 == 0) goto L_0x000e
            X.8nB r5 = r13.A07
            long r3 = X.AnonymousClass7HD.A00(r8)
            int r0 = X.C86104wH.A07(r3)
            int r15 = r5.CVm(r0)
            int r16 = X.C121457Gf.A00(r6, r1)
            X.7HD r14 = X.C86154wM.A0I(r8)
            X.8mx r12 = X.AnonymousClass74R.A02
            r17 = r7
            X.C121827Ii.A01(r12, r13, r14, r15, r16, r17)
            r11.A01()
            goto L_0x000e
        L_0x0466:
            X.8mv r3 = X.C86124wJ.A0Q(r11)
            X.77Z r1 = X.C103986b3.A0F
            X.6sc r0 = new X.6sc
            r0.<init>()
            r3.ChN(r1, r0)
            r2 = 0
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r1 = X.C86154wM.A13(r2, r0)
            X.77Z r0 = X.C103976b2.A04
            X.C146828mv.A00(r0, r3, r2, r1)
            goto L_0x000e
        L_0x0481:
            r2 = 0
            X.C04220Ms.A0B(r11, r2)
            java.lang.Object r1 = r5.A00
            X.7Xy r1 = (X.C123657Xy) r1
            r0 = 0
            X.C122067Jz.A00(r1, r0, r2, r2)
            goto L_0x000e
        L_0x048f:
            X.8nV r11 = (X.C147168nV) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            r0.A00 = r11
            goto L_0x000e
        L_0x049b:
            float r0 = X.C18240wQ.A00(r11)
            java.lang.Object r4 = r5.A00
            androidx.compose.material.SwipeableV2State r4 = (androidx.compose.material.SwipeableV2State) r4
            X.8pE r3 = r4.A08
            float r2 = X.C86114wI.A00(r3)
            float r2 = r2 + r0
            X.4oM r0 = r4.A0A
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            X.4oM r0 = r4.A09
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = X.AnonymousClass8bI.A01(r2, r1, r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
        L_0x04c6:
            r3.CrC(r2)
            goto L_0x000e
        L_0x04cb:
            X.C86144wL.A1M(r11)
            java.lang.Object r2 = r5.A00
            return r2
        L_0x04d1:
            float r0 = X.C18240wQ.A00(r11)
            java.lang.Object r4 = r5.A00
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = (androidx.compose.foundation.lazy.grid.LazyGridState) r4
            float r3 = -r0
            r2 = 0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x04e7
            X.8pE r0 = r4.A0B
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 == 0) goto L_0x04f3
        L_0x04e7:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x04fa
            X.8pE r0 = r4.A0A
            boolean r0 = X.C86104wH.A1X(r0)
            if (r0 != 0) goto L_0x04fa
        L_0x04f3:
            r3 = 0
        L_0x04f4:
            float r0 = -r3
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x04fa:
            float r1 = r4.A00
            float r0 = java.lang.Math.abs(r1)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x05f3
            float r1 = r1 + r3
            r4.A00 = r1
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x05e4
            X.8pE r0 = r4.A0H
            X.C86134wK.A1B(r0)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x05e4
            float r0 = r4.A00
            float r1 = r1 - r0
            X.6o6 r7 = r4.A09
            X.8pE r0 = r4.A0E
            java.lang.Object r5 = r0.getValue()
            X.8jo r5 = (X.C145088jo) r5
            java.util.List r11 = r5.BLp()
            boolean r0 = r11.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05e4
            r6 = 0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x05bf
            r9 = 1
            java.lang.Object r1 = X.AnonymousClass00J.A0E(r11)
            X.C28 r1 = (X.C28) r1
            X.8pE r0 = r4.A0D
            boolean r0 = X.C86104wH.A1X(r0)
            X.7VN r1 = (X.AnonymousClass7VN) r1
            if (r0 == 0) goto L_0x05bc
            int r0 = r1.A05
        L_0x054c:
            int r8 = r0 + 1
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r11)
            X.C28 r0 = (X.C28) r0
            X.7VN r0 = (X.AnonymousClass7VN) r0
            int r0 = r0.A01
            int r0 = r0 + 1
        L_0x055a:
            int r1 = r4.A01
            if (r8 == r1) goto L_0x05e4
            if (r0 < 0) goto L_0x05e4
            int r1 = r5.BHd()
            if (r0 >= r1) goto L_0x05e4
            boolean r0 = r4.A04
            if (r0 == r9) goto L_0x057e
            X.84X r0 = r4.A0J
            int r10 = r0.A00
            if (r10 <= 0) goto L_0x057e
            java.lang.Object[] r5 = r0.A01
            r1 = 0
        L_0x0573:
            r0 = r5[r1]
            X.8fZ r0 = (X.C142778fZ) r0
            r0.cancel()
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0573
        L_0x057e:
            r4.A04 = r9
            r4.A01 = r8
            X.84X r10 = r4.A0J
            r10.A05()
            X.8pE r0 = r4.A0G
            java.lang.Object r1 = r0.getValue()
            X.0YY r1 = (X.AnonymousClass0YY) r1
            X.6si r0 = new X.6si
            r0.<init>(r8)
            java.lang.Object r9 = r1.invoke(r0)
            java.util.List r9 = (java.util.List) r9
            int r8 = r9.size()
        L_0x059e:
            if (r6 >= r8) goto L_0x05e4
            java.lang.Object r1 = r9.get(r6)
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.A00
            int r5 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r1.A01
            androidx.compose.ui.unit.Constraints r0 = (androidx.compose.ui.unit.Constraints) r0
            long r0 = r0.A00
            X.8fZ r0 = r7.A00(r5, r0)
            r10.A0C(r0)
            int r6 = r6 + 1
            goto L_0x059e
        L_0x05bc:
            int r0 = r1.A00
            goto L_0x054c
        L_0x05bf:
            r9 = 0
            java.lang.Object r1 = X.AnonymousClass00J.A0C(r11)
            X.C28 r1 = (X.C28) r1
            X.8pE r0 = r4.A0D
            boolean r0 = X.C86104wH.A1X(r0)
            X.7VN r1 = (X.AnonymousClass7VN) r1
            if (r0 == 0) goto L_0x05e1
            int r0 = r1.A05
        L_0x05d2:
            int r8 = r0 + -1
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r11)
            X.C28 r0 = (X.C28) r0
            X.7VN r0 = (X.AnonymousClass7VN) r0
            int r0 = r0.A01
            int r0 = r0 - r10
            goto L_0x055a
        L_0x05e1:
            int r0 = r1.A00
            goto L_0x05d2
        L_0x05e4:
            float r1 = r4.A00
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f4
            float r3 = r3 - r1
            r4.A00 = r2
            goto L_0x04f4
        L_0x05f3:
            java.lang.String r0 = "entered drag with non-zero pending scroll: "
            java.lang.String r0 = X.AnonymousClass00U.A0I(r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x05fe:
            java.lang.Object r1 = r5.A00
            r0 = 4
            goto L_0x06d6
        L_0x0603:
            java.lang.Object r1 = r5.A00
            r0 = 5
            goto L_0x06d6
        L_0x0608:
            java.lang.Object r3 = X.C86154wM.A0c(r11, r5)
            X.8p8 r3 = (X.C147308p8) r3
            int r2 = r3.getItemCount()
            r1 = 0
        L_0x0613:
            if (r1 >= r2) goto L_0x0622
            java.lang.Object r0 = r3.Aql(r1)
            boolean r0 = X.C04220Ms.A0I(r0, r11)
            if (r0 != 0) goto L_0x0623
            int r1 = r1 + 1
            goto L_0x0613
        L_0x0622:
            r1 = -1
        L_0x0623:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L_0x0628:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.6qu r0 = (X.C113196qu) r0
            X.8pE r1 = r0.A0A
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x06f7
            java.lang.Object r0 = r1.getValue()
            X.7Gf r0 = (X.C121457Gf) r0
            X.C04220Ms.A0A(r0)
            X.7AW r0 = r0.A02
            goto L_0x0676
        L_0x0644:
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.8lb r0 = (X.C146078lb) r0
            if (r0 == 0) goto L_0x06f1
            boolean r0 = r0.ABk(r11)
            goto L_0x06f2
        L_0x0652:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.8lb r0 = (X.C146078lb) r0
            X.7Wb r2 = new X.7Wb
            r2.<init>(r0, r11)
            return r2
        L_0x0660:
            java.lang.Object r1 = r5.A00
            r0 = 6
            goto L_0x06d6
        L_0x0664:
            java.lang.Object r1 = r5.A00
            r0 = 7
            goto L_0x06d6
        L_0x0668:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.7WM r0 = (X.AnonymousClass7WM) r0
            X.6ms r0 = r0.A04
            X.7AW r0 = r0.A05
            if (r0 == 0) goto L_0x06f7
        L_0x0676:
            r11.add(r0)
            goto L_0x06f1
        L_0x067a:
            float r4 = X.C18240wQ.A00(r11)
            java.lang.Object r3 = r5.A00
            X.7EJ r3 = (X.AnonymousClass7EJ) r3
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            float r2 = X.C18240wQ.A00(r0)
            float r2 = r2 + r4
            X.8pE r1 = r3.A02
            java.lang.Object r0 = r1.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x06c1
            java.lang.Object r0 = r1.getValue()
            float r4 = X.C18240wQ.A00(r0)
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r4 = r4 - r0
        L_0x06ae:
            X.8pE r1 = r3.A03
            java.lang.Object r0 = r1.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = r0 + r4
            X.C147368pE.A02(r1, r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r4)
            return r2
        L_0x06c1:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x06ae
            X.8pE r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r4 = -r0
            goto L_0x06ae
        L_0x06d2:
            java.lang.Object r1 = r5.A00
            r0 = 8
        L_0x06d6:
            com.facebook.redex.IDxEResultShape438S0100000_2_I2 r2 = new com.facebook.redex.IDxEResultShape438S0100000_2_I2
            r2.<init>(r1, r0)
            return r2
        L_0x06dc:
            X.6sq r11 = (X.C114196sq) r11
            android.view.KeyEvent r1 = r11.A00
            X.8fd r0 = X.AnonymousClass6WV.A00
            java.lang.Integer r1 = r0.BeX(r1)
            java.lang.Integer r0 = X.AnonymousClass006.A08
            if (r1 != r0) goto L_0x06f7
            java.lang.Object r0 = r5.A00
            X.7F8 r0 = (X.AnonymousClass7F8) r0
            r0.A04()
        L_0x06f1:
            r0 = 1
        L_0x06f2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x06f7:
            r0 = 0
            goto L_0x06f2
        L_0x06f9:
            java.lang.Object r0 = r5.A00
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r0 = r0.A00
            X.7KC r2 = X.C86124wJ.A0O(r0)
            return r2
        L_0x0708:
            java.lang.Object r0 = r5.A00
            X.6b7 r0 = (X.C104026b7) r0
            androidx.compose.material.SwipeableV2State r0 = r0.A00
            float r0 = r0.A01()
            int r1 = X.AnonymousClass8bA.A02(r0)
            r0 = 0
            X.7Eg r2 = X.AnonymousClass7Hh.A04(r1, r0)
            return r2
        L_0x071c:
            X.66m r11 = (X.C967366m) r11
            java.lang.Object r0 = X.C86154wM.A0c(r11, r5)
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.6b7 r2 = new X.6b7
            r2.<init>(r11, r0)
            return r2
        L_0x072a:
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            return r2
        L_0x0733:
            java.lang.String r0 = "focusManager"
            goto L_0x0738
        L_0x0736:
            java.lang.String r0 = "keyboardActions"
        L_0x0738:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1.invoke(java.lang.Object):java.lang.Object");
    }
}
