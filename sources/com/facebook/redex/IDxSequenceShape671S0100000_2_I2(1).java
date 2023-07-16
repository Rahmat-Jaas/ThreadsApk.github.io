package com.facebook.redex;

import X.AnonymousClass0YP;
import X.C1366983y;
import X.C146838mw;
import X.C25598DoY;
import java.util.Iterator;

public class IDxSequenceShape671S0100000_2_I2 implements C146838mw {
    public Object A00;
    public final int A01;

    public IDxSequenceShape671S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Iterator iterator() {
        if (this.A01 != 0) {
            return (Iterator) this.A00;
        }
        C1366983y r1 = new C1366983y();
        r1.A02 = C25598DoY.A01(r1, r1, (AnonymousClass0YP) this.A00);
        return r1;
    }
}
