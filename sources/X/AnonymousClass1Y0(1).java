package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1Y0  reason: invalid class name */
public final class AnonymousClass1Y0 extends C34640IcN {
    public static final String __redex_internal_original_name = "TwoFacLoginHelpSheetFragment";
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(80133131);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0V(this);
        C14030oh.A09(65327268, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C310624b r1;
        int A02 = C14030oh.A02(509417227);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        View A0D = C18180wK.A0D(layoutInflater2, viewGroup, R.layout.two_fac_login_help_sheet_fragment, false);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(A0D, R.id.use_text_message_button);
        View A0K = AnonymousClass0wJ.A0K(A0D, R.id.use_recovery_code_button);
        View A0K2 = AnonymousClass0wJ.A0K(A0D, R.id.use_whatsapp_button);
        View A0K3 = AnonymousClass0wJ.A0K(A0D, R.id.use_authenticator_app_button);
        View A0K4 = AnonymousClass0wJ.A0K(A0D, R.id.request_support_button);
        View A0K5 = AnonymousClass0wJ.A0K(A0D, R.id.learn_more_button);
        View A0K6 = AnonymousClass0wJ.A0K(A0D, R.id.cancel_button);
        int i = 0;
        textView.setVisibility(C18190wL.A00(requireArguments().getBoolean("argument_sms_two_factor_on") ? 1 : 0));
        A0K2.setVisibility(C18190wL.A00(requireArguments().getBoolean("argument_whatsapp_two_factor_on") ? 1 : 0));
        if (!requireArguments().getBoolean("argument_totp_two_factor_on")) {
            i = 8;
        }
        A0K3.setVisibility(i);
        int i2 = requireArguments().getInt("arg_two_fac_clear_method");
        C310624b[] values = C310624b.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r1 = C310624b.UNKNOWN;
                break;
            }
            r1 = values[i3];
            if (r1.A00 == i2) {
                break;
            }
            i3++;
        }
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            textView.setVisibility(8);
        } else if (ordinal == 5) {
            A0K2.setVisibility(8);
        } else if (ordinal == 2) {
            A0K3.setVisibility(8);
        } else if (ordinal != 1) {
            C10450iM.A03(C63833iQ.A05(), "no clear method");
        } else {
            A0K.setVisibility(8);
        }
        if (requireArguments().getBoolean("argument_sms_not_allowed")) {
            C18180wK.A0s(requireContext(), textView, R.color.igds_secondary_text);
        }
        AnonymousClass0wJ.A18(textView, 131, this, AnonymousClass006.A00);
        AnonymousClass0wJ.A18(A0K2, 131, this, AnonymousClass006.A0u);
        AnonymousClass0wJ.A18(A0K, 131, this, AnonymousClass006.A0C);
        AnonymousClass0wJ.A18(A0K3, 131, this, AnonymousClass006.A0N);
        AnonymousClass0wJ.A18(A0K4, 131, this, AnonymousClass006.A0Y);
        AnonymousClass0wJ.A18(A0K5, 131, this, AnonymousClass006.A0j);
        AnonymousClass0wJ.A16(A0K6, 542, this);
        C14030oh.A09(-325282201, A02);
        return A0D;
    }
}
