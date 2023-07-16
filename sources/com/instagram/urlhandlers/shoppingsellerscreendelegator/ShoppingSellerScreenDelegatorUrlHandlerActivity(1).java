package com.instagram.urlhandlers.shoppingsellerscreendelegator;

import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C19513Axa;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ShoppingSellerScreenDelegatorUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(844483552);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        if (A0B != null) {
            this.A00 = C18190wL.A0S(A0B);
        }
        UserSession A02 = C05030Qo.A02(this.A00);
        String stringExtra = intent.getStringExtra("entry_point");
        C19513Axa.A00.A18(this, A02, intent.getStringExtra("screen"), stringExtra, C18180wK.A0e());
        C14030oh.A07(160883904, A002);
    }
}
