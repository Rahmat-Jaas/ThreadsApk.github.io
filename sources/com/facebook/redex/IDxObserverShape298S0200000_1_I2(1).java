package com.facebook.redex;

import X.AnonymousClass1jY;
import X.AnonymousClass1jZ;
import X.AnonymousClass4S5;
import X.C10450iM;
import X.C130667qT;
import X.C24551ja;
import X.C555933v;
import X.C61323St;
import X.C63113bW;
import X.C63643hy;
import X.C63813iO;
import X.C82364pV;
import X.C84684tg;
import android.content.Context;

public class IDxObserverShape298S0200000_1_I2 implements C82364pV {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape298S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void CGv(C555933v r5) {
        if (this.A02 != 0) {
            Context context = (Context) this.A00;
            C130667qT r3 = (C130667qT) this.A01;
            if (r5 instanceof AnonymousClass1jY) {
                C63813iO.A09(context);
                Throwable th = ((AnonymousClass1jY) r5).A00;
                if (th.getCause() != null) {
                    C10450iM.A07(r3.A05.getModuleName(), th.getCause());
                }
            } else if (r5 instanceof C24551ja) {
                C63643hy.A04(new AnonymousClass4S5(r3, C61323St.A00(((C24551ja) r5).A00)));
            }
        } else {
            C63113bW r32 = (C63113bW) this.A00;
            if (r32.A0A.getAndSet(r5) != r5) {
                C84684tg r1 = r32.A00;
                if (r1 != null && (r5 instanceof AnonymousClass1jZ)) {
                    r1.A7g("action_load_step");
                }
                try {
                    r32.A09.set(r5.A00);
                    r32.A08.set(r32.A06.now());
                } finally {
                    ((C82364pV) this.A01).CGv(r5);
                }
            }
        }
    }
}
