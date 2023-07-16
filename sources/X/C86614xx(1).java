package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xx  reason: invalid class name and case insensitive filesystem */
public final class C86614xx extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;

    private void A00(Canvas canvas, float f) {
        float f2 = this.A04;
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2, this.A06);
        canvas.translate(f - f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        canvas.drawArc(this.A07, -90.0f, 90.0f, true, this.A05);
        canvas.translate(2.0f * f2, f2);
    }

    public final int getOpacity() {
        return -2;
    }

    public C86614xx(int i, float f, float f2) {
        float f3 = f + f2;
        this.A04 = f3;
        int[] iArr = {0, i, 0};
        float f4 = f2 / f3;
        float[] fArr = {f4 - 0.02f, f4, 1.0f};
        float f5 = f3 * 2.0f;
        this.A07 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5, f5);
        Paint A0C = C86114wI.A0C(1);
        this.A05 = A0C;
        C86134wK.A13(A0C);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0C.setShader(new RadialGradient(f3, f3, f3, iArr, fArr, tileMode));
        Paint A0C2 = C86114wI.A0C(1);
        this.A06 = A0C2;
        A0C2.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr, fArr, tileMode));
    }

    public final void onBoundsChange(Rect rect) {
        this.A01 = (float) rect.left;
        this.A02 = (float) rect.top;
        float f = this.A04 * 2.0f;
        this.A00 = ((float) rect.width()) - f;
        this.A03 = ((float) rect.height()) - f;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A01 + this.A04, this.A02);
        A00(canvas, this.A00);
        canvas.rotate(90.0f);
        A00(canvas, this.A03);
        canvas.rotate(90.0f);
        A00(canvas, this.A00);
        canvas.rotate(90.0f);
        A00(canvas, this.A03);
        canvas.restore();
    }
}
