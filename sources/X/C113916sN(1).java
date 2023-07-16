package X;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* renamed from: X.6sN  reason: invalid class name and case insensitive filesystem */
public final class C113916sN {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public BoringLayout.Metrics A02;
    public boolean A03;
    public final TextPaint A04;
    public final CharSequence A05;
    public final int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if (r5.nextSpanTransition(-1, r5.length(), X.C87084zo.class) != r5.length()) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r4.getLetterSpacing() == com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00() {
        /*
            r8 = this;
            float r1 = r8.A01
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0073
            android.text.BoringLayout$Metrics r0 = r8.A01()
            if (r0 == 0) goto L_0x0017
            int r0 = r0.width
            float r0 = (float) r0
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            if (r7 != 0) goto L_0x002e
        L_0x0017:
            java.lang.CharSequence r3 = r8.A05
            r2 = 0
            int r1 = r3.length()
            android.text.TextPaint r0 = r8.A04
            float r0 = android.text.Layout.getDesiredWidth(r3, r2, r1, r0)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            float r0 = (float) r1
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
        L_0x002e:
            float r6 = r7.floatValue()
            java.lang.CharSequence r5 = r8.A05
            android.text.TextPaint r4 = r8.A04
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            boolean r0 = r5 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0074
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.lang.Class<X.4zp> r1 = X.C87094zp.class
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            int r0 = r5.length()
            r2 = -1
            int r1 = r5.nextSpanTransition(r2, r0, r1)
            int r0 = r5.length()
            if (r1 != r0) goto L_0x0066
            java.lang.Class<X.4zo> r1 = X.C87084zo.class
            int r0 = r5.length()
            int r1 = r5.nextSpanTransition(r2, r0, r1)
            int r0 = r5.length()
            if (r1 == r0) goto L_0x0074
        L_0x0066:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
        L_0x006d:
            float r1 = r7.floatValue()
            r8.A01 = r1
        L_0x0073:
            return r1
        L_0x0074:
            float r0 = r4.getLetterSpacing()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113916sN.A00():float");
    }

    public final BoringLayout.Metrics A01() {
        TextDirectionHeuristic textDirectionHeuristic;
        BoringLayout.Metrics metrics;
        if (!this.A03) {
            int i = this.A06;
            if (i == 0) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (i == 1) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else if (i != 2) {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            C04220Ms.A08(textDirectionHeuristic);
            CharSequence charSequence = this.A05;
            TextPaint textPaint = this.A04;
            if (C120447Av.A01()) {
                metrics = AnonymousClass7Ar.A00(textDirectionHeuristic, textPaint, charSequence);
            } else {
                metrics = null;
                if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
                    metrics = BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
                }
            }
            this.A02 = metrics;
            this.A03 = true;
        }
        return this.A02;
    }

    public C113916sN(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A05 = charSequence;
        this.A04 = textPaint;
        this.A06 = i;
    }
}
