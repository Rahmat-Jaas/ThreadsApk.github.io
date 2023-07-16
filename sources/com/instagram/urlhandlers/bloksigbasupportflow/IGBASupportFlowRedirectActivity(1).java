package com.instagram.urlhandlers.bloksigbasupportflow;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4To;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C37067Jjv;
import X.C63743iE;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class IGBASupportFlowRedirectActivity extends IgFragmentActivity {
    public C10300i6 A00;
    public UserSession A01;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(513789876);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 2064099731;
        } else {
            AnonymousClass0RG r5 = AnonymousClass0RA.A0C;
            C10300i6 A02 = r5.A02(A0C);
            this.A00 = A02;
            if (!(A02 instanceof UserSession)) {
                AnonymousClass3YR r0 = AnonymousClass3YR.A00;
                C04220Ms.A0A(A02);
                r0.A02(this, A0C, A02);
                i = -1590953790;
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (A0i == null) {
                    finish();
                    i = -906609009;
                } else {
                    Uri A012 = C15430rJ.A01(A0i);
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put("ad_account_id", A012.getQueryParameter("ad_account_id"));
                    A0y.put("ref", A012.getQueryParameter("ref"));
                    HashMap A022 = C37067Jjv.A02(A0y);
                    UserSession A06 = r5.A06(A0C);
                    this.A01 = A06;
                    C04220Ms.A0A(A06);
                    IgBloksScreenConfig A0N = C18190wL.A0N(A06);
                    A0N.A0P = "com.bloks.www.care.ads_payment_support";
                    C63743iE.A04("com.bloks.www.care.ads_payment_support", A022, AnonymousClass4To.A00()).A0C(this, A0N);
                    i = -1157916470;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
