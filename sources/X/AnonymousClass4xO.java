package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xO  reason: invalid class name */
public final class AnonymousClass4xO extends Drawable {
    public final Paint A00;
    public final int A01;
    public final RectF A02 = C86134wK.A0E();

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        canvas.drawOval(this.A02, this.A00);
    }

    public final void setAlpha(int i) {
        Paint paint = this.A00;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public AnonymousClass4xO(int i, int i2) {
        float f = (float) i;
        this.A01 = (int) (f / 2.0f);
        Paint A0C = C86114wI.A0C(1);
        this.A00 = A0C;
        A0C.setColor(i2);
        C86134wK.A12(A0C);
        A0C.setStrokeWidth(f);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        float f = (float) this.A01;
        rectF.inset(f, f);
    }
}
