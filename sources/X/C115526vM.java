package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6vM  reason: invalid class name and case insensitive filesystem */
public final class C115526vM {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint.FontMetricsInt A06;
    public final Rect A07 = C86134wK.A0D();
    public final Layout A08;
    public final C113916sN A09;
    public final C04530Oa A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final AnonymousClass7QP[] A0E;

    public final float A00(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = (float) this.A05;
        if (i != this.A04 - 1 || (fontMetricsInt = this.A06) == null) {
            lineBaseline = (float) this.A08.getLineBaseline(i);
        } else {
            lineBaseline = A02(i) - ((float) fontMetricsInt.ascent);
        }
        return f + lineBaseline;
    }

    public final float A01(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A04 - 1;
        if (i != i3 || (fontMetricsInt = this.A06) == null) {
            lineBottom = ((float) this.A05) + ((float) this.A08.getLineBottom(i));
            if (i == i3) {
                i2 = this.A02;
            } else {
                i2 = 0;
            }
        } else {
            lineBottom = (float) this.A08.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        }
        return lineBottom + ((float) i2);
    }

    public final float A02(int i) {
        int i2;
        float lineTop = (float) this.A08.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.A05;
        }
        return lineTop + ((float) i2);
    }

    public final float A03(int i, boolean z) {
        float f;
        float A012 = ((AnonymousClass789) this.A0A.getValue()).A01(i, true, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return A012 + f;
    }

    public final float A04(int i, boolean z) {
        float f;
        float A012 = ((AnonymousClass789) this.A0A.getValue()).A01(i, false, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return A012 + f;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: android.text.BoringLayout} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (((android.text.Spanned) r2).nextSpanTransition(-1, r8, X.C87064zm.class) >= r8) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        if (r2 != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0180, code lost:
        if (r7.length == 0) goto L_0x0182;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0226 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C115526vM(android.text.TextPaint r45, android.text.TextUtils.TruncateAt r46, X.C113916sN r47, java.lang.CharSequence r48, float r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, boolean r58) {
        /*
            r44 = this;
            r28 = 0
            r34 = 1065353216(0x3f800000, float:1.0)
            r35 = 0
            r5 = 1
            r2 = r48
            X.C04220Ms.A0B(r2, r5)
            r3 = 3
            r0 = 19
            r6 = r47
            X.C04220Ms.A0B(r6, r0)
            r0 = r44
            r0.<init>()
            r4 = r58
            r0.A0C = r4
            r0.A09 = r6
            android.graphics.Rect r1 = X.C86134wK.A0D()
            r0.A07 = r1
            int r8 = r2.length()
            r7 = r51
            if (r51 == 0) goto L_0x0071
            if (r7 == r5) goto L_0x006e
            r1 = 2
            if (r7 == r1) goto L_0x006b
            android.text.TextDirectionHeuristic r14 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
        L_0x0034:
            X.C04220Ms.A08(r14)
            r7 = r50
            if (r50 == 0) goto L_0x0068
            if (r7 == r5) goto L_0x0065
            r1 = 2
            if (r7 == r1) goto L_0x0062
            if (r7 == r3) goto L_0x005f
            android.text.Layout$Alignment r13 = X.C1191473s.A01
        L_0x0044:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x0055
            r7 = r2
            android.text.Spanned r7 = (android.text.Spanned) r7
            r3 = -1
            java.lang.Class<X.4zm> r1 = X.C87064zm.class
            int r1 = r7.nextSpanTransition(r3, r8, r1)
            r7 = 1
            if (r1 < r8) goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            r3 = -1047876740(0xffffffffc18aab7c, float:-17.333733)
            java.lang.String r1 = "TextLayout:initLayout"
            X.C13790oJ.A01(r1, r3)
            goto L_0x0074
        L_0x005f:
            android.text.Layout$Alignment r13 = X.C1191473s.A00
            goto L_0x0044
        L_0x0062:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0044
        L_0x0065:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0044
        L_0x0068:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0044
        L_0x006b:
            android.text.TextDirectionHeuristic r14 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0034
        L_0x006e:
            android.text.TextDirectionHeuristic r14 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0034
        L_0x0071:
            android.text.TextDirectionHeuristic r14 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0034
        L_0x0074:
            android.text.BoringLayout$Metrics r36 = r6.A01()     // Catch:{ all -> 0x0331 }
            int r19 = X.C86124wJ.A03(r49)     // Catch:{ all -> 0x0331 }
            r15 = r45
            r16 = r46
            r3 = r52
            if (r36 == 0) goto L_0x00d7
            float r1 = r6.A00()     // Catch:{ all -> 0x0331 }
            int r1 = (r1 > r49 ? 1 : (r1 == r49 ? 0 : -1))
            if (r1 > 0) goto L_0x00d7
            if (r7 != 0) goto L_0x00d7
            r0.A0D = r5     // Catch:{ all -> 0x0331 }
            r1 = 4
            X.C04220Ms.A0B(r13, r1)     // Catch:{ all -> 0x0331 }
            boolean r6 = X.C86114wI.A1S(r19)
            java.lang.String r1 = "Failed requirement."
            if (r6 == 0) goto L_0x00d2
            if (r19 < 0) goto L_0x00cd
            boolean r1 = X.C120447Av.A01()     // Catch:{ all -> 0x0331 }
            if (r1 == 0) goto L_0x00b7
            r37 = r13
            r38 = r15
            r39 = r16
            r40 = r2
            r41 = r19
            r42 = r19
            r43 = r4
            android.text.BoringLayout r1 = X.AnonymousClass7Ar.A01(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0331 }
            goto L_0x00ff
        L_0x00b7:
            android.text.BoringLayout r1 = new android.text.BoringLayout     // Catch:{ all -> 0x0331 }
            r29 = r1
            r30 = r2
            r31 = r15
            r32 = r19
            r33 = r13
            r37 = r4
            r38 = r16
            r39 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0331 }
            goto L_0x00ff
        L_0x00cd:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)     // Catch:{ all -> 0x0331 }
            throw r0     // Catch:{ all -> 0x0331 }
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)     // Catch:{ all -> 0x0331 }
            throw r0     // Catch:{ all -> 0x0331 }
        L_0x00d7:
            r1 = 0
            r0.A0D = r1     // Catch:{ all -> 0x0331 }
            int r18 = r2.length()     // Catch:{ all -> 0x0331 }
            r1 = 6
            X.C04220Ms.A0B(r13, r1)     // Catch:{ all -> 0x0331 }
            X.8g3 r1 = X.C102866Wv.A00     // Catch:{ all -> 0x0331 }
            X.LpY r12 = new X.LpY     // Catch:{ all -> 0x0331 }
            r26 = r56
            r22 = r57
            r23 = r53
            r24 = r54
            r25 = r55
            r20 = r3
            r21 = r19
            r27 = r4
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0331 }
            android.text.StaticLayout r1 = r1.AEs(r12)     // Catch:{ all -> 0x0331 }
        L_0x00ff:
            r0.A08 = r1     // Catch:{ all -> 0x0331 }
            r4 = 1051194490(0x3ea7f47a, float:0.32803708)
            X.C13790oJ.A00(r4)
            int r4 = r1.getLineCount()
            int r4 = java.lang.Math.min(r4, r3)
            r0.A04 = r4
            if (r4 < r3) goto L_0x0221
            int r6 = r4 + -1
            int r3 = r1.getEllipsisCount(r6)
            if (r3 > 0) goto L_0x0125
            int r3 = r1.getLineEnd(r6)
            int r2 = r2.length()
            if (r3 == r2) goto L_0x0221
        L_0x0125:
            r2 = 1
        L_0x0126:
            r0.A0B = r2
            boolean r2 = r0.A0C
            r3 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            if (r2 != 0) goto L_0x014e
            boolean r2 = r0.A0D
            android.text.Layout r7 = r0.A08
            if (r2 == 0) goto L_0x020a
            java.lang.String r2 = "null cannot be cast to non-null type android.text.BoringLayout"
            X.C04220Ms.A0C(r7, r2)
            r6 = r7
            android.text.BoringLayout r6 = (android.text.BoringLayout) r6
            X.C04220Ms.A0B(r6, r3)
            boolean r2 = X.C120447Av.A01()
            if (r2 == 0) goto L_0x01ab
            boolean r2 = X.AnonymousClass7Ar.A02(r6)
        L_0x014c:
            if (r2 == 0) goto L_0x01ab
        L_0x014e:
            kotlin.Pair r11 = new kotlin.Pair
            r11.<init>(r8, r8)
        L_0x0153:
            android.text.Layout r6 = r0.A08
            java.lang.CharSequence r2 = r6.getText()
            X.C04220Ms.A06(r2)
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x0182
            java.lang.CharSequence r7 = r6.getText()
            X.C04220Ms.A06(r7)
            android.text.Spanned r7 = (android.text.Spanned) r7
            java.lang.CharSequence r2 = r6.getText()
            X.C04220Ms.A06(r2)
            int r6 = r2.length()
            java.lang.Class<X.7QP> r2 = X.AnonymousClass7QP.class
            java.lang.Object[] r7 = r7.getSpans(r3, r6, r2)
            X.7QP[] r7 = (X.AnonymousClass7QP[]) r7
            X.C04220Ms.A04(r7)
            int r2 = r7.length
            if (r2 != 0) goto L_0x0184
        L_0x0182:
            X.7QP[] r7 = new X.AnonymousClass7QP[r3]
        L_0x0184:
            r0.A0E = r7
            int r9 = r7.length
            r10 = 0
            r6 = 0
            r13 = 0
        L_0x018a:
            if (r10 >= r9) goto L_0x0224
            r12 = r7[r10]
            int r2 = r12.A02
            if (r2 >= 0) goto L_0x019c
            int r2 = r12.A02
            int r2 = java.lang.Math.abs(r2)
            int r6 = java.lang.Math.max(r6, r2)
        L_0x019c:
            int r2 = r12.A04
            if (r2 >= 0) goto L_0x01a8
            int r2 = java.lang.Math.abs(r2)
            int r13 = java.lang.Math.max(r6, r2)
        L_0x01a8:
            int r10 = r10 + 1
            goto L_0x018a
        L_0x01ab:
            android.text.TextPaint r12 = r7.getPaint()
            java.lang.CharSequence r11 = r7.getText()
            X.C04220Ms.A06(r12)
            X.C04220Ms.A06(r11)
            int r6 = r7.getLineStart(r3)
            int r2 = r7.getLineEnd(r3)
            android.graphics.Rect r13 = X.AnonymousClass6FR.A00(r12, r11, r6, r2)
            int r10 = r7.getLineAscent(r3)
            int r2 = r13.top
            if (r2 >= r10) goto L_0x01f7
            int r10 = r10 - r2
        L_0x01ce:
            int r9 = r0.A04
            if (r9 == r5) goto L_0x01e0
            int r2 = r9 - r5
            int r6 = r7.getLineStart(r2)
            int r2 = r7.getLineEnd(r2)
            android.graphics.Rect r13 = X.AnonymousClass6FR.A00(r12, r11, r6, r2)
        L_0x01e0:
            int r9 = r9 - r5
            int r6 = r7.getLineDescent(r9)
            int r2 = r13.bottom
            if (r2 <= r6) goto L_0x01f2
            int r2 = r2 - r6
        L_0x01ea:
            if (r10 != 0) goto L_0x01fc
            if (r2 != 0) goto L_0x01fc
            kotlin.Pair r11 = X.AnonymousClass6ZS.A01
            goto L_0x0153
        L_0x01f2:
            int r2 = r7.getBottomPadding()
            goto L_0x01ea
        L_0x01f7:
            int r10 = r7.getTopPadding()
            goto L_0x01ce
        L_0x01fc:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r11 = X.C18180wK.A0p(r6, r2)
            goto L_0x0153
        L_0x020a:
            java.lang.String r2 = "null cannot be cast to non-null type android.text.StaticLayout"
            X.C04220Ms.A0C(r7, r2)
            r6 = r7
            android.text.StaticLayout r6 = (android.text.StaticLayout) r6
            X.C04220Ms.A0B(r6, r3)
            boolean r2 = X.C120447Av.A01()
            if (r2 == 0) goto L_0x014e
            boolean r2 = X.C115966wC.A01(r6)
            goto L_0x014c
        L_0x0221:
            r2 = 0
            goto L_0x0126
        L_0x0224:
            if (r6 != 0) goto L_0x0323
            if (r13 != 0) goto L_0x0323
            kotlin.Pair r10 = X.AnonymousClass6ZS.A01
        L_0x022a:
            java.lang.Object r2 = r11.A00
            int r6 = X.AnonymousClass0wJ.A04(r2)
            java.lang.Object r2 = r10.A00
            int r2 = X.AnonymousClass0wJ.A04(r2)
            int r2 = java.lang.Math.max(r6, r2)
            r0.A05 = r2
            java.lang.Object r2 = r11.A01
            int r6 = X.AnonymousClass0wJ.A04(r2)
            java.lang.Object r2 = r10.A01
            int r2 = X.AnonymousClass0wJ.A04(r2)
            int r2 = java.lang.Math.max(r6, r2)
            r0.A02 = r2
            int r2 = r0.A04
            int r2 = r2 - r5
            android.text.Layout r5 = r0.A08
            int r6 = r5.getLineStart(r2)
            int r5 = r5.getLineEnd(r2)
            if (r6 != r5) goto L_0x0321
            if (r9 == 0) goto L_0x0321
            java.lang.String r6 = "​"
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r6)
            java.lang.Object r6 = X.AnonymousClass8AP.A05(r7)
            X.7QP r6 = (X.AnonymousClass7QP) r6
            int r11 = r5.length()
            if (r2 == 0) goto L_0x031c
            boolean r13 = r6.A08
            if (r13 == 0) goto L_0x031c
            r12 = 0
        L_0x0277:
            float r9 = r6.A05
            float r10 = r6.A06
            X.7QP r8 = new X.7QP
            r8.<init>(r9, r10, r11, r12, r13)
            int r7 = r5.length()
            r6 = 33
            r5.setSpan(r8, r3, r7, r6)
            int r30 = r5.length()
            boolean r9 = r0.A0C
            r31 = 2147483647(0x7fffffff, float:NaN)
            android.text.Layout$Alignment r8 = X.AnonymousClass6ZR.A00
            r6 = 6
            X.C04220Ms.A0B(r8, r6)
            X.8g3 r7 = X.C102866Wv.A00
            X.LpY r6 = new X.LpY
            r24 = r6
            r25 = r8
            r26 = r14
            r27 = r15
            r29 = r5
            r32 = r31
            r33 = r31
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            android.text.StaticLayout r6 = r7.AEs(r6)
            android.graphics.Paint$FontMetricsInt r7 = new android.graphics.Paint$FontMetricsInt
            r7.<init>()
            int r5 = r6.getLineAscent(r3)
            r7.ascent = r5
            int r5 = r6.getLineDescent(r3)
            r7.descent = r5
            int r5 = r6.getLineTop(r3)
            r7.top = r5
            int r5 = r6.getLineBottom(r3)
            r7.bottom = r5
            float r3 = r0.A01(r2)
            float r2 = r0.A02(r2)
            float r3 = r3 - r2
            int r2 = (int) r3
            int r5 = r5 - r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
        L_0x02e9:
            r0.A06 = r7
            int r2 = r8.intValue()
            r0.A03 = r2
            int r3 = r4 + -1
            android.text.TextPaint r2 = r1.getPaint()
            X.C04220Ms.A06(r2)
            float r2 = X.C115976wD.A00(r2, r1, r3)
            r0.A00 = r2
            android.text.TextPaint r2 = r1.getPaint()
            X.C04220Ms.A06(r2)
            float r1 = X.C115976wD.A01(r2, r1, r3)
            r0.A01 = r1
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r1 = 33
            kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1 r1 = X.C86154wM.A13(r0, r1)
            X.0Oa r1 = X.AnonymousClass0OY.A01(r2, r1)
            r0.A0A = r1
            return
        L_0x031c:
            boolean r13 = r6.A08
            r12 = r13
            goto L_0x0277
        L_0x0321:
            r7 = 0
            goto L_0x02e9
        L_0x0323:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            kotlin.Pair r10 = X.C18180wK.A0p(r6, r2)
            goto L_0x022a
        L_0x0331:
            r1 = move-exception
            r0 = -546180558(0xffffffffdf71f232, float:-1.7434052E19)
            X.C13790oJ.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115526vM.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.6sN, java.lang.CharSequence, float, int, int, int, int, int, int, int, int, boolean):void");
    }
}
