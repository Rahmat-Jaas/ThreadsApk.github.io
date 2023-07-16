package com.instagram.ui.animation.pushlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class PushFastScrollListContainerFrameLayout extends FrameLayout {
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / ((float) width);
        }
        return x;
    }

    public void setXFraction(float f) {
        float f2;
        int width = getWidth();
        if (width > 0) {
            f2 = f * ((float) width);
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PushFastScrollListContainerFrameLayout(Context context) {
        super(context);
    }

    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
