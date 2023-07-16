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
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.50V  reason: invalid class name */
public class AnonymousClass50V extends View {
    public static final float[] A0M = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.05f, 0.14f, 0.26f, 0.42f, 0.43f, 0.7f, 0.92f};
    public static final int[] A0N = {-11229, -80351, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public float A00 = 0.9f;
    public float A01 = 0.38f;
    public int A02 = 12;
    public ValueAnimator A03;
    public Matrix A04;
    public Matrix A05;
    public Paint A06;
    public Paint A07;
    public Point A08;
    public RectF A09;
    public RectF A0A;
    public boolean A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public LinearGradient A0L;

    public final void A00(float f) {
        if (this.A0H != f || this.A0B) {
            this.A0H = f;
            this.A0B = true;
            Paint paint = this.A06;
            float f2 = (float) this.A0K;
            float f3 = (float) this.A0J;
            float min = Math.min(f / 0.5f, 1.0f);
            paint.setStrokeWidth((f3 * min) + ((1.0f - min) * f2));
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0H - 0.5f) / 0.5f;
            float min2 = Math.min(1.0f, max / 0.4f);
            float A012 = C86134wK.A01(this.A0J);
            RectF rectF = this.A09;
            Point point = this.A08;
            float f4 = ((float) point.x) - this.A0G;
            float f5 = ((float) point.y) + this.A0D;
            rectF.set(f4 - A012, f5 - A012, f4 + (this.A0E * (Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, max - 0.4f) / 0.6f)), f5 + A012);
            RectF rectF2 = this.A0A;
            float f6 = this.A0F;
            float f7 = (((float) point.x) - this.A0G) - f6;
            float f8 = ((float) point.y) + this.A0D;
            rectF2.set(f7, f8 - A012, f7 + ((f6 + A012) * min2), f8 + A012);
            invalidate();
        }
    }

    public float getCheckLengthLongRatio() {
        return this.A00;
    }

    public float getCheckLengthShortRatio() {
        return this.A01;
    }

    public int getCircleStrokeThicknessRatio() {
        return this.A02;
    }

    public AnonymousClass50V(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        Paint A0C2 = C86114wI.A0C(1);
        this.A06 = A0C2;
        C86134wK.A12(A0C2);
        Paint A0C3 = C86114wI.A0C(1);
        this.A07 = A0C3;
        C86134wK.A13(A0C3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        this.A03 = ofFloat;
        ofFloat.setDuration(500);
        this.A03.setInterpolator(new AccelerateDecelerateInterpolator());
        this.A03.addUpdateListener(new AnonymousClass7L5(this));
        this.A08 = new Point();
        this.A0B = true;
        this.A09 = C86134wK.A0E();
        this.A0A = C86134wK.A0E();
        this.A04 = C86164wN.A0E();
        this.A05 = C86164wN.A0E();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = ((float) this.A0I) * Math.min(this.A0H / 0.5f, 1.0f);
        Point point = this.A08;
        canvas.drawCircle((float) point.x, (float) point.y, min, this.A06);
        if (this.A0H >= 0.5f) {
            canvas.setMatrix(this.A05);
            RectF rectF = this.A0A;
            float f = this.A0C;
            Paint paint = this.A07;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (this.A0H >= 0.75f) {
                canvas.setMatrix(this.A04);
                RectF rectF2 = this.A09;
                float f2 = this.A0C;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            }
        }
        this.A0B = false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        this.A0K = (min * 3) >> 3;
        int i3 = min / this.A02;
        this.A0J = i3;
        int i4 = (min >> 1) - (i3 >> 1);
        this.A0I = i4;
        this.A0C = (float) i3;
        float f = (float) i4;
        this.A0D = (float) ((int) (0.3f * f));
        this.A0G = (float) ((int) (0.17f * f));
        this.A0F = (float) ((int) (this.A01 * f));
        this.A0E = (float) ((int) (f * this.A00));
        Point point = this.A08;
        point.set(size >> 1, size2 >> 1);
        this.A04.setRotate(-45.0f, ((float) point.x) - this.A0G, ((float) point.y) + this.A0D);
        this.A05.setRotate(45.0f, ((float) point.x) - this.A0G, ((float) point.y) + this.A0D);
        int i5 = point.x;
        int i6 = this.A0I;
        int i7 = point.y;
        LinearGradient linearGradient = new LinearGradient((float) (i5 - i6), (float) (i7 + i6), (float) (i5 + i6), (float) (i7 - i6), A0N, A0M, Shader.TileMode.CLAMP);
        this.A0L = linearGradient;
        this.A06.setShader(linearGradient);
        this.A07.setShader(this.A0L);
        this.A0B = true;
        A00(this.A0H);
    }

    public void setCheckLengthLongRatio(float f) {
        this.A00 = f;
    }

    public void setCheckLengthShortRatio(float f) {
        this.A01 = f;
    }

    public void setCircleStrokeThicknessRatio(int i) {
        this.A02 = i;
    }
}
