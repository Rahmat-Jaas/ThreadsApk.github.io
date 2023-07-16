package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zr  reason: invalid class name and case insensitive filesystem */
public final class C87114zr extends MetricAffectingSpan {
    public final Typeface A00;

    public C87114zr(Typeface typeface) {
        C04220Ms.A0B(typeface, 1);
        this.A00 = typeface;
    }

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }
}
