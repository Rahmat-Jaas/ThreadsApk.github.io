package com.instagram.urlhandlers.clipsaudio;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C19430AwC;
import X.C25556Dns;
import X.C37220Jmj;
import X.C37235Jn1;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ClipsAudioUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C37220Jmj getGnvGestureHandler() {
        C10300i6 r2 = this.A00;
        if (!C25556Dns.A02(r2)) {
            return null;
        }
        C37220Jmj A002 = C37220Jmj.A00(r2);
        C37235Jn1 A003 = C37235Jn1.A00(r2);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1658449567);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -644313518;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
                i = 253425519;
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (TextUtils.isEmpty(A0i)) {
                    finish();
                    i = 1415340967;
                } else {
                    UserSession userSession = (UserSession) this.A00;
                    AnonymousClass0wJ.A1M(userSession, 0, A0i);
                    if (!C19430AwC.A01(C19430AwC.A00(userSession, A0i, (String) null), false)) {
                        finish();
                    }
                    i = 797943933;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
