package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1ZN  reason: invalid class name */
public final class AnonymousClass1ZN extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacAddEmailFragment";
    public IgFormField A00;
    public ProgressButton A01;
    public String A02;
    public boolean A03;
    public final IDxACallbackShape111S0100000_1_I2 A04 = C63873iU.A06(this, 77);
    public final C04530Oa A05 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837003);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(448852595);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C18210wN.A0b(requireArguments, "email", "");
        this.A03 = C18240wQ.A1S(requireArguments, "KEY_SHOULD_SHOW_SKIP_BUTTON");
        C14030oh.A09(-1131049785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-1618294384);
        C04220Ms.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_add_email_fragment, viewGroup, false);
        IgFormField igFormField = (IgFormField) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_add_email_form_field);
        this.A00 = igFormField;
        if (igFormField == null) {
            str = "emailFormField";
        } else {
            boolean z = true;
            igFormField.setRuleChecker(new AnonymousClass4Cw(requireContext(), true));
            String str2 = this.A02;
            str = "email";
            if (str2 != null) {
                if (str2.length() > 0) {
                    igFormField.setText(str2);
                }
                igFormField.A00.addTextChangedListener(new IDxObjectShape282S0100000_1_I2(this, 14));
                ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(inflate, R.id.next_button);
                String str3 = this.A02;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        z = false;
                    }
                    progressButton.setEnabled(z);
                    progressButton.setOnClickListener(C18200wM.A0R(this, progressButton, 130));
                    this.A01 = progressButton;
                    AnonymousClass3Zw.A03(C18730xl.A00(this, C18220wO.A04(this), 32), AnonymousClass0wJ.A0L(inflate, R.id.two_fac_add_email_explanation), getString(2131837083), getString(2131837006));
                    View requireViewById = inflate.requireViewById(R.id.footer);
                    C04220Ms.A04(requireViewById);
                    if (!this.A03) {
                        i = 8;
                    }
                    requireViewById.setVisibility(i);
                    AnonymousClass0wJ.A16(requireViewById, 520, this);
                    C14030oh.A09(-88838753, A022);
                    return inflate;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
