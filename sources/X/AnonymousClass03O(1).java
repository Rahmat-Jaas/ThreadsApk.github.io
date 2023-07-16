package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.instagram.barcelona.R;

/* renamed from: X.03O  reason: invalid class name */
public final class AnonymousClass03O {
    public AnonymousClass03N A00;

    public static AnonymousClass03O A00(WindowInsetsAnimation windowInsetsAnimation) {
        AnonymousClass03O r2 = new AnonymousClass03O(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            r2.A00 = new C005602n(windowInsetsAnimation);
        }
        return r2;
    }

    public static void A01(View view, AnonymousClass03I r4) {
        AnonymousClass03L r0;
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            C005602n.A03(view, r4);
            return;
        }
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (r4 == null) {
            i = R.id.tag_window_insets_animation_callback;
            r0 = null;
        } else {
            r0 = new AnonymousClass03L(view, r4);
            i = R.id.tag_window_insets_animation_callback;
        }
        view.setTag(i, r0);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(r0);
        }
    }

    public AnonymousClass03O(int i, Interpolator interpolator, long j) {
        AnonymousClass03N r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new C005602n(i, interpolator, j);
        } else {
            r0 = new C005702o(i, interpolator, j);
        }
        this.A00 = r0;
    }
}
