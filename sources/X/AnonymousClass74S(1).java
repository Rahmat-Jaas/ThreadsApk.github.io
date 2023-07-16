package X;

/* renamed from: X.74S  reason: invalid class name */
public final class AnonymousClass74S {
    public static final float A00;
    public static final float A01;
    public static final float A02 = ((float) 12);
    public static final float A03;
    public static final float A04 = ((float) 24);
    public static final float A05;

    static {
        float f = (float) 2;
        A03 = f;
        float f2 = (float) 20;
        A05 = f2;
        A00 = f2 / f;
        A01 = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147258p3 r19, X.C141728cr r20, X.C147188nY r21, androidx.compose.ui.Modifier r22, X.AnonymousClass0ZU r23, int r24, int r25, boolean r26, boolean r27) {
        /*
            r13 = r20
            r9 = r19
            r11 = r27
            r14 = r22
            r1 = 1314435585(0x4e58b201, float:9.0888608E8)
            r0 = r21
            r0.Cvd(r1)
            r19 = r25
            r1 = r25 & 1
            r8 = 2
            r5 = r24
            r15 = r26
            if (r1 == 0) goto L_0x0239
            r2 = r24 | 6
        L_0x001d:
            r1 = r25 & 2
            r18 = r23
            if (r1 == 0) goto L_0x022c
            r2 = r2 | 48
        L_0x0025:
            r7 = r25 & 4
            if (r7 == 0) goto L_0x0221
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r3 = r25 & 8
            if (r3 == 0) goto L_0x0216
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0031:
            r6 = r25 & 16
            if (r6 == 0) goto L_0x0208
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0037:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r24
            if (r1 != 0) goto L_0x004c
            r1 = r25 & 32
            if (r1 != 0) goto L_0x0049
            boolean r4 = r0.ACY(r13)
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r4 != 0) goto L_0x004b
        L_0x0049:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x004b:
            r2 = r2 | r1
        L_0x004c:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r2
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r1) goto L_0x007a
            boolean r1 = r0.BCM()
            if (r1 == 0) goto L_0x007a
            r0.CuJ()
        L_0x005e:
            X.8nW r1 = r0.AKE()
            if (r1 == 0) goto L_0x0079
            X.8SB r0 = new X.8SB
            r20 = r15
            r21 = r11
            r15 = r13
            r16 = r14
            r17 = r18
            r18 = r5
            r13 = r0
            r14 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7WO.A00(r1, r0)
        L_0x0079:
            return
        L_0x007a:
            r0.CvD()
            r1 = r24 & 1
            if (r1 == 0) goto L_0x01dc
            boolean r1 = r0.Acj()
            if (r1 != 0) goto L_0x01dc
            r0.CuJ()
        L_0x008a:
            r0.AKA()
            r1 = 0
            if (r15 == 0) goto L_0x01d9
            float r3 = A02
            float r2 = (float) r8
            float r3 = r3 / r2
        L_0x0094:
            r24 = 0
            r7 = 100
            X.8fN r6 = X.AnonymousClass6aT.A00
            X.7Tr r20 = X.C122747Tr.A00(r6, r8, r7, r1)
            r2 = 704104481(0x29f7c821, float:1.100372E-13)
            r0.Cvb(r2)
            X.7yT r23 = X.C134847yT.A00(r3)
            X.8cW r21 = X.C103866ar.A01
            r26 = 24
            r22 = r0
            r25 = r24
            X.4oM r12 = X.AnonymousClass7DC.A00(r20, r21, r22, r23, r24, r25, r26)
            X.7W3 r2 = X.AnonymousClass7W3.A04(r0, r1)
            r4 = r13
            X.7Vz r4 = (X.C123237Vz) r4
            r3 = 1243421834(0x4a1d1c8a, float:2574114.5)
            r0.Cvb(r3)
            if (r11 != 0) goto L_0x017b
            long r3 = r4.A00
            r6 = -1052799002(0xffffffffc13f8fe6, float:-11.972631)
            r0.Cvb(r6)
            X.7KE r3 = X.C86134wK.A0I(r3)
            X.4oM r4 = X.C115806vw.A01(r0, r3)
        L_0x00d3:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
            r3 = 1941632354(0x73baf562, float:2.962476E31)
            r0.Cvb(r3)
            if (r18 == 0) goto L_0x0177
            X.7Wm r3 = androidx.compose.ui.Modifier.A00
            r6 = 3
            float r21 = A04
            r22 = 4
            r23 = 0
            r20 = r0
            r25 = r1
            X.8fO r20 = X.AnonymousClass72Y.A00(r20, r21, r22, r23, r25)
            X.799 r23 = X.AnonymousClass799.A00(r6)
            r21 = r9
            r22 = r3
            r24 = r18
            r25 = r15
            r26 = r11
            androidx.compose.ui.Modifier r10 = X.AnonymousClass6E1.A00(r20, r21, r22, r23, r24, r25, r26)
        L_0x0104:
            X.AnonymousClass7W3.A0w(r2, r1)
            if (r18 == 0) goto L_0x0119
            boolean r6 = androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled
            if (r6 == 0) goto L_0x0174
            r7 = 6
            kotlin.jvm.internal.KtLambdaShape2S0000000_I2 r6 = new kotlin.jvm.internal.KtLambdaShape2S0000000_I2
            r6.<init>(r7)
        L_0x0113:
            X.8Zh r7 = X.AnonymousClass8Zh.A00
            androidx.compose.ui.Modifier r3 = X.C120417Am.A02(r3, r6, r7)
        L_0x0119:
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.Modifier.A07(r14, r3, r10)
            androidx.compose.ui.Alignment r3 = X.AnonymousClass7KV.A09
            androidx.compose.ui.Modifier r6 = X.AnonymousClass7Kq.A03(r3, r6, r8)
            float r3 = A03
            androidx.compose.ui.Modifier r8 = X.AnonymousClass7K4.A03(r6, r3)
            float r7 = A05
            boolean r3 = X.C86164wN.A1Q(r1, r8)
            if (r3 == 0) goto L_0x0171
            r6 = 5
            kotlin.jvm.internal.KtLambdaShape1S0000001_I2 r3 = new kotlin.jvm.internal.KtLambdaShape1S0000001_I2
            r3.<init>(r7, r6)
        L_0x0137:
            X.55A r6 = new X.55A
            r20 = r6
            r21 = r3
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26)
            androidx.compose.ui.Modifier r6 = r8.Cx6(r6)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r3 = X.C147188nY.A10(r0, r4, r12, r3)
            java.lang.Object r7 = r2.A13()
            if (r3 != 0) goto L_0x015f
            java.lang.Object r3 = X.AnonymousClass7GN.A00
            if (r7 != r3) goto L_0x0168
        L_0x015f:
            r3 = 47
            kotlin.jvm.internal.KtLambdaShape39S0200000_I2 r7 = X.C86164wN.A10(r12, r4, r3)
            r2.A14(r7)
        L_0x0168:
            X.0YY r2 = X.AnonymousClass7W3.A0B(r2, r7, r1)
            X.AnonymousClass6DZ.A00(r0, r6, r2, r1)
            goto L_0x005e
        L_0x0171:
            X.0YY r3 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x0137
        L_0x0174:
            X.0YY r6 = androidx.compose.ui.platform.InspectableValueKt.A00
            goto L_0x0113
        L_0x0177:
            X.7Wm r10 = androidx.compose.ui.Modifier.A00
            r3 = r10
            goto L_0x0104
        L_0x017b:
            if (r15 != 0) goto L_0x01d6
            long r3 = r4.A02
        L_0x017f:
            r10 = -1052799107(0xffffffffc13f8f7d, float:-11.972531)
            r0.Cvb(r10)
            X.7Tr r20 = X.C122747Tr.A00(r6, r8, r7, r1)
            r6 = -1942442407(0xffffffff8c38ae59, float:-1.422731E-31)
            r0.Cvb(r6)
            r6 = -451899108(0xffffffffe510911c, float:-4.26686E22)
            r0.Cvb(r6)
            java.lang.String r25 = "ColorAnimation"
            r16 = 63
            long r6 = r3 & r16
            int r10 = (int) r6
            X.6vY[] r16 = X.GQI.A0K
            r6 = r16[r10]
            boolean r7 = X.C147188nY.A0y(r0, r6)
            java.lang.Object r6 = r2.A13()
            if (r7 != 0) goto L_0x01ae
            java.lang.Object r7 = X.AnonymousClass7GN.A00
            if (r6 != r7) goto L_0x01bd
        L_0x01ae:
            X.0YY r6 = X.AnonymousClass6a4.A00
            r7 = r16[r10]
            X.8Kd r6 = (X.AnonymousClass8Kd) r6
            java.lang.Object r6 = r6.invoke(r7)
            X.8cW r6 = (X.AnonymousClass8cW) r6
            r2.A14(r6)
        L_0x01bd:
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8cW r6 = (X.AnonymousClass8cW) r6
            X.7KE r23 = X.C86134wK.A0I(r3)
            r26 = 8
            r21 = r6
            X.4oM r4 = X.AnonymousClass7DC.A00(r20, r21, r22, r23, r24, r25, r26)
            X.AnonymousClass7W3.A0w(r2, r1)
            X.AnonymousClass7W3.A0w(r2, r1)
            goto L_0x00d3
        L_0x01d6:
            long r3 = r4.A01
            goto L_0x017f
        L_0x01d9:
            float r3 = (float) r1
            goto L_0x0094
        L_0x01dc:
            if (r7 == 0) goto L_0x01e0
            X.7Wm r14 = androidx.compose.ui.Modifier.A00
        L_0x01e0:
            boolean r11 = X.C86154wM.A1Z(r3, r11)
            if (r6 == 0) goto L_0x01f4
            X.7W3 r2 = X.C147188nY.A0Y(r0)
            java.lang.Object r9 = X.AnonymousClass7GN.A00(r2)
            r1 = 0
            X.AnonymousClass7W3.A0w(r2, r1)
            X.8p3 r9 = (X.C147258p3) r9
        L_0x01f4:
            r1 = r25 & 32
            if (r1 == 0) goto L_0x008a
            r22 = 0
            r21 = 7
            r20 = r0
            r24 = r22
            r26 = r22
            X.8cr r13 = X.AnonymousClass6EF.A00(r20, r21, r22, r24, r26)
            goto L_0x008a
        L_0x0208:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r24
            if (r1 != 0) goto L_0x0037
            int r1 = X.C147188nY.A0J(r0, r9)
            r2 = r2 | r1
            goto L_0x0037
        L_0x0216:
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0031
            int r1 = X.C147188nY.A0O(r0, r11)
            r2 = r2 | r1
            goto L_0x0031
        L_0x0221:
            r1 = r5 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x002b
            int r1 = X.C147188nY.A0H(r0, r14)
            r2 = r2 | r1
            goto L_0x002b
        L_0x022c:
            r1 = r24 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0025
            r1 = r18
            int r1 = X.C147188nY.A0A(r0, r1)
            r2 = r2 | r1
            goto L_0x0025
        L_0x0239:
            r1 = r24 & 14
            if (r1 != 0) goto L_0x0245
            int r2 = X.C147188nY.A0L(r0, r15)
            r2 = r2 | r24
            goto L_0x001d
        L_0x0245:
            r2 = r5
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74S.A00(X.8p3, X.8cr, X.8nY, androidx.compose.ui.Modifier, X.0ZU, int, int, boolean, boolean):void");
    }
}
