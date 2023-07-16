package com.instagram.urlhandlers.proinspiration;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18230wP;
import X.C63753iH;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ProInspirationUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C14030oh.A00(-1042626729);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            str = C18190wL.A0i(A0C);
        } else {
            str = null;
        }
        Uri A01 = C15430rJ.A01(str);
        String queryParameter = A01.getQueryParameter("entry_point");
        String queryParameter2 = A01.getQueryParameter("media_id");
        boolean booleanQueryParameter = A01.getBooleanQueryParameter("should_show_promotion_content", false);
        if (C04220Ms.A0I(A01.toString(), "https://www.instagram.com/linking/inspiration_hub") || C04220Ms.A0I(A01.toString(), "https://instagram.com/linking/inspiration_hub")) {
            booleanQueryParameter = true;
            queryParameter = "deep_link";
        }
        if (A0C != null) {
            A0C.putString("entry_point", queryParameter);
            A0C.putString("media_id", queryParameter2);
            A0C.putBoolean("should_show_promotion_content", booleanQueryParameter);
            C18190wL.A12(A01, A0C, "dummy_param_random_uuid");
            C18230wP.A13(A01, A0C, "has_relaunched_from_main_activity");
        }
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            C63753iH.A06(A0C, this, getSession());
        }
        C14030oh.A07(588382744, A00);
    }
}
