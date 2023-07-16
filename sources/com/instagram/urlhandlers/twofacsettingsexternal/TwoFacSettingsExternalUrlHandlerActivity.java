package com.instagram.urlhandlers.twofacsettingsexternal;

import X.AnonymousClass006;
import X.AnonymousClass054;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C62653aT;
import X.C63013bK;
import X.C63803iN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class TwoFacSettingsExternalUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;
    public final AnonymousClass054 A01 = new IDxCListenerShape426S0100000_1_I2(this, 16);

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "two_fac_settings_url_handler";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-794279072);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -471401363;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
            } else if (C63803iN.A0E(AnonymousClass0TJ.A05, A0S, 36316409504205922L)) {
                getSupportFragmentManager().A0v(this.A01);
                UserSession userSession = (UserSession) this.A00;
                C04220Ms.A0B(userSession, 2);
                schedule(C63013bK.A00(C18220wO.A0T(this, this, userSession), userSession, "two_factor", "two_factor", true));
            } else {
                C10300i6 r3 = this.A00;
                C18190wL.A13(A0C, C05030Qo.A02(r3).token);
                Fragment A012 = C62653aT.A01().A01(AnonymousClass006.A0N, false, false);
                A012.setArguments(A0C);
                C18220wO.A1B(A012, C18180wK.A0Q(this, r3), false);
            }
            i = -1341790147;
        }
        C14030oh.A07(i, A002);
    }
}
