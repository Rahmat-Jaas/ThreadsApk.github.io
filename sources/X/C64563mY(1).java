package X;

import android.view.View;

/* renamed from: X.3mY  reason: invalid class name and case insensitive filesystem */
public final class C64563mY implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C84864tz A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C64563mY(C84864tz r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A00.destroy();
        view.removeOnAttachStateChangeListener(this);
    }
}
