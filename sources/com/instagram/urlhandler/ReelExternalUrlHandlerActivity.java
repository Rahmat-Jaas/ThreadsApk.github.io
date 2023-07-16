package com.instagram.urlhandler;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public class ReelExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-2058561425);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        this.A00 = C18190wL.A0S(A0C);
        String A0i = C18190wL.A0i(A0C);
        if (A0i == null) {
            finish();
            i = -644339325;
        } else {
            if (A0i.indexOf("applink") != -1) {
                A0i = A0i.replace("applink", "www");
            }
            A0C.putString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL", A0i);
            C10300i6 r1 = this.A00;
            if (r1 == null || !(r1 instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, r1);
            } else {
                IgFragmentFactoryImpl.A00();
                ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = new ShortUrlReelLoadingFragment();
                C18180wK.A0w(A0C, r1);
                shortUrlReelLoadingFragment.setArguments(A0C);
                C18180wK.A16(shortUrlReelLoadingFragment, this, r1);
            }
            i = -84694532;
        }
        C14030oh.A07(i, A002);
    }
}
