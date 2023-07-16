package com.instagram.urlhandlers.creatorsubscriberchat;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C23511dy;
import X.C25786Drz;
import X.C548530j;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class CreatorSubscriberChatUrlHandlerActivity extends BaseFragmentActivity {
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
        String A0i;
        int A00 = C14030oh.A00(-467947809);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || (A0i = C18190wL.A0i(A0C)) == null || A0i.length() == 0) {
            finish();
            i = 1323313503;
        } else {
            C10300i6 session = getSession();
            if (!(session instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, session);
            } else {
                UserSession userSession = (UserSession) session;
                if (C548530j.A00.A04(userSession)) {
                    C25786Drz A0Q = C18180wK.A0Q(this, userSession);
                    A0Q.A03 = new C23511dy();
                    C18240wQ.A1B(A0Q);
                }
            }
            i = -190932296;
        }
        C14030oh.A07(i, A00);
    }
}
