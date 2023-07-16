package com.instagram.urlhandlers.languagesettings;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1wO;
import X.C04220Ms;
import X.C05030Qo;
import X.C05050Qq;
import X.C10300i6;
import X.C111986om;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C22721Ze;
import X.C63803iN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class LanguageSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Fragment r1;
        int A00 = C14030oh.A00(977308490);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        String str = null;
        if (A0C != null) {
            str = C18190wL.A0i(A0C);
        }
        String host = C15430rJ.A01(str).getHost();
        AnonymousClass0RG r5 = AnonymousClass0RA.A0C;
        UserSession A02 = C05030Qo.A02(r5.A03(this));
        if (C04220Ms.A0I(host, "app_language_setting")) {
            r1 = C111986om.A01.A00().A02(A02);
        } else {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, A02, 36325733877949669L)) {
                if (C04220Ms.A0I(host, "languages_settings")) {
                    C18190wL.A10();
                    r1 = new AnonymousClass1wO();
                } else if (C04220Ms.A0I(host, "content_language_settings")) {
                    C18190wL.A10();
                    C04220Ms.A0B(A02, 0);
                    r1 = new C22721Ze();
                    Bundle A06 = C18180wK.A06();
                    C05050Qq.A00(A06, A02);
                    r1.setArguments(A06);
                }
            }
            i = 420338447;
            C14030oh.A07(i, A00);
        }
        C18230wP.A19(r1, C18180wK.A0Q(this, r5.A03(this)));
        i = -1454337972;
        C14030oh.A07(i, A00);
    }
}
