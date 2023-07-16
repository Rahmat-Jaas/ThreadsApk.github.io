package com.instagram.urlhandlers.businessprofilecalling;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class BusinessProfileCallingUrlHandlerActivity extends UserSessionUrlHandlerActivity {
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
}
