package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.4zv  reason: invalid class name and case insensitive filesystem */
public final class C87154zv extends ReplacementSpan {
    public int A00;
    public Paint.FontMetricsInt A01;
    public boolean A02;
    public int A03;
    public final int A04 = 3;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;

    public C87154zv(float f, float f2, float f3, int i, int i2) {
        this.A07 = f;
        this.A09 = i;
        this.A05 = f2;
        this.A08 = i2;
        this.A06 = f3;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if ((A00() + r4) > r2) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r13.ascent = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getSize(android.graphics.Paint r9, java.lang.CharSequence r10, int r11, int r12, android.graphics.Paint.FontMetricsInt r13) {
        /*
            r8 = this;
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            r7 = 1
            r8.A02 = r7
            float r6 = r9.getTextSize()
            android.graphics.Paint$FontMetricsInt r3 = r9.getFontMetricsInt()
            X.C04220Ms.A06(r3)
            r8.A01 = r3
            int r2 = r3.descent
            int r4 = r3.ascent
            if (r2 <= r4) goto L_0x00bc
            int r0 = r8.A09
            java.lang.String r5 = "Unsupported unit."
            if (r0 == 0) goto L_0x00a4
            if (r0 != r7) goto L_0x00b7
            float r1 = r8.A07
            float r1 = r1 * r6
        L_0x0025:
            int r1 = X.C86124wJ.A03(r1)
            r8.A00 = r1
            int r0 = r8.A08
            if (r0 == 0) goto L_0x009e
            if (r0 != r7) goto L_0x00b2
            float r5 = r8.A05
            float r5 = r5 * r6
        L_0x0034:
            int r0 = X.C86124wJ.A03(r5)
            r8.A03 = r0
            if (r13 == 0) goto L_0x0073
            r13.ascent = r4
            r13.descent = r2
            int r0 = r3.leading
            r13.leading = r0
            int r0 = r8.A04
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0087;
                case 2: goto L_0x0078;
                default: goto L_0x0049;
            }
        L_0x0049:
            int r5 = r2 - r4
            int r0 = r8.A00()
            if (r5 >= r0) goto L_0x0063
            int r0 = r8.A00()
            int r0 = r0 - r5
            int r0 = r0 >> 1
            int r4 = r4 - r0
            r13.ascent = r4
        L_0x005b:
            int r0 = r8.A00()
            int r2 = r4 + r0
            r13.descent = r2
        L_0x0063:
            int r0 = r3.top
            int r0 = java.lang.Math.min(r0, r4)
            r13.top = r0
            int r0 = r3.bottom
            int r0 = java.lang.Math.max(r0, r2)
            r13.bottom = r0
        L_0x0073:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00ab
            return r1
        L_0x0078:
            int r0 = r8.A00()
            int r0 = r2 - r0
            if (r4 <= r0) goto L_0x0063
            int r0 = r8.A00()
            int r4 = r2 - r0
            goto L_0x009b
        L_0x0087:
            int r0 = r8.A00()
            int r0 = r0 + r4
            if (r0 <= r2) goto L_0x0063
            goto L_0x005b
        L_0x008f:
            int r0 = r8.A00()
            int r0 = -r0
            if (r4 <= r0) goto L_0x0063
            int r0 = r8.A00()
            int r4 = -r0
        L_0x009b:
            r13.ascent = r4
            goto L_0x0063
        L_0x009e:
            float r5 = r8.A05
            float r0 = r8.A06
            float r5 = r5 * r0
            goto L_0x0034
        L_0x00a4:
            float r1 = r8.A07
            float r0 = r8.A06
            float r1 = r1 * r0
            goto L_0x0025
        L_0x00ab:
            java.lang.String r0 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00b2:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r5)
            throw r0
        L_0x00b7:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r5)
            throw r0
        L_0x00bc:
            java.lang.String r0 = "Invalid fontMetrics: line height can not be negative."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87154zv.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }

    public final int A00() {
        if (this.A02) {
            return this.A03;
        }
        throw C18180wK.A0a("PlaceholderSpan is not laid out yet.");
    }
}
