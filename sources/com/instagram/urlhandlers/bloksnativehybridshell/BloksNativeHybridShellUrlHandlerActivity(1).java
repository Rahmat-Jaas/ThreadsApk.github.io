package com.instagram.urlhandlers.bloksnativehybridshell;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C25786Drz;
import X.C29031wa;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.endtoend.EndToEnd;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class BloksNativeHybridShellUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(815493102);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || TextUtils.isEmpty(C18190wL.A0i(A0C)) || !EndToEnd.isRunningEndToEndTest()) {
            finish();
            i = -1412012386;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
                i = -1293062968;
            } else {
                C25786Drz A0Q = C18180wK.A0Q(this, A0S);
                A0Q.A03 = new C29031wa();
                A0Q.A05();
                i = 2053595211;
            }
        }
        C14030oh.A07(i, A002);
    }
}
