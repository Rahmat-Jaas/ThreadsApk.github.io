package X;

import android.view.View;

/* renamed from: X.0h6  reason: invalid class name */
public final class AnonymousClass0h6 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C142618fJ A01;
    public final /* synthetic */ Runnable A02;

    public AnonymousClass0h6(View view, C142618fJ r2, Runnable runnable) {
        this.A01 = r2;
        this.A02 = runnable;
        this.A00 = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((Boolean) this.A01.apply((Object) null)).booleanValue()) {
            this.A02.run();
            this.A00.removeOnLayoutChangeListener(this);
        }
    }
}
