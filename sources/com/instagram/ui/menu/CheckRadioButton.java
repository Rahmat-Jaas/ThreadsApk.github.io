package com.instagram.ui.menu;

import X.C18180wK;
import X.C63393hP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgRadioButton;

public class CheckRadioButton extends IgRadioButton {
    public Drawable A00;

    public CheckRadioButton(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
        this.A00 = drawable;
        C63393hP.A03(context, drawable.mutate(), R.color.blue_5);
        setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
    }

    public void setChecked(boolean z) {
        Drawable drawable;
        super.setChecked(z);
        Context context = getContext();
        int i = R.color.igds_primary_text;
        if (z) {
            i = R.color.blue_5;
        }
        C18180wK.A0s(context, this, i);
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable2 = compoundDrawables[0];
        Drawable drawable3 = compoundDrawables[1];
        if (z) {
            drawable = this.A00;
        } else {
            drawable = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable, compoundDrawables[3]);
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public CheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
