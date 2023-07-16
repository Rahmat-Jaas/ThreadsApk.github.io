package com.instagram.common.ui.widget.framelayout;

import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FixedAspectRatioFrameLayout extends FrameLayout {
    public float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A00 = 1.0f;
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        float f = this.A00;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                float f2 = (float) size;
                if (f2 < ((float) size2) / f) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), 1073741824);
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    super.onMeasure(makeMeasureSpec2, makeMeasureSpec);
                    return;
                }
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) size2) / f), 1073741824);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            super.onMeasure(makeMeasureSpec2, makeMeasureSpec);
            return;
        }
        throw new IllegalStateException();
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
