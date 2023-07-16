package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xj  reason: invalid class name and case insensitive filesystem */
public final class C86474xj extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03 = C86134wK.A0E();

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.drawOval(this.A03, this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(rect);
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        Paint paint = this.A02;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public C86474xj(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A00 = i2;
        Paint A0C = C86114wI.A0C(1);
        A0C.setColor(i3);
        A0C.setStyle(Paint.Style.FILL_AND_STROKE);
        A0C.setStrokeWidth((float) i4);
        this.A02 = A0C;
    }
}
