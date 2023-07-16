package com.instagram.ui.widget.selectableview;

import X.AnonymousClass4xO;
import X.AnonymousClass51Y;
import X.C11630kW;
import X.C18200wM;
import X.C29934Fwk;
import X.C63393hP;
import X.C86134wK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class SingleSelectableAvatar extends AnonymousClass51Y {
    public ImageView A00;
    public CircularImageView A01;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A28);
        int i = 0;
        if (obtainStyledAttributes.hasValue(0)) {
            i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_single, this, true);
        this.A01 = (CircularImageView) inflate.requireViewById(R.id.selectable_avatar);
        ImageView A0J = C18200wM.A0J(inflate, R.id.select_check_mark);
        this.A00 = A0J;
        C63393hP.A04(context2, A0J, R.color.design_dark_default_color_on_background);
        if (i != 0) {
            this.A01.getLayoutParams().width = i;
            this.A01.getLayoutParams().height = i;
        }
    }

    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        CircularImageView circularImageView = this.A01;
        if (z) {
            C63393hP.A04(getContext(), circularImageView, R.color.black_60_transparent);
            imageView = this.A00;
            i = 0;
        } else {
            circularImageView.setColorFilter((ColorFilter) null);
            imageView = this.A00;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setImageDrawable(Drawable drawable) {
        this.A01.setImageDrawable(drawable);
    }

    public void setUrl(ImageUrl imageUrl, C11630kW r3) {
        this.A01.setUrl(imageUrl, r3);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.setAlpha(255);
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new AnonymousClass4xO(C86134wK.A07(context), context.getColor(R.color.blue_5));
    }

    public SingleSelectableAvatar(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
