package com.instagram.urlhandlers.creatorcollaboration;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass1bX;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class CreatorCollaborationStatusUrlHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C14030oh.A00(-1194750258);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -511730266;
        } else {
            Bundle A0C = AnonymousClass0wJ.A0C(this);
            if (A0C == null) {
                finish();
                i = -902025417;
            } else if (C18190wL.A0i(A0C) == null) {
                finish();
                i = -1103546262;
            } else {
                C10300i6 session = getSession();
                if (!(session instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, session);
                } else {
                    AnonymousClass1bX r1 = new AnonymousClass1bX();
                    r1.setArguments(C18180wK.A09("args_entrypoint", "qp"));
                    C25786Drz A0Q = C18180wK.A0Q(this, session);
                    A0Q.A03 = r1;
                    A0Q.A08();
                    A0Q.A0C = false;
                    A0Q.A05();
                }
                i = -2059034783;
            }
        }
        C14030oh.A07(i, A00);
    }
}
