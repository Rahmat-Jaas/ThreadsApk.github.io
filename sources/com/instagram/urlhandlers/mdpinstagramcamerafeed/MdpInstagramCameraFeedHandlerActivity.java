package com.instagram.urlhandlers.mdpinstagramcamerafeed;

import X.AnonymousClass3YR;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C159769as;
import X.C18190wL;
import X.C18220wO;
import X.C62333Yi;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class MdpInstagramCameraFeedHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(2137996250);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = -2091791763;
        } else {
            C10300i6 A0S = C18190wL.A0S(bundleExtra);
            this.A00 = A0S;
            if (!(A0S instanceof UserSession)) {
                AnonymousClass3YR.A01(this, A0S);
            } else {
                Intent A003 = C62333Yi.A00(this);
                A003.setData(C18220wO.A0F(C18220wO.A0E("instagram://story-camera"), DatePickerDialogModule.ARG_MODE, C159769as.A00.A00));
                C10650ih.A02(this, A003);
            }
            finish();
            i = -522693786;
        }
        C14030oh.A07(i, A002);
    }
}
