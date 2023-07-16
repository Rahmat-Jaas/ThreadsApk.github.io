package com.instagram.urlhandlers.verifiedusercalling;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C29091wi;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class VerifiedUserCallingUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(-556618715);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 session = getSession();
        if (!(session instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, session);
        } else {
            C18190wL.A10();
            Bundle A06 = C18180wK.A06();
            C18210wN.A0x(A06, "call_settings_megaphone");
            C29091wi r0 = new C29091wi();
            r0.setArguments(A06);
            C18180wK.A16(r0, this, session);
        }
        C14030oh.A07(814273181, A00);
    }
}
