package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* renamed from: X.7QN  reason: invalid class name */
public final class AnonymousClass7QN implements LineHeightSpan.WithDensity {
    public final void A00(Paint.FontMetricsInt fontMetricsInt, float f) {
        int i;
        int ceil = (int) Math.ceil((double) (47.5f * f));
        int i2 = fontMetricsInt.descent;
        if (((float) i2) > 47.5f) {
            int min = Math.min(ceil, i2);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            i = 0;
        } else {
            int i3 = fontMetricsInt.ascent;
            int i4 = -i3;
            if (i4 + i2 > ceil) {
                fontMetricsInt.bottom = i2;
                i = (-ceil) + i2;
            } else {
                int i5 = fontMetricsInt.bottom;
                if (i4 + i5 > ceil) {
                    fontMetricsInt.top = i3;
                    fontMetricsInt.bottom = i3 + ceil;
                    return;
                }
                int i6 = fontMetricsInt.top;
                int i7 = (-i6) + i5;
                if (i7 > ceil) {
                    i = i5 - ceil;
                    fontMetricsInt.top = i;
                }
                double A01 = (double) C86134wK.A01(ceil - i7);
                int ceil2 = (int) (((double) i6) - Math.ceil(A01));
                fontMetricsInt.top = ceil2;
                int floor = (int) (((double) i5) + Math.floor(A01));
                fontMetricsInt.bottom = floor;
                fontMetricsInt.ascent = ceil2;
                fontMetricsInt.descent = floor;
                return;
            }
        }
        fontMetricsInt.ascent = i;
        fontMetricsInt.top = i;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        A00(fontMetricsInt, 1.0f);
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        A00(fontMetricsInt, textPaint.density);
    }
}
