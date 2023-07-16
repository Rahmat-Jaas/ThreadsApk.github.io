package com.facebook;

import X.AnonymousClass01J;
import X.C10090hi;
import X.C10300i6;
import X.C12560m7;
import X.C14030oh;
import X.C16100sU;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C19150zN;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

public final class FacebookActivity extends AppCompatActivity {
    public Fragment A00;

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.A00;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1526783036);
        int A003 = C14030oh.A00(1345302537);
        if (!C16100sU.A00().A01(this, getIntent(), this)) {
            finish();
        }
        if (bundle != null) {
            C10090hi.A00(bundle, getClass().getClassLoader(), C18200wM.A0u());
        }
        super.onCreate(bundle);
        C14030oh.A07(1386702006, A003);
        C10300i6 A0W = C18200wM.A0W(this);
        Bundle A0C = C18190wL.A0C(this);
        if (A0C != null) {
            A0C.getParcelable("Request");
        }
        setContentView((int) R.layout.com_facebook_activity_layout);
        C12560m7 supportFragmentManager = getSupportFragmentManager();
        Fragment A0O = supportFragmentManager.A0O("SingleFragment");
        if (A0O == null) {
            A0O = new C19150zN();
            Bundle bundle2 = A0O.mArguments;
            if (bundle2 == null) {
                bundle2 = C18180wK.A06();
            }
            C18180wK.A0w(bundle2, A0W);
            A0O.setArguments(bundle2);
            A0O.setRetainInstance(true);
            AnonymousClass01J r1 = new AnonymousClass01J(supportFragmentManager);
            r1.A0F(A0O, "SingleFragment", R.id.com_facebook_fragment_container);
            r1.A00();
        }
        this.A00 = A0O;
        C14030oh.A07(-309335048, A002);
    }
}
