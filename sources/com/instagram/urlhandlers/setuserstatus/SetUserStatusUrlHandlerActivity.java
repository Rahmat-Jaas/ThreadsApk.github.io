package com.instagram.urlhandlers.setuserstatus;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C63863iT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

public final class SetUserStatusUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C14030oh.A00(1573422277);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -2120542332;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 189181199;
            } else {
                AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
                if (!(r2.A03(this) instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0C, r2.A03(this));
                } else {
                    String queryParameter = C15430rJ.A01(A0i).getQueryParameter("entrypoint");
                    if (queryParameter == null) {
                        queryParameter = "deeplink";
                    }
                    Bundle A06 = C18180wK.A06();
                    C18210wN.A0x(A06, queryParameter);
                    A06.putBoolean("open_music_picker", true);
                    C63863iT.A09(this, A06, r2.A03(this), ModalActivity.class, "set_user_status");
                    finish();
                }
                i = -634629427;
            }
        }
        C14030oh.A07(i, A00);
    }
}
