package com.instagram.urlhandlers.embedsoptout;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1x8;
import X.AnonymousClass3YR;
import X.C06810aP;
import X.C10300i6;
import X.C14030oh;
import X.C169839tz;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C25786Drz;
import X.C63803iN;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class EmbedsOptOutUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(710920144);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 session = getSession();
        if (!(session instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, session);
            finish();
            i = 1402640774;
        } else {
            UserSession userSession = (UserSession) session;
            if (C18200wM.A0a(userSession, C06810aP.A01) == C169839tz.PrivacyStatusPrivate || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316813230869846L)) {
                finish();
                i = -1607754715;
            } else {
                C25786Drz A0Q = C18180wK.A0Q(this, session);
                C18190wL.A10();
                A0Q.A03 = new AnonymousClass1x8();
                C18240wQ.A1B(A0Q);
                i = 1889172697;
            }
        }
        C14030oh.A07(i, A00);
    }
}
