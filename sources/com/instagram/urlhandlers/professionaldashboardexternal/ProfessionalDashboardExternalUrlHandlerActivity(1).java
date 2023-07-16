package com.instagram.urlhandlers.professionaldashboardexternal;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C63753iH;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class ProfessionalDashboardExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        String str;
        int A00 = C14030oh.A00(-152613700);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            HashMap A0y = AnonymousClass0wJ.A0y();
            Intent intent = getIntent();
            if (intent == null || (str = intent.getStringExtra("origin")) == null || str.length() == 0) {
                str = "deep_link";
            }
            A0y.put("origin", str);
            C63753iH.A0B(this, getSession(), A0y);
        }
        C14030oh.A07(183218028, A00);
    }
}
