package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xQ  reason: invalid class name and case insensitive filesystem */
public final class C86304xQ extends Drawable {
    public Paint A00;
    public final double A01;
    public final Paint A02;
    public final RectF A03 = C86134wK.A0E();

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A03;
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A00);
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A02);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(rect);
        float f = (float) this.A01;
        rectF.inset(f, f);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C86304xQ(int i, int i2, int i3) {
        Paint A0C = C86114wI.A0C(1);
        A0C.setColor(i2);
        C86134wK.A12(A0C);
        A0C.setStrokeWidth((float) i);
        this.A02 = A0C;
        this.A01 = ((double) i) / 2.0d;
        Paint A0C2 = C86114wI.A0C(1);
        A0C2.setColor(i3);
        this.A00 = A0C2;
    }
}
