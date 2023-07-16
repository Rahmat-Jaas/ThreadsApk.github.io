package com.instagram.ui.widget.spinner;

import X.C121907Is;
import X.C29934Fwk;
import X.C63393hP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.barcelona.R;

public class RefreshSpinner extends SpinnerImageView {
    public RefreshSpinner(Context context) {
        super(context);
        setImageResource(R.drawable.nav_spinner);
    }

    public void setDark(boolean z) {
        ColorFilter colorFilter;
        Drawable mutate = getDrawable().mutate();
        if (z) {
            colorFilter = C63393hP.A00(C121907Is.A00(getContext(), R.attr.glyphColorPrimary));
        } else {
            colorFilter = null;
        }
        mutate.setColorFilter(colorFilter);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageResource(R.drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A1r);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageResource(R.drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A1r);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }
}
