package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1bA  reason: invalid class name */
public final class AnonymousClass1bA extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "OffsiteOnboardingFragment";
    public boolean A00 = false;
    public UserSession A01;

    public final String getModuleName() {
        return "OFFSITE_ONBOARDING_FRAGMENT";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-558747248);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(C18250wR.A07(this));
        this.A01 = A0V;
        C130667qT A0T = C18220wO.A0T(requireActivity(), new C683543l(this), A0V);
        UserSession userSession = this.A01;
        Bundle A07 = C18250wR.A07(this);
        String string = A07.getString("waterfall_id");
        String string2 = A07.getString("entry_point");
        String string3 = A07.getString("prior_module");
        String string4 = A07.getString("presentation_style");
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        if (string2 == null) {
            string2 = "";
        }
        iVw.A04("entry_point", string2);
        if (string == null) {
            string = "";
        }
        iVw.A04("waterfall_id", string);
        if (string3 == null) {
            string3 = "";
        }
        iVw.A04("prior_module", string3);
        if (string4 == null) {
            string4 = "";
        }
        iVw.A04("presentation_style", string4);
        IVw A0M = C18180wK.A0M(k9r, iVw);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18200wM.A1T(A0M, A0y);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession, "com.bloks.www.bloks.commerce.offsite.onboarding.start.async", A0y);
        AnonymousClass4A9.A01(A002, A0T, this, 22);
        schedule(A002);
        C14030oh.A09(-1416812703, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-77411302);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        C14030oh.A09(-182221466, A02);
        return A0H;
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-1340294721);
        super.onResume();
        if (this.A00) {
            C18190wL.A19(this);
        }
        C14030oh.A09(677783267, A02);
    }
}
