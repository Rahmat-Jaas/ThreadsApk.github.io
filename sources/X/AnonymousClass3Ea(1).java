package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ea  reason: invalid class name */
public final class AnonymousClass3Ea {
    public final C13330nS A00;

    public final void A00(Integer num, String str) {
        String str2;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "shopping_business_setting_tapped"), 2696);
        switch (num.intValue()) {
            case 0:
                str2 = ClientCookie.DOMAIN_ATTR;
                break;
            case 1:
                str2 = "approved_accounts";
                break;
            case 2:
                str2 = "highlight_products_for_partners";
                break;
            case 3:
                str2 = "creator_content";
                break;
            default:
                str2 = "link_untagged_post";
                break;
        }
        A0I.A0T("shopping_business_setting_type", str2);
        C18210wN.A1A(A0I, str);
        A0I.Bb4();
    }

    public AnonymousClass3Ea(C11630kW r2, UserSession userSession) {
        this.A00 = C13330nS.A01(r2, userSession);
    }
}
