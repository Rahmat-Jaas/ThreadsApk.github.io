package X;

import java.util.List;

/* renamed from: X.7Xs  reason: invalid class name and case insensitive filesystem */
public final class C123597Xs implements C146288ly {
    public final /* synthetic */ AnonymousClass745 A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ AnonymousClass0Y0 A03;
    public final /* synthetic */ float A04;

    public C123597Xs(AnonymousClass745 r1, Integer num, Integer num2, AnonymousClass0Y0 r4, float f) {
        this.A02 = num;
        this.A03 = r4;
        this.A04 = f;
        this.A01 = num2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01cb, code lost:
        if (r17 == Integer.MAX_VALUE) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0152, code lost:
        if (r12 != Integer.MAX_VALUE) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0246 A[LOOP:4: B:139:0x0244->B:140:0x0246, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C146098ld Bg2(X.C147618pd r31, java.util.List r32, long r33) {
        /*
            r30 = this;
            r29 = r31
            r4 = r32
            r0 = r29
            boolean r10 = X.AnonymousClass0wJ.A1Y(r0, r4)
            int r0 = r4.size()
            X.7Xy[] r3 = new X.C123657Xy[r0]
            r5 = r30
            java.lang.Integer r0 = r5.A02
            r28 = r0
            X.0Y0 r2 = r5.A03
            float r1 = r5.A04
            X.745 r0 = r5.A00
            X.6mL r7 = new X.6mL
            r11 = r7
            r12 = r0
            r13 = r28
            r14 = r4
            r15 = r2
            r16 = r3
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            int r6 = r4.size()
            java.lang.Integer r9 = r7.A02
            java.lang.Integer r5 = X.AnonymousClass006.A00
            if (r9 != r5) goto L_0x00d4
            int r27 = androidx.compose.ui.unit.Constraints.A04(r33)
        L_0x0039:
            int r12 = androidx.compose.ui.unit.Constraints.A02(r33)
        L_0x003d:
            int r26 = androidx.compose.ui.unit.Constraints.A03(r33)
        L_0x0041:
            int r25 = androidx.compose.ui.unit.Constraints.A01(r33)
        L_0x0045:
            float r1 = r7.A00
            r0 = r29
            int r11 = r0.CfL(r1)
            r24 = 0
            r3 = 0
            r15 = 0
            r23 = 0
            r17 = 0
            r16 = 0
            r8 = 0
            r22 = 0
        L_0x005a:
            r21 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r6) goto L_0x00ec
            java.util.List r0 = r7.A03
            java.lang.Object r14 = r0.get(r3)
            X.8pZ r14 = (X.C147578pZ) r14
            X.79Y[] r0 = r7.A05
            r4 = r0[r3]
            if (r4 == 0) goto L_0x007a
            float r1 = r4.A00
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            float r16 = r16 + r1
            int r17 = r17 + 1
        L_0x0077:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x007a:
            X.7Xy[] r2 = r7.A06
            r13 = r2[r3]
            if (r13 != 0) goto L_0x0099
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r1) goto L_0x0087
            int r1 = r12 - r8
        L_0x0087:
            X.C04220Ms.A0B(r9, r10)
            r0 = r25
            if (r9 != r5) goto L_0x0091
            r0 = r1
            r1 = r25
        L_0x0091:
            long r0 = X.AnonymousClass7JT.A02(r10, r0, r10, r1)
            X.7Xy r13 = r14.Bg4(r0)
        L_0x0099:
            int r1 = r12 - r8
            X.C04220Ms.A0B(r13, r10)
            if (r9 != r5) goto L_0x00d1
            int r0 = r13.A01
        L_0x00a2:
            int r1 = r1 - r0
            int r15 = java.lang.Math.min(r11, r1)
            if (r9 != r5) goto L_0x00ce
            int r0 = r13.A01
        L_0x00ab:
            int r0 = r0 + r15
            int r8 = r8 + r0
            if (r9 != r5) goto L_0x00cb
            int r1 = r13.A00
        L_0x00b1:
            r0 = r23
            int r23 = java.lang.Math.max(r0, r1)
            if (r22 != 0) goto L_0x00c3
            if (r4 == 0) goto L_0x00c8
            X.745 r0 = r4.A01
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0 instanceof X.C873752j
            if (r0 == 0) goto L_0x00c8
        L_0x00c3:
            r22 = 1
        L_0x00c5:
            r2[r3] = r13
            goto L_0x0077
        L_0x00c8:
            r22 = 0
            goto L_0x00c5
        L_0x00cb:
            int r1 = r13.A01
            goto L_0x00b1
        L_0x00ce:
            int r0 = r13.A00
            goto L_0x00ab
        L_0x00d1:
            int r0 = r13.A00
            goto L_0x00a2
        L_0x00d4:
            int r27 = androidx.compose.ui.unit.Constraints.A03(r33)
            if (r9 == r5) goto L_0x0039
            int r12 = androidx.compose.ui.unit.Constraints.A01(r33)
            if (r9 == r5) goto L_0x003d
            int r26 = androidx.compose.ui.unit.Constraints.A04(r33)
            if (r9 == r5) goto L_0x0041
            int r25 = androidx.compose.ui.unit.Constraints.A02(r33)
            goto L_0x0045
        L_0x00ec:
            if (r17 != 0) goto L_0x014b
            int r8 = r8 - r15
            r3 = 0
        L_0x00f0:
            if (r22 == 0) goto L_0x022b
            r14 = 0
            r1 = 0
            r11 = 0
        L_0x00f5:
            if (r14 >= r6) goto L_0x022d
            X.7Xy[] r0 = r7.A06
            r13 = r0[r14]
            X.C04220Ms.A0A(r13)
            X.79Y[] r0 = r7.A05
            r0 = r0[r14]
            if (r0 == 0) goto L_0x0142
            X.745 r2 = r0.A01
            if (r2 == 0) goto L_0x0142
            boolean r0 = r2 instanceof X.C873752j
            if (r0 == 0) goto L_0x0142
            X.52j r2 = (X.C873752j) r2
            r0 = 0
            X.C04220Ms.A0B(r13, r0)
            X.6nA r0 = r2.A00
            int r0 = r0.A00(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            if (r12 == 0) goto L_0x0142
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r0 = r12.intValue()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r4) goto L_0x0129
            r0 = 0
        L_0x0129:
            int r1 = java.lang.Math.max(r1, r0)
            if (r9 != r5) goto L_0x0148
            int r2 = r13.A00
        L_0x0131:
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r0 = r12.intValue()
            if (r0 != r4) goto L_0x013d
            if (r9 != r5) goto L_0x0145
            int r0 = r13.A00
        L_0x013d:
            int r2 = r2 - r0
            int r11 = java.lang.Math.max(r11, r2)
        L_0x0142:
            int r14 = r14 + 1
            goto L_0x00f5
        L_0x0145:
            int r0 = r13.A01
            goto L_0x013d
        L_0x0148:
            int r2 = r13.A01
            goto L_0x0131
        L_0x014b:
            int r0 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            r14 = r12
            r0 = r21
            if (r12 == r0) goto L_0x0188
        L_0x0154:
            int r14 = r14 - r8
            int r0 = r17 + -1
            int r11 = r11 * r0
            int r14 = r14 - r11
            int r0 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x0186
            float r13 = (float) r14
            float r13 = r13 / r16
        L_0x0160:
            X.8bH r0 = X.AnonymousClass8bI.A0C(r10, r6)
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0169:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018b
            r0 = r3
            X.83z r0 = (X.C1367083z) r0
            int r1 = r0.A00()
            X.79Y[] r0 = r7.A05
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0184
            float r0 = r0.A00
        L_0x017e:
            int r0 = X.AnonymousClass8bA.A03(r0, r13)
            int r2 = r2 + r0
            goto L_0x0169
        L_0x0184:
            r0 = 0
            goto L_0x017e
        L_0x0186:
            r13 = 0
            goto L_0x0160
        L_0x0188:
            r14 = r27
            goto L_0x0154
        L_0x018b:
            int r14 = r14 - r2
            r4 = 0
            r3 = 0
        L_0x018e:
            if (r4 >= r6) goto L_0x0224
            X.7Xy[] r0 = r7.A06
            r20 = r0
            r0 = r0[r4]
            if (r0 != 0) goto L_0x0212
            java.util.List r0 = r7.A03
            java.lang.Object r19 = r0.get(r4)
            r0 = r19
            X.8pZ r0 = (X.C147578pZ) r0
            r19 = r0
            X.79Y[] r0 = r7.A05
            r18 = r0[r4]
            if (r18 == 0) goto L_0x029b
            r0 = r18
            float r2 = r0.A00
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x029b
            if (r14 >= 0) goto L_0x021f
            r1 = -1
        L_0x01b5:
            int r14 = r14 - r1
            int r0 = X.AnonymousClass8bA.A03(r2, r13)
            int r0 = r0 + r1
            int r17 = java.lang.Math.max(r10, r0)
            r0 = r18
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01cd
            r16 = r17
            r1 = r17
            r0 = r21
            if (r1 != r0) goto L_0x01cf
        L_0x01cd:
            r16 = 0
        L_0x01cf:
            X.C04220Ms.A0B(r9, r10)
            r0 = 0
            r1 = r25
            if (r9 != r5) goto L_0x01df
            r0 = r16
            r1 = r17
            r16 = 0
            r17 = r25
        L_0x01df:
            r15 = r1
            r2 = r0
            r1 = r16
            r0 = r17
            long r15 = X.AnonymousClass7JT.A02(r2, r15, r1, r0)
            r1 = r15
            r0 = r19
            X.7Xy r1 = r0.Bg4(r1)
            X.C04220Ms.A0B(r1, r10)
            if (r9 != r5) goto L_0x021c
            int r0 = r1.A01
        L_0x01f7:
            int r3 = r3 + r0
            if (r9 != r5) goto L_0x0219
            int r0 = r1.A00
        L_0x01fc:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r0)
            if (r22 != 0) goto L_0x020e
            r0 = r18
            X.745 r0 = r0.A01
            if (r0 == 0) goto L_0x0216
            boolean r0 = r0 instanceof X.C873752j
            if (r0 == 0) goto L_0x0216
        L_0x020e:
            r22 = 1
        L_0x0210:
            r20[r4] = r1
        L_0x0212:
            int r4 = r4 + 1
            goto L_0x018e
        L_0x0216:
            r22 = 0
            goto L_0x0210
        L_0x0219:
            int r0 = r1.A01
            goto L_0x01fc
        L_0x021c:
            int r0 = r1.A00
            goto L_0x01f7
        L_0x021f:
            boolean r1 = X.C18180wK.A1X(r14)
            goto L_0x01b5
        L_0x0224:
            int r3 = r3 + r11
            int r12 = r12 - r8
            if (r3 <= r12) goto L_0x00f0
            r3 = r12
            goto L_0x00f0
        L_0x022b:
            r11 = 0
            r1 = 0
        L_0x022d:
            int r8 = r8 + r3
            r0 = r27
            int r15 = java.lang.Math.max(r8, r0)
            int r11 = r11 + r1
            r0 = r26
            int r2 = java.lang.Math.max(r0, r11)
            r0 = r23
            int r14 = java.lang.Math.max(r0, r2)
            int[] r2 = new int[r6]
            r0 = 0
        L_0x0244:
            if (r0 >= r6) goto L_0x024b
            r2[r0] = r10
            int r0 = r0 + 1
            goto L_0x0244
        L_0x024b:
            int[] r3 = new int[r6]
            r4 = 0
        L_0x024e:
            if (r4 >= r6) goto L_0x0266
            X.7Xy[] r0 = r7.A06
            r0 = r0[r4]
            X.C04220Ms.A0A(r0)
            X.C04220Ms.A0B(r0, r10)
            if (r9 != r5) goto L_0x0263
            int r0 = r0.A01
        L_0x025e:
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x024e
        L_0x0263:
            int r0 = r0.A00
            goto L_0x025e
        L_0x0266:
            X.0Y0 r8 = r7.A04
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            X.69J r11 = r29.getLayoutDirection()
            r10 = r3
            r12 = r29
            r13 = r2
            r8.invoke(r9, r10, r11, r12, r13)
            X.6lH r4 = new X.6lH
            r12 = r4
            r16 = r6
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r28
            if (r0 != r5) goto L_0x0296
            int r3 = r4.A03
            int r2 = r4.A01
        L_0x0289:
            r1 = 12
            r0 = r29
            kotlin.jvm.internal.KtLambdaShape10S0300000_I2 r1 = X.C86154wM.A0y(r4, r0, r7, r1)
            X.8ld r0 = X.C147618pd.A00(r0, r1, r3, r2)
            return r0
        L_0x0296:
            int r3 = r4.A01
            int r2 = r4.A03
            goto L_0x0289
        L_0x029b:
            java.lang.String r0 = "All weights <= 0 should have placeables"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123597Xs.Bg2(X.8pd, java.util.List, long):X.8ld");
    }

    public static Object A00(C123597Xs r2, C147168nV r3, Object obj, AnonymousClass0YM r5, int i) {
        return r5.invoke(obj, Integer.valueOf(i), Integer.valueOf(r3.CfL(r2.A04)));
    }

    public final int Bf9(C147838q0 r3, List list, int i) {
        AnonymousClass0YM r0;
        AnonymousClass0wJ.A1N(r3, list);
        if (this.A02 == AnonymousClass006.A00) {
            r0 = C103856aq.A00;
        } else {
            r0 = C103856aq.A04;
        }
        return AnonymousClass0wJ.A04(A00(this, r3, list, r0, i));
    }

    public final int BfC(C147838q0 r3, List list, int i) {
        AnonymousClass0YM r0;
        AnonymousClass0wJ.A1N(r3, list);
        if (this.A02 == AnonymousClass006.A00) {
            r0 = C103856aq.A01;
        } else {
            r0 = C103856aq.A05;
        }
        return AnonymousClass0wJ.A04(A00(this, r3, list, r0, i));
    }

    public final int BgK(C147838q0 r3, List list, int i) {
        AnonymousClass0YM r0;
        AnonymousClass0wJ.A1N(r3, list);
        if (this.A02 == AnonymousClass006.A00) {
            r0 = C103856aq.A02;
        } else {
            r0 = C103856aq.A06;
        }
        return AnonymousClass0wJ.A04(A00(this, r3, list, r0, i));
    }

    public final int BgN(C147838q0 r3, List list, int i) {
        AnonymousClass0YM r0;
        AnonymousClass0wJ.A1N(r3, list);
        if (this.A02 == AnonymousClass006.A00) {
            r0 = C103856aq.A03;
        } else {
            r0 = C103856aq.A07;
        }
        return AnonymousClass0wJ.A04(A00(this, r3, list, r0, i));
    }
}
