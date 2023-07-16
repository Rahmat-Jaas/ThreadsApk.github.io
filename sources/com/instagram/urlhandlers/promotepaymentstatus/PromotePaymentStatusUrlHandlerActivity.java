package com.instagram.urlhandlers.promotepaymentstatus;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C63343hJ;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class PromotePaymentStatusUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        double d;
        int i;
        int A002 = C14030oh.A00(68156686);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        this.A00 = C18190wL.A0S(A0B);
        String stringExtra = intent.getStringExtra("account");
        String stringExtra2 = intent.getStringExtra("contextID");
        String stringExtra3 = intent.getStringExtra("paymentID");
        A0B.putString("account", stringExtra);
        A0B.putString("contextID", stringExtra2);
        A0B.putString("paymentID", stringExtra3);
        String stringExtra4 = intent.getStringExtra("originRootTag");
        if (!TextUtils.isEmpty(stringExtra4)) {
            d = Double.parseDouble(stringExtra4);
        } else {
            d = 0.0d;
        }
        A0B.putDouble("originRootTag", d);
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession) || !AnonymousClass0wJ.A0Y(C05030Qo.A02(r1)).A2i()) {
            AnonymousClass3YR.A00.A02(this, A0B, this.A00);
            i = 1705685707;
        } else {
            finish();
            C63343hJ.getInstance().navigateToReactNativeApp(this.A00, "AdsPaymentsPrepayPaymentStatusRoute", A0B);
            i = -241370319;
        }
        C14030oh.A07(i, A002);
    }
}
