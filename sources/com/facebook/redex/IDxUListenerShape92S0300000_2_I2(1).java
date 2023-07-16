package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.AnonymousClass51z;
import X.AnonymousClass7Kz;
import X.AnonymousClass8bA;
import X.C04220Ms;
import X.C135377zM;
import X.C18240wQ;
import X.C31163GhW;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.view.View;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

public class IDxUListenerShape92S0300000_2_I2 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxUListenerShape92S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(valueAnimator, 0);
                int A032 = AnonymousClass7Kz.A0G().A03((Context) this.A00, 21);
                AnonymousClass51z progressBarView = ((FBPayAnimationButton) this.A02).getProgressBarView();
                AnonymousClass0ZU r5 = (AnonymousClass0ZU) this.A01;
                progressBarView.setCircleColorRaw(C31163GhW.A06(A032, AnonymousClass8bA.A03((float) 255, valueAnimator.getAnimatedFraction())));
                if (valueAnimator.getAnimatedFraction() == 1.0f) {
                    RotateDrawable rotateDrawable = progressBarView.A02;
                    if (rotateDrawable == null) {
                        C04220Ms.A0E("layerSpinnerRingDrawable");
                        throw null;
                    }
                    rotateDrawable.setAlpha(0);
                    if (r5 != null) {
                        progressBarView.getRootView().postDelayed(new C135377zM(r5), 800);
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        progressBarView.performHapticFeedback(16);
                        return;
                    }
                    return;
                }
                return;
            case 1:
            case 2:
                C04220Ms.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((View) this.A00).setAlpha(C18240wQ.A00(animatedValue));
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C04220Ms.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                ((View) this.A02).setAlpha(C18240wQ.A00(animatedValue2));
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C04220Ms.A0C(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                ((View) this.A01).setAlpha(C18240wQ.A00(animatedValue3));
                return;
            default:
                return;
        }
    }
}
