package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.50S  reason: invalid class name */
public final class AnonymousClass50S extends View {
    public static final float[] A0G = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.05f, 0.14f, 0.26f, 0.42f, 0.43f, 0.7f, 0.92f};
    public static final int[] A0H = {-11229, -80351, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public int A00;
    public ValueAnimator A01;
    public Matrix A02 = C86164wN.A0E();
    public Matrix A03 = C86164wN.A0E();
    public Paint A04;
    public Paint A05;
    public Point A06 = new Point();
    public RectF A07 = C86134wK.A0E();
    public RectF A08 = C86134wK.A0E();
    public boolean A09 = true;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;

    public final void A00(float f) {
        if (this.A0D != f || this.A09) {
            this.A0D = f;
            this.A09 = true;
            Paint paint = this.A04;
            float f2 = (float) this.A0F;
            float f3 = (float) this.A0E;
            float min = Math.min(f / 0.5f, 1.0f);
            paint.setStrokeWidth((f3 * min) + ((1.0f - min) * f2));
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0D - 0.5f) / 0.5f;
            float min2 = Math.min(1.0f, max / 0.4f);
            float A012 = C86134wK.A01(this.A0E);
            RectF rectF = this.A07;
            Point point = this.A06;
            float f4 = (float) point.x;
            float f5 = (float) point.y;
            rectF.set(f4 - A012, f5 - A012, f4 + (this.A0B * (Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, max - 0.4f) / 0.6f)), f5 + A012);
            RectF rectF2 = this.A08;
            float f6 = this.A0C;
            float f7 = ((float) point.x) - f6;
            float f8 = (float) point.y;
            rectF2.set(f7, f8 - A012, f7 + ((f6 + A012) * min2), f8 + A012);
            invalidate();
        }
    }

    public AnonymousClass50S(Context context) {
        super(context);
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        Paint A0C2 = C86114wI.A0C(1);
        this.A04 = A0C2;
        C86134wK.A12(A0C2);
        Paint A0C3 = C86114wI.A0C(1);
        this.A05 = A0C3;
        C86134wK.A13(A0C3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        this.A01 = ofFloat;
        ofFloat.setDuration(500);
        this.A01.setInterpolator(new AccelerateDecelerateInterpolator());
        this.A01.addUpdateListener(new AnonymousClass7L6(this));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = ((float) this.A00) * Math.min(this.A0D / 0.5f, 1.0f);
        Point point = this.A06;
        canvas.drawCircle((float) point.x, (float) point.y, min, this.A04);
        if (this.A0D >= 0.5f) {
            canvas.setMatrix(this.A03);
            RectF rectF = this.A08;
            float f = this.A0A;
            Paint paint = this.A05;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (this.A0D >= 0.75f) {
                canvas.setMatrix(this.A02);
                RectF rectF2 = this.A07;
                float f2 = this.A0A;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            }
        }
        this.A09 = false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        this.A0F = (min * 3) >> 3;
        int i3 = min / 12;
        this.A0E = i3;
        int i4 = (min >> 1) - (i3 >> 1);
        this.A00 = i4;
        this.A0A = ((float) i3) / 4.0f;
        float f = (float) i4;
        this.A0C = (float) ((int) (0.45f * f));
        this.A0B = (float) ((int) (f * 0.65f));
        Point point = this.A06;
        point.set(size >> 1, size2 >> 1);
        this.A02.setRotate(-90.0f, (float) point.x, (float) point.y);
        this.A03.setRotate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) point.x, (float) point.y);
        int i5 = point.x;
        int i6 = this.A00;
        int i7 = point.y;
        LinearGradient linearGradient = new LinearGradient((float) (i5 - i6), (float) (i7 + i6), (float) (i5 + i6), (float) (i7 - i6), A0H, A0G, Shader.TileMode.CLAMP);
        this.A04.setShader(linearGradient);
        this.A05.setShader(linearGradient);
        this.A09 = true;
        A00(this.A0D);
    }
}
