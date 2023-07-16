package X;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.02n  reason: invalid class name and case insensitive filesystem */
public final class C005602n extends AnonymousClass03N {
    public final WindowInsetsAnimation A00;

    public C005602n(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.A00 = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds A00(AnonymousClass03H r3) {
        return new WindowInsetsAnimation.Bounds(r3.A00.A03(), r3.A01.A03());
    }

    public static void A03(View view, AnonymousClass03I r2) {
        AnonymousClass03M r0;
        if (r2 != null) {
            r0 = new AnonymousClass03M(r2);
        } else {
            r0 = null;
        }
        view.setWindowInsetsAnimationCallback(r0);
    }

    public final float A05() {
        return this.A00.getInterpolatedFraction();
    }

    public final int A06() {
        return this.A00.getTypeMask();
    }

    public final long A07() {
        return this.A00.getDurationMillis();
    }

    public final void A08(float f) {
        this.A00.setFraction(f);
    }

    public static AnonymousClass01T A01(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass01T.A01(bounds.getUpperBound());
    }

    public static AnonymousClass01T A02(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass01T.A01(bounds.getLowerBound());
    }

    public C005602n(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }
}
