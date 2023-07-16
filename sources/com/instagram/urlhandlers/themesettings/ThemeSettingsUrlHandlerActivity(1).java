package com.instagram.urlhandlers.themesettings;

import X.AnonymousClass0wJ;
import X.AnonymousClass1wM;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ThemeSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-1529676894);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || TextUtils.isEmpty(C18190wL.A0i(A0C))) {
            finish();
            i = 1382676714;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
            } else {
                C18180wK.A0w(A0C, A0S);
                C18190wL.A10();
                C18180wK.A16(new AnonymousClass1wM(), this, this.A00);
            }
            i = -64476906;
        }
        C14030oh.A07(i, A002);
    }
}
