package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.instagram.barcelona.R;

/* renamed from: X.02q  reason: invalid class name and case insensitive filesystem */
public final class C005902q implements View.OnApplyWindowInsetsListener {
    public AnonymousClass03Y A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C004402a A02;

    public C005902q(View view, C004402a r3) {
        this.A01 = view;
        this.A02 = r3;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass03Y Bky;
        AnonymousClass03Y A012 = AnonymousClass03Y.A01(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            View view2 = this.A01;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
            }
            if (A012.equals(this.A00)) {
                Bky = this.A02.Bky(view, A012);
                return Bky.A04();
            }
        }
        this.A00 = A012;
        Bky = this.A02.Bky(view, A012);
        if (i < 30) {
            view.requestApplyInsets();
        }
        return Bky.A04();
    }
}
