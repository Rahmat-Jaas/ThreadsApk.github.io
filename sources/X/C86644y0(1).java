package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4y0  reason: invalid class name and case insensitive filesystem */
public final class C86644y0 extends Drawable {
    public final Paint A00;
    public final RectF A01;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.drawRoundRect(this.A01, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A00);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        RectF rectF = this.A01;
        rectF.set(rect);
        this.A00.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, rectF.top, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, rectF.bottom, new int[]{-1090519040, 0}, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.8f}, Shader.TileMode.CLAMP));
    }

    public final int getAlpha() {
        return this.A00.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A00.getColorFilter();
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86644y0(float f) {
        Paint A0C = C86114wI.A0C(1);
        C86134wK.A13(A0C);
        this.A00 = A0C;
        this.A01 = C86134wK.A0E();
    }

    public C86644y0() {
        this(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
