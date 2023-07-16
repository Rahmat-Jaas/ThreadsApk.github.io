package com.instagram.business.ui;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C18200wM;
import X.C29934Fwk;
import X.C67353zP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxLListenerShape126S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.spinner.RefreshSpinner;

public class BusinessNavBar extends LinearLayout {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TitleTextView A03;
    public CharSequence A04;
    public View A05;
    public TextView A06;
    public TextView A07;
    public RefreshSpinner A08;
    public boolean A09;

    public BusinessNavBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void A00() {
        View view = this.A05;
        if (view != null) {
            boolean z = true;
            int i = 0;
            boolean A1T = AnonymousClass0wJ.A1T(this.A03.getVisibility(), 8);
            if (this.A02.getVisibility() != 8) {
                z = false;
            }
            if (!A1T || !z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setFooterTerms(CharSequence charSequence) {
        this.A06.setText(charSequence);
    }

    public void setPrimaryButtonEnabled(boolean z) {
        this.A07.setEnabled(z);
        View view = this.A01;
        if (view.getBackground() != null) {
            Drawable background = view.getBackground();
            int i = 64;
            if (z) {
                i = 255;
            }
            background.setAlpha(i);
        }
    }

    public void setPrimaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setSecondaryButtonEnabled(boolean z) {
        TitleTextView titleTextView = this.A03;
        titleTextView.setEnabled(z);
        float f = 64.0f;
        if (z) {
            f = 255.0f;
        }
        titleTextView.setAlpha(f);
    }

    public void setSecondaryButtonOnclickListeners(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setSecondaryButtonText(int i) {
        C18200wM.A17(getResources(), this.A03, i);
    }

    public void setShowProgressBarOnPrimaryButton(boolean z) {
        CharSequence charSequence;
        if (this.A09 != z) {
            this.A09 = z;
            RefreshSpinner refreshSpinner = this.A08;
            int i = 4;
            if (z) {
                i = 0;
            }
            refreshSpinner.setVisibility(i);
            TextView textView = this.A07;
            if (z) {
                charSequence = "";
            } else {
                charSequence = this.A04;
            }
            textView.setText(charSequence);
            setPrimaryButtonEnabled(!z);
        }
    }

    public final void A01(View view) {
        getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape126S0200000_1_I2(0, view, this));
    }

    public void setPrimaryButtonText(int i) {
        setPrimaryButtonText((CharSequence) getResources().getString(i));
    }

    public BusinessNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.business_nav_bar, this);
        this.A01 = inflate.requireViewById(R.id.primary_button_container);
        this.A07 = AnonymousClass0wJ.A0L(inflate, R.id.primary_button_text);
        this.A08 = (RefreshSpinner) inflate.requireViewById(R.id.primary_button_progress);
        this.A03 = (TitleTextView) inflate.requireViewById(R.id.secondary_button);
        this.A02 = (LinearLayout) inflate.requireViewById(R.id.business_fb_page_footer);
        this.A06 = AnonymousClass0wJ.A0L(inflate, R.id.business_fb_page_footer_text);
        this.A00 = inflate.requireViewById(R.id.divider_line);
        this.A05 = inflate.requireViewById(R.id.bb_extra_padding);
        this.A04 = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C29934Fwk.A0C);
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                setPrimaryButtonText((CharSequence) context.getString(resourceId2));
            }
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                setSecondaryButtonText((CharSequence) context.getString(resourceId));
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A03.setVisibility(0);
            }
            if (obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.getBoolean(3, false)) {
                this.A02.setVisibility(0);
            }
            A00();
            obtainStyledAttributes.recycle();
        }
    }

    public void setFooterTerms(C10300i6 r7, String str, String str2) {
        C67353zP.A05(getContext(), this.A06, r7, str, str2, "https://www.facebook.com/page_guidelines.php");
    }

    public void setPrimaryButtonText(CharSequence charSequence) {
        this.A04 = charSequence;
        this.A07.setText(charSequence);
    }

    public void setSecondaryButtonText(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public void setFooterTerms(C10300i6 r7, String str, String str2, String str3) {
        C67353zP.A05(getContext(), this.A06, r7, str, str2, str3);
    }
}
