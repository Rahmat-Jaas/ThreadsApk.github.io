package com.facebook.redex;

import X.C10450iM;
import X.C81964on;

public class IDxRHelperShape755S0100000_1_I2 implements C81964on {
    public Object A00;
    public final int A01;

    public IDxRHelperShape755S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Ccx(String str, Throwable th) {
        String str2;
        switch (this.A01) {
            case 0:
                str2 = "CaaAutoConf";
                break;
            case 1:
                str2 = "ConfidenceFrameworkHelper";
                break;
            case 2:
                str2 = "FeO2IntegrateHelper";
                break;
            default:
                str2 = "GetClientMessageBloksSignature";
                break;
        }
        C10450iM.A07(str2, th);
    }
}
