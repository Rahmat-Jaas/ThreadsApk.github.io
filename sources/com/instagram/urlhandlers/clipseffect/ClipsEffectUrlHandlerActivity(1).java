package com.instagram.urlhandlers.clipseffect;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C19430AwC;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ClipsEffectUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1660153787);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 49830779;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
                i = -789622189;
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (TextUtils.isEmpty(A0i)) {
                    finish();
                    i = -1625735516;
                } else {
                    UserSession userSession = (UserSession) this.A00;
                    AnonymousClass0wJ.A1M(userSession, 0, A0i);
                    if (!C19430AwC.A01(C19430AwC.A00(userSession, A0i, (String) null), false)) {
                        finish();
                    }
                    i = -1028456847;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
