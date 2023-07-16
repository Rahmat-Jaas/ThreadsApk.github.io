package com.facebook.redex;

import X.AnonymousClass17J;
import X.AnonymousClass56Y;
import X.C04220Ms;
import X.C18180wK;
import X.C27713Es3;
import X.C86074wE;
import X.C882257f;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2;

public class IDxBListenerShape743S0100000_2_I2 implements C27713Es3 {
    public Object A00;
    public final int A01;

    public IDxBListenerShape743S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C8w(AnonymousClass17J r6) {
        if (this.A01 != 0) {
            C04220Ms.A0B(r6, 0);
            C86074wE r3 = ((C882257f) this.A00).A00;
            do {
            } while (!r3.ADi(r3.getValue(), new KtCSuperShape0S0010000_I2(C18180wK.A1V(r6.A01 + r6.A00), 0)));
            return;
        }
        C04220Ms.A0B(r6, 0);
        if (r6.A01 > 0) {
            ((AnonymousClass56Y) this.A00).A0D.CrC(C18180wK.A0Y());
        }
    }
}
