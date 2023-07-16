package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zm  reason: invalid class name and case insensitive filesystem */
public final class C87064zm extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.baselineShift += C86124wJ.A03(textPaint.ascent() * this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.baselineShift += C86124wJ.A03(textPaint.ascent() * this.A00);
    }

    public C87064zm(float f) {
        this.A00 = f;
    }
}
