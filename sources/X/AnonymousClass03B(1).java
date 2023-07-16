package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.facebook.redex.IDxLAdapterShape0S0300000_I2;
import java.lang.ref.WeakReference;

/* renamed from: X.03B  reason: invalid class name */
public final class AnonymousClass03B {
    public final WeakReference A00;

    public final void A00() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void A01() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void A02(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void A03(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void A04(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void A05(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    public final void A06(Interpolator interpolator) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void A07(AnonymousClass03C r5) {
        IDxLAdapterShape0S0300000_I2 iDxLAdapterShape0S0300000_I2;
        View view = (View) this.A00.get();
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (r5 != null) {
                iDxLAdapterShape0S0300000_I2 = new IDxLAdapterShape0S0300000_I2(0, view, this, r5);
            } else {
                iDxLAdapterShape0S0300000_I2 = null;
            }
            animate.setListener(iDxLAdapterShape0S0300000_I2);
        }
    }

    public AnonymousClass03B(View view) {
        this.A00 = new WeakReference(view);
    }
}
