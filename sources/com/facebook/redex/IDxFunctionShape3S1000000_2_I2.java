package com.facebook.redex;

import X.C114686tj;
import X.C114696tk;
import X.C114956uC;
import X.C115146ua;
import X.C115156ub;
import X.C142618fJ;
import com.facebookpay.expresscheckout.models.ECPOffer;

public class IDxFunctionShape3S1000000_2_I2 implements C142618fJ {
    public String A00;
    public final int A01;

    public IDxFunctionShape3S1000000_2_I2(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.A01 != 0) {
            String str = this.A00;
            if (str == null || str.length() == 0) {
                return null;
            }
            return new ECPOffer("", str, "", str, "");
        }
        C114956uC r8 = (C114956uC) obj;
        C114686tj r0 = r8.A01;
        C114686tj r4 = new C114686tj(r0.A00, this.A00);
        C115146ua r02 = r8.A00;
        C115146ua r3 = new C115146ua(r02.A00, (C114696tk) null, (String) null, r02.A03);
        C115156ub r03 = r8.A02;
        return new C114956uC(r3, r4, new C115156ub(r03.A00, (C114696tk) null, (String) null, r03.A03));
    }
}
