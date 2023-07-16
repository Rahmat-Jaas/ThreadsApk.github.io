package com.instagram.urlhandlers.creatormonetizationcontactsupport;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass29T;
import X.AnonymousClass4WK;
import X.C05030Qo;
import X.C10300i6;
import X.C11630kW;
import X.C13330nS;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C315828e;
import X.C62853b1;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class CreatorMonetizationContactSupportUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(856093463);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -335449001;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 37164553;
            } else {
                this.A00 = C18190wL.A0S(A0C);
                Uri A0A = C18210wN.A0A(A0i);
                C10300i6 r0 = this.A00;
                if (r0 != null) {
                    UserSession A02 = C05030Qo.A02(r0);
                    String queryParameter = A0A.getQueryParameter("product");
                    if ("igtv_ads".equals(queryParameter) || "badges".equals(queryParameter) || "bonuses".equals(queryParameter) || "branded_content".equals(queryParameter) || "fan_club".equals(queryParameter) || "affiliate".equals(queryParameter) || "gifts".equals(queryParameter)) {
                        C18230wP.A19(C62853b1.A03(A02, "com.instagram.pro_home.monetization_platform.support.contact_support_screen", new HashMap(AnonymousClass4WK.A0O(C18180wK.A0p("product", queryParameter)))), C18180wK.A0Q(this, A02));
                        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, this.A00), "ig_creator_monetization_support_inbox"), 1155);
                        A0I.A0O(AnonymousClass29T.CONTACT_SUPPORT, OptSvcAnalyticsStore.LOGGING_KEY_STEP);
                        C18220wO.A1E(C315828e.ENTER, A0I);
                        A0I.A0T("client_extra", AnonymousClass00U.A0L("help_center_article_", queryParameter));
                        A0I.Bb4();
                    }
                    i = -944634354;
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
