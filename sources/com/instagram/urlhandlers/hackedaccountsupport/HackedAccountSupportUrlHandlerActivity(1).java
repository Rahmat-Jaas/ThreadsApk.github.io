package com.instagram.urlhandlers.hackedaccountsupport;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C25786Drz;
import X.C63743iE;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxOSessionShape141S0000000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

public final class HackedAccountSupportUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        String A0i;
        int A00 = C14030oh.A00(597402918);
        super.onCreate(bundle);
        AnonymousClass0RA.A0C.A05(new IDxOSessionShape141S0000000_1_I2(4));
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            C18190wL.A13(A0C, "IgSessionManager.LOGGED_OUT_TOKEN");
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (!(A0C == null || (A0i = C18190wL.A0i(A0C)) == null)) {
            C18210wN.A0w(C18210wN.A0A(A0i), "source", A0y);
        }
        C63743iE A02 = C63743iE.A02("com.instagram.account_security.hacked_accounts_support.support_form", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(getSession());
        A0N.A0g = false;
        A0N.A0O = AnonymousClass006.A01;
        Fragment A0B = A02.A0B(this, A0N);
        C25786Drz A0Q = C18180wK.A0Q(this, getSession());
        A0Q.A0D = true;
        A0Q.A03 = A0B;
        A0Q.A05();
        C14030oh.A07(1502984438, A00);
    }
}
