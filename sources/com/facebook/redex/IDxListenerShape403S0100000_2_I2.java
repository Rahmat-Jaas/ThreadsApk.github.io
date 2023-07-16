package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.C24429DLt;
import X.C27907EvI;
import com.instagram.model.reels.Reel;

public class IDxListenerShape403S0100000_2_I2 implements C27907EvI {
    public Object A00;
    public final int A01;

    public IDxListenerShape403S0100000_2_I2(AnonymousClass0ZU r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BzF(Reel reel, C24429DLt dLt) {
        AnonymousClass0ZU r0;
        switch (this.A01) {
            case 0:
                r0 = (AnonymousClass0ZU) this.A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 1:
            case 2:
                r0 = (AnonymousClass0ZU) this.A00;
                break;
            default:
                return;
        }
        r0.invoke();
    }

    public final /* synthetic */ void CEd(Reel reel) {
    }

    public final /* synthetic */ void CF5(Reel reel) {
    }
}
