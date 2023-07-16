package com.instagram.urlhandlers.managesavedlogin;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C25786Drz;
import X.C29221xX;
import X.C63463hW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ManageSavedLoginUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-165347228);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1322208378;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (A0S instanceof UserSession) {
                C25786Drz A0Q = C18180wK.A0Q(this, A0S);
                C18250wR.A18(A0Q);
                C63463hW.A03();
                A0Q.A03 = new C29221xX();
                A0Q.A05();
            } else {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
            }
            i = 1200094852;
        }
        C14030oh.A07(i, A002);
    }
}
