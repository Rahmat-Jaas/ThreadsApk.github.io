package com.fbpay.hub.common.view;

import X.AnonymousClass7Kz;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;

public class HubProgressBar extends FrameLayout {
    public HubProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7Kz.A0K();
        inflate(context, R.layout.hub_spinner, this);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (getChildCount() > 0) {
            getChildAt(0).setBackground(drawable);
        }
    }

    public HubProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public HubProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
