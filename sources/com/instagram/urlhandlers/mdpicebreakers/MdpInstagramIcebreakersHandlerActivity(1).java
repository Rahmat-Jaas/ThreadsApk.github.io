package com.instagram.urlhandlers.mdpicebreakers;

import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C23411dm;
import X.C25786Drz;
import X.KK1;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment;
import com.instagram.service.session.UserSession;

public class MdpInstagramIcebreakersHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        C25786Drz A0Q;
        int i;
        int A002 = C14030oh.A00(1331721345);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -1860075691;
        } else {
            C10300i6 A0S = C18190wL.A0S(bundleExtra);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A01(this, A0S);
            } else {
                KK1 A003 = KK1.A00((UserSession) A0S);
                synchronized (A003) {
                    A003.A05 = null;
                }
                A003.A06();
                String stringExtra = intent.getStringExtra("entrypoint");
                if ("business_hub".equals(stringExtra) || "pro_home".equals(stringExtra) || "inbox_tool".equals(stringExtra)) {
                    A0Q = C18180wK.A0Q(this, this.A00);
                    A0Q.A0C = false;
                } else {
                    C25786Drz A0Q2 = C18180wK.A0Q(this, this.A00);
                    C18250wR.A18(A0Q2);
                    C23411dm.A06(A0Q2);
                    A0Q = C18180wK.A0Q(this, this.A00);
                }
                A0Q.A08();
                C18190wL.A10();
                A0Q.A03 = new DirectIceBreakerSettingFragment();
                A0Q.A05();
            }
            i = -2090218155;
        }
        C14030oh.A07(i, A002);
    }
}
