package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C23411dm;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public class IgdsDummyDebugFragment extends C23411dm implements C82034oy {
    public UserSession mUserSession;

    public void configureActionBar(AnonymousClass4u2 r1) {
    }

    public String getModuleName() {
        return "igds_dummy_debug_fragment";
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1919189794);
        super.onCreate(bundle);
        this.mUserSession = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(1652366727, A02);
    }

    public void onResume() {
        int A02 = C14030oh.A02(632032348);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A01("IGDS Dummy Fragment Header", A0v);
        setItems(A0v);
        C14030oh.A09(1055493578, A02);
    }
}
