package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.4O9  reason: invalid class name */
public final class AnonymousClass4O9 implements Runnable {
    public final /* synthetic */ AnonymousClass3D5 A00;

    public AnonymousClass4O9(AnonymousClass3D5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3D5 r2 = this.A00;
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
