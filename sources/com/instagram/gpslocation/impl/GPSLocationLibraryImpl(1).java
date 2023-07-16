package com.instagram.gpslocation.impl;

import X.AnonymousClass779;
import X.AnonymousClass8f3;
import X.C18180wK;
import X.C95345zw;
import android.app.Activity;
import android.os.Bundle;
import com.instagram.service.session.UserSession;

public class GPSLocationLibraryImpl extends AnonymousClass779 {
    public final UserSession A00;

    public C95345zw createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, AnonymousClass8f3 r9, String str, String str2) {
        return new C95345zw(activity, r9, this.A00, str, str2);
    }

    public GPSLocationLibraryImpl(String str) {
        Bundle A06 = C18180wK.A06();
        A06.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        this.A00 = C18180wK.A0V(A06);
    }
}
