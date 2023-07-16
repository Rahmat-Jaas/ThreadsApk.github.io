package com.instagram.urlhandlers.activepromotions;

import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C34552Jz;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ActivePromotionsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A002 = C14030oh.A00(-1582337933);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        this.A00 = C18190wL.A0S(A0B);
        String A0i = C18190wL.A0i(A0B);
        if (A0i != null) {
            Uri A01 = C15430rJ.A01(A0i);
            C18190wL.A12(A01, A0B, "coupon_offer_id");
            C18190wL.A12(A01, A0B, "entry_point");
            C18190wL.A12(A01, A0B, "dummy_param_random_uuid");
            C18230wP.A13(A01, A0B, "has_relaunched_from_main_activity");
        }
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, r1);
        } else {
            UserSession A02 = C05030Qo.A02(r1);
            if (intent.getStringExtra("entrypoint") != null) {
                str = intent.getStringExtra("entrypoint");
            } else {
                str = "DEEPLINK_UNKNOWN";
            }
            if ("inbox_tool".equals(str)) {
                C34552Jz.A00().A01(this, A02, str, (String) null, true);
            } else {
                C34552Jz.A00().A00(A0B, this, A02, str);
            }
        }
        C14030oh.A07(-157344732, A002);
    }
}
