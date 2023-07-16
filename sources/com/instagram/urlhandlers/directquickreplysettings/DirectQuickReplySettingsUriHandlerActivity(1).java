package com.instagram.urlhandlers.directquickreplysettings;

import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18250wR;
import X.C23411dm;
import X.C25786Drz;
import X.C35092Mb;
import X.KK0;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class DirectQuickReplySettingsUriHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-828914345);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -55011619;
        } else {
            C10300i6 A0S = C18190wL.A0S(bundleExtra);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A01(this, A0S);
            } else {
                UserSession A02 = C05030Qo.A02(A0S);
                String stringExtra = intent.getStringExtra("entrypoint");
                if (C35092Mb.A00(A02)) {
                    if ("business_hub".equals(stringExtra) || "pro_home".equals(stringExtra) || "inbox_tool".equals(stringExtra)) {
                        KK0.A00(C05030Qo.A02(this.A00)).A02();
                    } else {
                        C25786Drz A0Q = C18180wK.A0Q(this, this.A00);
                        C18250wR.A18(A0Q);
                        C23411dm.A06(A0Q);
                    }
                    new C25786Drz(this, this.A00);
                    throw C18200wM.A0d();
                }
            }
            i = -236152466;
        }
        C14030oh.A07(i, A002);
    }
}
