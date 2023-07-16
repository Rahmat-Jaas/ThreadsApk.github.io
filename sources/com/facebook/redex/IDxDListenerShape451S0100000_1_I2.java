package com.facebook.redex;

import X.AnonymousClass7Ko;
import X.C09860go;
import X.C24701jr;
import X.C34640IcN;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

public class IDxDListenerShape451S0100000_1_I2 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape451S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onPreDraw() {
        BaseFragmentActivity baseFragmentActivity;
        String str;
        switch (this.A01) {
            case 0:
                C34640IcN icN = (C34640IcN) this.A00;
                View view = icN.mView;
                if (view == null) {
                    return true;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!icN.isAdded()) {
                    return false;
                }
                Activity rootActivity = icN.getRootActivity();
                if (!(rootActivity instanceof BaseFragmentActivity) || (baseFragmentActivity = (BaseFragmentActivity) rootActivity) == null) {
                    return true;
                }
                baseFragmentActivity.A09();
                baseFragmentActivity.A0C();
                return false;
            case 1:
                ViewGroup viewGroup = ((C24701jr) this.A00).A05;
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                InlineErrorMessageView.A03(viewGroup);
                break;
            case 2:
                View view2 = (View) this.A00;
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (view2.getParent() instanceof ViewGroup) {
                    View view3 = (View) view2.getParent();
                    int dimensionPixelOffset = view2.getResources().getDimensionPixelOffset(R.dimen.abc_star_medium);
                    int bottom = ((view3.getBottom() - view2.getBottom()) - view3.getPaddingBottom()) >> 1;
                    int max = Math.max(dimensionPixelOffset, view2.getPaddingBottom() + bottom);
                    int max2 = Math.max(dimensionPixelOffset, view2.getPaddingTop() + bottom);
                    if (!(view2.getPaddingBottom() == max && view2.getPaddingTop() == max2)) {
                        C09860go.A0V(view2, max2);
                        C09860go.A0Q(view2, max);
                        return false;
                    }
                }
                break;
            default:
                InlineErrorMessageView inlineErrorMessageView = (InlineErrorMessageView) this.A00;
                int i = inlineErrorMessageView.A00;
                boolean z = true;
                int i2 = inlineErrorMessageView.A03;
                if (i == 0) {
                    if (i2 != 0) {
                        z = false;
                    }
                    AnonymousClass7Ko.A0E(z, "Descendant view was provided without specifying the error background");
                } else {
                    if (i2 == 0) {
                        View childAt = inlineErrorMessageView.getChildAt(0);
                        inlineErrorMessageView.A05 = childAt;
                        if (childAt == null) {
                            z = false;
                        }
                        str = "Error background was provided but no child view exists to apply it to";
                    } else {
                        View findViewById = inlineErrorMessageView.findViewById(i2);
                        inlineErrorMessageView.A05 = findViewById;
                        if (findViewById == null) {
                            z = false;
                        }
                        str = "Descendant view (to apply error background to) wasn't found by provided id";
                    }
                    AnonymousClass7Ko.A0E(z, str);
                    inlineErrorMessageView.A04 = inlineErrorMessageView.A05.getBackground();
                }
                inlineErrorMessageView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return true;
    }
}
