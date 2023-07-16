package com.facebook.redex;

import X.AnonymousClass58F;
import X.AnonymousClass5xM;
import X.C22941be;
import X.C23061br;
import X.C23091bu;
import X.C72744Pn;
import X.C72764Pp;
import X.C82914qT;
import android.os.Handler;

public class IDxPCleanerShape530S0100000_1_I2 implements C82914qT {
    public Object A00;
    public final int A01;

    public IDxPCleanerShape530S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void ACu() {
        Handler handler;
        Runnable r0;
        switch (this.A01) {
            case 0:
                ((AnonymousClass58F) ((C22941be) this.A00).A04.getValue()).A0E.CrC((Object) null);
                return;
            case 1:
                ((AnonymousClass5xM) this.A00).A00 = null;
                return;
            case 2:
                C23091bu r1 = (C23091bu) this.A00;
                if (r1.isVisible() && !r1.A0A) {
                    handler = r1.A0E;
                    r0 = new C72744Pn(r1);
                    break;
                } else {
                    r1.A0B = true;
                    return;
                }
                break;
            default:
                C23061br r12 = (C23061br) this.A00;
                if (r12.isVisible() && !r12.A07) {
                    handler = r12.A0D;
                    r0 = new C72764Pp(this);
                    break;
                } else {
                    r12.A09 = true;
                    return;
                }
        }
        handler.post(r0);
    }
}
