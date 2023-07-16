package com.instagram.urlhandlers.bloksordershub;

import X.AnonymousClass3ib;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class BloksOrdersHubUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(890632314);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        C10300i6 A0S = C18190wL.A0S(A0B);
        this.A00 = A0S;
        AnonymousClass3ib.A0J(this, C05030Qo.A02(A0S), intent.getStringExtra("referrer_surface"), intent.getStringExtra("additional_logging_data"), intent.getStringExtra("deeplink_destination"), intent.getStringExtra("deeplink_destination_params"));
        C14030oh.A07(1300214731, A002);
    }
}
