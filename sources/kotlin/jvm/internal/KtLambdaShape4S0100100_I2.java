package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape4S0100100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0100100_I2(long j, Object obj, int i) {
        super(1);
        this.A02 = i;
        this.A00 = j;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (r1 >= r4) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0176, code lost:
        r0 = X.C121127Eg.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017e, code lost:
        return new X.C121127Eg(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bc, code lost:
        X.C115886w4.A01((X.C104136bI) null, r11, X.C18240wQ.A00(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0242, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r32) {
        /*
            r31 = this;
            r5 = r31
            r11 = r32
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x005e;
                case 2: goto L_0x00ba;
                case 3: goto L_0x0121;
                case 4: goto L_0x017f;
                case 5: goto L_0x019f;
                case 6: goto L_0x0026;
                case 7: goto L_0x01ae;
                case 8: goto L_0x01c5;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            long r1 = r5.A00
            long r3 = r11.A00
            long r1 = r1 - r3
            java.lang.Object r0 = r5.A01
            X.KJn r0 = (X.C38069KJn) r0
            int r0 = r0.A03
            long r4 = (long) r0
        L_0x001b:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r0 = 1
            if (r3 >= 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0026:
            X.6p5 r11 = (X.C112156p5) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            long r3 = r11.A00
            long r1 = r5.A00
            long r1 = r1 - r3
            java.lang.Object r5 = r5.A01
            X.6sX r5 = (X.C114006sX) r5
            X.0Oa r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            long r3 = X.C18190wL.A08(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0020
            X.0Oa r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            long r4 = X.C18190wL.A08(r0)
            goto L_0x001b
        L_0x004e:
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            java.lang.Object r3 = r5.A01
            X.7Xy r3 = (X.C123657Xy) r3
            long r1 = r5.A00
            r0 = 0
            X.C122067Jz.A01(r3, r0, r1)
            goto L_0x0240
        L_0x005e:
            X.677 r11 = (X.AnonymousClass677) r11
            r8 = 0
            X.C04220Ms.A0B(r11, r8)
            java.lang.Object r2 = r5.A01
            X.52Z r2 = (X.AnonymousClass52Z) r2
            long r4 = r5.A00
            X.4oM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x00b3
            X.0YY r1 = r0.A02
            X.6t4 r0 = new X.6t4
            r0.<init>(r4)
            java.lang.Object r0 = r1.invoke(r0)
            X.6t4 r0 = (X.C114336t4) r0
            long r6 = r0.A00
        L_0x0083:
            X.4oM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x00b1
            X.0YY r1 = r0.A02
            X.6t4 r0 = new X.6t4
            r0.<init>(r4)
            java.lang.Object r0 = r1.invoke(r0)
            X.6t4 r0 = (X.C114336t4) r0
            long r2 = r0.A00
        L_0x009c:
            int r1 = r11.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00a9
            if (r1 == r8) goto L_0x00af
            r0 = 2
            if (r1 != r0) goto L_0x00b5
            r4 = r2
        L_0x00a9:
            X.6t4 r0 = new X.6t4
            r0.<init>(r4)
            return r0
        L_0x00af:
            r4 = r6
            goto L_0x00a9
        L_0x00b1:
            r2 = r4
            goto L_0x009c
        L_0x00b3:
            r6 = r4
            goto L_0x0083
        L_0x00b5:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ba:
            X.677 r11 = (X.AnonymousClass677) r11
            r4 = 0
            X.C04220Ms.A0B(r11, r4)
            java.lang.Object r2 = r5.A01
            X.52Z r2 = (X.AnonymousClass52Z) r2
            long r5 = r5.A00
            androidx.compose.ui.Alignment r0 = r2.A00
            if (r0 == 0) goto L_0x0176
            X.4oM r3 = r2.A01
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L_0x0176
            androidx.compose.ui.Alignment r0 = r2.A00
            boolean r0 = X.C86124wJ.A1Y(r3, r0)
            if (r0 != 0) goto L_0x0176
            int r1 = r11.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0176
            if (r1 == r4) goto L_0x0176
            r0 = 2
            if (r1 != r0) goto L_0x011c
            X.4oM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.6uQ r0 = (X.C115056uQ) r0
            if (r0 == 0) goto L_0x0176
            X.0YY r1 = r0.A02
            X.6t4 r0 = new X.6t4
            r0.<init>(r5)
            java.lang.Object r0 = r1.invoke(r0)
            X.6t4 r0 = (X.C114336t4) r0
            long r7 = r0.A00
            java.lang.Object r3 = r3.getValue()
            X.C04220Ms.A0A(r3)
            androidx.compose.ui.Alignment r3 = (androidx.compose.ui.Alignment) r3
            X.69J r4 = X.AnonymousClass69J.Ltr
            long r0 = r3.A88(r4, r5, r7)
            androidx.compose.ui.Alignment r3 = r2.A00
            X.C04220Ms.A0A(r3)
            long r2 = r3.A88(r4, r5, r7)
            long r4 = X.AnonymousClass7Hh.A02(r0, r2)
            goto L_0x0179
        L_0x011c:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0121:
            X.677 r11 = (X.AnonymousClass677) r11
            r6 = 0
            X.C04220Ms.A0B(r11, r6)
            java.lang.Object r7 = r5.A01
            X.52Y r7 = (X.AnonymousClass52Y) r7
            long r2 = r5.A00
            X.4oM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.6tJ r0 = (X.C114446tJ) r0
            if (r0 == 0) goto L_0x0173
            X.0YY r1 = r0.A01
            X.6t4 r0 = new X.6t4
            r0.<init>(r2)
            java.lang.Object r0 = r1.invoke(r0)
            X.7Eg r0 = (X.C121127Eg) r0
            long r4 = r0.A00
        L_0x0146:
            X.4oM r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            X.6tJ r0 = (X.C114446tJ) r0
            if (r0 == 0) goto L_0x0170
            X.0YY r1 = r0.A01
            X.6t4 r0 = new X.6t4
            r0.<init>(r2)
            java.lang.Object r0 = r1.invoke(r0)
            X.7Eg r0 = (X.C121127Eg) r0
            long r0 = r0.A00
        L_0x015f:
            int r3 = r11.ordinal()
            r2 = 1
            if (r3 == r2) goto L_0x0176
            if (r3 == r6) goto L_0x0179
            r2 = 2
            if (r3 == r2) goto L_0x0178
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0170:
            long r0 = X.C121127Eg.A01
            goto L_0x015f
        L_0x0173:
            long r4 = X.C121127Eg.A01
            goto L_0x0146
        L_0x0176:
            long r0 = X.C121127Eg.A01
        L_0x0178:
            r4 = r0
        L_0x0179:
            X.7Eg r0 = new X.7Eg
            r0.<init>(r4)
            return r0
        L_0x017f:
            X.75O r1 = X.C86144wL.A0K(r11)
            long r3 = r5.A00
            X.7KE r0 = X.C86134wK.A0I(r3)
            r1.A00 = r0
            X.86i r2 = r1.A01
            X.7KE r1 = X.C86134wK.A0I(r3)
            java.lang.String r0 = "color"
            r2.A01(r0, r1)
            java.lang.Object r1 = r5.A01
            java.lang.String r0 = "shape"
            r2.A01(r0, r1)
            goto L_0x0240
        L_0x019f:
            X.8q1 r11 = (X.C147848q1) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            long r2 = r5.A00
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            goto L_0x01bc
        L_0x01ae:
            X.8q1 r11 = (X.C147848q1) r11
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            long r2 = r5.A00
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C86104wH.A0f(r0)
        L_0x01bc:
            float r1 = X.C18240wQ.A00(r0)
            r0 = 0
            X.C115886w4.A01(r0, r11, r1, r2)
            goto L_0x0240
        L_0x01c5:
            X.8q1 r11 = (X.C147848q1) r11
            r9 = 0
            X.C04220Ms.A0B(r11, r9)
            X.6hH r0 = X.C103106Xv.A00
            float r0 = r0.A01
            float r2 = r11.CxL(r0)
            X.69J r0 = r11.getLayoutDirection()
            X.69J r10 = X.AnonymousClass69J.Rtl
            r3 = 2
            if (r0 != r10) goto L_0x033c
            long r0 = r11.BCH()
            float r0 = X.AnonymousClass7JK.A02(r0)
            float r6 = (float) r3
            float r2 = r2 / r6
            float r0 = r0 - r2
        L_0x01e7:
            float r1 = X.AnonymousClass73T.A00
            float r14 = r11.CxL(r1)
            java.lang.Object r1 = r5.A01
            X.687 r1 = (X.AnonymousClass687) r1
            int r2 = r1.ordinal()
            r8 = 1
            if (r2 == r8) goto L_0x030b
            if (r2 == r3) goto L_0x02ed
            r7 = 3
            if (r2 == r7) goto L_0x0243
            r1 = 4
            if (r2 != r1) goto L_0x0240
            long r3 = r5.A00
            long r1 = r11.BCH()
            float r18 = X.AnonymousClass7JK.A02(r1)
            float r19 = X.AnonymousClass7JK.A00(r1)
            X.8mj r6 = r11.Ae6()
            r9 = r6
            X.7X9 r9 = (X.AnonymousClass7X9) r9
            X.7XA r1 = r9.A01
            X.7El r5 = r1.A02
            long r1 = X.C121167El.A00(r5)
            X.8lx r10 = r9.A00
            r9 = 0
            r17 = r9
            r20 = r8
            r15 = r10
            r16 = r9
            r15.ADO(r16, r17, r18, r19, r20)
            r8 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r8
            long r16 = X.C86104wH.A0C(r0, r9)
            r9 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            X.53x r10 = X.C877353x.A00
            r8 = r11
            r11 = r14
            r13 = r7
            r14 = r3
            r8.AIp(r9, r10, r11, r12, r13, r14, r16)
            X.C146708mj.A00(r5, r6, r1)
        L_0x0240:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0243:
            long r3 = r5.A00
            r1 = 14
            float r1 = (float) r1
            float r24 = r11.CxL(r1)
            X.69J r2 = r11.getLayoutDirection()
            r1 = 1
            if (r2 != r10) goto L_0x0254
            r1 = -1
        L_0x0254:
            float r1 = (float) r1
            float r5 = r24 * r1
            float r2 = X.C147848q1.A00(r11)
            float r2 = r2 - r24
            float r2 = r2 / r6
            r1 = 0
            long r20 = X.C86104wH.A0C(r0, r1)
            long r22 = X.C86104wH.A0C(r0, r2)
            r12 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r13 = r12
            r18 = r3
            r17 = r7
            r16 = r9
            r11.AJ3(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            android.graphics.Path r8 = X.C86144wL.A0G()
            X.7X1 r6 = new X.7X1
            r6.<init>(r8)
            android.graphics.Path r8 = r6.A01
            r8.moveTo(r5, r1)
            r10 = 1073741824(0x40000000, float:2.0)
            float r28 = r24 / r10
            r22 = r8
            r23 = r5
            r25 = r1
            r26 = r24
            r27 = r1
            r22.cubicTo(r23, r24, r25, r26, r27, r28)
            r16 = r8
            r17 = r1
            r18 = r1
            r19 = r5
            r20 = r1
            r21 = r5
            r22 = r24
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            float r8 = r0 - r5
            X.8mj r5 = r11.Ae6()
            X.7X9 r5 = (X.AnonymousClass7X9) r5
            X.8lx r5 = r5.A00
            r5.D7f(r8, r2)
            r30 = 30
            X.53w r19 = new X.53w
            r26 = r14
            r28 = r9
            r29 = r9
            r25 = r19
            r25.<init>(r26, r27, r28, r29, r30)
            r16 = r11
            r17 = r12
            r18 = r6
            r20 = r15
            r21 = r7
            r22 = r3
            r16.AJ7(r17, r18, r19, r20, r21, r22)
            float r6 = -r8
            float r1 = -r2
            r5.D7f(r6, r1)
            float r2 = r2 + r24
            long r20 = X.C86104wH.A0C(r0, r2)
            float r1 = X.C147848q1.A00(r11)
            long r22 = X.C86104wH.A0C(r0, r1)
            r18 = r3
            r17 = r7
            r16 = r9
            r11.AJ3(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            goto L_0x0240
        L_0x02ed:
            long r1 = r5.A00
            r3 = 0
            long r20 = X.C86104wH.A0C(r0, r3)
            float r3 = X.C147848q1.A00(r11)
            long r22 = X.C86104wH.A0C(r0, r3)
            r12 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r17 = 3
            r13 = r12
            r18 = r1
            r16 = r9
            r11.AJ3(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            goto L_0x0240
        L_0x030b:
            long r1 = r5.A00
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r14 / r3
            long r20 = X.C86104wH.A0C(r0, r3)
            float r4 = X.C147848q1.A00(r11)
            long r22 = X.C86104wH.A0C(r0, r4)
            r12 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r17 = 3
            r13 = r12
            r18 = r1
            r16 = r9
            r11.AJ3(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            long r13 = X.C86104wH.A0C(r0, r3)
            X.53x r7 = X.C877353x.A00
            r5 = r11
            r6 = r12
            r8 = r3
            r9 = r15
            r10 = r17
            r11 = r1
            r5.AIp(r6, r7, r8, r9, r10, r11, r13)
            goto L_0x0240
        L_0x033c:
            float r6 = (float) r3
            float r0 = r2 / r6
            goto L_0x01e7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape4S0100100_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
