package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1ZZ  reason: invalid class name */
public final class AnonymousClass1ZZ extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacSetupManuallyFragment";
    public TextView A00;
    public TextView A01;
    public String A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837148);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1993540611);
        super.onCreate(bundle);
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A03), "setup_manually_auth_app");
        C14030oh.A09(-1867869410, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-984819614);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_setup_manually_fragment, viewGroup, false);
        this.A00 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_key_line_one);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.ig_key_line_two);
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.copy_key), 548, this);
        C18230wP.A0W(inflate, R.id.next_bottom_button).setPrimaryActionOnClickListener(C18190wL.A0H(this, 549));
        C24731jw.A00(this);
        C14030oh.A09(2025929717, A022);
        return inflate;
    }

    public final void onStart() {
        String str;
        int A022 = C14030oh.A02(-218121751);
        super.onStart();
        String str2 = this.A02;
        if (str2 != null) {
            TextView textView = this.A00;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    C62923b9.A03(textView, textView2, str2);
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C62473a5.A02(requireContext(), C63873iU.A06(this, 98), AnonymousClass0wJ.A0U(this.A03));
        C14030oh.A09(694403506, A022);
    }
}
