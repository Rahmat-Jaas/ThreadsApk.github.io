package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ig  reason: invalid class name and case insensitive filesystem */
public final class C71294Ig implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public C71294Ig(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        C18190wL.A12(uri, A06, "media_id");
        C18190wL.A12(uri, A06, "coupon_offer_id");
        C18230wP.A13(uri, A06, "is_cta_ctwa_aymt");
        C18230wP.A13(uri, A06, "is_ctwa_coupon_aymt");
        C18230wP.A13(uri, A06, "is_cta_lead_ads_aymt");
        C18190wL.A12(uri, A06, "entry_point");
        C18190wL.A12(uri, A06, "aymt_channel");
        C18190wL.A12(uri, A06, "dummy_param_random_uuid");
        C18230wP.A13(uri, A06, "has_relaunched_from_main_activity");
        C63753iH.A08(A06, this.A00.requireActivity(), this.A01);
    }
}
