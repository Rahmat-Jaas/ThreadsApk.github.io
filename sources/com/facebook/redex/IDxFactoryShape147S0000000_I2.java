package com.facebook.redex;

import X.AnonymousClass05B;
import X.AnonymousClass06G;
import X.C111686o9;
import X.C147138nS;
import X.C62793ak;
import X.C98376Fg;

public class IDxFactoryShape147S0000000_I2 implements C147138nS {
    public final int A00;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public IDxFactoryShape147S0000000_I2(int i) {
        this.A00 = i;
    }

    public final C62793ak create(Class cls) {
        if (this.A00 != 0) {
            return new AnonymousClass06G();
        }
        return new AnonymousClass05B(true);
    }
}
