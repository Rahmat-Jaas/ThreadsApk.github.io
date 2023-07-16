package com.instagram.common.tracer;

import X.AnonymousClass80J;
import X.C10600ic;
import X.C131707se;
import X.C25898DuL;
import com.facebook.redex.IDxDListenerShape442S0100000_2_I2;

public class IDxIHandlerShape135S0100000_2_I2 extends C25898DuL {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIHandlerShape135S0100000_2_I2(AnonymousClass80J r2) {
        super("startHeroServiceController");
        this.A00 = r2;
    }

    public final boolean onQueueIdle() {
        if (this.A01 != 0) {
            ((AnonymousClass80J) this.A00).A00.A09(C10600ic.A00);
            return false;
        }
        C131707se r3 = (C131707se) ((IDxDListenerShape442S0100000_2_I2) this.A00).A00;
        r3.BPv(r3.A00, r3.A02, r3.A03);
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIHandlerShape135S0100000_2_I2(IDxDListenerShape442S0100000_2_I2 iDxDListenerShape442S0100000_2_I2) {
        super("FbnsPushRegistrar.init");
        this.A00 = iDxDListenerShape442S0100000_2_I2;
    }
}
