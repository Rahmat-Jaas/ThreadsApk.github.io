package X;

import android.os.Build;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.02r  reason: invalid class name and case insensitive filesystem */
public final class C006002r {
    public static void A00(View view, C004402a r3) {
        View.OnApplyWindowInsetsListener r0;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, r3);
        }
        if (r3 == null) {
            r0 = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        } else {
            r0 = new C005902q(view, r3);
        }
        view.setOnApplyWindowInsetsListener(r0);
    }
}
