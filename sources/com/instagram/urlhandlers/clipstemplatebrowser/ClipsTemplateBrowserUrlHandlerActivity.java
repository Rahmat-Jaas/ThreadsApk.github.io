package com.instagram.urlhandlers.clipstemplatebrowser;

import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C35042Lw;
import X.D33;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ClipsTemplateBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(-1039299021);
        super.onCreate(bundle);
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("entry_point", D33.DEEPLINK);
        C10300i6 A0W = C18200wM.A0W(this);
        C18200wM.A1R(A0W);
        C35042Lw.A00(this, C18230wP.A09(this), A06, (UserSession) A0W);
        C14030oh.A07(1954609503, A00);
    }
}
