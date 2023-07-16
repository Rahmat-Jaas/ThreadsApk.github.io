package com.facebook.redex;

import X.AnonymousClass8bI;
import X.C142928fp;
import X.C39928L8m;

public class IDxDFunctionShape716S0100000_2_I2 implements C142928fp {
    public Object A00;
    public final int A01;

    public IDxDFunctionShape716S0100000_2_I2(C39928L8m l8m, int i) {
        this.A01 = i;
        this.A00 = l8m;
    }

    public final double BQo(double d) {
        int i = this.A01;
        C39928L8m l8m = (C39928L8m) this.A00;
        double d2 = d;
        if (i != 0) {
            return l8m.A03.BQo(AnonymousClass8bI.A00(d2, (double) l8m.A01, (double) l8m.A00));
        }
        return AnonymousClass8bI.A00(l8m.A05.BQo(d), (double) l8m.A01, (double) l8m.A00);
    }
}
