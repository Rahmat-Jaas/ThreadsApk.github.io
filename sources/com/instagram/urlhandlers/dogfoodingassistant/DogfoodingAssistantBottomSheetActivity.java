package com.instagram.urlhandlers.dogfoodingassistant;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18200wM;
import X.C62333Yi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class DogfoodingAssistantBottomSheetActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        Uri A01;
        int A00 = C14030oh.A00(98993134);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            C10300i6 A0S = C18190wL.A0S(A0C);
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A00(this, A0C, A0S);
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (!(A0i == null || (A01 = C15430rJ.A01(A0i)) == null)) {
                    Intent A002 = C62333Yi.A00(this);
                    A002.setData(A01);
                    C10650ih.A02(this, A002);
                }
            }
            finish();
            C14030oh.A07(1805641992, A00);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A07(-1224468171, A00);
        throw A0b;
    }
}
