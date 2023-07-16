package com.instagram.urlhandlers.guardianpairing;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2Q8;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C33452Ft;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class GuardianPairingUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(1261131020);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -992028840;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 1464126140;
            } else {
                C10300i6 session = getSession();
                if (!(session instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, session);
                } else {
                    Uri A0A = C18210wN.A0A(A0i);
                    UserSession userSession = (UserSession) session;
                    C04220Ms.A0B(userSession, 1);
                    try {
                        AnonymousClass2Q8.A00(String.valueOf(A0A.getQueryParameter("entry_point")));
                    } catch (IllegalArgumentException unused) {
                    }
                    C33452Ft.A00(this, userSession);
                }
                i = -246218643;
            }
        }
        C14030oh.A07(i, A00);
    }
}
