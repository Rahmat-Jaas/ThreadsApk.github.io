package com.instagram.urlhandlers.viewprofile;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass44O;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C50382su;
import X.C60113Ns;
import X.C60853Qu;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ViewProfileUrlHandlerActivity extends BaseFragmentActivity {
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
        String A0i;
        int A00 = C14030oh.A00(2034507385);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 session = getSession();
        if (!(session instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, session);
        } else {
            if (!(A0C == null || (A0i = C18190wL.A0i(A0C)) == null || A0i.length() <= 0)) {
                UserSession userSession = (UserSession) session;
                C04220Ms.A0B(userSession, 1);
                try {
                    Uri A01 = C15430rJ.A01(A0i);
                    if ("user".equalsIgnoreCase(A01.getHost())) {
                        String queryParameter = A01.getQueryParameter("id");
                        String queryParameter2 = A01.getQueryParameter("id_type");
                        C50382su.A00(A01);
                        if (!(queryParameter == null || queryParameter.length() <= 0 || queryParameter2 == null)) {
                            if (queryParameter2.equals("fbid")) {
                                C60853Qu.A00(this, AnonymousClass44O.A00, userSession, AnonymousClass0wJ.A0d(queryParameter), "ig_direct");
                            } else if (queryParameter2.equals("igid")) {
                                C60113Ns.A01(this, userSession);
                                throw null;
                            }
                        }
                    }
                } catch (SecurityException unused) {
                    finish();
                }
            }
            finish();
        }
        C14030oh.A07(2065906663, A00);
    }
}
