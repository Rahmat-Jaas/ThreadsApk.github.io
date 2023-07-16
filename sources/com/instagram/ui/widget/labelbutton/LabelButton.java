package com.instagram.ui.widget.labelbutton;

import X.AnonymousClass0wJ;
import X.AnonymousClass2LX;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LabelButton extends IgLinearLayout {
    public final IgSimpleImageView A00;
    public final IgTextView A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setLabelText(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.A01.setVisibility(8);
            return;
        }
        IgTextView igTextView = this.A01;
        igTextView.setText(charSequence);
        igTextView.setVisibility(0);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.A00.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        this.A00.setImageResource(i);
    }

    public final void setImageTintList(ColorStateList colorStateList) {
        this.A00.setImageTintList(colorStateList);
    }

    public final void setSize(int i) {
        this.A00.setLayoutParams(new LinearLayout.LayoutParams(i, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        setOrientation(1);
        setGravity(1);
        View.inflate(context, R.layout.layout_label_button, this);
        this.A00 = (IgSimpleImageView) AnonymousClass0wJ.A0I(this, R.id.label_button_icon);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0I(this, R.id.label_button_text);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1b, i, 0);
            C04220Ms.A06(obtainStyledAttributes);
            setLabelText((CharSequence) AnonymousClass2LX.A00(context, obtainStyledAttributes, 1));
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setImageResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setLabelText(int i) {
        setLabelText((CharSequence) getContext().getString(i));
    }

    public /* synthetic */ LabelButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LabelButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
