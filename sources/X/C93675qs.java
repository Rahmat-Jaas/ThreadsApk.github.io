package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.barcelona.R;

/* renamed from: X.5qs  reason: invalid class name and case insensitive filesystem */
public class C93675qs extends TextInputLayout {
    public int A00;
    public GradientDrawable A01;
    public ImageView A02;
    public ProgressBar A03;
    public BaseAutoCompleteTextView A04;
    public int A05;
    public boolean A06 = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93675qs(Context context) {
        super(new ContextThemeWrapper(context, R.style.InputFieldContainerStyle), (AttributeSet) null, 0);
        AnonymousClass7Kz.A0K();
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.fbpay_edit_text_input_layout, this);
        this.A04 = (BaseAutoCompleteTextView) requireViewById(R.id.auto_complete_edit_text);
        this.A02 = C18200wM.A0J(this, R.id.icon);
        ProgressBar progressBar = (ProgressBar) requireViewById(R.id.spinner_icon);
        this.A03 = progressBar;
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            C86154wM.A1B(PorterDuff.Mode.MULTIPLY, indeterminateDrawable, AnonymousClass7Kz.A0G().A03(context2, 25));
        }
        this.A04.setTextAlignment(5);
        this.A04.setTextSize(0, C117006xy.A00(context2, R.attr.fbpay_input_field_text_size));
        A0X(false, false);
        setOrientation(0);
        GradientDrawable gradientDrawable = null;
        this.A04.setBackground((Drawable) null);
        this.A04.setTextColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{C86104wH.A0G(context2, R.attr.fbpay_primary_text_color).data, C86104wH.A0G(context2, R.attr.fbpay_disabled_text_color).data}));
        this.A04.setPadding(0, (int) C117006xy.A00(context2, R.attr.fbpay_input_field_text_top_padding), 0, 0);
        setBackgroundResource(C86104wH.A0G(context2, R.attr.fbpay_input_field_background).resourceId);
        this.A01 = getBackground() instanceof GradientDrawable ? (GradientDrawable) getBackground() : gradientDrawable;
        this.A00 = (int) C117006xy.A00(context2, R.attr.fbpay_input_field_border_stroke);
        A0W(AnonymousClass66H.A04, false);
        int A002 = (int) C117006xy.A00(context2, R.attr.fbpay_input_field_bottom_padding);
        int A003 = (int) C117006xy.A00(context2, R.attr.fbpay_input_field_top_padding);
        int A004 = (int) C117006xy.A00(context2, R.attr.fbpay_input_field_horizontal_padding);
        setPadding(A004, A003, A004, A002);
    }

    public void setStyle(AnonymousClass66H r2) {
        A0W(r2, true);
    }

    public final void A0V(Drawable drawable, View.OnClickListener onClickListener, Integer num) {
        this.A03.setVisibility(8);
        ImageView imageView = this.A02;
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(onClickListener);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(num.intValue());
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
    }

    public final void A0W(AnonymousClass66H r7, boolean z) {
        int i;
        int i2;
        GradientDrawable gradientDrawable = this.A01;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            GradientDrawable gradientDrawable2 = this.A01;
            if (r7 == AnonymousClass66H.A03) {
                i2 = this.A05;
            } else {
                i2 = this.A00;
            }
            gradientDrawable2.setStroke(i2, C86104wH.A0G(getContext(), r7.A00).data);
        }
        if (z) {
            Integer num = r7.A02;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = r7.A01;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 33;
                }
                A0V(AnonymousClass7Kz.A0G().A04(getContext(), intValue, i), (View.OnClickListener) null, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
                return;
            }
            this.A02.setVisibility(8);
        }
    }

    public void setShowLoadingSpinner(boolean z) {
        ProgressBar progressBar;
        int i = 8;
        if (z) {
            this.A02.setVisibility(8);
            progressBar = this.A03;
            i = 0;
        } else {
            progressBar = this.A03;
        }
        progressBar.setVisibility(i);
    }

    public final void A0U() {
        GradientDrawable gradientDrawable;
        Context context = getContext();
        setBackgroundResource(C86104wH.A0G(context, R.attr.fbpay_box_input_field_background).resourceId);
        if (getBackground() instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) getBackground();
        } else {
            gradientDrawable = null;
        }
        this.A01 = gradientDrawable;
        this.A00 = (int) C117006xy.A00(context, R.attr.fbpay_box_input_field_border_stroke);
        this.A05 = (int) C117006xy.A00(context, R.attr.fbpay_box_input_field_focus_border_stroke);
        A0W(AnonymousClass66H.A04, false);
    }

    public final void A0X(Boolean bool, Boolean bool2) {
        int i;
        int[][] iArr = {new int[]{16842910}, new int[]{-16842910}};
        Context context = getContext();
        if (bool.booleanValue()) {
            i = R.attr.fbpay_error_text_color;
        } else if (bool2.booleanValue()) {
            boolean z = this.A06;
            i = R.attr.fbpay_focus_color;
            if (z) {
                i = R.attr.fbpay_box_input_focus_color;
            }
        } else {
            i = R.attr.fbpay_hint_text_color;
        }
        setDefaultHintTextColor(new ColorStateList(iArr, new int[]{C86104wH.A0G(context, i).data, C86104wH.A0G(context, R.attr.fbpay_disabled_text_color).data}));
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i3 = marginLayoutParams.leftMargin;
            Context context = getContext();
            boolean z = this.A06;
            int i4 = R.attr.fbpay_input_field_margin_top;
            if (z) {
                i4 = R.attr.fbpay_box_input_field_margin_top;
            }
            int A002 = (int) C117006xy.A00(context, i4);
            int i5 = marginLayoutParams.rightMargin;
            boolean z2 = this.A06;
            int i6 = R.attr.fbpay_input_field_margin_bottom;
            if (z2) {
                i6 = R.attr.fbpay_box_input_field_margin_bottom;
            }
            marginLayoutParams.setMargins(i3, A002, i5, (int) C117006xy.A00(context, i6));
        }
        if (getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) getLayoutParams()).gravity = 16;
        }
    }

    public void setId(int i) {
        super.setId(i);
        this.A04.setDropDownAnchor(i);
    }
}
