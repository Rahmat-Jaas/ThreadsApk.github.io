package com.instagram.urlhandlers.iab;

import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class InAppBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(80980179);
        super.onCreate(bundle);
        finish();
        C14030oh.A07(-2001068107, A00);
    }
}
