package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.AnonymousClass5uY;
import X.AnonymousClass6UB;
import X.C10390iG;
import X.C131707se;
import X.C14030oh;
import X.C63173fJ;
import android.os.Looper;
import com.instagram.common.tracer.IDxIHandlerShape135S0100000_2_I2;

public class IDxDListenerShape442S0100000_2_I2 implements C10390iG {
    public Object A00;
    public final int A01;

    public IDxDListenerShape442S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAppBackgrounded() {
        int A03;
        int i;
        if (this.A01 != 0) {
            A03 = C14030oh.A03(1892489);
            i = -643571422;
        } else {
            A03 = C14030oh.A03(-1116481028);
            i = 350312963;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03;
        int i;
        if (this.A01 != 0) {
            A03 = C14030oh.A03(1990762);
            C131707se r3 = (C131707se) this.A00;
            if (AnonymousClass6UB.A00(r3.A05)) {
                if (C63173fJ.A05(AnonymousClass0TJ.A05, 18296805494620641L)) {
                    Looper.myQueue().addIdleHandler(new IDxIHandlerShape135S0100000_2_I2(this));
                    i = 2059867593;
                } else {
                    r3.BPv(r3.A00, r3.A02, r3.A03);
                }
            }
            i = 2116478362;
        } else {
            A03 = C14030oh.A03(-1809194614);
            AnonymousClass5uY.A00();
            i = -66007230;
        }
        C14030oh.A0A(i, A03);
    }
}
