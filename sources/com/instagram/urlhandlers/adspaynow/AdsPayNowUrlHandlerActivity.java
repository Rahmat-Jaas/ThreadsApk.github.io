package com.instagram.urlhandlers.adspaynow;

import X.AnonymousClass3YR;
import X.AnonymousClass7CU;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C67093yr;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class AdsPayNowUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(602079204);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        if (A0B != null) {
            this.A00 = C18190wL.A0S(A0B);
        }
        String stringExtra = intent.getStringExtra("adAccountID");
        A0B.putString("paymentAccountID", stringExtra);
        A0B.putString("entryPoint", "instagram");
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, r1);
        } else if (!AnonymousClass7CU.A00(stringExtra)) {
            C67093yr.A01(this, (UserSession) r1, stringExtra);
        }
        C14030oh.A07(-1087055987, A002);
    }
}
