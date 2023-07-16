package com.instagram.urlhandlers.viewallleads;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C25731Dqw;
import X.C62853b1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ViewAllLeadsUrlHandlerActivity extends BaseFragmentActivity {
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
        Bundle A0B;
        int A00 = C14030oh.A00(-1908872574);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = 2113065347;
        } else {
            String A0i = C18190wL.A0i(A0B);
            if (A0i == null || A0i.length() == 0) {
                finish();
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                if (!(getSession() instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0B, getSession());
                } else {
                    C04220Ms.A06(A01);
                    C10300i6 session = getSession();
                    C04220Ms.A0B(session, 1);
                    AnonymousClass0wJ.A19(C62853b1.A03(session, "com.bloks.www.ig.smb.services.lead_gen.all_leads", C25731Dqw.A00(A01)), this, session);
                }
            }
            i = -1150403338;
        }
        C14030oh.A07(i, A00);
    }
}
