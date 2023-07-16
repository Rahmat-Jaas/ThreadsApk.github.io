package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.AnonymousClass041;
import X.C04220Ms;
import X.C16200se;
import X.C18230wP;
import X.C61493Tq;
import android.content.Context;
import android.content.Intent;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class BloksWhatsAppCodeReceiver extends AnonymousClass041 {
    public final void A02(Context context, Intent intent, C16200se r7) {
        String stringExtra;
        C04220Ms.A0B(context, 0);
        C61493Tq r1 = C61493Tq.A00;
        if (r1.A00(intent) && r1.A00(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
            Intent A0B = C18230wP.A0B();
            A0B.setAction("com.instagram.android.WHATSAPP_OTP");
            A0B.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra);
            C18230wP.A0O().A05(context, A0B);
        }
    }
}
