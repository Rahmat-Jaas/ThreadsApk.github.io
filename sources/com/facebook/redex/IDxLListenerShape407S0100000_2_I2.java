package com.facebook.redex;

import X.AnonymousClass600;
import X.C121427Fy;
import X.C127307gu;
import X.C17828APc;
import X.C25812DsR;
import X.C33619HrR;
import X.C86124wJ;
import android.widget.ImageView;

public class IDxLListenerShape407S0100000_2_I2 implements C33619HrR {
    public Object A00;
    public final int A01;

    public IDxLListenerShape407S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void By3() {
        if (this.A01 == 0) {
            C121427Fy.A00((ImageView) this.A00);
        }
    }

    public final void C4t(C17828APc aPc) {
        if (1 - this.A01 == 0) {
            C127307gu r0 = ((AnonymousClass600) this.A00).A07;
            r0.A00 = 0;
            C25812DsR dsR = r0.A03;
            dsR.A0D(C127307gu.A08);
            dsR.A06 = false;
            C86124wJ.A1M(dsR);
        }
    }
}
