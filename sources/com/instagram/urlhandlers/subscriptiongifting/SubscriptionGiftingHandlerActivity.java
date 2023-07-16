package com.instagram.urlhandlers.subscriptiongifting;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WJ;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C62853b1;
import X.C63203gz;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class SubscriptionGiftingHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String queryParameter;
        int A00 = C14030oh.A00(-1011226050);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1190940850;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -1297258786;
            } else {
                Uri A01 = C15430rJ.A01(A0i);
                if (A01 == null || (queryParameter = A01.getQueryParameter("gift_id")) == null) {
                    finish();
                    i = -1730898190;
                } else {
                    UserSession A0V = C18180wK.A0V(A0C);
                    AnonymousClass3WJ.A02();
                    C18230wP.A19(C62853b1.A03(A0V, "com.instagram.user_pay.fan_club.screens.gifting_received_confirmation", C63203gz.A03("gift_id", queryParameter)), AnonymousClass0wJ.A0Q(this, A0V));
                    i = 310904371;
                }
            }
        }
        C14030oh.A07(i, A00);
    }
}
