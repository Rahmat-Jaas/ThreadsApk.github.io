package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass601;
import X.C109326jp;
import X.C39531KvF;
import X.C61043Rr;
import X.C63893iY;

public class IDxEListenerShape312S0200000_1_I2 implements C39531KvF {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEListenerShape312S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A01 = r2;
            this.A00 = r1;
        } else {
            this.A00 = r1;
            this.A01 = r2;
        }
    }

    public final void BvV() {
        if (this.A02 != 0) {
            C109326jp r1 = (C109326jp) this.A01;
            if (r1 != null) {
                C63893iY.A0G((AnonymousClass601) this.A00, r1);
                return;
            }
            return;
        }
        C61043Rr.A00((AnonymousClass601) this.A00, new C63893iY(AnonymousClass0wJ.A0v()), (C109326jp) this.A01);
    }
}
