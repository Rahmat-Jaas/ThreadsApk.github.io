package com.instagram.ui.widget.gradientspinner;

import X.AnonymousClass00U;
import X.C09860go;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86164wN;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

public class SpinningGradientBorder extends FrameLayout {
    public int A00;
    public LinearGradient A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final RectF A05;
    public final int A06;
    public final ValueAnimator A07;
    public final Matrix A08;

    public void setCurrentPlayTime(long j) {
        this.A07.setCurrentPlayTime(j);
    }

    public void setSpinnerState(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i != 0) {
                if (i == 1) {
                    this.A07.start();
                    invalidate();
                } else if (i != 2) {
                    throw C18180wK.A0a(AnonymousClass00U.A0J("Invalid SpinnerState ", i));
                }
            }
            this.A07.cancel();
            invalidate();
        }
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        this.A02 = (float) C86124wJ.A09(context);
        float A002 = C09860go.A00(context, 1.5f);
        this.A03 = A002;
        Paint A0C = C86114wI.A0C(1);
        this.A04 = A0C;
        C86134wK.A12(A0C);
        A0C.setStrokeWidth(A002);
        A0C.setStrokeCap(Paint.Cap.ROUND);
        this.A05 = C86134wK.A0E();
        this.A08 = C86164wN.A0E();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f}).setDuration(1200);
        this.A07 = duration;
        C86164wN.A15(duration);
        duration.setRepeatCount(-1);
        C86134wK.A0z(duration, this, 25);
        this.A06 = context.getColor(C86104wH.A0G(context, R.attr.gradientSpinnerDoneColor).resourceId);
        setWillNotDraw(false);
    }

    private LinearGradient getGradient() {
        Context context = getContext();
        LinearGradient linearGradient = this.A01;
        if (linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), context.getColor(R.color.fds_transparent), this.A06, Shader.TileMode.CLAMP);
        this.A01 = linearGradient2;
        return linearGradient2;
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(787297186);
        super.onDetachedFromWindow();
        this.A07.end();
        C14030oh.A0D(-2123829886, A062);
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                paint = this.A04;
                paint.setShader(getGradient());
                Matrix matrix = this.A08;
                matrix.setRotate((C18240wQ.A00(this.A07.getAnimatedValue()) * 360.0f) - 0.099609375f, (float) (getWidth() / 2), (float) (getHeight() / 2));
                getGradient().setLocalMatrix(matrix);
            } else if (i == 2) {
                paint = this.A04;
                paint.setShader((Shader) null);
                paint.setColor(this.A06);
            } else {
                throw C18180wK.A0a(AnonymousClass00U.A0J("Invalid SpinnerState ", i));
            }
            RectF rectF = this.A05;
            float f = this.A03;
            rectF.set(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f);
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public SpinningGradientBorder(Context context) {
        this(context, (AttributeSet) null);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
