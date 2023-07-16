package com.instagram.urlhandlers.directwelcomemessagesetting;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass1aY;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class DirectWelcomeMessageSettingUriHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(1789310853);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            C25786Drz A0Q = C18180wK.A0Q(this, getSession());
            C18250wR.A18(A0Q);
            C18190wL.A10();
            A0Q.A03 = new AnonymousClass1aY();
            A0Q.A05();
        }
        C14030oh.A07(1829304051, A00);
    }
}
