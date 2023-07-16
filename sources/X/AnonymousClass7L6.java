package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.7L6  reason: invalid class name */
public final class AnonymousClass7L6 implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass50S r1 = (AnonymousClass50S) this.A00.get();
        if (r1 != null) {
            r1.A00(valueAnimator.getAnimatedFraction());
        }
    }

    public AnonymousClass7L6(AnonymousClass50S r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
