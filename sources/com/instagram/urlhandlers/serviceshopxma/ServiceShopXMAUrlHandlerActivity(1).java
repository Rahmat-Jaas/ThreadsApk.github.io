package com.instagram.urlhandlers.serviceshopxma;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C18240wQ;
import X.C25786Drz;
import X.C62853b1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

public final class ServiceShopXMAUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        int A00 = C14030oh.A00(-1161881457);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = -466833547;
        } else {
            String A0i = C18190wL.A0i(A0B);
            if (!(A0i == null || A0i.length() == 0)) {
                Uri A01 = C15430rJ.A01(A0i);
                if (C18240wQ.A03(A01) == 2 && C04220Ms.A0I(A01.getPathSegments().get(1), "service_details_page")) {
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    if ("com.bloks.www.service.buyer.service-details-page".equals("com.bloks.www.service.buyer.service-details-page")) {
                        C18210wN.A0w(A01, "service_id", A0y);
                        C18210wN.A0w(A01, "referrer_ui_surface", A0y);
                        C18210wN.A0w(A01, "referrer_ui_component", A0y);
                    }
                    C10300i6 session = getSession();
                    C25786Drz A0Q = AnonymousClass0wJ.A0Q(this, session);
                    A0Q.A0C = false;
                    A0Q.A03 = C62853b1.A03(session, "com.bloks.www.service.buyer.service-details-page", A0y);
                    A0Q.A05();
                    i = 469404682;
                }
            }
            finish();
            i = 469404682;
        }
        C14030oh.A07(i, A00);
    }
}
