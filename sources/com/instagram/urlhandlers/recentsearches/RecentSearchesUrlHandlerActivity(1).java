package com.instagram.urlhandlers.recentsearches;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C111986om;
import X.C14030oh;
import X.C18190wL;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class RecentSearchesUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1299366931);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1161485310;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (A0S instanceof UserSession) {
                C25786Drz A0Q = AnonymousClass0wJ.A0Q(this, C05030Qo.A02(A0S));
                A0Q.A0C = false;
                A0Q.A03 = C111986om.A01.A00().A01(A0C, "recent_searches_url");
                A0Q.A05();
            } else {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
            }
            i = -1383026753;
        }
        C14030oh.A07(i, A002);
    }
}
