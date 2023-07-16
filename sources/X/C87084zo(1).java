package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zo  reason: invalid class name and case insensitive filesystem */
public final class C87084zo extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setLetterSpacing(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setLetterSpacing(this.A00);
    }

    public C87084zo(float f) {
        this.A00 = f;
    }
}
