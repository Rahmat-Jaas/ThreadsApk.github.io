package com.instagram.urlhandlers.followandinvitefriends;

import X.AnonymousClass1wH;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C25786Drz;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public class FollowAndInviteFriendsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-1447095756);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = 904730028;
        } else {
            C10300i6 A0S = C18190wL.A0S(bundleExtra);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A01(this, A0S);
            } else {
                C25786Drz A0Q = C18180wK.A0Q(this, C05030Qo.A02(A0S));
                C18250wR.A18(A0Q);
                C18190wL.A10();
                A0Q.A03 = new AnonymousClass1wH();
                A0Q.A05();
            }
            i = 1817454452;
        }
        C14030oh.A07(i, A002);
    }
}
