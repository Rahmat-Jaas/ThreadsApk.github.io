package com.facebook.redex;

import X.AnonymousClass0OB;
import X.AnonymousClass0OK;
import X.AnonymousClass0YA;
import X.C05980Xe;
import X.C07290bH;
import java.util.Random;

public class IDxCFactoryShape2S0001000_I2 implements AnonymousClass0OB {
    public int A00;
    public final int A01;

    public IDxCFactoryShape2S0001000_I2(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r6) {
        if (this.A01 != 0) {
            return new C05980Xe(this.A00);
        }
        return new C07290bH(r6.A02(), new AnonymousClass0YA(new Random()), r6.A03(), this.A00);
    }
}
