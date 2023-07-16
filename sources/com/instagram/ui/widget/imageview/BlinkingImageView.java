package com.instagram.ui.widget.imageview;

import X.C14030oh;
import X.C18240wQ;
import X.C86164wN;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BlinkingImageView extends ImageView implements ValueAnimator.AnimatorUpdateListener {
    public boolean A00;
    public final ValueAnimator A01;

    public void setBlinking(boolean z) {
        this.A00 = z;
        ValueAnimator valueAnimator = this.A01;
        if (!z) {
            valueAnimator.cancel();
            setImageAlpha(255);
        } else if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.2f}).setDuration(800);
        this.A01 = duration;
        duration.addUpdateListener(this);
        duration.setRepeatMode(2);
        duration.setRepeatCount(-1);
        C86164wN.A15(duration);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        setImageAlpha(Math.round(C18240wQ.A00(valueAnimator.getAnimatedValue()) * 255.0f));
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(1087184377);
        super.onAttachedToWindow();
        if (this.A00) {
            ValueAnimator valueAnimator = this.A01;
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
        }
        C14030oh.A0D(355755839, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(1067989183);
        this.A01.cancel();
        super.onDetachedFromWindow();
        C14030oh.A0D(-1428712358, A06);
    }

    public BlinkingImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
