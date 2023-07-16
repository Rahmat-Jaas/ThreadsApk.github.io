package com.facebook.redex;

import X.C129017kq;
import X.C129027kr;
import X.C143138gA;

public class IDxCListenerShape801S0100000_2_I2 implements C143138gA {
    public Object A00;
    public final int A01;

    public IDxCListenerShape801S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCancel() {
        if (this.A01 != 0) {
            ((C129027kr) this.A00).A00.cancel(true);
        } else {
            ((C129017kq) this.A00).A00.deleteObservers();
        }
    }
}
