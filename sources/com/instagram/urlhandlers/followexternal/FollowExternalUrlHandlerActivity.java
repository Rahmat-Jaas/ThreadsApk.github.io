package com.instagram.urlhandlers.followexternal;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C63753iH;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public class FollowExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1011774531);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        A0C.getClass();
        this.A00 = C18190wL.A0S(A0C);
        String A0i = C18190wL.A0i(A0C);
        if (A0i == null) {
            i = 315873242;
        } else {
            A0C.putString("short_url", A0i);
            List<String> pathSegments = C15430rJ.A01(A0i).getPathSegments();
            if (pathSegments.size() < 2) {
                i = -924608750;
            } else {
                A0C.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", C18190wL.A0p(pathSegments, 1));
                C63753iH.A09(A0C, this, this.A00);
                i = -1487049383;
            }
        }
        C14030oh.A07(i, A002);
    }
}
