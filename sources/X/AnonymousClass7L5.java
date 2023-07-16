package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.7L5  reason: invalid class name */
public final class AnonymousClass7L5 implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass50V r1 = (AnonymousClass50V) this.A00.get();
        if (r1 != null) {
            r1.A00(valueAnimator.getAnimatedFraction());
        }
    }

    public AnonymousClass7L5(AnonymousClass50V r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
