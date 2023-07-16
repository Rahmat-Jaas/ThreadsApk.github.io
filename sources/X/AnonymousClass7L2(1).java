package X;

import android.animation.Animator;

/* renamed from: X.7L2  reason: invalid class name */
public final class AnonymousClass7L2 implements Animator.AnimatorListener {
    public final /* synthetic */ C131647sY A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C63893iY A02;
    public final /* synthetic */ C109326jp A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AnonymousClass7L2(C131647sY r1, AnonymousClass601 r2, C63893iY r3, C109326jp r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onAnimationEnd(Animator animator) {
        C109326jp r2 = this.A03;
        C61043Rr.A00(this.A01, this.A02, r2);
    }
}
