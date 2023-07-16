package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C34640IcN;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public class IgdsTextStyleExampleFragment extends C34640IcN implements C82034oy {
    public UserSession mUserSession;

    public String getModuleName() {
        return "igds_text_style_examples";
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825256);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-426272905);
        super.onCreate(bundle);
        this.mUserSession = C18180wK.A0V(this.mArguments);
        C14030oh.A09(554885437, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1629523170);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.igds_text_style_examples);
        C14030oh.A09(501590629, A02);
        return A0H;
    }
}
