package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLAdapterShape0S0100001_2_I2;

/* renamed from: X.7mY  reason: invalid class name */
public final class AnonymousClass7mY implements McA {
    public float A00 = 1.0f;

    public final Animator AFO(View view, ViewGroup viewGroup) {
        float alpha;
        if (view.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = this.A00;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new AnonymousClass7LC(view, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, alpha, f));
        ofFloat.addListener(new IDxLAdapterShape0S0100001_2_I2(view, alpha, 0));
        return ofFloat;
    }

    public final Animator AFf(View view, ViewGroup viewGroup) {
        float alpha;
        if (view.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new AnonymousClass7LC(view, alpha, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f));
        ofFloat.addListener(new IDxLAdapterShape0S0100001_2_I2(view, alpha, 0));
        return ofFloat;
    }
}
