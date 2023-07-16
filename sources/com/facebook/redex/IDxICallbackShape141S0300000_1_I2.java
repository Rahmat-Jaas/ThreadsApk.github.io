package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C109326jp;
import X.C61043Rr;
import X.C63893iY;
import X.C82374pW;

public class IDxICallbackShape141S0300000_1_I2 implements C82374pW {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxICallbackShape141S0300000_1_I2(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3, int i) {
        this.A03 = i;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onBackInvoked() {
        C63893iY A05 = C63893iY.A05(AnonymousClass3VO.A00(), this.A00, 0);
        C61043Rr.A00((AnonymousClass601) this.A01, A05, (C109326jp) this.A02);
    }
}
