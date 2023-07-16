package com.instagram.ui.widget.selectableview;

import X.AnonymousClass0wJ;
import X.C11630kW;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C18250wR;
import X.C25757DrU;
import X.C25812DsR;
import X.C29934Fwk;
import X.C63393hP;
import X.C86104wH;
import X.C86134wK;
import X.C90785f3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;

public class RoundedCornerCheckMarkSelectableImageView extends FrameLayout {
    public static final C25757DrU A07 = C25757DrU.A01(250.0d, 16.0d);
    public static final C25757DrU A08 = C25757DrU.A01(40.0d, 9.0d);
    public ImageView A00;
    public boolean A01 = false;
    public int A02;
    public ImageView A03;
    public C25812DsR A04;
    public RoundedCornerMediaFrameLayout A05;
    public final List A06;

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1x);
        if (!obtainStyledAttributes.hasValue(2) || !obtainStyledAttributes.hasValue(1)) {
            throw C18250wR.A0V("Width and height required");
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context2).inflate(R.layout.rounded_corner_check_mark_selectable_image_view, this, false);
        this.A05 = roundedCornerMediaFrameLayout;
        if (dimensionPixelSize != 0) {
            roundedCornerMediaFrameLayout.getLayoutParams().width = dimensionPixelSize;
            this.A05.getLayoutParams().height = dimensionPixelSize2;
        }
        this.A05.setRadius(this.A02);
        this.A06.add(this.A05.findViewById(R.id.selectable_image));
        ImageView A0J = C18200wM.A0J(this.A05, R.id.select_check_mark);
        this.A00 = A0J;
        C63393hP.A04(context2, A0J, R.color.design_dark_default_color_on_background);
        this.A03 = C18200wM.A0J(this.A05, R.id.type_icon);
        addView(this.A05);
    }

    public final void A02() {
        List list = this.A06;
        ((ImageView) list.get(0)).setImageDrawable((Drawable) null);
        ((View) list.get(0)).setBackgroundResource(C86104wH.A0G(getContext(), R.attr.elevatedImagePlaceholderColor).resourceId);
    }

    public int getDisabledAlpha() {
        return 0;
    }

    public List getImageViews() {
        return this.A06;
    }

    public ImageView getOverlayImage() {
        return this.A00;
    }

    public void setImageDrawable(Drawable drawable) {
        ((ImageView) C18240wQ.A0b(this.A06)).setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        ColorFilter colorFilter;
        for (ImageView imageView : this.A06) {
            if (z) {
                colorFilter = getColorFilter();
            } else {
                colorFilter = null;
            }
            imageView.setColorFilter(colorFilter);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            imageView2.setVisibility(C18190wL.A00(z ? 1 : 0));
        }
        invalidate();
        requestLayout();
    }

    public void setTypeIconDrawable(Drawable drawable) {
        ImageView imageView;
        int i;
        if (drawable != null) {
            this.A03.setImageDrawable(drawable);
            imageView = this.A03;
            i = 0;
        } else {
            imageView = this.A03;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setUrl(ImageUrl imageUrl, C11630kW r3) {
        ((IgImageView) C18240wQ.A0b(this.A06)).setUrl(imageUrl, r3);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A06 = AnonymousClass0wJ.A0v();
        A01(context, attributeSet);
    }

    private void A00() {
        C25812DsR A0O = C86134wK.A0O();
        A0O.A00 = 0.01d;
        A0O.A0E(new C90785f3(this));
        this.A04 = A0O;
    }

    public ColorFilter getColorFilter() {
        return C63393hP.A01(getContext(), R.color.black_60_transparent);
    }

    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A01) {
            C25812DsR dsR = this.A04;
            if (z) {
                dsR.A0D(A07);
                d = 1.0d;
            } else {
                dsR.A0D(A08);
                d = 0.0d;
            }
            dsR.A0A(d);
        }
    }

    public void setAnimatePress(boolean z) {
        this.A01 = z;
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context) {
        super(context);
        A00();
        this.A06 = AnonymousClass0wJ.A0v();
        A01(context, (AttributeSet) null);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A06 = AnonymousClass0wJ.A0v();
        A01(context, attributeSet);
    }
}
