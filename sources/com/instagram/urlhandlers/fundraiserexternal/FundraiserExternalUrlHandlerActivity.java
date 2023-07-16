package com.instagram.urlhandlers.fundraiserexternal;

import X.AnonymousClass054;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass43F;
import X.AnonymousClass4A9;
import X.C05030Qo;
import X.C10300i6;
import X.C130667qT;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C31155GhB;
import X.C63263h8;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class FundraiserExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;
    public final AnonymousClass054 A01 = new IDxCListenerShape426S0100000_1_I2(this, 8);

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-222218453);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        this.A00 = C18190wL.A0S(A0B);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("fundraiser_id", intent.getStringExtra("fundraiser_id"));
        A0y.put("source_name", intent.getStringExtra("source_name"));
        getSupportFragmentManager().A0v(this.A01);
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            C130667qT A0T = C18220wO.A0T(this, new AnonymousClass43F(), A02);
            AnonymousClass4A9 A003 = C63263h8.A00(A02, "com.instagram.social_impact.fundraiser.personal.details.full_screen_action", A0y);
            A003.A00 = new IDxACallbackShape103S0100000_1_I2(A0T, 13);
            C31155GhB.A03(A003);
        }
        C14030oh.A07(1363554571, A002);
    }
}
