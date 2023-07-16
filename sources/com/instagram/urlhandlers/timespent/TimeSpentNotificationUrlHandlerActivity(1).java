package com.instagram.urlhandlers.timespent;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3UZ;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class TimeSpentNotificationUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C14030oh.A00(644920173);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 498372137;
        } else {
            AnonymousClass0RG r3 = AnonymousClass0RA.A0C;
            if (r3.A03(this) instanceof UserSession) {
                UserSession A06 = r3.A06(A0C);
                AnonymousClass3UZ r0 = AnonymousClass3UZ.A02;
                if (r0 != null) {
                    C18180wK.A16(r0.A00().A02(A06, AnonymousClass006.A1C), this, r3.A03(this));
                    i = -1333226748;
                }
            }
            finish();
            i = -1333226748;
        }
        C14030oh.A07(i, A00);
    }
}
