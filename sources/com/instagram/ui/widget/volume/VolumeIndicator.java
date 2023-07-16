package com.instagram.ui.widget.volume;

import X.C14030oh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class VolumeIndicator extends ProgressBar {
    public Runnable A00;

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(-582349776);
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.A00 = null;
        super.onDetachedFromWindow();
        C14030oh.A0D(614533106, A06);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VolumeIndicator(Context context) {
        super(context);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
