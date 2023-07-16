package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zq  reason: invalid class name and case insensitive filesystem */
public final class C87104zq extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public C87104zq(float f) {
        this.A00 = f;
    }
}
