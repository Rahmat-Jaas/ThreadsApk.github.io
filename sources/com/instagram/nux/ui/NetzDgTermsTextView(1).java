package com.instagram.nux.ui;

import X.C10300i6;
import X.C18200wM;
import X.C62503a9;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class NetzDgTermsTextView extends TextView {
    public final void A00(C10300i6 r2) {
        if (!C62503a9.A02()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setClickable(true);
        setOnClickListener(C18200wM.A0R(r2, this, 156));
    }

    public NetzDgTermsTextView(Context context) {
        super(context);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NetzDgTermsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
