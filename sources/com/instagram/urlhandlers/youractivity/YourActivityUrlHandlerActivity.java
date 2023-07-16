package com.instagram.urlhandlers.youractivity;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

public final class YourActivityUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(496547428);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = -350672374;
        } else {
            String A0i = C18190wL.A0i(A0B);
            if (A0i == null || A0i.length() == 0) {
                finish();
                i = 342559816;
            } else {
                C10300i6 session = getSession();
                if (!(session instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0B, session);
                } else {
                    C63743iE A02 = C63743iE.A02("com.instagram.privacy.activity_center.activity_center_entry_business_screen", AnonymousClass0wJ.A0y());
                    IgBloksScreenConfig A0N = C18190wL.A0N(session);
                    A0N.A0S = "Your activity";
                    C18180wK.A16(C62853b1.A02(A0N, A02), this, session);
                }
                i = -621034905;
            }
        }
        C14030oh.A07(i, A00);
    }
}
