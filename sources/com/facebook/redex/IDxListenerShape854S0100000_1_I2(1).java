package com.facebook.redex;

import X.AnonymousClass1iX;
import X.AnonymousClass24Z;
import X.AnonymousClass3GB;
import X.AnonymousClass4Aj;
import X.C63713iA;
import X.C82584pw;
import X.M5J;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

public class IDxListenerShape854S0100000_1_I2 implements C82584pw {
    public Object A00;
    public final int A01;

    public IDxListenerShape854S0100000_1_I2(AnonymousClass4Aj r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BrW() {
        Fragment fragment;
        M5J A002;
        int i = this.A01;
        AnonymousClass4Aj r6 = (AnonymousClass4Aj) this.A00;
        if (i != 0) {
            UserSession userSession = r6.A09;
            Fragment fragment2 = r6.A05;
            AnonymousClass4Aj.A05(fragment2, new AnonymousClass1iX(fragment2, r6.A06, r6.A00, r6.A01, userSession, r6.A03), userSession);
            return;
        }
        if (C63713iA.A01) {
            C63713iA.A09(r6.A09, true);
            C63713iA.A01 = false;
        }
        AnonymousClass24Z r5 = r6.A07;
        AnonymousClass3GB r1 = r6.A00;
        if (r1 != null && (fragment = r6.A05) != null && fragment.getActivity() != null && (A002 = r1.A00(r5)) != null) {
            A002.A0C(fragment, new IDxObserverShape212S0100000_3_I2(new IDxObserverShape54S0300000_1_I2(0, r6, r1, r5), 53));
        }
    }
}
