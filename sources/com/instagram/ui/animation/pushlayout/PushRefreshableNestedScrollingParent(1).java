package com.instagram.ui.animation.pushlayout;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

public class PushRefreshableNestedScrollingParent extends RefreshableNestedScrollingParent {
    public float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / ((float) width);
        }
        return x;
    }

    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PushRefreshableNestedScrollingParent(Context context) {
        super(context);
    }

    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
