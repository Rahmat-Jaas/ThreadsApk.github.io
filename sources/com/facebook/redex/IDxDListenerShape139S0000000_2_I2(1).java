package com.facebook.redex;

import X.AnonymousClass740;
import X.AnonymousClass7K8;
import X.C04530Oa;
import X.C10390iG;
import X.C113006qY;
import X.C135497za;
import X.C14030oh;
import android.os.Handler;

public class IDxDListenerShape139S0000000_2_I2 implements C10390iG {
    public final int A00;

    public IDxDListenerShape139S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final void onAppBackgrounded() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C14030oh.A03(-696022098);
            C113006qY r3 = (C113006qY) AnonymousClass740.A01.getValue();
            C04530Oa r2 = r3.A04;
            ((Handler) r2.getValue()).removeCallbacks((Runnable) r3.A05.getValue());
            ((Handler) r2.getValue()).post(new C135497za(r3));
            i = -1561794689;
        } else {
            A03 = C14030oh.A03(-359150246);
            AnonymousClass7K8.A01.clear();
            i = -433623983;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C14030oh.A03(-2021698038);
            ((C113006qY) AnonymousClass740.A01.getValue()).A00();
            i = 1550272116;
        } else {
            A03 = C14030oh.A03(-1205211377);
            i = -1757892476;
        }
        C14030oh.A0A(i, A03);
    }
}
