package com.facebook.redex;

import X.AnonymousClass03V;
import X.AnonymousClass03Y;
import X.AnonymousClass1dM;
import X.AnonymousClass52I;
import X.AnonymousClass7IJ;
import X.C004402a;
import X.C006702y;
import X.C04220Ms;
import X.C36433JUv;
import X.IYC;
import android.view.View;

public class IDxIListenerShape487S0100000_2_I2 implements C004402a {
    public Object A00;
    public final int A01;

    public IDxIListenerShape487S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass03Y Bky(View view, AnonymousClass03Y r6) {
        switch (this.A01) {
            case 0:
                r6.A00.A03();
                View view2 = ((AnonymousClass7IJ) this.A00).A04;
                if (view2 != null) {
                    return C006702y.A05(view2, r6);
                }
                return r6;
            case 1:
                AnonymousClass52I r2 = (AnonymousClass52I) this.A00;
                C36433JUv jUv = r2.A02;
                if (jUv != null) {
                    r2.A03.A0l.remove(jUv);
                }
                if (r6 == null) {
                    return r6;
                }
                IYC iyc = new IYC(r2.A00, r6);
                r2.A02 = iyc;
                r2.A03.A0M(iyc);
                return r6;
            default:
                C04220Ms.A0B(r6, 1);
                AnonymousClass03V r1 = r6.A00;
                int i = r1.A05(8).A00 - r1.A06(2).A00;
                int i2 = 0;
                if (0 < i) {
                    i2 = i;
                }
                View view3 = ((AnonymousClass1dM) this.A00).A01;
                if (view3 == null) {
                    C04220Ms.A0E("rootView");
                    throw null;
                }
                view3.setPadding(0, 0, 0, i2);
                return r6;
        }
    }
}
