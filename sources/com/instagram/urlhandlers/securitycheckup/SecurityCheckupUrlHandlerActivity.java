package com.instagram.urlhandlers.securitycheckup;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass24F;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C11630kW;
import X.C12560m7;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C28591uf;
import X.C32165H8c;
import X.C54472zV;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class SecurityCheckupUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "security_checkup_url_handler_activity";
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int parseInt;
        int A00 = C14030oh.A00(197213394);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            AnonymousClass0RG r7 = AnonymousClass0RA.A0C;
            if (r7.A03(this) != null) {
                if (!(r7.A03(this) instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0C, r7.A03(this));
                    finish();
                    i = 73026374;
                } else {
                    String A0i = C18190wL.A0i(A0C);
                    if (A0i != null) {
                        C10300i6 A03 = r7.A03(this);
                        C04220Ms.A0C(A03, "null cannot be cast to non-null type com.instagram.common.session.Session");
                        Uri A0A = C18210wN.A0A(A0i);
                        getSupportFragmentManager().A0v(new IDxCListenerShape426S0100000_1_I2(this, 13));
                        String queryParameter = A0A.getQueryParameter("use_case");
                        if (queryParameter == null) {
                            parseInt = AnonymousClass24F.PROACTIVE.A00;
                        } else {
                            parseInt = Integer.parseInt(queryParameter);
                        }
                        C32165H8c A002 = C54472zV.A00(A03, Integer.valueOf(parseInt));
                        C12560m7 supportFragmentManager = getSupportFragmentManager();
                        C10300i6 A032 = r7.A03(this);
                        C04220Ms.A0C(A032, "null cannot be cast to non-null type com.instagram.common.session.Session");
                        C28591uf.A00(supportFragmentManager, this, A002, A032);
                        i = 1569514612;
                    } else {
                        finish();
                        i = -1839206357;
                    }
                }
                C14030oh.A07(i, A00);
            }
        }
        finish();
        i = 1481416160;
        C14030oh.A07(i, A00);
    }
}
