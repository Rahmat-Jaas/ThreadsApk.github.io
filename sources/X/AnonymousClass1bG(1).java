package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.1bG  reason: invalid class name */
public final class AnonymousClass1bG extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "UnderAgeRegBlockingFragment";
    public C10300i6 A00;
    public RegFlowExtras A01;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public static void A00(AnonymousClass1bG r3) {
        RegFlowExtras regFlowExtras;
        FragmentActivity activity = r3.getActivity();
        if (!(activity instanceof C84654td) || r3.mFragmentManager == null) {
            Bundle bundle = r3.mArguments;
            if ((bundle == null || !bundle.getBoolean("SHOULD_START_AT_SAC_REG_FLOW", false)) && ((regFlowExtras = r3.A01) == null || regFlowExtras.A01() == null || regFlowExtras.A01() != C313625r.SAC)) {
                C12560m7 r2 = r3.mFragmentManager;
                if (r2 != null) {
                    r2.A1C("reg_gdpr_entrance", 1);
                    return;
                }
                return;
            }
            C18190wL.A1A(r3);
        } else if (!((C84654td) activity).BMy()) {
            r3.mFragmentManager.A16();
        }
    }

    public final String getModuleName() {
        return C18210wN.A0e(this);
    }

    public final boolean onBackPressed() {
        Bundle A0C = C18190wL.A0C(requireActivity());
        if (A0C == null || !A0C.containsKey("caa_registration_redirection_to_native")) {
            A00(this);
            return true;
        }
        C18190wL.A1A(this);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(181637578);
        super.onCreate(bundle);
        AnonymousClass7Ko.A07(this.mArguments, "Arguments must contain Session token and Registration extras");
        this.A00 = C18190wL.A0S(this.mArguments);
        this.A01 = (RegFlowExtras) this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        C14030oh.A09(-671450039, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1089794762);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.under_age_reg_blocking_fragment);
        AnonymousClass0wJ.A17(A0H.requireViewById(R.id.ok_button), 28, this);
        C14030oh.A09(2054787410, A02);
        return A0H;
    }
}
