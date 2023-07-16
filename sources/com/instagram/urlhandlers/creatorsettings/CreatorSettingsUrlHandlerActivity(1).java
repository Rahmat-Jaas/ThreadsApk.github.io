package com.instagram.urlhandlers.creatorsettings;

import X.AnonymousClass0wJ;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C23411dm;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class CreatorSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1885806477);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -188040232;
        } else if (C18190wL.A0i(A0C) == null) {
            finish();
            i = -379854732;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            C25786Drz A0Q = C18180wK.A0Q(this, C05030Qo.A02(A0S));
            A0Q.A0C = false;
            C23411dm.A06(A0Q);
            i = 904589070;
        }
        C14030oh.A07(i, A002);
    }
}
