package com.instagram.urlhandlers.editprofileexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C60113Ns;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class EditProfileExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-214540607);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 A0S = C18190wL.A0S(A0C);
        this.A00 = A0S;
        if (!(A0S instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, A0S);
            C14030oh.A07(1261870632, A002);
            return;
        }
        C18190wL.A13(A0C, C05030Qo.A02(A0S).token);
        C60113Ns.A00();
        throw null;
    }
}
