package com.facebookpay.form.view;

import X.AnonymousClass0ZU;
import X.AnonymousClass58J;
import X.AnonymousClass6B4;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kr;
import X.AnonymousClass7Kz;
import X.AnonymousClass7S2;
import X.C04220Ms;
import X.C128237jC;
import X.C128957ke;
import X.C14030oh;
import X.C142178e5;
import X.C18180wK;
import X.C86104wH;
import X.L7E;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.autofill.AutofillValue;
import android.widget.AdapterView;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

public final class BaseAutoCompleteTextView extends L7E {
    public C142178e5 A00;
    public Integer A01;
    public AnonymousClass0ZU A02;
    public AnonymousClass0ZU A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A00();
    }

    public final boolean enoughToFilter() {
        return true;
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public int getAutofillType() {
        Integer num = this.A01;
        if (num != null) {
            return num.intValue();
        }
        return super.getAutofillType();
    }

    public final AnonymousClass0ZU getOnAutofillListener() {
        return this.A02;
    }

    public final AnonymousClass0ZU getOnAutofillPromptListener() {
        return this.A03;
    }

    public final C142178e5 getOnShowListener() {
        return this.A00;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener(new AnonymousClass7S2(onItemClickListener));
    }

    private final void A00() {
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        AnonymousClass7Kz.A0G();
        int color = context.getColor(R.color.igds_elevated_background);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(color);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(color);
        }
        setDropDownBackgroundDrawable(drawable);
    }

    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        AnonymousClass0ZU r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        LoggingContext loggingContext;
        AnonymousClass6B4 r4;
        C128957ke r1;
        AnonymousClass58J r0;
        int A06 = C14030oh.A06(26264688);
        super.onFocusChanged(z, i, rect);
        if (z && getAdapter() != null) {
            performFiltering(getText(), 0);
            if (getAdapter() != null && !isPopupShowing() && hasFocus() && getAdapter().getCount() > 0) {
                C142178e5 r42 = this.A00;
                if (r42 != null) {
                    C128237jC r43 = (C128237jC) r42;
                    int i2 = r43.A00;
                    if (i2 == 0 || i2 == 1) {
                        r1 = AnonymousClass7JJ.A00();
                        r0 = r43.A01;
                        loggingContext = r0.A02;
                        if (loggingContext != null) {
                            r4 = AnonymousClass6B4.CONTACT_INFO;
                        }
                        C04220Ms.A0E("loggingContext");
                        throw null;
                    } else if (i2 == 2 || i2 == 5) {
                        r1 = AnonymousClass7JJ.A00();
                        r0 = r43.A01;
                        loggingContext = r0.A02;
                        if (loggingContext != null) {
                            r4 = AnonymousClass6B4.SHIPPING_ADDRESS;
                        }
                        C04220Ms.A0E("loggingContext");
                        throw null;
                    }
                    LinkedHashMap A07 = AnonymousClass7Kr.A07(r0.A0S);
                    C04220Ms.A0B(r4, 2);
                    C128957ke.A04(C18180wK.A0I(C86104wH.A0K(r1.A00, "client_load_ecpautofill_display"), 272), loggingContext, new KtLambdaShape3S1300000_I2((Object) r4, (Object) A07, (Object) loggingContext, "nux_checkout", 14));
                }
                showDropDown();
            }
        }
        C14030oh.A0D(-677820535, A06);
    }

    public final void setAutofillType(Integer num) {
        this.A01 = num;
    }

    public final void setOnAutofillListener(AnonymousClass0ZU r1) {
        this.A02 = r1;
    }

    public final void setOnAutofillPromptListener(AnonymousClass0ZU r1) {
        this.A03 = r1;
    }

    public final void setOnShowListener(C142178e5 r1) {
        this.A00 = r1;
    }

    public final void setParentAnchorId(int i) {
        setDropDownAnchor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context) {
        super(context, (AttributeSet) null, R.attr.autoCompleteTextViewStyle);
        C04220Ms.A0B(context, 1);
        A00();
    }

    /* renamed from: getAutofillType  reason: collision with other method in class */
    public final Integer m20getAutofillType() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C04220Ms.A0B(context, 1);
        A00();
    }
}
