package com.facebook.redex;

import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C109326jp;
import X.C61043Rr;
import X.C63893iY;
import X.C82374pW;

public class IDxICallbackShape297S0200000_1_I2 implements C82374pW {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxICallbackShape297S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A01 = r2;
            this.A00 = r1;
        } else {
            this.A00 = r2;
            this.A01 = r1;
        }
    }

    public final void onBackInvoked() {
        switch (this.A02) {
            case 0:
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                AnonymousClass601 r2 = (AnonymousClass601) this.A01;
                C63893iY.A0F(r2, A002, (C109326jp) this.A00, r2.A00, 0);
                return;
            case 1:
                C63893iY r1 = C63893iY.A01;
                C61043Rr.A00((AnonymousClass601) this.A00, r1, (C109326jp) this.A01);
                return;
            default:
                return;
        }
    }
}
