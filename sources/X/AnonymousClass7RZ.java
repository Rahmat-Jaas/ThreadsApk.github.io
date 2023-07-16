package X;

import android.view.View;

/* renamed from: X.7RZ  reason: invalid class name */
public final class AnonymousClass7RZ implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C95235zg A02;

    public AnonymousClass7RZ(View view, C95235zg r2, int i) {
        this.A02 = r2;
        this.A01 = view;
        this.A00 = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C95235zg r3 = this.A02;
        int i9 = r3.A00;
        View view2 = this.A01;
        if (i9 != 0) {
            if (i9 != view2.getHeight()) {
                C95235zg.A00(r3, this.A00 + (view2.getHeight() - r3.A00));
            } else {
                return;
            }
        }
        r3.A00 = view2.getHeight();
    }
}
