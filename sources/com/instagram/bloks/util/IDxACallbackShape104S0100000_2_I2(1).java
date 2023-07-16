package com.instagram.bloks.util;

import X.AnonymousClass0wJ;
import X.AnonymousClass1eT;
import X.AnonymousClass3XX;
import X.AnonymousClass5x7;
import X.C04220Ms;
import X.C130667qT;
import X.C18250wR;
import X.C30938GbW;
import X.C33492Fx;
import X.C61323St;
import X.C86124wJ;
import X.LWN;
import androidx.fragment.app.Fragment;

public class IDxACallbackShape104S0100000_2_I2 extends AnonymousClass1eT {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape104S0100000_2_I2(Object obj, int i) {
        super(false);
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A03(AnonymousClass3XX r3) {
        if (this.A01 != 0) {
            C86124wJ.A1H((Fragment) this.A00);
            return;
        }
        C04220Ms.A0B(r3, 0);
        LWN lwn = (LWN) this.A00;
        Throwable th = r3.A01;
        if (th == null) {
            th = C18250wR.A0V("Network error in InstagramConsentBloksActionLauncher");
        }
        lwn.setException(th);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        if (this.A01 != 0) {
            C61323St r4 = (C61323St) obj;
            C04220Ms.A0B(r4, 0);
            AnonymousClass5x7 r2 = (AnonymousClass5x7) this.A00;
            C33492Fx.A00(C130667qT.A02(r2, AnonymousClass0wJ.A0U(r2.A0A), (C30938GbW) null), r4);
            return;
        }
        C04220Ms.A0B(obj, 0);
        ((LWN) this.A00).set(obj);
    }
}
