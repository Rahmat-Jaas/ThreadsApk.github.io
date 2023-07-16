package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.C04220Ms;
import X.C14030oh;
import X.C18230wP;
import X.C61493Tq;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class BloksWhatsAppCodeReceiverActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int A00 = C14030oh.A00(1298990936);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C61493Tq r1 = C61493Tq.A00;
        C04220Ms.A06(intent);
        if (r1.A00(intent) && r1.A00(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
            Intent A0B = C18230wP.A0B();
            A0B.setAction("com.instagram.android.WHATSAPP_OTP");
            A0B.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra);
            C18230wP.A0O().A05(getApplicationContext(), A0B);
        }
        finish();
        C14030oh.A07(-556907763, A00);
    }
}
