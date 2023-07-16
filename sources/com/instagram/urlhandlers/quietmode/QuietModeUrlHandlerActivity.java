package com.instagram.urlhandlers.quietmode;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3UZ;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C25786Drz;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class QuietModeUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Uri A00;
        int A002 = C14030oh.A00(-1903474680);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1855730406;
        } else {
            AnonymousClass0RG r6 = AnonymousClass0RA.A0C;
            if ((r6.A03(this) instanceof UserSession) && (A00 = C15430rJ.A00(C18190wL.A0I(), C18190wL.A0i(A0C), true)) != null) {
                String queryParameter = A00.getQueryParameter("entry_point");
                if (queryParameter == null) {
                    queryParameter = "url";
                }
                UserSession A06 = r6.A06(A0C);
                AnonymousClass3UZ r1 = AnonymousClass3UZ.A02;
                if (r1 != null) {
                    Bundle A062 = C18180wK.A06();
                    A062.putString("entrypoint", queryParameter);
                    Fragment A01 = r1.A00().A01(A06, AnonymousClass006.A15);
                    C25786Drz A0Q = C18180wK.A0Q(this, r6.A03(this));
                    A0Q.A0A(A062, A01);
                    C18240wQ.A1B(A0Q);
                    i = 744478757;
                }
            }
            finish();
            i = 744478757;
        }
        C14030oh.A07(i, A002);
    }
}
