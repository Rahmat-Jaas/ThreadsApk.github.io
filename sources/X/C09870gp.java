package X;

import android.view.View;

/* renamed from: X.0gp  reason: invalid class name and case insensitive filesystem */
public final class C09870gp implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    public final Runnable A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C09870gp(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.A00.run();
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnLayoutChangeListener(this);
        view.removeOnAttachStateChangeListener(this);
    }
}
