package com.instagram.urlhandlers.evergreensafetycheck;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18250wR;
import X.C22871as;
import X.C25786Drz;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class EvergreenSafetyCheckV2UrlHandlerActivity extends BaseFragmentActivity {
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
        String str;
        int A00 = C14030oh.A00(-550968815);
        super.onCreate(bundle);
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, AnonymousClass0wJ.A0C(this), getSession());
        } else {
            C25786Drz A0Q = C18180wK.A0Q(this, getSession());
            C18250wR.A18(A0Q);
            C22871as r3 = new C22871as();
            Bundle A06 = C18180wK.A06();
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("trigger");
            } else {
                str = null;
            }
            A06.putString("trigger", str);
            C18180wK.A0x(A06, r3, A0Q);
        }
        C14030oh.A07(-1624924765, A00);
    }
}
