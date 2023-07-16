package com.instagram.ui.widget.inlineerror;

import X.AnonymousClass2LX;
import X.AnonymousClass7Ko;
import X.C14030oh;
import X.C18180wK;
import X.C29934Fwk;
import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxDListenerShape451S0100000_1_I2;
import com.instagram.barcelona.R;

public class InlineErrorMessageView extends LinearLayout {
    public static final TimeInterpolator A09 = new DecelerateInterpolator();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public TextView A06;
    public String A07;
    public boolean A08;

    private void A02(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1V);
            this.A03 = obtainStyledAttributes.getResourceId(0, 0);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            this.A07 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 3);
            Context context2 = getContext();
            this.A02 = obtainStyledAttributes.getColor(4, context2.getColor(R.color.igds_secondary_text));
            this.A01 = obtainStyledAttributes.getColor(2, context2.getColor(R.color.igds_error_or_destructive));
            obtainStyledAttributes.recycle();
        }
    }

    private void A00() {
        if (this.A06 == null) {
            this.A06 = (TextView) C18180wK.A0C(this).inflate(R.layout.inline_error_text_view, this, false);
            boolean z = false;
            View childAt = getChildAt(0);
            if (childAt != null) {
                z = true;
            }
            AnonymousClass7Ko.A0E(z, "InlineErrorMessageView has no children; it has to wrap at least one view.");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A06.getLayoutParams();
            marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
            addView(this.A06);
        }
    }

    private void A01() {
        if (this.A07 != null && !this.A08) {
            A00();
            this.A06.setVisibility(0);
            this.A06.setText(this.A07);
            this.A06.setTextColor(this.A02);
        }
    }

    public final void A04() {
        View view;
        TextView textView = this.A06;
        if (textView != null) {
            boolean z = this.A08;
            this.A08 = false;
            textView.setVisibility(8);
            if (z && (view = this.A05) != null) {
                view.setBackgroundDrawable(this.A04);
                Drawable drawable = this.A04;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0.getVisibility() != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0062
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0062
            boolean r4 = r5.A08
            android.widget.TextView r0 = r5.A06
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x001b
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            r5.A08 = r1
            r5.A00()
            android.widget.TextView r0 = r5.A06
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.A06
            r0.setText(r6)
            android.widget.TextView r1 = r5.A06
            int r0 = r5.A01
            r1.setTextColor(r0)
            if (r4 != 0) goto L_0x003f
            android.view.View r1 = r5.A05
            if (r1 == 0) goto L_0x003f
            int r0 = r5.A00
            if (r0 == 0) goto L_0x003f
            r1.setBackgroundResource(r0)
        L_0x003f:
            if (r2 != 0) goto L_0x0062
            android.widget.TextView r1 = r5.A06
            r0 = 0
            r1.setAlpha(r0)
            android.widget.TextView r0 = r5.A06
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            android.animation.TimeInterpolator r0 = A09
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r0.start()
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A05(java.lang.String):void");
    }

    public void setHint(String str) {
        this.A07 = str;
        A01();
    }

    public InlineErrorMessageView(Context context) {
        super(context);
        setOrientation(1);
    }

    public static void A03(ViewGroup viewGroup) {
        viewGroup.getClass();
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
            viewGroup.setLayoutTransition(layoutTransition);
        }
        layoutTransition.enableTransitionType(4);
        viewGroup.setClipChildren(false);
    }

    public final void onFinishInflate() {
        int A062 = C14030oh.A06(883834395);
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape451S0100000_1_I2(this, 3));
        A01();
        C14030oh.A0D(-1027431541, A062);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }
}
