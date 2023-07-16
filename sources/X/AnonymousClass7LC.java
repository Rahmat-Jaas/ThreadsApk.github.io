package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7LC  reason: invalid class name */
public final class AnonymousClass7LC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ View A03;

    public AnonymousClass7LC(View view, float f, float f2, float f3) {
        this.A03 = view;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = C18240wQ.A00(valueAnimator.getAnimatedValue());
        View view = this.A03;
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        if (A002 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (A002 > f3) {
                f = f2;
            } else {
                f += ((A002 - BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) / (f3 - BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) * (f2 - f);
            }
        }
        view.setAlpha(f);
    }
}
