package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zs  reason: invalid class name and case insensitive filesystem */
public final class C87124zs extends MetricAffectingSpan {
    public final Typeface A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public C87124zs(Typeface typeface) {
        this.A00 = typeface;
    }
}
