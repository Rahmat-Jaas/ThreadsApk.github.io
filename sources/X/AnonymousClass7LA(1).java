package X;

import android.animation.ValueAnimator;

/* renamed from: X.7LA  reason: invalid class name */
public final class AnonymousClass7LA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C56 A02;

    public AnonymousClass7LA(C56 c56, int i, int i2) {
        this.A02 = c56;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        this.A02.setColor(C09760gd.A02(C18240wQ.A00(C86144wL.A0e(valueAnimator)), this.A01, this.A00));
    }
}
