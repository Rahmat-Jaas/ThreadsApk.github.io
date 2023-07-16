package com.facebook.redex;

import X.AnonymousClass7GV;
import X.C04220Ms;
import X.C18180wK;
import X.C82404pZ;
import X.C83544ra;
import X.C83564rc;

public class IDxConsumerShape376S0100000_1_I2 implements C82404pZ {
    public Object A00;
    public final int A01;

    public IDxConsumerShape376S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass7GV.A02();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    ((C83544ra) this.A00).onFailure();
                    return;
                } else {
                    ((C83544ra) this.A00).onSuccess();
                    return;
                }
            default:
                boolean A0I = C04220Ms.A0I(obj, C18180wK.A0Y());
                C83564rc r0 = (C83564rc) this.A00;
                if (A0I) {
                    if (r0 != null) {
                        r0.onSuccess();
                        return;
                    }
                    return;
                } else if (r0 != null) {
                    r0.onFailure();
                    return;
                } else {
                    return;
                }
        }
    }
}
