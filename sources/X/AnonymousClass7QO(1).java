package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.7QO  reason: invalid class name */
public final class AnonymousClass7QO implements LineHeightSpan {
    public final float A00;

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C04220Ms.A0B(fontMetricsInt, 5);
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int A03 = C86124wJ.A03(this.A00);
            int ceil = (int) Math.ceil(((double) i5) * ((double) ((((float) A03) * 1.0f) / ((float) i6))));
            fontMetricsInt.descent = ceil;
            fontMetricsInt.ascent = ceil - A03;
        }
    }

    public AnonymousClass7QO(float f) {
        this.A00 = f;
    }
}
