package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4zn  reason: invalid class name and case insensitive filesystem */
public final class C87074zn extends MetricAffectingSpan {
    public final String A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setFontFeatureSettings(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setFontFeatureSettings(this.A00);
    }

    public C87074zn(String str) {
        this.A00 = str;
    }
}
