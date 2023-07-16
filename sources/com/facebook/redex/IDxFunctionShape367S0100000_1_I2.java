package com.facebook.redex;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C33444Hnz;
import X.C66633xv;
import X.C66643xw;
import X.C79324jr;
import X.C79334js;

public class IDxFunctionShape367S0100000_1_I2 implements C33444Hnz {
    public Object A00;
    public final int A01;

    public IDxFunctionShape367S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.A01 != 0) {
            AnonymousClass0YY r0 = ((C66633xv) this.A00).A05;
            C04220Ms.A07(obj);
            return ((C79334js) r0).invoke(obj);
        }
        AnonymousClass0YY r02 = ((C66643xw) this.A00).A06;
        C04220Ms.A07(obj);
        return ((C79324jr) r02).invoke(obj);
    }
}
