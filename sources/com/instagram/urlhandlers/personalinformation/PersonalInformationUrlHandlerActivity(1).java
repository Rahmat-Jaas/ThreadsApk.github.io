package com.instagram.urlhandlers.personalinformation;

import X.AnonymousClass054;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C18220wO;
import X.C60113Ns;
import X.C63013bK;
import X.C63803iN;
import X.C683943p;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class PersonalInformationUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass054 A00 = new IDxCListenerShape426S0100000_1_I2(this, 11);

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(131010761);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1792169240;
        } else {
            AnonymousClass0RG r7 = AnonymousClass0RA.A0C;
            if (r7.A03(this) instanceof UserSession) {
                C10300i6 A03 = r7.A03(this);
                C04220Ms.A0C(A03, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
                if (C63803iN.A0E(AnonymousClass0TJ.A05, A03, 36316409504205922L)) {
                    getSupportFragmentManager().A0v(this.A00);
                    C683943p r4 = new C683943p(this);
                    C10300i6 A032 = r7.A03(this);
                    C04220Ms.A0C(A032, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
                    UserSession userSession = (UserSession) A032;
                    C04220Ms.A0B(userSession, 2);
                    schedule(C63013bK.A00(C18220wO.A0T(this, r4, userSession), userSession, "personal_info", "personal_info", false));
                } else {
                    C60113Ns.A01(this, r7.A03(this));
                    throw null;
                }
            } else {
                AnonymousClass3YR.A00.A02(this, A0C, r7.A03(this));
                finish();
            }
            i = -1865582644;
        }
        C14030oh.A07(i, A002);
    }
}
