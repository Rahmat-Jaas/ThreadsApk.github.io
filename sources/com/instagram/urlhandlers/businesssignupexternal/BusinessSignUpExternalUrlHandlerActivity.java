package com.instagram.urlhandlers.businesssignupexternal;

import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C05050Qq;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C18200wM;
import X.C18210wN;
import X.C34502Ju;
import X.C62883b4;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public class BusinessSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1276462688);
        super.onCreate(bundle);
        this.A00 = C18200wM.A0W(this);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        C10300i6 r1 = this.A00;
        if (!(r1 instanceof UserSession) || A0B == null) {
            AnonymousClass3YR.A00(this, A0B, r1);
        } else {
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("fb_user_id");
            String stringExtra3 = intent.getStringExtra("page_id");
            Intent A003 = C62883b4.A00(this);
            C05050Qq.A00(A0B, C05030Qo.A02(this.A00));
            C34502Ju.A00();
            C18210wN.A0x(A0B, stringExtra);
            A0B.putInt("business_account_flow", 7);
            A0B.putString("upsell_fb_user_id", stringExtra2);
            A0B.putString("upsell_page_id", stringExtra3);
            A003.putExtras(A0B);
            C10650ih.A08(this, A003, 12);
            finish();
        }
        C14030oh.A07(462613051, A002);
    }
}
