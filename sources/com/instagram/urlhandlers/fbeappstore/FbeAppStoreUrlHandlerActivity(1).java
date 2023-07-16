package com.instagram.urlhandlers.fbeappstore;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C62343Yl;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class FbeAppStoreUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        r0.getClass();
        return r0;
    }

    public final void onCreate(Bundle bundle) {
        C63743iE A02;
        C62343Yl r1;
        int i;
        int A002 = C14030oh.A00(1801562154);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        if (A0B != null) {
            this.A00 = C18190wL.A0S(A0B);
        }
        C10300i6 r12 = this.A00;
        if (r12 == null || (r12 instanceof UserSession)) {
            String stringExtra = intent.getStringExtra("app_id");
            String stringExtra2 = intent.getStringExtra("app_name");
            String stringExtra3 = intent.getStringExtra("app_logo_url");
            String stringExtra4 = intent.getStringExtra("authentication_url");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4)) {
                A02 = C63743iE.A02("com.instagram.fbe.screens.partner_list", AnonymousClass0wJ.A0y());
                C10300i6 r0 = this.A00;
                r0.getClass();
                r1 = new C62343Yl(r0);
                i = 2131823288;
            } else {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("app_id", stringExtra);
                A0y.put("app_name", stringExtra2);
                A0y.put("app_logo_url", stringExtra3);
                A0y.put("authentication_url", stringExtra4);
                A02 = C63743iE.A02("com.instagram.fbe.screens.value_prop", A0y);
                C10300i6 r02 = this.A00;
                r02.getClass();
                r1 = new C62343Yl(r02);
                i = 2131824313;
            }
            String string = getString(i);
            IgBloksScreenConfig igBloksScreenConfig = r1.A00;
            igBloksScreenConfig.A0S = string;
            igBloksScreenConfig.A0e = true;
            C62853b1.A00(igBloksScreenConfig, A02);
            throw null;
        }
        AnonymousClass3YR.A00(this, A0B, r12);
        C14030oh.A07(1092999786, A002);
    }
}
