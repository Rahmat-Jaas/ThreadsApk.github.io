package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass4wP;
import X.AnonymousClass51R;
import X.C143198gH;
import X.C143208gI;
import X.C18240wQ;
import X.C86144wL;
import X.C86164wN;
import X.I85;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class IDxLAdapterShape0S0100000_2_I2 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape0S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 0:
                C143208gI r0 = ((AnonymousClass51R) this.A00).A06;
                if (r0 != null) {
                    r0.CKZ();
                    return;
                }
                return;
            case 1:
                C143198gH r02 = ((AnonymousClass51R) this.A00).A05;
                if (r02 != null) {
                    r02.BuA();
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        View A0I;
        switch (this.A01) {
            case 0:
                C143208gI r0 = ((AnonymousClass51R) this.A00).A06;
                if (r0 != null) {
                    r0.CKZ();
                    return;
                }
                return;
            case 1:
                C143198gH r02 = ((AnonymousClass51R) this.A00).A05;
                if (r02 != null) {
                    r02.BuA();
                    return;
                }
                return;
            case 2:
                AnonymousClass4wP r1 = (AnonymousClass4wP) this.A00;
                AnonymousClass4wP.A00(r1, C86164wN.A0q(r1, 26));
                return;
            case 3:
                C18240wQ.A1G(this.A00);
                return;
            case 4:
                ((View) this.A00).getLayoutParams().height = -2;
                return;
            case 5:
                I85 i85 = (I85) this.A00;
                if (i85.A01 == AnonymousClass006.A01) {
                    A0I = C86144wL.A0I(i85.A0B);
                    break;
                } else {
                    return;
                }
            case 6:
                ((Runnable) this.A00).run();
                return;
            default:
                A0I = (View) this.A00;
                break;
        }
        A0I.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        if (5 - this.A01 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        I85 i85 = (I85) this.A00;
        if (i85.A01 == AnonymousClass006.A00) {
            C86144wL.A0I(i85.A0B).setVisibility(0);
        }
    }
}
