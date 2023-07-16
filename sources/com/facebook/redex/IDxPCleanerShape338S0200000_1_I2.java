package com.facebook.redex;

import X.AnonymousClass1cO;
import X.AnonymousClass1d5;
import X.C72734Pm;
import X.C72754Po;
import X.C82914qT;
import android.os.Handler;

public class IDxPCleanerShape338S0200000_1_I2 implements C82914qT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPCleanerShape338S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void ACu() {
        Handler handler;
        Runnable r0;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass1cO r1 = (AnonymousClass1cO) obj;
            if (!r1.isVisible() || r1.A03) {
                r1.A04 = true;
                return;
            } else {
                handler = (Handler) this.A00;
                r0 = new C72754Po(r1);
            }
        } else {
            AnonymousClass1d5 r12 = (AnonymousClass1d5) obj;
            if (r12.isVisible() && !r12.A04) {
                handler = (Handler) this.A00;
                r0 = new C72734Pm(r12);
            } else {
                return;
            }
        }
        handler.post(r0);
    }
}
