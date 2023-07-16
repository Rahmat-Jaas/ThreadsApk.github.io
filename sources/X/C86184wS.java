package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.4wS  reason: invalid class name and case insensitive filesystem */
public final class C86184wS extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ View A02;

    public C86184wS(View view, float f, float f2) {
        this.A02 = view;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.A02;
        view.setScaleX(this.A00);
        view.setScaleY(this.A01);
    }
}
