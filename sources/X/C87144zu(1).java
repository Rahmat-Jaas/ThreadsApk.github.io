package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.4zu  reason: invalid class name and case insensitive filesystem */
public final class C87144zu extends ReplacementSpan {
    public final String A00;

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (paint.measureText(this.A00, 0, 1) + paint.measureText(charSequence, i, i2));
    }

    public C87144zu(String str) {
        this.A00 = str;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(charSequence.subSequence(i, i2));
        canvas.drawText(C18180wK.A0i(this.A00, A0r), f, (float) i4, paint);
    }
}
