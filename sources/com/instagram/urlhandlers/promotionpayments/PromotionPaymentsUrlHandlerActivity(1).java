package com.instagram.urlhandlers.promotionpayments;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C35394Iu2;
import X.C37367JqP;
import X.C682342v;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class PromotionPaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(914105282);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0W(this);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            C35394Iu2 iu2 = C35394Iu2.A13;
            AnonymousClass0wJ.A1Q(iu2, A02);
            C37367JqP.A00(this, AnonymousClass06E.A00(this), new C682342v(this, iu2, A02, "promoted_posts"), A02);
        }
        C14030oh.A07(1473740195, A002);
    }
}
