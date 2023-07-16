package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.78g  reason: invalid class name and case insensitive filesystem */
public final class C1200378g {
    public static C1200378g A01;
    public WeakReference A00;

    public static synchronized C1200378g A00() {
        C1200378g r0;
        synchronized (C1200378g.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C1200378g();
                A01 = r0;
            }
        }
        return r0;
    }

    public final void A01() {
        View view;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(view);
            this.A00 = null;
        }
    }

    public final void A02(Activity activity) {
        ImageView imageView = new ImageView(activity);
        Window window = activity.getWindow();
        window.getClass();
        ((ViewGroup) window.getDecorView()).addView(imageView);
        imageView.setVisibility(8);
        this.A00 = C86144wL.A0w(imageView);
    }
}
