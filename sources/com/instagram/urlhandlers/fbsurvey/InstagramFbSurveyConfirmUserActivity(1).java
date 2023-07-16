package com.instagram.urlhandlers.fbsurvey;

import X.AnonymousClass00U;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass8bQ;
import X.C10300i6;
import X.C117076y5;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C36941JhV;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;

public final class InstagramFbSurveyConfirmUserActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C14030oh.A00(-324956782);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            str = C18190wL.A0i(A0C);
        } else {
            str = null;
        }
        Uri A01 = C15430rJ.A01(str);
        String queryParameter = A01.getQueryParameter("survey_fbid");
        String queryParameter2 = A01.getQueryParameter("id1");
        String queryParameter3 = A01.getQueryParameter("id2");
        String queryParameter4 = A01.getQueryParameter("id3");
        if (queryParameter == null || C117076y5.A00(queryParameter) == null || queryParameter2 == null || AnonymousClass8bQ.A0n(queryParameter2) || queryParameter3 == null || AnonymousClass8bQ.A0n(queryParameter3) || queryParameter4 == null || AnonymousClass8bQ.A0n(queryParameter4)) {
            finish();
            i = 825538966;
        } else {
            SimpleWebViewActivity.A01.A02(this, getSession(), new C36941JhV(AnonymousClass00U.A0k("https://www.instagram.com/fbsurvey/confirm_user/?survey_fbid=", queryParameter, "&id1=", queryParameter2, "&id2=", queryParameter3, "&id3=", queryParameter4)).A00());
            finish();
            i = -1630098693;
        }
        C14030oh.A07(i, A00);
    }
}
