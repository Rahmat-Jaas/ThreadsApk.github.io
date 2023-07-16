package com.instagram.urlhandlers.professionalsignupexternal;

import X.AnonymousClass0wJ;
import X.C05050Qq;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C34502Ju;
import X.C62883b4;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

public final class ProfessionalSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        C10300i6 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(999364440);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        if (A0B != null) {
            this.A00 = C18190wL.A0S(A0B);
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("account_id");
            String stringExtra3 = intent.getStringExtra("fb_page_id");
            String stringExtra4 = intent.getStringExtra("user_type");
            Intent A003 = C62883b4.A00(this);
            C05050Qq.A00(A0B, this.A00);
            if (stringExtra == null) {
                stringExtra = "deep_link";
            }
            C34502Ju.A00();
            C18210wN.A0x(A0B, stringExtra);
            A0B.putInt("business_account_flow", 7);
            A0B.putString("account_id", stringExtra2);
            A0B.putString("user_type", stringExtra4);
            A0B.putString("upsell_page_id", stringExtra3);
            A003.putExtras(A0B);
            C10650ih.A08(this, A003, 12);
        }
        finish();
        C14030oh.A07(1626889403, A002);
    }
}
