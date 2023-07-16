package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1bL  reason: invalid class name */
public final class AnonymousClass1bL extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacCheckWhatsAppPhoneNumberFragment";
    public ProgressButton A00;
    public String A01;
    public final C63873iU A02 = C63873iU.A06(this, 79);
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837062);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final boolean onBackPressed() {
        AnonymousClass0wJ.A19(C62653aT.A01().A01(AnonymousClass006.A0j, true, !requireArguments().getBoolean("has_two_fac_already_on")), requireActivity(), AnonymousClass0wJ.A0U(this.A03));
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1379017564);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.two_fac_check_whatsapp_phone_number_fragment, false);
        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) AnonymousClass0wJ.A0J(A0D, R.id.edit_phone_number_view);
        Bundle requireArguments = requireArguments();
        String A0b = C18210wN.A0b(requireArguments, C63833iQ.A02(), "");
        this.A01 = A0b;
        if (A0b.length() > 0) {
            String string = requireArguments.getString("country_code", "");
            String string2 = requireArguments.getString("national_number", "");
            Context requireContext = requireContext();
            C04220Ms.A06(string);
            editPhoneNumberView.setupEditPhoneNumberView(C60053Nl.A01(requireContext, string), string2);
        }
        IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(this, 528);
        int color = requireContext().getColor(R.color.igds_secondary_text);
        CountryCodeTextView countryCodeTextView = editPhoneNumberView.A04;
        countryCodeTextView.setOnClickListener(A0H);
        countryCodeTextView.setTextColor(color);
        EditText editText = editPhoneNumberView.A01;
        editText.setOnClickListener(A0H);
        editText.setFocusable(false);
        editText.setTextColor(color);
        ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(A0D, R.id.next_button);
        this.A00 = progressButton;
        if (progressButton == null) {
            C04220Ms.A0E("nextButton");
            throw null;
        }
        AnonymousClass0wJ.A16(progressButton, 527, this);
        C62923b9.A02(C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 33), C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 34), (TextView) AnonymousClass0wJ.A0J(A0D, R.id.learn_more_and_policy), C18180wK.A0g(this, 2131837066), C18180wK.A0g(this, 2131837067));
        C14030oh.A09(-637058865, A022);
        return A0D;
    }
}
