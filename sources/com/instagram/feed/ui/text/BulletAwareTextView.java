package com.instagram.feed.ui.text;

import X.C14030oh;
import X.C18230wP;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;

public class BulletAwareTextView extends TextView {
    public int A00;
    public boolean A01 = false;
    public final float A02 = TypedValue.applyDimension(1, 0.5f, C18230wP.A0E(getContext()));

    private void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A0B);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            setLineSpacing((float) this.A00, 1.0f);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!this.A01) {
            this.A01 = true;
            i4 += this.A00;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet);
    }

    private void A00() {
        Drawable drawable;
        if (getText() instanceof Spannable) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) ((Spannable) getText()).getSpans(0, 1, ImageSpan.class);
            if (imageSpanArr.length != 0 && (drawable = imageSpanArr[0].getDrawable()) != null) {
                Rect bounds = drawable.getBounds();
                drawable.setBounds(bounds.left, 0, bounds.right, drawable.getIntrinsicHeight() + getOffset());
            }
        }
    }

    private int getOffset() {
        float f;
        if (getLineCount() == 1) {
            return 0;
        }
        float f2 = (float) this.A00;
        if (getLineCount() > 1) {
            f = this.A02;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return (int) (f2 - f);
    }

    public final void onMeasure(int i, int i2) {
        int A06 = C14030oh.A06(24093417);
        super.onMeasure(i, i2);
        A00();
        C14030oh.A0D(-1612750587, A06);
    }

    public void setSpacingAdd(int i) {
        int paddingBottom = getPaddingBottom();
        if (this.A01) {
            paddingBottom -= this.A00;
            this.A01 = false;
        }
        this.A00 = i;
        setLineSpacing((float) i, 1.0f);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), paddingBottom);
        A00();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (getLineCount() != 0) {
            A00();
        }
    }

    public BulletAwareTextView(Context context) {
        super(context);
    }

    public BulletAwareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet);
    }
}
