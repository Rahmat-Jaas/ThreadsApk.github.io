package com.facebook.redex;

import X.AnonymousClass03C;
import X.AnonymousClass03O;
import X.C005702o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class IDxLAdapterShape0S0300000_I2 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLAdapterShape0S0300000_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((AnonymousClass03C) this.A01).BkP((View) this.A02);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A03 != 0) {
            AnonymousClass03O r2 = (AnonymousClass03O) this.A01;
            r2.A00.A08(1.0f);
            C005702o.A03((View) this.A02, r2);
            return;
        }
        ((AnonymousClass03C) this.A01).BkT((View) this.A02);
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((AnonymousClass03C) this.A01).Bkf((View) this.A02);
        }
    }
}
