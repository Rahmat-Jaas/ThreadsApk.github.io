package com.instagram.urlhandlers.mdpgroupprofile;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C60113Ns;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class MdpInstagramGroupProfileCreationHandlerActivity extends BaseFragmentActivity {
    public final Handler A00 = AnonymousClass0wJ.A0F();

    public final void A0D(Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0RA.A0C.A07(AnonymousClass0wJ.A0C(this));
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(1492290056);
        super.onCreate(bundle);
        UserSession A07 = AnonymousClass0RA.A0C.A07(AnonymousClass0wJ.A0C(this));
        if (A07 == null) {
            finish();
            C14030oh.A07(27168846, A002);
            return;
        }
        C60113Ns.A01(this, A07);
        throw null;
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(-440031198);
        super.onDestroy();
        this.A00.removeCallbacksAndMessages((Object) null);
        C14030oh.A07(-1641691886, A002);
    }
}
