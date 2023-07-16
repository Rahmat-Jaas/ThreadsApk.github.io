package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xP  reason: invalid class name and case insensitive filesystem */
public final class C86294xP extends Drawable {
    public float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86294xP(int i, int i2) {
        Paint A0C = C86114wI.A0C(1);
        this.A03 = A0C;
        this.A01 = i;
        this.A02 = i2;
        C86134wK.A13(A0C);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        C86134wK.A11(canvas, bounds);
        float A012 = C86134wK.A01(bounds.width());
        canvas.drawCircle(A012, A012, this.A00, this.A03);
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        float f = (float) this.A02;
        float width = (((float) rect.width()) / 2.0f) + f;
        this.A00 = width;
        float f2 = 1.0f - (f / width);
        int i = this.A01;
        this.A03.setShader(new RadialGradient(((float) rect.width()) / 2.0f, ((float) rect.width()) / 2.0f, this.A00, new int[]{i, i, 0}, new float[]{0.0f, f2, 1.0f}, Shader.TileMode.CLAMP));
    }
}
