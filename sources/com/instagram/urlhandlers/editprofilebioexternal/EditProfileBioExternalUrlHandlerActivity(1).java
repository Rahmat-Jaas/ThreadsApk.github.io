package com.instagram.urlhandlers.editprofilebioexternal;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C60113Ns;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class EditProfileBioExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(1924472446);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
            C14030oh.A07(-880643221, A00);
            return;
        }
        getSession();
        C60113Ns.A00();
        throw null;
    }
}
