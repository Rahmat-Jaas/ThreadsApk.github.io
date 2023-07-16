package com.facebook.redex;

import X.AnonymousClass7zL;
import X.C04220Ms;
import X.C135367zK;
import X.C19577Ayd;
import X.DY1;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

public class IDxAListenerShape371S0100000_2_I2 implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape371S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (2 - this.A01 == 0) {
            C04220Ms.A0B(animator, 0);
            animator.removeAllListeners();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        long j;
        switch (this.A01) {
            case 0:
                FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) this.A00;
                fBPayAnimationButton.getButtonView().setVisibility(4);
                fBPayAnimationButton.getProgressBarView().setVisibility(0);
                ViewPropertyAnimator alpha = fBPayAnimationButton.getProgressMsgView().animate().alpha(1.0f);
                boolean z = FBPayAnimationButton.A0E;
                long j2 = 3000;
                if (z) {
                    j = 3000;
                } else {
                    j = 5000;
                }
                fBPayAnimationButton.A04 = alpha.setStartDelay(j).setDuration(400).withStartAction(new C135367zK(fBPayAnimationButton)).withEndAction(new AnonymousClass7zL(fBPayAnimationButton));
                fBPayAnimationButton.getProgressBarView().setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                fBPayAnimationButton.getProgressMsgView().setPivotX(fBPayAnimationButton.getButtonView().getPivotX());
                ViewPropertyAnimator scaleY = fBPayAnimationButton.getProgressBarView().animate().scaleX(0.5f).scaleY(0.5f);
                if (!z) {
                    j2 = 5000;
                }
                scaleY.setStartDelay(j2).setDuration(400);
                return;
            case 1:
                C19577Ayd ayd = ((DY1) this.A00).A03;
                ayd.A08().setVisibility(8);
                ayd.A08().setAlpha(1.0f);
                return;
            case 2:
                ((View) this.A00).setVisibility(8);
                return;
            case 3:
                ((Animator) this.A00).start();
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
