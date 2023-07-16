package com.facebook.redex;

import X.AnonymousClass0MZ;
import X.C146958n9;
import X.C27187EfV;
import X.C83234r0;
import X.C84714tk;

public class IDxFlowShape19S0101000_2_I2 implements C84714tk {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxFlowShape19S0101000_2_I2(C84714tk r1, int i, int i2) {
        this.A02 = i2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final Object collect(C83234r0 r5, C146958n9 r6) {
        C84714tk r3;
        C83234r0 iDxFCollectorShape14S0101000_2_I2;
        if (this.A02 != 0) {
            AnonymousClass0MZ r1 = new AnonymousClass0MZ();
            r3 = (C84714tk) this.A01;
            iDxFCollectorShape14S0101000_2_I2 = new C27187EfV(r1, r5, this.A00);
        } else {
            r3 = (C84714tk) this.A01;
            iDxFCollectorShape14S0101000_2_I2 = new IDxFCollectorShape14S0101000_2_I2(r5, this.A00, 2);
        }
        return C84714tk.A00(r6, r3, iDxFCollectorShape14S0101000_2_I2);
    }
}
