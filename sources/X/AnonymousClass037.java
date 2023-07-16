package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.037  reason: invalid class name */
public final /* synthetic */ class AnonymousClass037 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass03D A01;

    public /* synthetic */ AnonymousClass037(View view, AnonymousClass03D r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.Bkg(this.A00);
    }
}
