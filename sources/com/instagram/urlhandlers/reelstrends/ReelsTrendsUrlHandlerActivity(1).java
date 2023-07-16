package com.instagram.urlhandlers.reelstrends;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18250wR;
import X.C563236s;
import X.C63863iT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ReelsTrendsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(1775180273);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            A0C = C18180wK.A06();
        }
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            C10300i6 session = getSession();
            if (C563236s.A01 == null) {
                C18250wR.A0k();
                throw null;
            }
            UserSession A02 = C05030Qo.A02(session);
            C04220Ms.A0B(A02, 0);
            C63863iT.A0A(this, C18180wK.A06(), A02, "trend");
            finish();
        }
        C14030oh.A07(-1620074301, A00);
    }
}
