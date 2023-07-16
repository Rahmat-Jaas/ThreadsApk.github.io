package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.1b7  reason: invalid class name */
public final class AnonymousClass1b7 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "ConnectFBPayFragment";
    public UserSession A00;
    public boolean A01 = false;

    public final String getModuleName() {
        return "FBPAY_CONTAINER_FRAGMENT";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(215757139);
        super.onCreate(bundle);
        UserSession A0V = C18180wK.A0V(C18250wR.A07(this));
        this.A00 = A0V;
        C59713Ma.A01(A0V, true);
        C130667qT A0T = C18220wO.A0T(requireActivity(), new AnonymousClass43R(this), this.A00);
        UserSession userSession = this.A00;
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        iVw.A04("product_type", "FBPAY_HUB");
        iVw.A04(C61953Wm.A00(), ((FBPayLoggerData) C18240wQ.A0D(C18250wR.A07(this), "logger_data")).A00());
        IVw iVw2 = new IVw(k9r);
        iVw2.A00.put("fbpay_params", iVw);
        iVw2.A04("redirect_service", "fb_pay");
        iVw2.A04("entrypoint", "fb_pay_hub");
        iVw2.A04("transition_style", "fade");
        UserSession userSession2 = this.A00;
        C04220Ms.A0B(userSession2, 0);
        iVw2.A03("cds_client_value", C59713Ma.A00(userSession2));
        IVw A0M = C18180wK.A0M(k9r, iVw2);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18200wM.A1T(A0M, A0y);
        AnonymousClass4A9 A002 = C63263h8.A00(userSession, "com.bloks.www.fxcal.settings.async", A0y);
        AnonymousClass4A9.A01(A002, A0T, this, 3);
        schedule(A002);
        C14030oh.A09(-141097780, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1872474354);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.hub_spinner);
        C14030oh.A09(1257517495, A02);
        return A0H;
    }

    public final void onResume() {
        int A02 = C14030oh.A02(182944707);
        super.onResume();
        if (this.A01) {
            C18190wL.A19(this);
        }
        C14030oh.A09(-1674325653, A02);
    }
}
