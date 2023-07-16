package com.instagram.urlhandlers.bloksstepup;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C25786Drz;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class BloksStepUpRouterUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = C14030oh.A00(941041054);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        if (A0B != null) {
            UserSession A06 = r1.A06(A0B);
            this.A00 = A06;
            String stringExtra = intent.getStringExtra("flow_type");
            if (stringExtra != null) {
                String stringExtra2 = intent.getStringExtra("flow_params");
                String stringExtra3 = intent.getStringExtra("ref");
                String stringExtra4 = intent.getStringExtra("upl_session_id");
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("flow_type", stringExtra);
                A0y.put("flow_params", stringExtra2);
                A0y.put("ref", stringExtra3);
                A0y.put("upl_session_id", stringExtra4);
                C25786Drz A0Q = C18180wK.A0Q(this, A06);
                C63743iE A02 = C63743iE.A02("com.bloks.www.bloks.universal_link.step_up.router", A0y);
                IgBloksScreenConfig A0N = C18190wL.A0N(A06);
                A0N.A0S = "";
                C18220wO.A1B(C62853b1.A02(A0N, A02), A0Q, false);
                C14030oh.A07(2001368951, A002);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1803012069;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1457067585;
        }
        C14030oh.A07(i, A002);
        throw illegalStateException;
    }
}
