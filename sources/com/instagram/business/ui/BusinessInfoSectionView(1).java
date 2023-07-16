package com.instagram.business.ui;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C121907Is;
import X.C12560m7;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18250wR;
import X.C25828Dsm;
import X.C313225m;
import X.C60053Nl;
import X.C63393hP;
import X.C82854qN;
import X.C85924vz;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape217S0200000_1_I2;
import com.facebook.redex.IDxObjectShape170S0200000_1_I2;
import com.facebook.redex.IDxTListenerShape181S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

public class BusinessInfoSectionView extends LinearLayout implements CallerContextable {
    public EditText A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public IgSwitch A09;
    public EditPhoneNumberView A0A;
    public boolean A0B;
    public boolean A0C;
    public TextWatcher A0D;
    public TextWatcher A0E;
    public View A0F;
    public View A0G;
    public TextView A0H;

    public void setBusinessInfoListeners(C85924vz r5) {
        IDxObjectShape170S0200000_1_I2 iDxObjectShape170S0200000_1_I2 = new IDxObjectShape170S0200000_1_I2(2, this, r5);
        this.A0D = iDxObjectShape170S0200000_1_I2;
        this.A00.addTextChangedListener(iDxObjectShape170S0200000_1_I2);
        this.A00.setOnFocusChangeListener(new IDxCListenerShape217S0200000_1_I2(1, this, r5));
        IDxObjectShape170S0200000_1_I2 iDxObjectShape170S0200000_1_I22 = new IDxObjectShape170S0200000_1_I2(3, this, r5);
        this.A0E = iDxObjectShape170S0200000_1_I22;
        this.A0A.A01.addTextChangedListener(iDxObjectShape170S0200000_1_I22);
        if (!this.A0B) {
            AnonymousClass0wJ.A18(this.A07, 49, r5, this);
        }
        AnonymousClass0wJ.A18(this.A01, 50, r5, this);
        AnonymousClass0wJ.A18(this.A0H, 51, r5, this);
        AnonymousClass0wJ.A18(this.A08, 52, r5, this);
        this.A09.A07 = new IDxTListenerShape181S0200000_1_I2(2, (Object) this, (Object) r5);
        AnonymousClass0wJ.A16(this.A0F, 218, this);
    }

    public void setIsLdpApp(boolean z) {
    }

