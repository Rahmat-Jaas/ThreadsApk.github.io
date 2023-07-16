package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1b8  reason: invalid class name */
public final class AnonymousClass1b8 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "CheckoutOnboardingFragment";
    public boolean A00 = false;
    public UserSession A01;

    public final String getModuleName() {
        return "CHECKOUT_ONBOARDING_FRAGMENT";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C14030oh.A02(-833703849);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        if (A07.getBoolean("is_deferred_payout")) {
            str = "com.bloks.www.bloks.commerce.onboarding.mcc.start.async";
        } else {
            str = "com.bloks.www.bloks.commerce.onboarding.start.async";
        }
        UserSession A0V = C18180wK.A0V(A07);
        this.A01 = A0V;
        C130667qT A0T = C18220wO.A0T(requireActivity(), new C683343j(this), A0V);
        UserSession userSession = this.A01;
        Bundle A072 = C18250wR.A07(this);
        String string = A072.getString("waterfall_id");
        String string2 = A072.getString("entry_point");
        String string3 = A072.getString("prior_module");
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
        IVw A0M = C18180wK.A0M(k9r, iVw);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18200wM.A1T(A0M, A0y);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession, str, A0y);
        AnonymousClass4A9.A01(A002, A0T, this, 20);
        schedule(A002);
        C14030oh.A09(-1948161066, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-959268696);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        C14030oh.A09(-893191388, A02);
        return A0H;
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-1303110990);
        super.onResume();
        if (this.A00) {
            C18190wL.A19(this);
        }
        C14030oh.A09(816546192, A02);
    }
}
