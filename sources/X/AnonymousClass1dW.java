package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1dW  reason: invalid class name */
public final class AnonymousClass1dW extends C34640IcN implements AnonymousClass4tH, C82034oy, C82854qN {
    public static final String A0A = AnonymousClass00U.A0L(AnonymousClass1dW.class.getName(), ".EXTRA_PUBLIC_PHONE_CONTACT");
    public static final String __redex_internal_original_name = "BusinessPhoneNumberEditFragment";
    public RadioGroup A00;
    public ActionButton A01;
    public UserSession A02;
    public EditPhoneNumberView A03;
    public String A04;
    public String A05;
    public boolean A06 = false;
    public BusinessFlowAnalyticsLogger A07;
    public PublicPhoneContact A08;
    public final Handler A09 = AnonymousClass0wJ.A0F();

    public final boolean Bvc(int i) {
        return false;
    }

    public final void CAo() {
    }

    public final void CSm() {
    }

    public final String getModuleName() {
        return "business_edit_phone_number";
    }

    public static void A00(AnonymousClass1dW r2) {
        boolean z;
        if (!TextUtils.isEmpty(r2.A08.A03) || !TextUtils.isEmpty(AnonymousClass0wJ.A0n(r2.A03.A01))) {
            z = !r2.A03.getPhoneNumber().equals(r2.A08.A03);
        } else {
            z = false;
        }
        r2.A06 = z;
    }

    public final void Bl8() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("business_contact_info", "edit_profile", "area_code", (String) null, (String) null, Collections.singletonMap("area_code", this.A03.A04.A00), (Map) null, (Map) null));
        }
    }

    public final void CRi() {
        if (this.A01 != null) {
            A00(this);
            this.A01.setEnabled(this.A06);
        }
    }

    public final void CjW(CountryCodeData countryCodeData) {
        this.A03.setCountryCodeWithPlus(countryCodeData);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bbh(new C37408JrQ("business_contact_info", "edit_profile", (String) null, (String) null, (String) null, (Map) null, Collections.singletonMap("area_code", this.A03.A04.A00), (Map) null));
        }
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) view2.requireViewById(R.id.phone_number_edit_view);
        this.A03 = editPhoneNumberView;
        EditPhoneNumberView.A01(this, (C12560m7) null, (C313225m) null, (C82854qN) null, this.A02, this, editPhoneNumberView);
        EditPhoneNumberView editPhoneNumberView2 = this.A03;
        PublicPhoneContact publicPhoneContact = this.A08;
        editPhoneNumberView2.setupEditPhoneNumberView(publicPhoneContact.A01, publicPhoneContact.A02);
        String str = this.A08.A00;
        this.A04 = str;
        if ("UNKNOWN".equals(str)) {
            this.A04 = "TEXT";
        }
        this.A00 = (RadioGroup) view2.findViewById(R.id.contact_method_group);
        AnonymousClass0wJ.A0L(view2, R.id.contact_method_header).getPaint().setFakeBoldText(true);
        this.A00.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        this.A00.removeAllViews();
        this.A05 = new String(this.A04);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C62563aI.A01("CALL", AnonymousClass0wJ.A0B(this).getString(2131822819), A0v);
        C62563aI.A01("TEXT", AnonymousClass0wJ.A0B(this).getString(2131836658), A0v);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
        int i = 0;
        while (i < A0v.size()) {
            CompoundButton compoundButton = (CompoundButton) C18230wP.A0F(this).inflate(R.layout.contact_method_radio_button_item, (ViewGroup) null);
            compoundButton.setText(((C62563aI) A0v.get(i)).A02);
            compoundButton.setLayoutParams(layoutParams);
            int i2 = i + 1;
            compoundButton.setId(i2);
            this.A00.addView(compoundButton);
            C18230wP.A0F(this).inflate(R.layout.row_divider, this.A00);
            if (((C62563aI) A0v.get(i)).A01.equals(this.A04)) {
                compoundButton.setChecked(true);
            }
            i = i2;
        }
        this.A00.setOnCheckedChangeListener(new IDxCListenerShape512S0100000_1_I2(this, 3));
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        ActionButton Crr = r5.Crr(new C25348Dk8(C18190wL.A0H(this, 126), AnonymousClass0wJ.A0B(this).getString(2131832467), R.drawable.instagram_arrow_back_24));
        this.A01 = Crr;
        Crr.setEnabled(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(796659274);
        super.onCreate(bundle);
        C24731jw.A01(this);
        this.A08 = (PublicPhoneContact) requireArguments().getParcelable(A0A);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A02 = A0V;
        this.A07 = C37076Jk8.A00(C311924p.EDIT_PROFILE, this, A0V, C18180wK.A0e());
        C14030oh.A09(2091854250, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1648518273);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.business_phone_number_layout);
        C14030oh.A09(1987211193, A022);
        return A0H;
    }
}
