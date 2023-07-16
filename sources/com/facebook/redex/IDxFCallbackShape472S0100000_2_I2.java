package com.facebook.redex;

import X.AnonymousClass6ZB;
import X.AnonymousClass8s9;
import X.C126127ec;
import android.view.Choreographer;

public class IDxFCallbackShape472S0100000_2_I2 implements Choreographer.FrameCallback {
    public Object A00;
    public final int A01;

    public IDxFCallbackShape472S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void doFrame(long j) {
        switch (this.A01) {
            case 0:
                ((Runnable) this.A00).run();
                return;
            case 1:
                C126127ec r5 = (C126127ec) this.A00;
                if (!r5.A02) {
                    r5.A03.removeFrameCallback(this);
                    return;
                }
                if (r5.A00 == -1) {
                    r5.A00 = j;
                    r5.A01 = j;
                } else {
                    r5.A01 = j;
                    r5.A04.C05(j - r5.A01);
                }
                r5.A03.postFrameCallback(this);
                return;
            default:
                ((AnonymousClass8s9) this.A00).Cf7(Long.valueOf(j), AnonymousClass6ZB.A00);
                return;
        }
    }
}
