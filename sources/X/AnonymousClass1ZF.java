package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1ZF  reason: invalid class name */
public final class AnonymousClass1ZF extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "AutoConfConfirmationFragment";
    public IgTextView A00;
    public ProgressButton A01;
    public final C04530Oa A02 = C18190wL.A0x(this, 41);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131820822);
    }

    public final String getModuleName() {
        return "auto_conf_confirmation";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1629757402);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        C62323Yh.A00(AnonymousClass0wJ.A0U(this.A02), false, "auto_conf_confirmation", "client_auth_show_confirmation", (String) null, "optimistic_authentication_flow", "ar_code_sms", (String) null, (String) null, (String) null, (String) null);
        View A0D = C18180wK.A0D(layoutInflater2, viewGroup, R.layout.auto_conf_confirmation_fragment, false);
        ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(A0D, R.id.auto_conf_continue_button);
        this.A01 = progressButton;
        if (progressButton == null) {
            str = "continueButton";
        } else {
            AnonymousClass0wJ.A16(progressButton, 593, this);
            IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(A0D, R.id.auto_conf_helper_button);
            C18200wM.A18(igTextView.getResources(), igTextView, 2131821659);
            this.A00 = igTextView;
            str = "helperButton";
            AnonymousClass3X6.A00(igTextView);
            IgTextView igTextView2 = this.A00;
            if (igTextView2 != null) {
                AnonymousClass0wJ.A16(igTextView2, 594, this);
                C14030oh.A09(-1358941431, A022);
                return A0D;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-915909720);
        super.onResume();
        C14030oh.A09(-1491109159, A022);
    }
}
