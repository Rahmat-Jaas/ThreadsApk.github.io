package X;

import android.view.animation.Interpolator;

/* renamed from: X.07F  reason: invalid class name */
public final class AnonymousClass07F implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
