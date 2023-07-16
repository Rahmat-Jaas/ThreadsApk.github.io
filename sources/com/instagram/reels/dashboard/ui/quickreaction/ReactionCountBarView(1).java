package com.instagram.reels.dashboard.ui.quickreaction;

import X.C04220Ms;
import X.C29934Fwk;
import X.C86134wK;
import X.C86144wL;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

public final class ReactionCountBarView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final Paint A06 = C86144wL.A0F();
    public final Path A07 = C86144wL.A0G();
    public final RectF A08 = C86134wK.A0E();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionCountBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        Paint paint = this.A06;
        paint.setAntiAlias(true);
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(R.attr.backgroundColorPrimary, typedValue, true);
        int i = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(R.attr.backgroundColorPrimary, typedValue2, true);
        int i2 = typedValue2.data;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A1p);
            C04220Ms.A06(obtainStyledAttributes);
            this.A01 = obtainStyledAttributes.getColor(0, i);
            this.A03 = obtainStyledAttributes.getColor(2, i2);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A00 = obtainStyledAttributes.getFloat(3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            obtainStyledAttributes.recycle();
        } else {
            this.A01 = i;
            this.A03 = i2;
            this.A02 = 0;
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        paint.setColor(this.A03);
    }

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Path path = this.A07;
        RectF rectF = this.A08;
        float f = (float) this.A02;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        canvas.clipPath(path);
        canvas.drawColor(this.A01);
        canvas.save();
        float f2 = ((float) this.A04) * (((float) 1) - this.A00);
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2);
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A05, ((float) this.A04) - f2, this.A06);
        canvas.restore();
    }

    public final void setFillPercentage(float f) {
        this.A00 = f;
        postInvalidate();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A05 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A04 = size;
        RectF rectF = this.A08;
        rectF.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = (float) this.A05;
        rectF.bottom = (float) size;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionCountBarView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }
}
