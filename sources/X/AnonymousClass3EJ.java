package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.3EJ  reason: invalid class name */
public final class AnonymousClass3EJ {
    public final C11630kW A00;

    public final void A00(C10300i6 r4, Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this.A00, r4), "push_notification_setting"), 2541);
        if (num == AnonymousClass006.A00) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        A0I.A0T(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        A0I.A0T("extra_setting_data", (String) null);
        A0I.Bb4();
    }

    public AnonymousClass3EJ(C11630kW r1) {
        this.A00 = r1;
    }
}
