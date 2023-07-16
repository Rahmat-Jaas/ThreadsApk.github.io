package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04040Ma;
import X.C142718fT;

public class KtLambdaShape0S0300001_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0300001_I2(C142718fT r2, AnonymousClass0YY r3, C04040Ma r4, float f, int i) {
        super(1);
        this.A04 = i;
        this.A00 = f;
        if (2 - i != 0) {
            this.A01 = r4;
            this.A03 = r2;
            this.A02 = r3;
        } else {
            this.A02 = r4;
            this.A03 = r2;
            this.A01 = r3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.internal.KtLambdaShape39S0200000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.8Jf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.8Jf} */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.0YY] */
    /* JADX WARNING: type inference failed for: r0v62, types: [kotlin.jvm.internal.KtLambdaShape39S0200000_I2] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03ad, code lost:
        if (r16 != false) goto L_0x03c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r46) {
        /*
            r45 = this;
            r1 = r45
            r2 = r46
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0216;
                case 2: goto L_0x0179;
                case 3: goto L_0x0118;
                case 4: goto L_0x0070;
                default: goto L_0x0009;
            }
        L_0x0009:
            float r7 = X.C18240wQ.A00(r2)
            java.lang.Object r6 = r1.A01
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            int r5 = r6.getWidth()
            int r2 = r6.getHeight()
            int r0 = r6.getHeight()
            int r0 = r0 - r5
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
            r0 = 0
            android.graphics.Bitmap r2 = X.C31176Gi6.A06(r6, r5, r2, r0, r0)
            X.C04220Ms.A06(r2)
            java.lang.Object r0 = r1.A02
            android.content.res.Resources r0 = (android.content.res.Resources) r0
            X.4xu r4 = new X.4xu
            r4.<init>(r0, r2)
            int r0 = r2.getWidth()
            float r3 = (float) r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r3 = r3 / r0
            int r0 = r6.getWidth()
            float r2 = (float) r0
            float r2 = r2 * r7
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = java.lang.Math.max(r3, r2)
            r4.A00(r0)
            float r2 = (float) r5
            float r0 = r1.A00
            float r2 = r2 * r0
            float r2 = r2 * r7
            float r0 = r4.A00
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            r4.A00 = r2
            r0 = 1
            r4.A04 = r0
            r4.invalidateSelf()
        L_0x005e:
            java.lang.Object r0 = r1.A03
            X.6qb r0 = (X.C113036qb) r0
            X.0Oa r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r4)
        L_0x006d:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0070:
            X.8pw r4 = X.C86144wL.A0J(r2)
            java.lang.Object r0 = r1.A03
            X.7JH r0 = (X.AnonymousClass7JH) r0
            X.7WW r0 = r0.A04
            X.8pE r2 = r0.A05
            java.lang.Object r0 = r2.getValue()
            float r0 = X.C18240wQ.A00(r0)
            X.7Wz r4 = (X.C123457Wz) r4
            r4.A03 = r0
            java.lang.Object r0 = r2.getValue()
            float r0 = X.C18240wQ.A00(r0)
            r4.A04 = r0
            java.lang.Object r0 = r1.A02
            X.7JH r0 = (X.AnonymousClass7JH) r0
            X.7WW r0 = r0.A04
            X.8pE r6 = r0.A05
            java.lang.Object r0 = r6.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r2 = r0.A00
            float r0 = X.AnonymousClass7KC.A01(r2)
            r4.A06 = r0
            java.lang.Object r0 = r1.A01
            X.6hL r0 = (X.C107806hL) r0
            X.7JH r0 = r0.A00
            X.7WW r0 = r0.A04
            X.8pE r8 = r0.A05
            java.lang.Object r0 = r8.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r2 = r0.A00
            float r5 = X.AnonymousClass7KC.A00(r2)
            float r7 = r1.A00
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.Object r0 = r8.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            if (r1 <= 0) goto L_0x0115
            long r2 = r0.A00
            float r1 = X.AnonymousClass7KC.A01(r2)
            float r1 = r1 / r5
            float r0 = X.AnonymousClass7KC.A02(r2)
            float r0 = r0 / r5
            long r0 = X.C86104wH.A0C(r1, r0)
            long r0 = X.AnonymousClass7KC.A03(r7, r0)
        L_0x00de:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.AnonymousClass7KC.A00(r0)
            r2 = 2
            float r2 = (float) r2
            float r7 = r7 * r2
            float r3 = r3 / r7
            float r5 = r5 - r3
            long r2 = X.AnonymousClass7KC.A03(r5, r0)
            java.lang.Object r0 = r6.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r0 = r0.A00
            float r1 = X.AnonymousClass7KC.A01(r0)
            float r0 = X.AnonymousClass7KC.A01(r2)
            float r1 = r1 + r0
            r4.A06 = r1
            java.lang.Object r0 = r6.getValue()
            X.7KC r0 = (X.AnonymousClass7KC) r0
            long r0 = r0.A00
            float r1 = X.AnonymousClass7KC.A02(r0)
            float r0 = X.AnonymousClass7KC.A02(r2)
            float r1 = r1 + r0
            r4.A07 = r1
            goto L_0x006d
        L_0x0115:
            long r0 = r0.A00
            goto L_0x00de
        L_0x0118:
            X.6qg r2 = (X.C113076qg) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.8pE r6 = r2.A06
            java.lang.Object r0 = r6.getValue()
            float r7 = X.C18240wQ.A00(r0)
            float r4 = r1.A00
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x016a
            r7 = 0
        L_0x0130:
            java.lang.Object r5 = r1.A01
            X.0Ma r5 = (X.C04040Ma) r5
            float r0 = r5.A00
            float r4 = r7 - r0
            java.lang.Object r0 = r1.A03
            X.8fT r0 = (X.C142718fT) r0
            float r3 = r0.CgC(r4)
            java.lang.Object r1 = r1.A02
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r1.invoke(r0)
            float r1 = X.C86124wJ.A01(r4, r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            java.lang.Object r0 = r6.getValue()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0166
        L_0x0161:
            float r0 = r5.A00
            float r0 = r0 + r3
            goto L_0x0212
        L_0x0166:
            r2.A00()
            goto L_0x0161
        L_0x016a:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0130
        L_0x0172:
            r7 = r4
            goto L_0x0130
        L_0x0174:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0130
            goto L_0x0172
        L_0x0179:
            X.6qg r2 = (X.C113076qg) r2
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.8pE r6 = r2.A06
            java.lang.Object r0 = r6.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r3 = java.lang.Math.abs(r0)
            float r5 = r1.A00
            float r0 = java.lang.Math.abs(r5)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.lang.Object r0 = r6.getValue()
            float r4 = X.C18240wQ.A00(r0)
            if (r3 < 0) goto L_0x01e3
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01d4
            r4 = 0
        L_0x01a5:
            java.lang.Object r6 = r1.A02
            X.0Ma r6 = (X.C04040Ma) r6
            float r0 = r6.A00
            float r5 = r4 - r0
            java.lang.Object r0 = r1.A03
            X.8fT r0 = (X.C142718fT) r0
            java.lang.Object r3 = r1.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            float r1 = r0.CgC(r5)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.invoke(r0)
            float r1 = X.C86124wJ.A01(r5, r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cd
            r2.A00()
        L_0x01cd:
            r2.A00()
            r6.A00 = r4
            goto L_0x006d
        L_0x01d4:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01de
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
        L_0x01dc:
            r4 = r5
            goto L_0x01a5
        L_0x01de:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            goto L_0x01dc
        L_0x01e3:
            java.lang.Object r5 = r1.A02
            X.0Ma r5 = (X.C04040Ma) r5
            float r0 = r5.A00
            float r4 = r4 - r0
            java.lang.Object r0 = r1.A03
            X.8fT r0 = (X.C142718fT) r0
            java.lang.Object r3 = r1.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            float r1 = r0.CgC(r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.invoke(r0)
            float r1 = X.C86124wJ.A01(r4, r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x020a
            r2.A00()
        L_0x020a:
            java.lang.Object r0 = r6.getValue()
            float r0 = X.C18240wQ.A00(r0)
        L_0x0212:
            r5.A00 = r0
            goto L_0x006d
        L_0x0216:
            X.86i r3 = X.AnonymousClass75O.A00(r2)
            java.lang.Object r2 = r1.A02
            java.lang.String r0 = "sourceCenter"
            r3.A01(r0, r2)
            java.lang.Object r2 = r1.A01
            java.lang.String r0 = "magnifierCenter"
            r3.A01(r0, r2)
            float r0 = r1.A00
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = "zoom"
            r3.A01(r0, r2)
            java.lang.Object r1 = r1.A03
            java.lang.String r0 = "style"
            r3.A01(r0, r1)
            goto L_0x006d
        L_0x023c:
            X.7ZH r2 = (X.AnonymousClass7ZH) r2
            r20 = 0
            r0 = r20
            X.C04220Ms.A0B(r2, r0)
            float r5 = r1.A00
            float r0 = r2.Acr()
            float r0 = r0 * r5
            r17 = 0
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x05b9
            X.8l1 r0 = r2.A00
            long r3 = r0.BCH()
            float r0 = X.AnonymousClass7JK.A01(r3)
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x05b9
            r0 = r17
            int r0 = java.lang.Float.compare(r5, r0)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 == 0) goto L_0x04b8
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x026e:
            X.8l1 r0 = r2.A00
            long r3 = r0.BCH()
            float r3 = X.AnonymousClass7JK.A01(r3)
            r0 = 2
            float r8 = (float) r0
            float r3 = r3 / r8
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r0 = (float) r3
            float r0 = java.lang.Math.min(r5, r0)
            float r5 = r0 / r8
            long r21 = X.C86104wH.A0C(r5, r5)
            X.8l1 r3 = r2.A00
            long r3 = r3.BCH()
            float r6 = X.AnonymousClass7JK.A02(r3)
            float r6 = r6 - r0
            X.8l1 r3 = r2.A00
            long r3 = r3.BCH()
            float r3 = X.AnonymousClass7JK.A00(r3)
            float r3 = r3 - r0
            long r23 = X.C86104wH.A0C(r6, r3)
            float r8 = r8 * r0
            X.8l1 r3 = r2.A00
            long r3 = r3.BCH()
            float r3 = X.AnonymousClass7JK.A01(r3)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            boolean r25 = X.C18180wK.A1X(r3)
            java.lang.Object r7 = r1.A03
            X.8fo r7 = (X.C142918fo) r7
            X.8l1 r3 = r2.A00
            long r3 = r3.BCH()
            X.8l1 r6 = r2.A00
            X.69J r6 = r6.getLayoutDirection()
            X.6Ef r4 = r7.AG2(r2, r6, r3)
            boolean r3 = r4 instanceof X.C876353n
            if (r3 == 0) goto L_0x04c5
            java.lang.Object r5 = r1.A01
            X.6bN r5 = (X.C104186bN) r5
            java.lang.Object r11 = r1.A02
            X.6nD r11 = (X.C111366nD) r11
            X.53n r4 = (X.C876353n) r4
            if (r25 == 0) goto L_0x02e8
            r0 = 16
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r0 = X.C86164wN.A10(r11, r4, r0)
        L_0x02e0:
            X.6bG r3 = new X.6bG
            r3.<init>(r0)
            r2.A01 = r3
            return r3
        L_0x02e8:
            boolean r0 = r11 instanceof X.C876253m
            r22 = 0
            if (r0 == 0) goto L_0x04b3
            r3 = 1
            r0 = r11
            X.53m r0 = (X.C876253m) r0
            long r0 = r0.A00
            X.6bI r39 = X.C115866w2.A01(r0)
        L_0x02f8:
            X.8nF r0 = r4.A00
            r44 = r0
            X.7X1 r0 = (X.AnonymousClass7X1) r0
            android.graphics.Path r1 = r0.A01
            android.graphics.RectF r7 = r0.A02
            r19 = 1
            r0 = r19
            r1.computeBounds(r7, r0)
            float r6 = r7.left
            float r4 = r7.top
            float r1 = r7.right
            float r0 = r7.bottom
            X.7F6 r7 = new X.7F6
            r7.<init>(r6, r4, r1, r0)
            java.lang.Object r0 = r5.A00
            X.79f r0 = (X.C1202079f) r0
            if (r0 != 0) goto L_0x032f
            r27 = 15
            X.79f r0 = new X.79f
            r23 = r22
            r24 = r22
            r25 = r22
            r26 = r22
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.A00 = r0
        L_0x032f:
            X.8nF r4 = r0.A02
            if (r4 != 0) goto L_0x033e
            android.graphics.Path r1 = X.C86144wL.A0G()
            X.7X1 r4 = new X.7X1
            r4.<init>(r1)
            r0.A02 = r4
        L_0x033e:
            r1 = r4
            X.7X1 r1 = (X.AnonymousClass7X1) r1
            android.graphics.Path r1 = r1.A01
            r1.reset()
            r4.A7N(r7)
            r5 = r44
            r1 = r20
            r4.CVP(r4, r5, r1)
            X.0MJ r18 = X.C86144wL.A17()
            float r1 = r7.A02
            float r12 = r7.A01
            float r1 = r1 - r12
            int r5 = X.C86124wJ.A03(r1)
            float r1 = r7.A00
            float r13 = r7.A03
            float r1 = r1 - r13
            int r1 = X.C86124wJ.A03(r1)
            long r35 = X.AnonymousClass7FV.A00(r5, r1)
            X.8n0 r6 = r0.A01
            X.8mg r5 = r0.A00
            if (r6 == 0) goto L_0x03af
            int r9 = r6.AYr()
            r16 = 0
            r1 = r20
            if (r9 == r1) goto L_0x04af
            int r1 = r6.AYr()
            if (r3 == r1) goto L_0x04af
        L_0x0380:
            if (r5 == 0) goto L_0x03af
            X.8l1 r1 = r2.A00
            long r9 = r1.BCH()
            float r10 = X.AnonymousClass7JK.A02(r9)
            r1 = r6
            X.Gmy r1 = (X.C31336Gmy) r1
            android.graphics.Bitmap r9 = r1.A00
            int r1 = r9.getWidth()
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x03af
            X.8l1 r1 = r2.A00
            long r14 = r1.BCH()
            float r10 = X.AnonymousClass7JK.A00(r14)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x03af
            if (r16 != 0) goto L_0x03c5
        L_0x03af:
            int r6 = X.C86104wH.A07(r35)
            int r5 = X.C86104wH.A08(r35)
            r1 = 24
            X.8n0 r6 = X.C29102Fi4.A00(r6, r5, r3, r1)
            r0.A01 = r6
            X.8mg r5 = X.C98086Ed.A00(r6)
            r0.A00 = r5
        L_0x03c5:
            X.7XA r10 = r0.A03
            if (r10 != 0) goto L_0x03d0
            X.7XA r10 = new X.7XA
            r10.<init>()
            r0.A03 = r10
        L_0x03d0:
            long r14 = X.AnonymousClass7FV.A02(r35)
            X.8l1 r0 = r2.A00
            X.69J r9 = r0.getLayoutDirection()
            X.7El r3 = r10.A02
            X.8nV r0 = r3.A02
            r43 = r0
            X.69J r0 = r3.A03
            r42 = r0
            X.8mg r0 = r3.A01
            r38 = r0
            long r0 = r3.A00
            r40 = r0
            r3.A02 = r2
            r0 = r20
            X.C04220Ms.A0B(r9, r0)
            r3.A03 = r9
            X.C04220Ms.A0B(r5, r0)
            r3.A01 = r5
            r3.A00 = r14
            r5.Cfm()
            long r26 = X.AnonymousClass7KE.A01
            long r28 = X.AnonymousClass7KC.A03
            r24 = 1065353216(0x3f800000, float:1.0)
            X.53x r23 = X.C877353x.A00
            r21 = r10
            r25 = r0
            r30 = r14
            r21.AJA(r22, r23, r24, r25, r26, r28, r30)
            float r0 = -r12
            r37 = r0
            float r0 = -r13
            r21 = r0
            X.8mj r15 = r10.A03
            r13 = r15
            X.7X9 r13 = (X.AnonymousClass7X9) r13
            X.8lx r12 = r13.A00
            r1 = r37
            r12.D7f(r1, r0)
            r34 = 30
            X.53w r29 = new X.53w
            r30 = r8
            r31 = r17
            r32 = r20
            r33 = r20
            r29.<init>(r30, r31, r32, r33, r34)
            r31 = 3
            r25 = r10
            r26 = r11
            r27 = r22
            r28 = r44
            r30 = r24
            r25.AJ6(r26, r27, r28, r29, r30, r31)
            long r16 = r10.BCH()
            float r9 = X.AnonymousClass7JK.A02(r16)
            r0 = r19
            float r0 = (float) r0
            float r9 = r9 + r0
            float r1 = X.AnonymousClass7JK.A02(r16)
            float r9 = r9 / r1
            float r8 = X.AnonymousClass7JK.A00(r16)
            float r8 = r8 + r0
            float r0 = X.AnonymousClass7JK.A00(r16)
            float r8 = r8 / r0
            long r16 = r10.AX0()
            X.7XA r0 = r13.A01
            X.7El r0 = r0.A02
            r19 = r0
            long r13 = X.C121167El.A00(r19)
            r0 = r16
            r12.Cg3(r9, r8, r0)
            r28 = r4
            r29 = r23
            r31 = r20
            r25.AJ6(r26, r27, r28, r29, r30, r31)
            r0 = r19
            X.C146708mj.A00(r0, r15, r13)
            r0 = r37
            float r1 = -r0
            r0 = r21
            float r0 = -r0
            r12.D7f(r1, r0)
            r1 = r43
            r0 = r42
            X.C121167El.A01(r5, r3, r1, r0)
            r0 = r38
            r3.A01 = r0
            r0 = r40
            r3.A00 = r0
            r0 = r6
            X.Gmy r0 = (X.C31336Gmy) r0
            android.graphics.Bitmap r0 = r0.A00
            r0.prepareToDraw()
            r0 = r18
            r0.A00 = r6
            kotlin.jvm.internal.KtLambdaShape0S0300100_I2 r0 = new kotlin.jvm.internal.KtLambdaShape0S0300100_I2
            r33 = r0
            r34 = r20
            r37 = r7
            r38 = r18
            r33.<init>(r34, r35, r37, r38, r39)
            goto L_0x02e0
        L_0x04af:
            r16 = 1
            goto L_0x0380
        L_0x04b3:
            r3 = 0
            r39 = r22
            goto L_0x02f8
        L_0x04b8:
            float r0 = r2.Acr()
            float r5 = r5 * r0
            double r3 = (double) r5
            double r3 = java.lang.Math.ceil(r3)
            float r5 = (float) r3
            goto L_0x026e
        L_0x04c5:
            boolean r3 = r4 instanceof X.C876853s
            if (r3 == 0) goto L_0x057e
            java.lang.Object r3 = r1.A01
            X.6bN r3 = (X.C104186bN) r3
            java.lang.Object r9 = r1.A02
            X.6nD r9 = (X.C111366nD) r9
            X.53s r4 = (X.C876853s) r4
            X.79q r1 = r4.A00
            boolean r4 = X.AnonymousClass6EZ.A00(r1)
            if (r4 == 0) goto L_0x0501
            long r3 = r1.A06
            r15 = 30
            X.53w r16 = new X.53w
            r10 = r16
            r11 = r0
            r12 = r17
            r13 = r20
            r14 = r13
            r10.<init>(r11, r12, r13, r14, r15)
            X.8Jf r1 = new X.8Jf
            r14 = r1
            r15 = r9
            r17 = r5
            r18 = r0
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r25)
        L_0x04f9:
            X.6bG r3 = new X.6bG
            r3.<init>(r1)
            r2.A01 = r3
            return r3
        L_0x0501:
            java.lang.Object r4 = r3.A00
            X.79f r4 = (X.C1202079f) r4
            if (r4 != 0) goto L_0x0516
            r11 = 0
            r16 = 15
            X.79f r4 = new X.79f
            r10 = r4
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.A00 = r4
        L_0x0516:
            X.8nF r5 = r4.A02
            if (r5 != 0) goto L_0x0525
            android.graphics.Path r3 = X.C86144wL.A0G()
            X.7X1 r5 = new X.7X1
            r5.<init>(r3)
            r4.A02 = r5
        L_0x0525:
            r3 = r5
            X.7X1 r3 = (X.AnonymousClass7X1) r3
            android.graphics.Path r3 = r3.A01
            r3.reset()
            r5.A7Y(r1)
            if (r25 != 0) goto L_0x0576
            android.graphics.Path r3 = X.C86144wL.A0G()
            X.7X1 r8 = new X.7X1
            r8.<init>(r3)
            float r7 = r1.A02
            float r3 = r1.A01
            float r7 = r7 - r3
            float r7 = r7 - r0
            float r6 = r1.A00
            float r3 = r1.A03
            float r6 = r6 - r3
            float r6 = r6 - r0
            long r3 = r1.A06
            long r26 = X.AnonymousClass7Ac.A00(r0, r3)
            long r3 = r1.A07
            long r28 = X.AnonymousClass7Ac.A00(r0, r3)
            long r3 = r1.A04
            long r32 = X.AnonymousClass7Ac.A00(r0, r3)
            long r3 = r1.A05
            long r30 = X.AnonymousClass7Ac.A00(r0, r3)
            X.79q r1 = new X.79q
            r22 = r0
            r23 = r0
            r24 = r7
            r25 = r6
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r28, r30, r32)
            r8.A7Y(r1)
            r0 = r20
            r5.CVP(r5, r8, r0)
        L_0x0576:
            r0 = 17
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r1 = X.C86164wN.A10(r9, r5, r0)
            goto L_0x04f9
        L_0x057e:
            boolean r3 = r4 instanceof X.C876453o
            if (r3 == 0) goto L_0x05b4
            java.lang.Object r1 = r1.A02
            X.6nD r1 = (X.C111366nD) r1
            if (r25 == 0) goto L_0x05a6
            long r21 = X.AnonymousClass7KC.A03
            X.8l1 r0 = r2.A00
            long r23 = r0.BCH()
            X.53x r3 = X.C877353x.A00
        L_0x0592:
            X.8Ij r0 = new X.8Ij
            r5 = r3
            r6 = r21
            r8 = r23
            r3 = r0
            r4 = r1
            r3.<init>(r4, r5, r6, r8)
            X.6bG r3 = new X.6bG
            r3.<init>(r0)
            r2.A01 = r3
            return r3
        L_0x05a6:
            r8 = 30
            X.53w r3 = new X.53w
            r4 = r0
            r5 = r17
            r6 = r20
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0592
        L_0x05b4:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x05b9:
            X.8L1 r0 = X.AnonymousClass8L1.A00
            X.6bG r3 = new X.6bG
            r3.<init>(r0)
            r2.A01 = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape0S0300001_I2.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0300001_I2(Object obj, Object obj2, Object obj3, float f, int i) {
        super(1);
        this.A04 = i;
        this.A00 = f;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
