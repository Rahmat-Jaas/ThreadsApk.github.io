package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.4wT  reason: invalid class name */
public final class AnonymousClass4wT extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass97l A01;
    public final /* synthetic */ C00 A02;
    public final /* synthetic */ C145958lO A03;

    public final void onAnimationEnd(Animator animator) {
        C04220Ms.A0B(animator, 0);
        super.onAnimationEnd(animator);
        this.A03.Bp4(this.A01, this.A02, this.A00);
    }

    public AnonymousClass4wT(AnonymousClass97l r1, C00 c00, C145958lO r3, int i) {
        this.A03 = r3;
        this.A02 = c00;
        this.A00 = i;
        this.A01 = r1;
    }
}
