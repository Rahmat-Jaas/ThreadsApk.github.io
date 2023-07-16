package com.instagram.urlhandlers.directexternal;

import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class DirectExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-2007325575);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        C10300i6 A0S = C18190wL.A0S(A0B);
        this.A00 = A0S;
        if (!(A0S instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, A0S);
            C14030oh.A07(-1063657406, A002);
            return;
        }
        C05030Qo.A02(A0S);
        C18180wK.A06().putString("entry_point", intent.getStringExtra("entry_point"));
        throw C18200wM.A0d();
    }
}
