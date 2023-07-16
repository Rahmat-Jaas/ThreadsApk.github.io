package com.instagram.urlhandlers.bloksorderreceipt;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C25786Drz;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class BloksOrderReceiptUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(2053078095);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        C10300i6 A0S = C18190wL.A0S(A0B);
        this.A00 = A0S;
        UserSession A02 = C05030Qo.A02(A0S);
        String stringExtra = intent.getStringExtra("order_id");
        C04220Ms.A0B(A02, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("order_id", stringExtra);
        C25786Drz A0Q = C18180wK.A0Q(this, A02);
        C63743iE A022 = C63743iE.A02("com.bloks.www.bloks.commerce.order_summary", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(A02);
        C18210wN.A0s(this, A0N, 2131822384);
        A0N.A0h = true;
        C18220wO.A1B(C62853b1.A02(A0N, A022), A0Q, false);
        C14030oh.A07(1299110281, A002);
    }
}
