package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.3Gl  reason: invalid class name and case insensitive filesystem */
public final class C58613Gl {
    public static C58613Gl A01;
    public View A00;

    public final void A00(Context context, Window window, boolean z, boolean z2, boolean z3) {
        View childAt;
        float f;
        if (window != null && window.getDecorView() != null && context != null && this.A00 == null) {
            View decorView = window.getDecorView();
            C04220Ms.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            boolean A002 = C34822La.A00(context);
            if (z && (childAt = viewGroup.getChildAt(0)) != null) {
                if (z3) {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else {
                    f = 0.3f;
                    if (A002) {
                        f = 0.4f;
                    }
                }
                childAt.setAlpha(f);
            }
            window.addFlags(16);
            if (z2) {
                this.A00 = new F5i(context);
                int i = R.color.camera_pre_capture_utility_menu_color;
                if (A002) {
                    i = R.color.design_dark_default_color_on_background;
                }
                F12 f12 = new F12(context, 2.0f, context.getColor(i), (int) AnonymousClass3W1.A00(context, 38.0f));
                View view = this.A00;
                C04220Ms.A0C(view, "null cannot be cast to non-null type com.bloks.foa.cds.CDSAnimatableView");
                ((F5i) view).A01(f12);
                View view2 = this.A00;
                C04220Ms.A0C(view2, "null cannot be cast to non-null type com.bloks.foa.cds.CDSAnimatableView");
                ((F5i) view2).A00();
            } else {
                SpinnerImageView spinnerImageView = new SpinnerImageView(context);
                this.A00 = spinnerImageView;
                spinnerImageView.setImageResource(R.drawable.spinner_large);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            viewGroup.addView(this.A00, layoutParams);
        }
    }

    public final void A01(Window window) {
        if (window != null) {
            window.clearFlags(16);
            View decorView = window.getDecorView();
            C04220Ms.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            View view = this.A00;
            if (!(view == null || viewGroup == null)) {
                viewGroup.removeView(view);
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null) {
                    childAt.setAlpha(1.0f);
                }
            }
            this.A00 = null;
        }
    }
}
