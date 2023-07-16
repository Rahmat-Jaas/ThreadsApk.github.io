package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.7LG  reason: invalid class name */
public final class AnonymousClass7LG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ View A04;

    public AnonymousClass7LG(View view, float f, float f2, float f3, float f4) {
        this.A04 = view;
        this.A03 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = C18240wQ.A00(valueAnimator.getAnimatedValue());
        View view = this.A04;
        float f = this.A03;
        float f2 = this.A01;
        float f3 = this.A02;
        float f4 = this.A00;
        if (A002 >= f3) {
            if (A002 > f4) {
                f = f2;
            } else {
                f += ((A002 - f3) / (f4 - f3)) * (f2 - f);
            }
        }
        view.setAlpha(f);
    }
}
