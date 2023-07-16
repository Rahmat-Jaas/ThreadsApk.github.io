package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass01J;
import X.AnonymousClass5xH;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class InstantExperiencesBrowserActivity extends IgFragmentActivity {
    public Fragment A00;
    public UserSession A01;

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onBackPressed() {
        if (!((AnonymousClass5xH) this.A00).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(410757087);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(C18190wL.A0C(this));
        setContentView((int) R.layout.instant_experiences_browser_main);
        if (bundle == null) {
            AnonymousClass5xH r1 = new AnonymousClass5xH();
            this.A00 = r1;
            r1.setArguments(C18190wL.A0C(this));
            AnonymousClass01J A0L = C18220wO.A0L(this);
            A0L.A0C(this.A00, R.id.instant_experience_fragment_container);
            A0L.A00();
        } else {
            this.A00 = getSupportFragmentManager().A0M(bundle, "instant_experiences_browser_fragment");
        }
        C14030oh.A07(499206163, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSupportFragmentManager().A0h(bundle, this.A00, "instant_experiences_browser_fragment");
    }
}
