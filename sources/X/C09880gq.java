package X;

import android.view.View;

/* renamed from: X.0gq  reason: invalid class name and case insensitive filesystem */
public final class C09880gq implements View.OnLayoutChangeListener {
    public final /* synthetic */ Runnable A00;

    public C09880gq(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.A00.run();
    }
}
