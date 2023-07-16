package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.smartcapture.logging.SCEventNames;
import com.instagram.barcelona.R;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public final class C22841am extends C34640IcN implements C82034oy, C82854qN {
    public static final String __redex_internal_original_name = "TwoFacEnterPhoneNumberFragment";
    public EditPhoneNumberView A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final C04530Oa A05 = C18210wN.A0j(this, 6);
    public final C04530Oa A06 = C18210wN.A0j(this, 7);
    public final C04530Oa A07 = C18210wN.A0j(this, 8);
    public final C04530Oa A08 = C80644m9.A00(this);

    public final void CjW(CountryCodeData countryCodeData) {
        C04220Ms.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            C04220Ms.A0E("editPhoneNumberView");
            throw null;
        } else {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        int i = 2131837062;
        if (this.A03) {
            i = 2131837027;
        }
        AnonymousClass4u2.A07(r3, i);
    }

    public static final void A00(C22841am r6) {
        EditPhoneNumberView editPhoneNumberView = r6.A00;
        if (editPhoneNumberView == null) {
            C04220Ms.A0E("editPhoneNumberView");
            throw null;
        }
        String phoneNumber = editPhoneNumberView.getPhoneNumber();
        C04530Oa r5 = r6.A08;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        C04220Ms.A0B(A0U, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, A0U), "instagram_two_fac_setup_action"), 2315);
        C18210wN.A1A(A0I, SCEventNames.Params.STEP_CHANGE_NEXT);
        A0I.A0T("view", "");
        C63833iQ.A0D(A0I);
        A0I.A0T("phone_numer", phoneNumber);
        A0I.Bb4();
        if (phoneNumber.length() == 0) {
            C63813iO.A02(r6.requireContext(), r6.getString(2131832475), (String) null, 0);
            return;
        }
        C32165H8c A022 = C62403Zn.A02(r6.requireContext(), AnonymousClass0wJ.A0X(r5), phoneNumber);
        A022.A00 = (C63873iU) r6.A07.getValue();
        r6.schedule(A022);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2015511356);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C63833iQ.A08(requireArguments);
        this.A03 = requireArguments.getBoolean(C63833iQ.A07(0, 33, 124));
        this.A04 = requireArguments.getBoolean("ARG_IS_ENABLING_WHATSAPP", false);
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A08), "add_phone_number");
        C14030oh.A09(-82341167, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1572219643);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        boolean z = false;
        View inflate = layoutInflater2.inflate(R.layout.two_fac_enter_phone_number_fragment, viewGroup, false);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_add_phone_number_description);
        if (this.A03) {
            C18180wK.A10((TextView) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_add_phone_number_title), this, 2131837028);
            C18180wK.A10(textView, this, 2131837026);
        } else if (this.A04) {
            AnonymousClass0wJ.A0K(inflate, R.id.two_fac_add_phone_whatsapp_disclaimer).setVisibility(0);
            textView.setText(2131837177);
        }
        this.A00 = (EditPhoneNumberView) AnonymousClass0wJ.A0J(inflate, R.id.edit_phone_number_view);
        String str2 = this.A02;
        if (str2 == null) {
            str = "currPhoneNumber";
        } else {
            if (str2.length() > 0) {
                z = true;
            }
            str = "editPhoneNumberView";
            if (z) {
                Bundle requireArguments = requireArguments();
                EditPhoneNumberView editPhoneNumberView = this.A00;
                if (editPhoneNumberView != null) {
                    editPhoneNumberView.setupEditPhoneNumberView(C60053Nl.A01(requireContext(), C18210wN.A0b(requireArguments, "country_code", "")), requireArguments.getString("national_number", ""));
                }
            }
            EditPhoneNumberView editPhoneNumberView2 = this.A00;
            if (editPhoneNumberView2 != null) {
                EditPhoneNumberView.A01(this, (C12560m7) null, C313225m.ARGUMENT_TWOFAC_FLOW, (C82854qN) null, AnonymousClass0wJ.A0X(this.A08), (AnonymousClass4MF) this.A06.getValue(), editPhoneNumberView2);
                EditPhoneNumberView editPhoneNumberView3 = this.A00;
                if (editPhoneNumberView3 == null) {
                    C04220Ms.A0E(str);
                    throw null;
                }
                editPhoneNumberView3.requestFocus();
                ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(inflate, R.id.next_button);
                this.A01 = progressButton;
                if (progressButton == null) {
                    str = "nextButton";
                } else {
                    progressButton.setOnClickListener((View.OnClickListener) this.A05.getValue());
                    C62923b9.A02(C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 38), C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 39), (TextView) AnonymousClass0wJ.A0J(inflate, R.id.learn_more_and_policy), C18180wK.A0g(this, 2131837066), C18180wK.A0g(this, 2131837067));
                    C24731jw.A02(this);
                    C14030oh.A09(-1647906659, A022);
                    return inflate;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1380118780);
        super.onPause();
        Window A0F = C18180wK.A0F(this);
        if (A0F != null) {
            A0F.setSoftInputMode(0);
        }
        C18240wQ.A10(this);
        C14030oh.A09(1968566447, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1867134172);
        super.onResume();
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView == null) {
            C04220Ms.A0E("editPhoneNumberView");
            throw null;
        }
        editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200);
        Window A0F = C18180wK.A0F(this);
        if (A0F != null) {
            A0F.setSoftInputMode(16);
        }
        C14030oh.A09(-1965408002, A022);
    }
}
