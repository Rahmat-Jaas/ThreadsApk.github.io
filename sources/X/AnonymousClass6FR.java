package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.6FR  reason: invalid class name */
public final class AnonymousClass6FR {
    public static final Rect A00(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        Rect rect;
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C04220Ms.A0B(spanned, 0);
            if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
                rect = C86134wK.A0D();
                Rect A0D = C86134wK.A0D();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    C04220Ms.A04(metricAffectingSpanArr);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AnonymousClass6FQ.A00(textPaint2, A0D, charSequence, i, nextSpanTransition);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, A0D);
                    }
                    rect.right += A0D.width();
                    rect.top = Math.min(rect.top, A0D.top);
                    rect.bottom = Math.max(rect.bottom, A0D.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        rect = C86134wK.A0D();
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass6FQ.A00(textPaint, rect, charSequence, i, i2);
            return rect;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i2, rect);
        return rect;
    }
}
