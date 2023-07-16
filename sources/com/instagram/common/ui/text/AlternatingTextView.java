package com.instagram.common.ui.text;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C29934Fwk;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ca.psiphon.PsiphonTunnel;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public class AlternatingTextView extends IgTextView {
    public ValueAnimator A00;
    public List A01;

    private int getMeasuredTextWidth() {
        measure(0, 0);
        return getMeasuredWidth();
    }

    public int getCurrentTextIndex() {
        return 0;
    }

    public AlternatingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = AnonymousClass0wJ.A0v();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A01);
        obtainStyledAttributes.getInt(1, PsiphonTunnel.VPN_INTERFACE_MTU);
        obtainStyledAttributes.getInt(2, 3000);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.A00 = new ValueAnimator();
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(1296699796);
        super.onAttachedToWindow();
        C14030oh.A0D(-2028254052, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(-1125503557);
        this.A00.pause();
        super.onDetachedFromWindow();
        C14030oh.A0D(1627886878, A06);
    }

    public AlternatingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AlternatingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
