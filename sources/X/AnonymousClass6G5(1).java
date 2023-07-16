package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6G5  reason: invalid class name */
public final class AnonymousClass6G5 {
    public static Interpolator A00(C127397h3 r6) {
        if (r6 == null) {
            return new PathInterpolator(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f);
        }
        return new PathInterpolator(r6.A0G(35, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), r6.A0G(38, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), r6.A0G(36, 1.0f), r6.A0G(40, 1.0f));
    }
}
