package com.instagram.urlhandlers.events;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18200wM;
import X.C62333Yi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class EventsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        Uri A01;
        int A00 = C14030oh.A00(-1983947803);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (!(A0C == null || A0C.getString("original_url") == null)) {
            C10300i6 A0W = C18200wM.A0W(this);
            if (A0W instanceof UserSession) {
                String queryParameter = C15430rJ.A01(A0C.getString("original_url")).getQueryParameter("event_id");
                if (!(queryParameter == null || queryParameter.length() == 0)) {
                    String string = A0C.getString("original_url");
                    if (!(string == null || (A01 = C15430rJ.A01(string)) == null)) {
                        Intent A002 = C62333Yi.A00(this);
                        A002.setData(A01);
                        C10650ih.A02(this, A002);
                    }
                }
            } else {
                AnonymousClass3YR.A00(this, A0C, A0W);
            }
            C14030oh.A07(-109384102, A00);
        }
        finish();
        C14030oh.A07(-109384102, A00);
    }
}
