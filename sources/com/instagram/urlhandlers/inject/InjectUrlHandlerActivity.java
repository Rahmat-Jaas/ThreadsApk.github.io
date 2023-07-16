package com.instagram.urlhandlers.inject;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18200wM;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class InjectUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        Uri A01;
        int A00 = C14030oh.A00(1785553301);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
            if (r2.A03(this) instanceof UserSession) {
                String A0i = C18190wL.A0i(A0C);
                if (!(A0i == null || (A01 = C15430rJ.A01(A0i)) == null || A01.getQueryParameter("id") == null)) {
                    A01.getQueryParameter("surface");
                }
            } else {
                AnonymousClass3YR.A00.A02(this, A0C, r2.A03(this));
            }
        }
        finish();
        C14030oh.A07(-831597485, A00);
    }
}
