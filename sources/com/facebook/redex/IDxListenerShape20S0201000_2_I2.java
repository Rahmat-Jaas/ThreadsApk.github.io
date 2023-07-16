package com.facebook.redex;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C139888Pr;
import X.C139898Ps;
import X.C18266Acd;
import X.C20066BMj;
import X.C21325BsW;
import X.Lu1;

public class IDxListenerShape20S0201000_2_I2 implements C21325BsW {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxListenerShape20S0201000_2_I2(int i, int i2, Object obj, Object obj2) {
        this.A03 = i2;
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void C6m(C20066BMj bMj, int i) {
        int i2 = this.A03;
        C04220Ms.A0B(bMj, 0);
        int i3 = this.A00;
        if (i2 != 0) {
            if (i == i3) {
                ((Lu1) this.A02).A00(((C139898Ps) ((AnonymousClass0YY) this.A01)).invoke(bMj));
            }
        } else if (i == i3) {
            ((C18266Acd) this.A02).A00(((C139888Pr) ((AnonymousClass0YY) this.A01)).invoke(bMj));
        }
    }
}
