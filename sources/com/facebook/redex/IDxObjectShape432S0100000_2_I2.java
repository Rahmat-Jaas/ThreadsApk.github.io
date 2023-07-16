package com.facebook.redex;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C04270Mx;
import X.C143158gC;
import X.C86134wK;
import kotlin.Function;

public class IDxObjectShape432S0100000_2_I2 implements C143158gC, C04270Mx {
    public Object A00;
    public final int A01;

    public IDxObjectShape432S0100000_2_I2(int i, AnonymousClass0YY r3) {
        this.A01 = i;
        C04220Ms.A0B(r3, 1);
        this.A00 = r3;
    }

    public final Function Ak7() {
        return (Function) this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C143158gC) || !(obj instanceof C04270Mx)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((C04270Mx) obj).Ak7());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C86134wK.A1L(this.A00, obj);
    }
}
