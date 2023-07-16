package com.instagram.urlhandlers.promoteexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C63753iH;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class PromoteExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        String A0i;
        int A002 = C14030oh.A00(888826609);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        this.A00 = C18190wL.A0S(A0B);
        if (!(A0B == null || (A0i = C18190wL.A0i(A0B)) == null)) {
            Uri A01 = C15430rJ.A01(A0i);
            C18190wL.A12(A01, A0B, "coupon_offer_id");
            C18190wL.A12(A01, A0B, "media_id");
            C18190wL.A12(A01, A0B, "objective");
            C18190wL.A12(A01, A0B, "entry_point");
            C18190wL.A12(A01, A0B, "aymt_channel");
            C18190wL.A12(A01, A0B, "dummy_param_random_uuid");
            C18190wL.A12(A01, A0B, "budget");
            C18190wL.A12(A01, A0B, "duration");
            C18230wP.A13(A01, A0B, "is_cta_ctwa_aymt");
            C18230wP.A13(A01, A0B, "is_cta_lead_ads_aymt");
            C18230wP.A13(A01, A0B, "has_relaunched_from_main_activity");
            C18230wP.A13(A01, A0B, "is_client_spec_override");
        }
        intent.getStringExtra("access_token");
        intent.getStringExtra("user_id");
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession) || !AnonymousClass0wJ.A0Y(C05030Qo.A02(r1)).A2i()) {
            AnonymousClass3YR.A00.A02(this, A0B, this.A00);
        } else {
            C63753iH.A08(A0B, this, this.A00);
            finish();
        }
        C14030oh.A07(119810515, A002);
    }
}
