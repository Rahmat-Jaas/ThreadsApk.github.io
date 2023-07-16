package com.instagram.ui.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class AspectRatioLinearLayout extends LinearLayout {
    public float A00 = 1.0f;

    public void setAspectRatio(float f) {
        this.A00 = f;
        requestLayout();
    }

    public AspectRatioLinearLayout(Context context) {
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.A00;
        if (f > 1.0f) {
            measuredHeight = (int) (((float) measuredWidth) / f);
        } else {
            measuredWidth = (int) (((float) measuredHeight) * f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
