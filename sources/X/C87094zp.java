package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4zp  reason: invalid class name and case insensitive filesystem */
public final class C87094zp extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    public C87094zp(float f) {
        this.A00 = f;
    }
}
