package com.instagram.common.ui.base;

import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class IgCheckBox extends CheckBox {
    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0y);
        boolean A1V = C18200wM.A1V(context, obtainStyledAttributes, this);
        C18210wN.A0q(context, obtainStyledAttributes, this, A1V ? 1 : 0);
        C18200wM.A13(context, obtainStyledAttributes, this, A1V);
        C18240wQ.A0q(context, obtainStyledAttributes, this, A1V);
        obtainStyledAttributes.recycle();
    }

    public IgCheckBox(Context context) {
        super(context);
    }

    public IgCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public IgCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    public IgCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
