package com.facebook.redex;

import X.AnonymousClass0LU;
import X.C39639KxH;
import X.I17;

public class IDxJListenerShape168S0000000_2_I2 implements C39639KxH {
    public final int A00;

    public IDxJListenerShape168S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final void onFailure() {
        String str;
        if (this.A00 != 0) {
            str = "FbPaySDKInjector";
        } else {
            str = "BaseShopsLiteSDKInjector";
        }
        AnonymousClass0LU.A0B(str, I17.A00(624));
    }

    public final void CHC(String str) {
    }
}
