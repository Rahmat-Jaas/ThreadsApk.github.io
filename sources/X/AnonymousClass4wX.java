package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.4wX  reason: invalid class name */
public final class AnonymousClass4wX extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C86174wQ A02;

    public final void onAnimationCancel(Animator animator) {
        C04220Ms.A0B(animator, 0);
        C86174wQ r5 = this.A02;
        if (r5.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        r5.A00 = 0;
        r5.A01 = true;
        C86174wQ.A00(r5, C86164wN.A0q(r5, 30));
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        C04220Ms.A0B(animator, 0);
        C86174wQ r3 = this.A02;
        if (r3.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = r3.A00 + 1;
        r3.A00 = i2;
        if (r3.A01 || ((i = this.A01) != -1 && i2 >= i)) {
            r3.A00 = 0;
            r3.A01 = false;
            C86174wQ.A00(r3, C86164wN.A0q(r3, 31));
            return;
        }
        animator.start();
    }

    public AnonymousClass4wX(C86174wQ r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = r3.A05.getStartDelay();
    }

    public final void onAnimationStart(Animator animator) {
        C86174wQ r1 = this.A02;
        if (r1.A00 == 0) {
            C86174wQ.A00(r1, C86164wN.A0q(r1, 32));
        }
    }
}
