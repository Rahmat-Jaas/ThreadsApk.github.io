package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLAdapterShape0S0100001_2_I2;

/* renamed from: X.7mX  reason: invalid class name */
public final class AnonymousClass7mX implements McA {
    public final Animator AFO(View view, ViewGroup viewGroup) {
        float alpha;
        View view2 = view;
        if (view.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new AnonymousClass7LG(view2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, alpha, 0.35f, 1.0f));
        ofFloat.addListener(new IDxLAdapterShape0S0100001_2_I2(view, alpha, 1));
        return ofFloat;
    }

    public final Animator AFf(View view, ViewGroup viewGroup) {
        float alpha;
        View view2 = view;
        if (view.getAlpha() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        ofFloat.addUpdateListener(new AnonymousClass7LG(view2, alpha, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.35f));
        ofFloat.addListener(new IDxLAdapterShape0S0100001_2_I2(view, alpha, 1));
        return ofFloat;
    }
}