    private void setDarkModeTint(TextView textView) {
        if (textView != null) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    C63393hP.A05(drawable.mutate(), C121907Is.A00(getContext(), R.attr.glyphColorPrimary));
                }
            }
        }
    }

    public final void A01() {
        this.A07.setOnClickListener((View.OnClickListener) null);
        this.A01.setOnClickListener((View.OnClickListener) null);
        TextWatcher textWatcher = this.A0D;
        if (textWatcher != null) {
            this.A00.removeTextChangedListener(textWatcher);
        }
        this.A0D = null;
        TextWatcher textWatcher2 = this.A0E;
        if (textWatcher2 != null) {
            this.A0A.A01.removeTextChangedListener(textWatcher2);
        }
        this.A0E = null;
        this.A09.A07 = null;
        this.A0F.setOnClickListener((View.OnClickListener) null);
    }

    public final void A04(Address address) {
        if (address != null) {
            String str = address.A03;
            if (!TextUtils.isEmpty(str)) {
                this.A01.setText(str);
                return;
            }
        }
        C18250wR.A0t(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != true) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.instagram.service.session.UserSession r6) {
        /*
            r5 = this;
            java.lang.Class<com.instagram.business.ui.BusinessInfoSectionView> r4 = com.instagram.business.ui.BusinessInfoSectionView.class
            android.widget.TextView r3 = r5.A08
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            com.instagram.user.model.User r0 = X.C04660Oo.A00(r6)
            r2 = 1
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A3a()
            if (r0 != r2) goto L_0x0022
            com.instagram.user.model.User r0 = X.C04660Oo.A00(r6)
            if (r0 == 0) goto L_0x0022
            boolean r1 = r0.A2s()
            r0 = 0
            if (r1 == r2) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r3.setVisibility(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r6)
            boolean r0 = r0.A2y()
            if (r0 != 0) goto L_0x0039
            android.widget.TextView r2 = r5.A08
            java.lang.String r0 = ""
        L_0x0035:
            r2.setText(r0)
        L_0x0038:
            return
        L_0x0039:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r0 = X.C63333hI.A00(r4)
            X.6li r0 = X.C63333hI.A01(r0, r6)
            if (r0 == 0) goto L_0x0038
            X.3EH r1 = r0.A00
            if (r1 == 0) goto L_0x0038
            android.widget.TextView r2 = r5.A08
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r0 = X.C63333hI.A00(r4)
            java.lang.Object r0 = r1.A00(r0, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.ui.BusinessInfoSectionView.A05(com.instagram.service.session.UserSession):void");
    }

    public final void A06(boolean z) {
        TextView textView = this.A0H;
        if (z) {
            textView.setText(2131822786);
        } else {
            textView.setText((CharSequence) null);
        }
        this.A0C = z;
        this.A0H.setVisibility(0);
    }

    public final void A07(boolean z, boolean z2, boolean z3) {
        View view = this.A0F;
        if (z) {
            view.setVisibility(0);
            IgSwitch igSwitch = this.A09;
            if (z3) {
                igSwitch.setCheckedAnimated(z2);
            } else {
                igSwitch.setChecked(z2);
            }
        } else {
            view.setVisibility(8);
        }
    }

    public final boolean A08() {
        CharSequence text;
        if (C18250wR.A1I(this.A00)) {
            if (this.A0B) {
                text = AnonymousClass0wJ.A0n(this.A0A.A01);
            } else {
                text = this.A07.getText();
            }
            if (!TextUtils.isEmpty(text) || !TextUtils.isEmpty(this.A01.getText()) || !TextUtils.isEmpty(this.A08.getText())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getAddress() {
        return C18210wN.A0c(this.A01);
    }

    public String getCountryCode() {
        return this.A0A.A04.getCountryCodeWithoutPlus();
    }

    public String getEmail() {
        return AnonymousClass0wJ.A0n(this.A00);
    }

    public String getNationalNumber() {
        return AnonymousClass0wJ.A0n(this.A0A.A01);
    }

    public String getPhoneNumber() {
        return this.A0A.getPhoneNumber();
    }

    public PublicPhoneContact getSubmitPublicPhoneContact() {
        if (!TextUtils.isEmpty(AnonymousClass0wJ.A0n(this.A0A.A01))) {
            return new PublicPhoneContact(this.A0A.A04.getCountryCodeWithoutPlus(), AnonymousClass0wJ.A0n(this.A0A.A01), this.A0A.getPhoneNumber(), "CALL");
        }
        return null;
    }

    public void setBusinessInfo(UserSession userSession, BusinessInfo businessInfo, Fragment fragment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C85924vz r22) {
        this.A00.setText(businessInfo.A0B);
        this.A0B = z;
        Fragment fragment2 = fragment;
        A03(fragment.requireContext(), businessInfo.A01);
        UserSession userSession2 = userSession;
        if (this.A0B) {
            EditPhoneNumberView.A01(fragment2, (C12560m7) null, (C313225m) null, (C82854qN) null, userSession2, r22, this.A0A);
            this.A00.setBackground(fragment.requireContext().getDrawable(R.drawable.input));
        } else {
            this.A0A.setVisibility(8);
            this.A07.setVisibility(0);
        }
        if (z2) {
            A04(businessInfo.A00);
        } else {
            this.A01.setVisibility(8);
        }
        if (z4) {
            A06(businessInfo.A0O);
        } else {
            this.A0H.setVisibility(8);
        }
        if (z3) {
            A05(userSession);
        } else {
            this.A08.setVisibility(8);
        }
        if (z7) {
            this.A03.setText(2131826704);
            C18200wM.A18(getResources(), this.A04, 2131826705);
            this.A04.setVisibility(0);
        }
        A07(z5, businessInfo.A0R, z6);
    }

    public void setCountryCode(CountryCodeData countryCodeData) {
        this.A0A.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public BusinessInfoSectionView(Context context) {
        super(context);
        A00(context);
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_business_info_section, this);
        this.A0G = inflate;
        this.A00 = (EditText) inflate.requireViewById(R.id.email);
        this.A01 = AnonymousClass0wJ.A0L(this.A0G, R.id.address);
        this.A08 = AnonymousClass0wJ.A0L(this.A0G, R.id.whatsapp);
        this.A0H = AnonymousClass0wJ.A0L(this.A0G, R.id.native_calling);
        this.A0A = (EditPhoneNumberView) this.A0G.requireViewById(R.id.phone_number_edit_view);
        this.A07 = AnonymousClass0wJ.A0L(this.A0G, R.id.phone_number_text_view);
        View requireViewById = this.A0G.requireViewById(R.id.profile_display_toggle);
        this.A0F = requireViewById;
        AnonymousClass0wJ.A0L(requireViewById, R.id.title).setText(2131832963);
        this.A09 = C18250wR.A0N(this.A0F, R.id.toggle);
        this.A03 = AnonymousClass0wJ.A0L(this.A0G, R.id.bottom_text);
        this.A04 = AnonymousClass0wJ.A0L(this.A0G, R.id.bottom_text_2);
        TextView A0L = AnonymousClass0wJ.A0L(this.A0G, R.id.email_inline_error_message);
        this.A05 = A0L;
        A0L.setText(2131832597);
        TextView A0L2 = AnonymousClass0wJ.A0L(this.A0G, R.id.phone_inline_error_message);
        this.A06 = A0L2;
        A0L2.setText(2131832466);
        TextView A0L3 = AnonymousClass0wJ.A0L(this.A0G, R.id.bottom_inline_error_message);
        this.A02 = A0L3;
        A0L3.setText(2131832598);
        Drawable drawable = this.A00.getCompoundDrawables()[0];
        if (drawable != null) {
            C63393hP.A05(drawable.mutate(), C121907Is.A00(getContext(), R.attr.glyphColorPrimary));
        }
        setDarkModeTint(this.A01);
        setDarkModeTint(this.A07);
        setDarkModeTint(this.A08);
    }

    public final void A02(Context context) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131831746);
        A0W.A0K(2131821039);
        C18180wK.A1O(A0W, this, 27, 2131831976);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final void A03(Context context, PublicPhoneContact publicPhoneContact) {
        String str;
        TextView textView;
        String str2;
        CountryCodeData A002 = C60053Nl.A00(context);
        String str3 = A002.A01;
        if (publicPhoneContact != null) {
            str3 = publicPhoneContact.A01;
            if (str3 != null && !str3.isEmpty()) {
                A002 = C60053Nl.A01(context, str3);
                str3 = AnonymousClass00U.A0L("+", str3);
            }
            str = publicPhoneContact.A02;
        } else {
            str = null;
        }
        if (this.A0B) {
            this.A0A.setupEditPhoneNumberView(A002, str);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String A0n = C18200wM.A0n(str);
            textView = this.A07;
            str2 = AnonymousClass00U.A0V(str3, " ", A0n);
        } else {
            textView = this.A07;
            str2 = "";
        }
        textView.setText(str2);
    }

    public BusinessInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
