package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.507  reason: invalid class name */
public final class AnonymousClass507 extends GestureDetector.SimpleOnGestureListener {
    public final AnonymousClass51R A00;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass51R r3 = this.A00;
        if (r3.getContext() == null) {
            return false;
        }
        float translationY = r3.getTranslationY();
        if (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            r3.A02((int) Math.abs(((((float) r3.getHeight()) - translationY) / f2) * 1000.0f));
        } else {
            r3.A03((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        r3.A08 = true;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass51R r3 = this.A00;
        if (r3.getTranslationY() <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return false;
        }
        r3.A08 = false;
        return true;
    }

    public AnonymousClass507(AnonymousClass51R r1) {
        this.A00 = r1;
    }
}
