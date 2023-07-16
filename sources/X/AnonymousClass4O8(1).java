package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.4O8  reason: invalid class name */
public final class AnonymousClass4O8 implements Runnable {
    public final /* synthetic */ C57893Cw A00;

    public AnonymousClass4O8(C57893Cw r1) {
        this.A00 = r1;
    }

    public final void run() {
        C57893Cw r2 = this.A00;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00.removeAllViews();
        }
    }
}
