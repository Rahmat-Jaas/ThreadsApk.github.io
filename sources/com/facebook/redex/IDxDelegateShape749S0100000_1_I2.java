package com.facebook.redex;

import X.AnonymousClass1ZQ;
import X.AnonymousClass1a3;
import X.AnonymousClass1a4;
import X.AnonymousClass3J5;
import X.C146958n9;
import X.C18200wM;
import X.C21531Bvt;
import X.C25237DiI;
import X.C27952Ew2;
import X.C62793ak;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;

public class IDxDelegateShape749S0100000_1_I2 implements C21531Bvt {
    public Object A00;
    public final int A01;

    public IDxDelegateShape749S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bas() {
        switch (this.A01) {
            case 0:
                AnonymousClass1a4.A00((AnonymousClass1a4) this.A00);
                return;
            case 1:
                AnonymousClass1a3.A00((AnonymousClass1a3) this.A00);
                return;
            default:
                C62793ak A0N = C18200wM.A0N(((AnonymousClass1ZQ) this.A00).A01);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(A0N, (C146958n9) null, 3), AnonymousClass3J5.A00(A0N), 3);
                return;
        }
    }
}
