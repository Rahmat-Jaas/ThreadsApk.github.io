package com.instagram.zero.cms;

import X.AnonymousClass2LX;
import X.C29934Fwk;
import X.C83944sF;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class ZeroCmsTextView extends TextView {
    public C83944sF A00;
    public String A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A2M);
        this.A01 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 1);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setText(context.getText(resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    public void setText(String str, String str2) {
        this.A01 = str;
        C83944sF r0 = this.A00;
        if (r0 != null) {
            str2 = r0.getString(str, str2);
        }
        setText(str2);
        setContentDescription(str2);
    }

    public ZeroCmsTextView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ZeroCmsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
