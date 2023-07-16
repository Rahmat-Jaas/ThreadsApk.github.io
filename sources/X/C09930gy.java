package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0gy  reason: invalid class name and case insensitive filesystem */
public final class C09930gy implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View A00;

    public C09930gy(View view) {
        this.A00 = view;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            View view = this.A00;
            C09860go.A0K(view);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
