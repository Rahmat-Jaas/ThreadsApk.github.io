package com.instagram.urlhandlers.familycenter;

import X.AnonymousClass054;
import X.AnonymousClass0wJ;
import X.AnonymousClass2Q8;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C33452Ft;
import X.C84674tf;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class FamilyCenterUrlHandlerActivity extends BaseFragmentActivity {
    public boolean A00 = true;
    public final AnonymousClass054 A01 = new IDxCListenerShape426S0100000_1_I2(this, 7);

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        C84674tf A0Z;
        String A0p;
        String A0p2;
        String A0p3;
        int i;
        int A002 = C14030oh.A00(-1103601008);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -326262922;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = 1460784945;
            } else {
                C10300i6 A0W = C18200wM.A0W(this);
                if (!(A0W instanceof UserSession)) {
                    AnonymousClass3YR.A00(this, A0C, A0W);
                } else {
                    C18210wN.A0o(this, getWindow());
                    getSupportFragmentManager().A0v(this.A01);
                    Uri A0A = C18210wN.A0A(A0i);
                    UserSession userSession = (UserSession) A0W;
                    if ((C18240wQ.A03(A0A) < 1 || (A0p3 = C18190wL.A0p(A0A.getPathSegments(), 0)) == null || !A0p3.equalsIgnoreCase("supervision")) && ((A0Z = AnonymousClass0wJ.A0Y(userSession).A0Z()) == null || !C18190wL.A1Z(A0Z.BTI(), true) || C18240wQ.A03(A0A) < 1 || (((A0p = C18190wL.A0p(A0A.getPathSegments(), 0)) == null || !A0p.equalsIgnoreCase("dashboard")) && ((A0p2 = C18190wL.A0p(A0A.getPathSegments(), 0)) == null || !A0p2.equalsIgnoreCase("share_supervision"))))) {
                        try {
                            AnonymousClass2Q8.A00(String.valueOf(A0A.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused) {
                        }
                    } else {
                        try {
                            AnonymousClass2Q8.A00(String.valueOf(A0A.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused2) {
                        }
                        C33452Ft.A00(this, userSession);
                    }
                }
                i = 622365274;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(-606488147);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C14030oh.A07(-702929793, A002);
    }
}
