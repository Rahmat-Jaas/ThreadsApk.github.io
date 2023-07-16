package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass44U;
import X.AnonymousClass601;
import X.C109326jp;
import X.C63893iY;
import X.C83754rw;
import com.instagram.service.session.UserSession;

public class IDxRCallbackShape39S0400000_1_I2 implements C83754rw {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxRCallbackShape39S0400000_1_I2(AnonymousClass601 r1, C109326jp r2, C109326jp r3, UserSession userSession, int i) {
        this.A04 = i;
        this.A03 = userSession;
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void Bxq() {
        C63893iY.A0G((AnonymousClass601) this.A00, (C109326jp) this.A01);
    }

    public final void CNS(boolean z, boolean z2) {
        int i = this.A04;
        AnonymousClass44U A002 = AnonymousClass44U.A00((UserSession) this.A03);
        if (1 - i != 0) {
            A002.A02(AnonymousClass006.A00, z, false);
        } else {
            A002.A02(AnonymousClass006.A01, z2, false);
        }
        C63893iY.A0G((AnonymousClass601) this.A00, (C109326jp) this.A02);
    }
}
