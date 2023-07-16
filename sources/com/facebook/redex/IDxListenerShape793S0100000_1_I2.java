package com.facebook.redex;

import X.AnonymousClass3BS;
import X.AnonymousClass3FS;
import X.AnonymousClass48x;
import X.AnonymousClass49I;
import X.C82574pv;

public class IDxListenerShape793S0100000_1_I2 implements C82574pv {
    public Object A00;
    public final int A01;

    public IDxListenerShape793S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Byn(AnonymousClass3BS r3) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass48x) this.A00).A00 = r3.A01;
                return;
            case 1:
                ((AnonymousClass49I) this.A00).A00 = r3;
                return;
            default:
                ((AnonymousClass3FS) this.A00).A00 = r3.A00;
                return;
        }
    }
}
