package com.fbpay.w3c.views;

import X.C04220Ms;
import X.C117036y1;
import X.C86104wH;
import X.C86144wL;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.barcelona.R;

public final class AutofillTextInputLayout extends TextInputLayout {
    public Drawable A00;
    public Drawable A01;
    public CharSequence A02;
    public View.OnClickListener A03;
    public final ColorStateList A04;
    public final ColorStateList A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A06 = i;
        setErrorEnabled(false);
        CharSequence hint = getHint();
        if (hint == null) {
            EditText editText = this.A0F;
            if (editText != null) {
                hint = editText.getHint();
            } else {
                hint = null;
            }
        }
        this.A02 = hint;
        this.A05 = this.A0C;
        Context context2 = getContext();
        this.A04 = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{C86104wH.A0G(context2, R.attr.w3c_bottom_sheet_error_text_color).data, C86104wH.A0G(context2, R.attr.w3c_bottom_sheet_error_text_color).data});
        this.A00 = context2.getDrawable(R.drawable.instagram_activity_error_badge);
        C117036y1.A00().A01.getValue();
    }

    public final int getDefStyleAttr() {
        return this.A06;
    }

    public final View.OnClickListener getInitCardScanner() {
        return this.A03;
    }

    public final void A0U(String str) {
        CharSequence hint = getHint();
        if (str == null) {
            CharSequence charSequence = this.A02;
            if (C86144wL.A1X(hint, charSequence)) {
                setHint(charSequence);
                setDefaultHintTextColor(this.A05);
                if (C04220Ms.A0I(this.A1D.getDrawable(), this.A00)) {
                    setEndIconDrawable(this.A01);
                }
            }
        } else if (!C04220Ms.A0I(hint, str)) {
            setDefaultHintTextColor(this.A04);
            Drawable drawable = this.A1D.getDrawable();
            if (drawable != null) {
                this.A01 = drawable;
            }
            setEndIconDrawable(this.A00);
            setHint((CharSequence) str);
        }
    }

    public final void setInitCardScanner(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutofillTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
