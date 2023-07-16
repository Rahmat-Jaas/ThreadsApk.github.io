package com.instagram.common.bloks.mutations;

import X.AnonymousClass3LX;
import X.AnonymousClass794;
import X.C111556ns;
import X.C127397h3;
import X.C18200wM;
import java.util.ArrayList;

public class IDxUOperationShape4S0101000_2_I2 extends C111556ns {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxUOperationShape4S0101000_2_I2(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        int intValue;
        if (this.A02 != 0) {
            AnonymousClass794.A00();
            C127397h3 r3 = (C127397h3) this.A01;
            Integer A002 = AnonymousClass3LX.A00(r3);
            if (A002 != null && (intValue = A002.intValue()) != -1) {
                ArrayList A0s = C18200wM.A0s(r3.A0Q(intValue));
                A0s.remove(this.A00);
                r3.A04.put(intValue, A0s);
                return;
            }
            return;
        }
        ((C127397h3) obj).A04.put(31, Integer.valueOf(this.A00));
    }
}
