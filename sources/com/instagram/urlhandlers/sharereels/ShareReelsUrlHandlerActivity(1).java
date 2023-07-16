package com.instagram.urlhandlers.sharereels;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LM;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C171799zz;
import X.C18180wK;
import X.C18200wM;
import X.C18439AfR;
import X.C18534AhA;
import X.C63863iT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;

public final class ShareReelsUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(-1877959846);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            A0C = C18180wK.A06();
        }
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            Bundle A06 = C18180wK.A06();
            A06.putAll(A0C);
            C18534AhA A002 = AnonymousClass3LM.A00();
            C10300i6 session = getSession();
            C18200wM.A1R(session);
            C18439AfR A04 = A002.A04(C171799zz.A2o, (UserSession) session);
            A04.A0g = true;
            A06.putAll(A04.A00());
            A06.putBoolean("modal_dismiss_on_cancel", true);
            C63863iT.A03(this, A06, getSession(), TransparentModalActivity.class, "clips_camera").A0I(this);
            finish();
        }
        C14030oh.A07(-1847603606, A00);
    }
}
