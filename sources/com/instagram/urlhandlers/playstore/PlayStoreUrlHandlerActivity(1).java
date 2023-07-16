package com.instagram.urlhandlers.playstore;

import X.AnonymousClass0wJ;
import X.C09650fs;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18250wR;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public final class PlayStoreUrlHandlerActivity extends BaseFragmentActivity {
    public final C16240si A00 = C18190wL.A0I();

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String A0p;
        int A002 = C14030oh.A00(-181752981);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1413808573;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -1652316878;
            } else {
                Uri A003 = C15430rJ.A00(this.A00, A0i, false);
                if (A003 == null || A003.getQueryParameter("id") == null) {
                    finish();
                    i = 1569018623;
                } else {
                    Bundle A06 = C18180wK.A06();
                    A06.putString("app_id", A003.getQueryParameter("id"));
                    String queryParameter = A003.getQueryParameter("referrer");
                    if (queryParameter != null) {
                        List A02 = C18250wR.A0h("\\W+").A02(queryParameter, 0);
                        if (A02.size() >= 2 && (A0p = C18190wL.A0p(A02, 0)) != null && A0p.equalsIgnoreCase("utm_source")) {
                            A06.putString("source", C18190wL.A0p(A02, 1));
                        }
                    }
                    C09650fs.A01(this, A06.getString("app_id"), A06.getString("source"));
                    finish();
                    i = 967076366;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
