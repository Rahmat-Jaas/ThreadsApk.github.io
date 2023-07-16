package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.4OA  reason: invalid class name */
public final class AnonymousClass4OA implements Runnable {
    public final /* synthetic */ C57653Bx A00;

    public AnonymousClass4OA(C57653Bx r1) {
        this.A00 = r1;
    }

    public final void run() {
        C57653Bx r2 = this.A00;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
                r2.A00.removeAllViews();
            }
        }
    }
}
