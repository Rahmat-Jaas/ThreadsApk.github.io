package com.facebook.smartcapture.ui;

import X.C04220Ms;
import X.C29934Fwk;
import X.LCH;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class SCImageView extends ImageView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1z, i, 0);
            C04220Ms.A06(obtainStyledAttributes);
            try {
                setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            try {
                setImageDrawable(LCH.A01(getContext().getTheme(), getResources(), i));
            } catch (Exception unused) {
                super.setImageResource(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet, 0);
    }
}
