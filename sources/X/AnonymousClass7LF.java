package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.7LF  reason: invalid class name */
public final class AnonymousClass7LF implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final StateListDrawable A03;
    public final /* synthetic */ FBPayAnimationButton A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        float animatedFraction = ((float) 1) - valueAnimator.getAnimatedFraction();
        int i = Build.VERSION.SDK_INT;
        String A002 = C28174Ezk.A00(0);
        if (i >= 29) {
            StateListDrawable stateListDrawable = this.A03;
            int stateCount = stateListDrawable.getStateCount();
            for (int i2 = 0; i2 < stateCount; i2++) {
                Drawable stateDrawable = stateListDrawable.getStateDrawable(i2);
                C04220Ms.A0C(stateDrawable, A002);
                Object animatedValue = valueAnimator.getAnimatedValue();
                C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((GradientDrawable) stateDrawable).setCornerRadius(C18240wQ.A00(animatedValue));
            }
        } else {
            Drawable current = this.A03.getCurrent();
            C04220Ms.A0C(current, A002);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            C04220Ms.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            ((GradientDrawable) current).setCornerRadius(C18240wQ.A00(animatedValue2));
        }
        FBPayAnimationButton fBPayAnimationButton = this.A04;
        fBPayAnimationButton.getButtonView().setTextColor(C31163GhW.A06(this.A01, AnonymousClass8bA.A03((float) 255, animatedFraction)));
        int A032 = AnonymousClass8bA.A03((float) this.A02, animatedFraction);
        fBPayAnimationButton.getButtonView().getLayoutParams().width = A032 + this.A00;
        C99126If.A00(fBPayAnimationButton.getButtonView(), 2);
        fBPayAnimationButton.setForegroundGravity(17);
        fBPayAnimationButton.requestLayout();
    }

    public AnonymousClass7LF(FBPayAnimationButton fBPayAnimationButton) {
        this.A04 = fBPayAnimationButton;
        Drawable background = fBPayAnimationButton.getButtonView().getBackground();
        C04220Ms.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        this.A03 = (StateListDrawable) background;
        this.A01 = fBPayAnimationButton.getButtonView().getCurrentTextColor();
        this.A00 = fBPayAnimationButton.getButtonView().getHeight();
        this.A02 = fBPayAnimationButton.getButtonView().getWidth() - fBPayAnimationButton.getButtonView().getHeight();
    }
}
