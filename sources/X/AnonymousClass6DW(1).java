package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6DW  reason: invalid class name */
public final class AnonymousClass6DW {
    public static /* synthetic */ AnonymousClass7WW A00(float f, float f2, int i) {
        long j;
        if ((i & 2) != 0) {
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        long j2 = Long.MIN_VALUE;
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        } else {
            j = 0;
        }
        if ((i & 8) == 0) {
            j2 = 0;
        }
        return new AnonymousClass7WW(new AnonymousClass52a(f2), C103866ar.A02, Float.valueOf(f), j, j2, false);
    }
}
