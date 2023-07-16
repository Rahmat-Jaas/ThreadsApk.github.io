package X;

import android.view.View;

/* renamed from: X.0h4  reason: invalid class name */
public final class AnonymousClass0h4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass0h4(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A00.removeOnLayoutChangeListener(this);
        this.A01.run();
    }
}
