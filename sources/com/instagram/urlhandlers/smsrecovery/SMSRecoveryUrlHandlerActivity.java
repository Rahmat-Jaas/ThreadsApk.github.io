package com.instagram.urlhandlers.smsrecovery;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Set;

public class SMSRecoveryUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(2063933571);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1409521070;
        } else {
            this.A00 = C18190wL.A0S(A0C);
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 1985950037;
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                Bundle A06 = C18180wK.A06();
                Set<String> queryParameterNames = A01.getQueryParameterNames();
                if (queryParameterNames.contains("token") && queryParameterNames.contains("utm_medium")) {
                    C18190wL.A12(A01, A06, "token");
                }
                A0C.putAll(A06);
                A0C.putBoolean("smsrecovery", true);
                C10300i6 r3 = this.A00;
                if (r3 instanceof UserSession) {
                    UserSession userSession = (UserSession) r3;
                    Bundle bundle2 = userSession.multipleAccountHelper.A0C(this, userSession, "settings", false).A00;
                    if (bundle2 != null) {
                        bundle2.putAll(A0C);
                    }
                    AnonymousClass3YR.A00.A02(this, bundle2, this.A00);
                } else {
                    AnonymousClass3YR.A00(this, A0C, r3);
                }
                i = -167142681;
            }
        }
        C14030oh.A07(i, A002);
    }
}
