package com.instagram.urlhandlers.shopsqareplyprivately;

import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18190wL;
import X.C18200wM;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class ShopsQAReplyPrivatelyUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;
    public UserSession A01;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "manage_qa_private_reply";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(462969872);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 24027386;
        } else {
            AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
            this.A00 = r1.A02(A0C);
            this.A01 = r1.A06(A0C);
            if (this.A00 != null) {
                try {
                    C18190wL.A0J().A00(this, getIntent(), (C16240si) null);
                    String A0i = C18190wL.A0i(A0C);
                    if (A0i != null && !TextUtils.isEmpty(A0i)) {
                        Uri A012 = C15430rJ.A01(A0i);
                        if (this.A01 != null) {
                            A012.getQueryParameter("ig_merchant_fbid");
                        }
                    }
                } catch (SecurityException e) {
                    e = e;
                    str = "Security issue with caller";
                    AnonymousClass0LU.A0E("REPLY_PRIVATELY", str, e);
                    finish();
                    i = 557111538;
                    C14030oh.A07(i, A002);
                } catch (IllegalStateException e2) {
                    e = e2;
                    str = "Failed to verify caller";
                    AnonymousClass0LU.A0E("REPLY_PRIVATELY", str, e);
                    finish();
                    i = 557111538;
                    C14030oh.A07(i, A002);
                }
                finish();
                i = 557111538;
            } else {
                finish();
                i = 1758831755;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(1982405064);
        super.onResume();
        C18200wM.A0z(this);
        C14030oh.A07(-353362607, A002);
    }
}
