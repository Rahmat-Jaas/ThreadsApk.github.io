package com.instagram.wellbeing.reporting.common.intf;

import X.AnonymousClass3VO;
import X.AnonymousClass4NE;
import X.AnonymousClass601;
import X.C109326jp;
import X.C63893iY;
import X.C63913ic;

public class IDxRListenerShape68S0200000_1_I2 extends AnonymousClass4NE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRListenerShape68S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void CMu(String str) {
        switch (this.A02) {
            case 0:
                if (str != null) {
                    AnonymousClass601 r4 = (AnonymousClass601) this.A00;
                    C63893iY.A0F(r4, AnonymousClass3VO.A00(), (C109326jp) this.A01, r4.A00, 0);
                    return;
                }
                return;
            case 1:
                C63913ic.A0K((AnonymousClass601) this.A00, (C109326jp) this.A01, new Object[0]);
                return;
            default:
                super.CMu(str);
                return;
        }
    }
}
