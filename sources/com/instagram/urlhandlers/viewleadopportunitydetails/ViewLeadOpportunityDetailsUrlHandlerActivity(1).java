package com.instagram.urlhandlers.viewleadopportunitydetails;

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
import X.C62853b1;
import X.C63203gz;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ViewLeadOpportunityDetailsUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(1416655291);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = -447395589;
        } else {
            String A0i = C18190wL.A0i(A0B);
            if (A0i == null || A0i.length() == 0) {
                finish();
            } else {
                String lastPathSegment = C15430rJ.A01(A0i).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                if (!(getSession() instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0B, getSession());
                } else {
                    C10300i6 session = getSession();
                    C04220Ms.A0B(session, 1);
                    AnonymousClass0wJ.A19(C62853b1.A03(session, "com.bloks.www.ig.smb.services.lead_gen.opportunity_details", C63203gz.A03("lead_opportunity_id", lastPathSegment)), this, session);
                }
            }
            i = 1291457432;
        }
        C14030oh.A07(i, A00);
    }
}
