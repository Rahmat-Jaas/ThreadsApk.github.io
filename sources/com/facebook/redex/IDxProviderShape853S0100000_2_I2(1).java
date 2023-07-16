package com.facebook.redex;

import X.C1195375t;
import X.C143998hf;
import android.content.Context;

public class IDxProviderShape853S0100000_2_I2 implements C143998hf {
    public Object A00;
    public final int A01;

    public IDxProviderShape853S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        C1195375t r0;
        if (this.A01 == 0) {
            return this.A00;
        }
        Context context = (Context) this.A00;
        synchronized (C1195375t.class) {
            r0 = C1195375t.A02;
            if (r0 == null) {
                r0 = new C1195375t(context);
                C1195375t.A02 = r0;
            }
        }
        return r0;
    }
}
