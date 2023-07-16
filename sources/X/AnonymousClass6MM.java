package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6MM  reason: invalid class name */
public final class AnonymousClass6MM {
    public static final float A00(float f, float f2) {
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 1.0f;
        }
        return AnonymousClass8bI.A01(f / f2, 0.75f, 1.3333334f);
    }
}
