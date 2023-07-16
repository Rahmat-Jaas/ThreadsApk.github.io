package com.instagram.urlhandlers.emailconfirm;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C62333Yi;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.List;

public class EmailConfirmExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-720378091);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        this.A00 = C18190wL.A0S(A0C);
        String A0i = C18190wL.A0i(A0C);
        if (A0i == null) {
            finish();
            i = -409785126;
        } else {
            List<String> pathSegments = C15430rJ.A01(A0i).getPathSegments();
            Bundle A06 = C18180wK.A06();
            A06.putString("EMAIL_NONCE", C18190wL.A0p(pathSegments, 2));
            A06.putString("ENCODED_EMAIL", C18190wL.A0p(pathSegments, 3));
            A0C.putAll(A06);
            C10300i6 r4 = this.A00;
            if (!(r4 instanceof UserSession)) {
                Bundle A062 = C18180wK.A06();
                A062.putBoolean("allow_confirm_email", true);
                A062.putString("confirm_email_nonce", A0C.getString("EMAIL_NONCE"));
                A062.putString("confirm_email_encoded_email", A0C.getString("ENCODED_EMAIL"));
                AnonymousClass3YR.A00(this, A062, r4);
            } else {
                Intent A03 = C62333Yi.A01().A03(this, 0);
                A03.setData(C15430rJ.A01(C18180wK.A0j("https://confirm_email/?nonce=%s&encoded_email=%s", new Object[]{A0C.getString("EMAIL_NONCE"), A0C.getString("ENCODED_EMAIL")})));
                C10650ih.A02(this, A03);
                finish();
            }
            i = -637519385;
        }
        C14030oh.A07(i, A002);
    }
}
