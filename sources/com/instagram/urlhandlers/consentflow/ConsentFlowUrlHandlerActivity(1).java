package com.instagram.urlhandlers.consentflow;

import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.C10300i6;
import X.C115436v4;
import X.C121107Ed;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18250wR;
import X.C61983Wp;
import X.C697349v;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

public final class ConsentFlowUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1230028072);
        this.A00 = C18200wM.A0W(this);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1766739556;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null || A0i.length() == 0) {
                finish();
                i = 1655808254;
            } else {
                Uri A0A = C18210wN.A0A(A0i);
                C10300i6 r4 = this.A00;
                if (r4 == null) {
                    C18250wR.A0l();
                    throw null;
                }
                C697349v r42 = (C697349v) r4.A01(C697349v.class, new KtLambdaShape24S0100000_I2_4(r4, 32));
                String queryParameter = A0A.getQueryParameter("flow_name");
                if (queryParameter != null) {
                    String queryParameter2 = A0A.getQueryParameter("source");
                    String queryParameter3 = A0A.getQueryParameter(C61983Wp.A01(0, 9, 48));
                    String queryParameter4 = A0A.getQueryParameter("app_id");
                    String queryParameter5 = A0A.getQueryParameter("extra_params");
                    Bundle A06 = C18180wK.A06();
                    AnonymousClass3W9.A01(A06, r42.A00);
                    C121107Ed.A00(this, A06, (C115436v4) null, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, (String) null);
                    finish();
                    i = 1868679772;
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
