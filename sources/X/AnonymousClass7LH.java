package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7LH  reason: invalid class name */
public final class AnonymousClass7LH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;

    public AnonymousClass7LH(View view, float f, float f2, int i, int i2) {
        this.A04 = view;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f;
        this.A00 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        View view = this.A04;
        Drawable mutate = view.getBackground().mutate();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        mutate.setTint(AnonymousClass0wJ.A04(animatedValue));
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        view.setTranslationX(AnonymousClass0hF.A02((float) AnonymousClass0wJ.A04(animatedValue2), (float) this.A03, (float) this.A02, this.A01, this.A00));
    }
}
