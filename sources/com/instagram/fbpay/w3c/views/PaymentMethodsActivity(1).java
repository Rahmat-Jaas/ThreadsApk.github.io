package com.instagram.fbpay.w3c.views;

import X.AnonymousClass01J;
import X.C04220Ms;
import X.C10300i6;
import X.C122037Js;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C86104wH;
import X.C86154wM;
import X.C92725jl;
import X.C92755jo;
import android.os.Bundle;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import java.util.HashSet;

public final class PaymentMethodsActivity extends BaseFragmentActivity {
    public final FBPayLoggerData A00;

    public PaymentMethodsActivity() {
        HashSet A0u = C18200wM.A0u();
        String A01 = C122037Js.A01();
        HashSet A13 = C86104wH.A13(A0u, A0u);
        String lowerCase = "IAB_AUTOFILL".toLowerCase();
        C04220Ms.A06(lowerCase);
        this.A00 = new FBPayLoggerData((String) null, lowerCase, (String) null, (String) null, A01, "offline_offsite", A13);
    }

    public final void A0D(Bundle bundle) {
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("viewmodel_class", C92725jl.class);
        C86154wM.A1E(A06, this.A00);
        A06.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, "IAB_AUTOFILL");
        C92755jo r2 = new C92755jo();
        r2.setArguments(A06);
        AnonymousClass01J A0L = C18220wO.A0L(this);
        A0L.A0C(r2, R.id.layout_container_main);
        A0L.A00();
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession A0Z = C18230wP.A0Z();
        C04220Ms.A0A(A0Z);
        return A0Z;
    }
}
