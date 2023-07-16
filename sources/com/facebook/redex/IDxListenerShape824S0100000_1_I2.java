package com.facebook.redex;

import X.AnonymousClass4AX;
import X.C28731ut;
import X.C83824s3;

public class IDxListenerShape824S0100000_1_I2 implements C83824s3 {
    public Object A00;
    public final int A01;

    public IDxListenerShape824S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CKJ() {
        if (this.A01 != 0) {
            AnonymousClass4AX.A04((AnonymousClass4AX) this.A00);
            return;
        }
        C28731ut r1 = (C28731ut) this.A00;
        r1.A00.A01();
        C28731ut.A03(r1);
    }

    public final void CKK() {
        if (this.A01 != 0) {
            AnonymousClass4AX.A04((AnonymousClass4AX) this.A00);
        }
    }
}
