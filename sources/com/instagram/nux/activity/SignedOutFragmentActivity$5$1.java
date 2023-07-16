package com.instagram.nux.activity;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass06E;
import X.AnonymousClass0gN;
import X.AnonymousClass0wJ;
import X.AnonymousClass1TG;
import X.AnonymousClass1hB;
import X.AnonymousClass1mc;
import X.AnonymousClass38W;
import X.AnonymousClass3CO;
import X.AnonymousClass3PQ;
import X.C10300i6;
import X.C14260p5;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C31155GhB;
import X.C32165H8c;
import X.H1T;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class SignedOutFragmentActivity$5$1 implements C14260p5 {
    public final /* synthetic */ AnonymousClass38W A00;

    public SignedOutFragmentActivity$5$1(AnonymousClass38W r1) {
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r6, AnonymousClass066 r7) {
        if (r6 == AnonymousClass060.ON_RESUME) {
            AnonymousClass38W r1 = this.A00;
            SignedOutFragmentActivity signedOutFragmentActivity = r1.A01;
            signedOutFragmentActivity.mLifecycleRegistry.A08(this);
            if (signedOutFragmentActivity.A08) {
                SignedOutFragmentActivity.A00(signedOutFragmentActivity);
            }
            Bundle bundle = r1.A00;
            if (C18230wP.A0I(signedOutFragmentActivity) == null) {
                AnonymousClass0gN.A00().AKp(new AnonymousClass1mc(bundle, signedOutFragmentActivity));
            }
            if (bundle.getBoolean("allow_confirm_email")) {
                AnonymousClass3CO r3 = new AnonymousClass3CO(signedOutFragmentActivity, signedOutFragmentActivity.A04, C18190wL.A0j(bundle, "confirm_email_nonce"), C18190wL.A0j(bundle, "confirm_email_encoded_email"));
                C10300i6 r2 = r3.A02;
                String str = r3.A04;
                String str2 = r3.A03;
                H1T A0N = AnonymousClass0wJ.A0N(r2);
                A0N.A0T("accounts/confirm_email/%s/%s/", str, str2);
                C32165H8c A0T = C18180wK.A0T(A0N, AnonymousClass1TG.class, AnonymousClass3PQ.class);
                A0T.A00 = new AnonymousClass1hB(r3);
                BaseFragmentActivity baseFragmentActivity = r3.A01;
                C31155GhB.A01(baseFragmentActivity, AnonymousClass06E.A00(baseFragmentActivity), A0T);
            }
        }
    }
}
