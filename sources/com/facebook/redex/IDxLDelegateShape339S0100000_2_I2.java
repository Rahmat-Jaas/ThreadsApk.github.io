package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3J5;
import X.AnonymousClass5xc;
import X.AnonymousClass5xd;
import X.C146958n9;
import X.C18200wM;
import X.C21269Brb;
import X.C25237DiI;
import X.C27952Ew2;
import X.C62793ak;
import X.C86164wN;
import X.CV1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;

public class IDxLDelegateShape339S0100000_2_I2 implements C21269Brb {
    public Object A00;
    public final int A01;

    public IDxLDelegateShape339S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void AA0() {
        switch (this.A01) {
            case 0:
                C62793ak A0N = C18200wM.A0N(((AnonymousClass5xc) this.A00).A02);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(A0N, (C146958n9) null, 34), AnonymousClass3J5.A00(A0N), 3);
                return;
            case 1:
                AnonymousClass5xd r1 = (AnonymousClass5xd) this.A00;
                C62793ak A0N2 = C18200wM.A0N(r1.A08);
                String string = r1.requireArguments().getString("arg_media_id");
                if (string != null) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(A0N2, string, (C146958n9) null, 1), AnonymousClass3J5.A00(A0N2), 3);
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            default:
                CV1 cv1 = (CV1) this.A00;
                if (cv1.A00 != null && !cv1.A03) {
                    cv1.A03 = true;
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(cv1, (C146958n9) null, 18), C18200wM.A0M(cv1), 3);
                    return;
                }
                return;
        }
    }
}
