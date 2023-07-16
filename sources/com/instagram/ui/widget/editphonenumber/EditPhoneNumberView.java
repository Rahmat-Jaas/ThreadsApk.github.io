package com.instagram.ui.widget.editphonenumber;

import X.AnonymousClass00U;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass4QJ;
import X.AnonymousClass4tH;
import X.C09860go;
import X.C121907Is;
import X.C12560m7;
import X.C14030oh;
import X.C18200wM;
import X.C18210wN;
import X.C29471yD;
import X.C29481yE;
import X.C29934Fwk;
import X.C313225m;
import X.C60053Nl;
import X.C63393hP;
import X.C63803iN;
import X.C64543mW;
import X.C82854qN;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape217S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape5S0500000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

public class EditPhoneNumberView extends LinearLayout {
    public ViewGroup A00;
    public EditText A01;
    public ImageView A02;
    public ImageView A03;
    public CountryCodeTextView A04;
    public InlineErrorMessageView A05;
    public boolean A06 = false;
    public UserSession A07;
    public boolean A08;
    public final PhoneNumberUtil A09 = PhoneNumberUtil.A01(getContext());
    public final Runnable A0A = new AnonymousClass4QJ(this);

    public static void A01(Fragment fragment, C12560m7 r10, C313225m r11, C82854qN r12, UserSession userSession, AnonymousClass4tH r14, EditPhoneNumberView editPhoneNumberView) {
        UserSession userSession2 = userSession;
        editPhoneNumberView.A07 = userSession;
        CountryCodeData A002 = C60053Nl.A00(editPhoneNumberView.getContext());
        if (TextUtils.isEmpty(editPhoneNumberView.A04.A00)) {
            if ("+1".equals(A002.A00()) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342156794492618429L)) {
                editPhoneNumberView.A04.setCountryCodeWithPlus("+1");
            } else {
                editPhoneNumberView.setCountryCodeWithPlus(A002);
            }
        }
        IDxCListenerShape5S0500000_1_I2 iDxCListenerShape5S0500000_1_I2 = new IDxCListenerShape5S0500000_1_I2(6, userSession2, r12, fragment, r14, r10);
        editPhoneNumberView.A04.setOnClickListener(iDxCListenerShape5S0500000_1_I2);
        editPhoneNumberView.A03.setOnClickListener(iDxCListenerShape5S0500000_1_I2);
        if (editPhoneNumberView.A08) {
            AnonymousClass0wJ.A17(editPhoneNumberView.A02, 329, editPhoneNumberView);
        }
        editPhoneNumberView.A01.setOnFocusChangeListener(new IDxCListenerShape217S0200000_1_I2(3, editPhoneNumberView, r14));
        C18210wN.A12(editPhoneNumberView.A01, r14, 17);
        editPhoneNumberView.A01.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        editPhoneNumberView.A01.addTextChangedListener(new C29481yE(r11, r14, editPhoneNumberView));
        editPhoneNumberView.A04.addTextChangedListener(new C29471yD(r14, editPhoneNumberView));
        editPhoneNumberView.A01.addTextChangedListener(C64543mW.A00(editPhoneNumberView.A07));
    }

    public final void clearFocus() {
        this.A01.clearFocus();
        C09860go.A0I(this.A01);
    }

    public String getCountryCode() {
        return this.A04.A00;
    }

    public TextView getCountryCodeTextView() {
        return this.A04;
    }

    public String getCountryCodeWithoutPlus() {
        return this.A04.getCountryCodeWithoutPlus();
    }

    public EditText getNumberEditText() {
        return this.A01;
    }

    public String getPhone() {
        return AnonymousClass0wJ.A0n(this.A01);
    }

    public String getPhoneNumber() {
        String stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass00U.A0V(this.A04.A00, " ", AnonymousClass0wJ.A0n(this.A01)));
        stripSeparators.getClass();
        return stripSeparators;
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.A01.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        this.A04.setCountryCodeWithPlus(countryCodeData);
        this.A01.postDelayed(this.A0A, 200);
    }

    public void setHint(int i) {
        this.A01.setHint(i);
    }

    public void setupEditPhoneNumberView(CountryCodeData countryCodeData, String str) {
        this.A04.setCountryCodeWithCountryPrefix(countryCodeData);
        if (str != null && !str.isEmpty()) {
            this.A01.setText(C18200wM.A0n(str));
        }
    }

    public EditPhoneNumberView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        Context context2 = getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context2).inflate(R.layout.layout_edit_phone_view, this);
        this.A00 = viewGroup;
        this.A04 = (CountryCodeTextView) viewGroup.requireViewById(R.id.country_code_picker);
        this.A01 = (EditText) this.A00.requireViewById(R.id.phone_number);
        this.A02 = C18200wM.A0J(this.A00, R.id.clear_button);
        this.A03 = C18200wM.A0J(this.A00, R.id.country_code_drop_down);
        this.A05 = (InlineErrorMessageView) this.A00.requireViewById(R.id.phone_inline_error);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0R);
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                this.A04.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_device_phone_outline_24, 0, 0, 0);
                C63393hP.A05(this.A04.getCompoundDrawables()[0].mutate(), C121907Is.A00(context2, R.attr.glyphColorPrimary));
                if (obtainStyledAttributes.hasValue(5)) {
                    this.A04.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(5, R.dimen.abc_button_padding_horizontal_material));
                }
            }
            if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.getBoolean(2, false)) {
                this.A04.setTypeface((Typeface) null, 1);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A04.setTextColor(obtainStyledAttributes.getColor(3, 0));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.A08 = obtainStyledAttributes.getBoolean(0, false);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            } else {
                i = 0;
            }
            if (obtainStyledAttributes.hasValue(7)) {
                i2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            } else {
                i2 = 0;
            }
            if (obtainStyledAttributes.hasValue(8)) {
                i3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            } else {
                i3 = 0;
            }
            this.A04.setPadding(i2, 0, i, 0);
            this.A01.setPadding(i, 0, i3, 0);
            if (obtainStyledAttributes.hasValue(10)) {
                float dimension = obtainStyledAttributes.getDimension(10, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.setTextSize(0, dimension);
                this.A01.setTextSize(0, dimension);
            }
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            this.A06 = z;
            if (z) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_floating_window_z);
                this.A00.requireViewById(R.id.phone_number_container).setBackgroundResource(C121907Is.A02(context, R.attr.textEditBackground));
                this.A00.requireViewById(R.id.phone_number_container).setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.A00.requireViewById(R.id.phone_number_container).getLayoutParams().height = resources.getDimensionPixelSize(R.dimen.container_height);
                this.A00.requireViewById(R.id.phone_number_container).requestLayout();
                this.A03.setVisibility(0);
                this.A01.setPadding(resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, 0, 0);
                this.A03.setBackgroundResource(R.drawable.container_divider);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(1312548448);
        super.onDetachedFromWindow();
        this.A01.removeCallbacks(this.A0A);
        UserSession userSession = this.A07;
        if (userSession != null) {
            this.A01.removeTextChangedListener(C64543mW.A00(userSession));
        }
        C14030oh.A0D(-656689200, A062);
    }

    public EditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public void setHint(String str) {
        this.A01.setHint(str);
    }

    public void setupEditPhoneNumberView(String str, String str2) {
        this.A04.setCountryCodeWithPlus(str);
        if (str2 != null && !str2.isEmpty()) {
            this.A01.setText(C18200wM.A0n(str2));
        }
    }
}
