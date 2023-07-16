package com.instagram.urlhandlers.contactimportsettingsexternal;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass1wb;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class ContactImportSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(-1707017256);
        super.onCreate(bundle);
        if (getSession() instanceof UserSession) {
            C25786Drz A0Q = C18180wK.A0Q(this, getSession());
            IgFragmentFactoryImpl.A00();
            A0Q.A03 = new AnonymousClass1wb();
            C18240wQ.A1B(A0Q);
        } else {
            AnonymousClass3YR.A00.A02(this, bundle, getSession());
            finish();
        }
        C14030oh.A07(-1949387489, A00);
    }
}
