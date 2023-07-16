package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.7Rz  reason: invalid class name and case insensitive filesystem */
public final class C122427Rz implements Animation.AnimationListener {
    public final /* synthetic */ View A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C122427Rz(View view) {
        this.A00 = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A00.setVisibility(8);
    }
}
