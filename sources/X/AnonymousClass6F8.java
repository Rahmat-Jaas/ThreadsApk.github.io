package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6F8  reason: invalid class name */
public final class AnonymousClass6F8 {
    public static final int A00(float f) {
        double floor;
        double d = (double) f;
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return -((int) ((float) floor));
    }
}
