package com.instagram.urlhandlers.messaginghub;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C25786Drz;
import X.C62853b1;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class MessagingHubUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(-1492247491);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || getSession() == null) {
            finish();
            i = -196514653;
        } else {
            if (!(getSession() instanceof UserSession)) {
                AnonymousClass3YR.A00.A02(this, A0C, getSession());
            } else {
                Uri A01 = C15430rJ.A01(C18190wL.A0i(A0C));
                String queryParameter = A01.getQueryParameter("entry_point");
                String queryParameter2 = A01.getQueryParameter("messaging_guidance_hub_type");
                C10300i6 session = getSession();
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("entry_point", queryParameter);
                A0y.put("messaging_guidance_hub_type", queryParameter2);
                C25786Drz A0Q = C18180wK.A0Q(this, session);
                C63743iE A02 = C63743iE.A02("com.instagram.hubs.messaging_guidance.messaging_hub.MessagingHubScreen", A0y);
                IgBloksScreenConfig A0N = C18190wL.A0N(session);
                A0N.A0g = false;
                C18220wO.A1B(C62853b1.A02(A0N, A02), A0Q, false);
            }
            i = -1797563289;
        }
        C14030oh.A07(i, A00);
    }
}
