package X;

import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6Gb  reason: invalid class name and case insensitive filesystem */
public final class C98566Gb {
    public static final int A00(Context context, float f) {
        float f2;
        C04220Ms.A0B(context, 0);
        float f3 = f * C18230wP.A0E(context).density;
        if (f3 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f2 = f3 + 0.5f;
        } else {
            f2 = f3 - 0.5f;
        }
        return (int) f2;
    }
}
