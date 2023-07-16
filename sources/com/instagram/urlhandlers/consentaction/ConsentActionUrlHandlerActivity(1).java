package com.instagram.urlhandlers.consentaction;

import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LR;
import X.C04690Os;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18190wL;
import X.C18200wM;
import X.C63803iN;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

public class ConsentActionUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;
    public UserSession A01;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return "consent_action";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(777913492);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -893279103;
        } else {
            AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
            this.A00 = r1.A02(A0C);
            this.A01 = r1.A06(A0C);
            if (this.A00 != null) {
                try {
                    C18190wL.A0J().A00(this, getIntent(), (C16240si) null);
                    UserSession userSession = this.A01;
                    if (userSession != null) {
                        C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313179688797532L);
                    }
                    String A0i = C18190wL.A0i(A0C);
                    if (A0i != null) {
                        Uri A012 = C15430rJ.A01(A0i);
                        if (!TextUtils.isEmpty(A0i) && this.A01 != null) {
                            String queryParameter = A012.getQueryParameter("params");
                            UserSession userSession2 = this.A01;
                            if (queryParameter != null) {
                                try {
                                    HashMap A003 = AnonymousClass2LR.A00(C04690Os.A02.A04(userSession2, queryParameter));
                                    if (A003 != null) {
                                        A003.isEmpty();
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    str = "Security issue with caller";
                    AnonymousClass0LU.A0E("CONSENT_ACTION", str, e);
                    finish();
                    i = -1319127498;
                    C14030oh.A07(i, A002);
                } catch (IllegalStateException e3) {
                    e = e3;
                    str = "Failed to verify caller";
                    AnonymousClass0LU.A0E("CONSENT_ACTION", str, e);
                    finish();
                    i = -1319127498;
                    C14030oh.A07(i, A002);
                }
                finish();
                i = -1319127498;
            } else {
                finish();
                i = -2086490636;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(-1557060764);
        super.onResume();
        C18200wM.A0z(this);
        C14030oh.A07(-1473240209, A002);
    }
}
