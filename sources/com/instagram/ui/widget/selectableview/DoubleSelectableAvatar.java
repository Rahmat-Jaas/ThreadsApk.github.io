package com.instagram.ui.widget.selectableview;

import X.AnonymousClass51Y;
import X.C18200wM;
import X.C29934Fwk;
import X.C63393hP;
import X.C86124wJ;
import X.C86134wK;
import X.C86344xU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class DoubleSelectableAvatar extends AnonymousClass51Y {
    public int A00;
    public ImageView A01;
    public CircularImageView A02;
    public CircularImageView A03;

    private void A00(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0Q);
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
        this.A00 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            z = obtainStyledAttributes.getBoolean(1, true);
        } else {
            z = true;
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_double, this, true);
        this.A03 = (CircularImageView) inflate.requireViewById(R.id.selectable_avatar_front);
        this.A02 = (CircularImageView) inflate.requireViewById(R.id.selectable_avatar_back);
        ImageView A0J = C18200wM.A0J(inflate, R.id.select_check_mark);
        this.A01 = A0J;
        C63393hP.A04(context2, A0J, R.color.design_dark_default_color_on_background);
        if (this.A00 != dimensionPixelSize) {
            this.A00 = (int) Math.floor((double) ((this.A00 * dimensionPixelSize) / context2.getResources().getDimensionPixelSize(R.dimen.alt_text_input_min_height)));
            this.A03.getLayoutParams().width = this.A00;
            this.A03.getLayoutParams().height = this.A00;
            this.A02.getLayoutParams().width = this.A00;
            this.A02.getLayoutParams().height = this.A00;
            View requireViewById = inflate.requireViewById(R.id.selectable_avatar_front_container);
            int floor = (int) Math.floor((double) ((((int) TypedValue.applyDimension(1, (float) 10, getResources().getDisplayMetrics())) * this.A00) / dimensionPixelSize));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(requireViewById.getLayoutParams());
            marginLayoutParams.setMargins(floor, floor, 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 0;
            requireViewById.setLayoutParams(layoutParams);
            View requireViewById2 = inflate.requireViewById(R.id.selectable_avatar_front_background);
            int A07 = this.A00 + (C86134wK.A07(context2) << 1);
            requireViewById2.getLayoutParams().width = A07;
            requireViewById2.getLayoutParams().height = A07;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A02.getLayoutParams();
        if (z) {
            int A072 = C86134wK.A07(context2);
            marginLayoutParams2.setMargins(A072, A072, 0, 0);
        } else {
            this.A05 = 0;
            marginLayoutParams2.setMargins(0, 0, 0, 0);
        }
        this.A01 = getStrokeDrawable();
    }

    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            ColorFilter A012 = C63393hP.A01(getContext(), R.color.black_60_transparent);
            this.A03.setColorFilter(A012);
            this.A02.setColorFilter(A012);
            imageView = this.A01;
            i = 0;
        } else {
            this.A03.setColorFilter((ColorFilter) null);
            this.A02.setColorFilter((ColorFilter) null);
            imageView = this.A01;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A03.setAlpha(255);
        this.A02.setAlpha(255);
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new C86344xU(C86134wK.A07(context), context.getColor(R.color.blue_5), this.A00, C86124wJ.A08(context));
    }

    public DoubleSelectableAvatar(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
